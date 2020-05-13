//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.05.13 a las 10:28:34 AM CDT 
//


package org.example.aerolinea;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idVuelo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idAsiento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nameClient" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="edadClient" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="phoneClient" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="emailClient" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "idVuelo",
    "idAsiento",
    "nameClient",
    "edadClient",
    "phoneClient",
    "emailClient"
})
@XmlRootElement(name = "CompraRequest")
public class CompraRequest {

    protected int idVuelo;
    @XmlElement(required = true)
    protected String idAsiento;
    @XmlElement(required = true)
    protected String nameClient;
    protected int edadClient;
    protected double phoneClient;
    @XmlElement(required = true)
    protected String emailClient;

    /**
     * Obtiene el valor de la propiedad idVuelo.
     * 
     */
    public int getIdVuelo() {
        return idVuelo;
    }

    /**
     * Define el valor de la propiedad idVuelo.
     * 
     */
    public void setIdVuelo(int value) {
        this.idVuelo = value;
    }

    /**
     * Obtiene el valor de la propiedad idAsiento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdAsiento() {
        return idAsiento;
    }

    /**
     * Define el valor de la propiedad idAsiento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdAsiento(String value) {
        this.idAsiento = value;
    }

    /**
     * Obtiene el valor de la propiedad nameClient.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameClient() {
        return nameClient;
    }

    /**
     * Define el valor de la propiedad nameClient.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameClient(String value) {
        this.nameClient = value;
    }

    /**
     * Obtiene el valor de la propiedad edadClient.
     * 
     */
    public int getEdadClient() {
        return edadClient;
    }

    /**
     * Define el valor de la propiedad edadClient.
     * 
     */
    public void setEdadClient(int value) {
        this.edadClient = value;
    }

    /**
     * Obtiene el valor de la propiedad phoneClient.
     * 
     */
    public double getPhoneClient() {
        return phoneClient;
    }

    /**
     * Define el valor de la propiedad phoneClient.
     * 
     */
    public void setPhoneClient(double value) {
        this.phoneClient = value;
    }

    /**
     * Obtiene el valor de la propiedad emailClient.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailClient() {
        return emailClient;
    }

    /**
     * Define el valor de la propiedad emailClient.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailClient(String value) {
        this.emailClient = value;
    }

}
