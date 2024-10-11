package com.wo.rest.service;

import com.wo.rest.soap.model.PaymentList;
import com.wo.rest.soap.model.PaymentListRequest;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

public class PaymentService extends WebServiceGatewaySupport {

    public PaymentList findAllByPaymentDate(PaymentListRequest request) {
        try {
            return (PaymentList) getWebServiceTemplate().marshalSendAndReceive(request);
        } catch (Exception e) {
            throw new RuntimeException("Error searching by date: " + e.getLocalizedMessage());
        }
    }

}
