//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v4.0.5 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
//


package com.wo.rest.soap.model;

import jakarta.xml.bind.annotation.*;

import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para PaymentObject complex type.</p>
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.</p>
 *
 * <pre>{@code
 * <complexType name="PaymentObject">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="paymentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         <element name="totalAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="currency" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentObject", propOrder = {
        "id",
        "paymentDate",
        "totalAmount",
        "currency"
})
public class PaymentObject {

    protected long id;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar paymentDate;
    protected double totalAmount;
    @XmlElement(required = true)
    protected String currency;

    /**
     * Obtiene el valor de la propiedad id.
     */
    public long getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad paymentDate.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getPaymentDate() {
        return paymentDate;
    }

    /**
     * Define el valor de la propiedad paymentDate.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setPaymentDate(XMLGregorianCalendar value) {
        this.paymentDate = value;
    }

    /**
     * Obtiene el valor de la propiedad totalAmount.
     */
    public double getTotalAmount() {
        return totalAmount;
    }

    /**
     * Define el valor de la propiedad totalAmount.
     */
    public void setTotalAmount(double value) {
        this.totalAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad currency.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Define el valor de la propiedad currency.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

}
