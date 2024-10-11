package com.wo.soap.service;

import com.wo.soap.model.Payment;

import java.util.List;

public interface IPaymentService {

    List<Payment> findAllByPaymentDate(String date);

}
