package com.wo.rest.controller;

import com.wo.rest.response.PaymentResponse;
import com.wo.rest.service.PaymentService;
import com.wo.rest.soap.model.PaymentList;
import com.wo.rest.soap.model.PaymentListRequest;
import com.wo.rest.utl.DateUtil;
import com.wo.rest.utl.NumberUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/payment")
@RequiredArgsConstructor
public class PaymentController {

    private final PaymentService paymentService;
    private static final double EXCHANGE_RATE = 3.85;

    @PostMapping("/payment-date")
    public ResponseEntity<List<PaymentResponse>> findAllByPaymentDate(@RequestBody PaymentListRequest request) {
        try {
            PaymentList paymentList = this.paymentService.findAllByPaymentDate(request);
            if (paymentList != null && !paymentList.getPayment().isEmpty()) {
                List<PaymentResponse> responses = paymentList.getPayment().stream()
                        .map(paymentObject -> {
                            double totalAmount = paymentObject.getTotalAmount();
                            String currency = paymentObject.getCurrency();

                            double totalInSoles = currency.equals("Soles") ? totalAmount : totalAmount * EXCHANGE_RATE;
                            double totalInDollars = currency.equals("Dólares") ? totalAmount : totalAmount / EXCHANGE_RATE;

                            double igv = totalAmount * 0.18;
                            double netValue = totalAmount - igv;

                            Map<String, Double> currencies = new HashMap<>();
                            currencies.put("soles", NumberUtil.roundToTwoDecimals(totalInSoles));
                            currencies.put("dolares", NumberUtil.roundToTwoDecimals(totalInDollars));

                            return new PaymentResponse(
                                    currencies,
                                    NumberUtil.roundToTwoDecimals(totalAmount),
                                    currency,
                                    NumberUtil.roundToTwoDecimals(igv),
                                    NumberUtil.roundToTwoDecimals(netValue),
                                    DateUtil.xmlGregorianCalendarToString(paymentObject.getPaymentDate(), "yyyy-MM-dd")
                            );
                        })
                        .collect(Collectors.toList());

                return ResponseEntity.ok(responses);
            } else {
                return ResponseEntity.status(HttpStatus.NOT_FOUND)
                        .body(Collections.emptyList());
            }
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(Collections.emptyList());
        }
    }

}
