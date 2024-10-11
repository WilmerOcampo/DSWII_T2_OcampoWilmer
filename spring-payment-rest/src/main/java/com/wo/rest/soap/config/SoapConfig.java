package com.wo.rest.soap.config;

import com.wo.rest.service.PaymentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class SoapConfig {

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.wo.rest.soap.model");
        return marshaller;
    }

    @Bean
    public PaymentService service(Jaxb2Marshaller marshaller) {
        PaymentService service = new PaymentService();
        service.setDefaultUri("http://localhost:8090/ws");
        service.setMarshaller(marshaller);
        service.setUnmarshaller(marshaller);
        return service;
    }

}
