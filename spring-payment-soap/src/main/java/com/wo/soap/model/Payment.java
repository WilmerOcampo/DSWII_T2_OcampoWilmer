package com.wo.soap.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "payments")
@Getter
@Setter
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "payment_date")
    private Date paymentDate;
    @Column(name = "total_amount")
    private Double totalAmount;
    private String currency;

}
