package com.wo.soap.service;

import com.wo.soap.model.Payment;

import java.util.Date;
import java.util.List;

public interface IPaymentService {

    List<Payment> findAllByPaymentDateIs(Date date);

}
