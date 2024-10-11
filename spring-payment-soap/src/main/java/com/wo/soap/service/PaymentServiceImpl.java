package com.wo.soap.service;

import com.wo.soap.model.Payment;
import com.wo.soap.repository.IPaymentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PaymentServiceImpl implements IPaymentService {

    private final IPaymentRepository paymentRepository;

    @Override
    public List<Payment> findAllByPaymentDateIs(Date date) {
        return paymentRepository.findAllByPaymentDate(date);
    }

}
