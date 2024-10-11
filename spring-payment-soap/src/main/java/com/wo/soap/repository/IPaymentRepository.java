package com.wo.soap.repository;

import com.wo.soap.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface IPaymentRepository extends JpaRepository<Payment, Long> {

    List<Payment> findAllByPaymentDate(Date date);

}
