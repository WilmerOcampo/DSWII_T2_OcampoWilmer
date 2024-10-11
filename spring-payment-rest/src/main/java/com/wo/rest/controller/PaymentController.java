package com.wo.rest.controller;

import com.wo.rest.response.ResponseFormat;
import com.wo.rest.service.PaymentService;
import com.wo.rest.soap.model.PaymentList;
import com.wo.rest.soap.model.PaymentListRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/payment")
@RequiredArgsConstructor
public class PaymentController {

    private final PaymentService paymentService;

    @PostMapping("/payment-date")
    public ResponseEntity<ResponseFormat> findAllByPaymentDate(@RequestBody PaymentListRequest request) {
        try {
            PaymentList paymentList = this.paymentService.findAllByPaymentDate(request);
            if (paymentList != null && !paymentList.getPayment().isEmpty()) {
                return ResponseEntity.ok(new ResponseFormat(paymentList.getPayment(), HttpStatus.OK, HttpStatus.OK.value()));
            } else {
                return ResponseEntity.status(HttpStatus.NOT_FOUND)
                        .body(new ResponseFormat("No payments were found for that date.", HttpStatus.NOT_FOUND, HttpStatus.NOT_FOUND.value()));
            }
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(new ResponseFormat(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR, HttpStatus.INTERNAL_SERVER_ERROR.value()));
        }
    }

}
