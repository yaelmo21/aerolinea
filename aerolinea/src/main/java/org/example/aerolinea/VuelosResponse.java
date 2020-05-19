//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.05.18 a las 10:11:02 PM CDT 
//


package org.example.aerolinea;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="vuelo" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="idVuelo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="origin" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="destination" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="time" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="alert" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "vuelo",
    "alert"
})
@XmlRootElement(name = "VuelosResponse")
public class VuelosResponse {

    @XmlElement(required = true)
    protected List<VuelosResponse.Vuelo> vuelo;
    @XmlElement(required = true)
    protected String alert;

    /**
     * Gets the value of the vuelo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vuelo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVuelo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VuelosResponse.Vuelo }
     * 
     * 
     */
    public List<VuelosResponse.Vuelo> getVuelo() {
        if (vuelo == null) {
            vuelo = new ArrayList<VuelosResponse.Vuelo>();
        }
        return this.vuelo;
    }
    
    
    

    public void setVuelo(List<VuelosResponse.Vuelo> vuelo) {
		this.vuelo = vuelo;
	}




	/**
     * Obtiene el valor de la propiedad alert.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlert() {
        return alert;
    }

    /**
     * Define el valor de la propiedad alert.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlert(String value) {
        this.alert = value;
    }


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
     *         &lt;element name="origin" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="destination" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="time" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}float"/>
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
        "origin",
        "destination",
        "date",
        "time",
        "price"
    })
    public static class Vuelo {

        protected int idVuelo;
        @XmlElement(required = true)
        protected String origin;
        @XmlElement(required = true)
        protected String destination;
        @XmlElement(required = true)
        protected String date;
        @XmlElement(required = true)
        protected String time;
        protected float price;

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
         * Obtiene el valor de la propiedad origin.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrigin() {
            return origin;
        }

        /**
         * Define el valor de la propiedad origin.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrigin(String value) {
            this.origin = value;
        }

        /**
         * Obtiene el valor de la propiedad destination.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDestination() {
            return destination;
        }

        /**
         * Define el valor de la propiedad destination.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDestination(String value) {
            this.destination = value;
        }

        /**
         * Obtiene el valor de la propiedad date.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDate() {
            return date;
        }

        /**
         * Define el valor de la propiedad date.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDate(String value) {
            this.date = value;
        }

        /**
         * Obtiene el valor de la propiedad time.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTime() {
            return time;
        }

        /**
         * Define el valor de la propiedad time.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTime(String value) {
            this.time = value;
        }

        /**
         * Obtiene el valor de la propiedad price.
         * 
         */
        public float getPrice() {
            return price;
        }

        /**
         * Define el valor de la propiedad price.
         * 
         */
        public void setPrice(float value) {
            this.price = value;
        }

    }

}
