package com.wo.soap.endpoint;

import com.wo.soap.model.Payment;
import com.wo.soap.payment.PaymentList;
import com.wo.soap.payment.PaymentListRequest;
import com.wo.soap.payment.PaymentObject;
import com.wo.soap.service.IPaymentService;
import com.wo.soap.util.DateUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.util.ArrayList;
import java.util.List;

@Endpoint
@RequiredArgsConstructor
public class PaymentEndpoint {

    private final IPaymentService paymentService;
    private static final String NAMESPACE = "http://www.wo.com/soap/payment";

    @PayloadRoot(namespace = NAMESPACE, localPart = "PaymentListRequest")
    @ResponsePayload
    public PaymentList paymentList(@RequestPayload PaymentListRequest request) {
        PaymentList result = new PaymentList();
        List<Payment> payments = this.paymentService.findAllByPaymentDate(request.getPaymentDate());
        List<PaymentObject> paymentObjects = new ArrayList<>();
        if (!payments.isEmpty()) {
            payments.forEach(obj -> {
                PaymentObject objTemp = new PaymentObject();
                objTemp.setId(obj.getId());
                objTemp.setPaymentDate(DateUtils.dateToXmlGregorianCalendar(obj.getPaymentDate()));
                objTemp.setTotalAmount(obj.getTotalAmount());
                objTemp.setCurrency(obj.getCurrency());
                paymentObjects.add(objTemp);
            });
            result.getPayment().addAll(paymentObjects);
        }
        return result;
    }

}
