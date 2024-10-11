//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v4.0.5 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
//


package com.wo.rest.soap.model;

import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the com.wo.rest.soap.model package.
 * <p>An ObjectFactory allows you to programmatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.wo.rest.soap.model
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PaymentListRequest }
     *
     * @return the new instance of {@link PaymentListRequest }
     */
    public PaymentListRequest createPaymentListRequest() {
        return new PaymentListRequest();
    }

    /**
     * Create an instance of {@link PaymentList }
     *
     * @return the new instance of {@link PaymentList }
     */
    public PaymentList createPaymentList() {
        return new PaymentList();
    }

    /**
     * Create an instance of {@link PaymentObject }
     *
     * @return the new instance of {@link PaymentObject }
     */
    public PaymentObject createPaymentObject() {
        return new PaymentObject();
    }

}
