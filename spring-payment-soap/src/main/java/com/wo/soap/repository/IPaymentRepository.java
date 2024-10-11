package com.wo.soap.repository;

import com.wo.soap.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IPaymentRepository extends JpaRepository<Payment, Long> {

    @Query("SELECT p FROM Payment p WHERE DATE(p.paymentDate) = DATE(?1)")
    List<Payment> findAllByPaymentDate(String date);

}
