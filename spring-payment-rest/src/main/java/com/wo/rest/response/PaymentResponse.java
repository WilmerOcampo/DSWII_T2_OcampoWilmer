package com.wo.rest.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
@AllArgsConstructor
public class PaymentResponse {

    private Map<String, Double> monedas;
    private double montoOriginal;
    private String monedaOriginal;
    private double impuestos;
    private double valorNeto;
    private String fechaVenta;

}
