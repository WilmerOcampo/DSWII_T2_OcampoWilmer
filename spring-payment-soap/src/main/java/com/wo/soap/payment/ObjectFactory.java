//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.2 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.10.11 a las 01:01:58 AM COT 
//


package com.wo.soap.payment;

import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.wo.soap.payment package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.wo.soap.payment
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PaymentListRequest }
     * 
     */
    public PaymentListRequest createPaymentListRequest() {
        return new PaymentListRequest();
    }

    /**
     * Create an instance of {@link PaymentList }
     * 
     */
    public PaymentList createPaymentList() {
        return new PaymentList();
    }

    /**
     * Create an instance of {@link PaymentObject }
     * 
     */
    public PaymentObject createPaymentObject() {
        return new PaymentObject();
    }

}
