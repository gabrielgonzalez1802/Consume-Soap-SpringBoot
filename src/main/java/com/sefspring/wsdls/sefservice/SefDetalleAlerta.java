//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.06.24 a las 08:01:36 PM VET 
//


package com.sefspring.wsdls.sefservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para sefDetalleAlerta complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="sefDetalleAlerta"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dateAlert" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="descr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idAlert" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="operatorClear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="operatorr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="seqnum" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="severety" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sefDetalleAlerta", propOrder = {
    "dateAlert",
    "descr",
    "idAlert",
    "operatorClear",
    "operatorr",
    "seqnum",
    "severety"
})
public class SefDetalleAlerta {

    protected String dateAlert;
    protected String descr;
    protected int idAlert;
    protected String operatorClear;
    protected String operatorr;
    protected int seqnum;
    protected String severety;

    /**
     * Obtiene el valor de la propiedad dateAlert.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateAlert() {
        return dateAlert;
    }

    /**
     * Define el valor de la propiedad dateAlert.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateAlert(String value) {
        this.dateAlert = value;
    }

    /**
     * Obtiene el valor de la propiedad descr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescr() {
        return descr;
    }

    /**
     * Define el valor de la propiedad descr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescr(String value) {
        this.descr = value;
    }

    /**
     * Obtiene el valor de la propiedad idAlert.
     * 
     */
    public int getIdAlert() {
        return idAlert;
    }

    /**
     * Define el valor de la propiedad idAlert.
     * 
     */
    public void setIdAlert(int value) {
        this.idAlert = value;
    }

    /**
     * Obtiene el valor de la propiedad operatorClear.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatorClear() {
        return operatorClear;
    }

    /**
     * Define el valor de la propiedad operatorClear.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatorClear(String value) {
        this.operatorClear = value;
    }

    /**
     * Obtiene el valor de la propiedad operatorr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatorr() {
        return operatorr;
    }

    /**
     * Define el valor de la propiedad operatorr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatorr(String value) {
        this.operatorr = value;
    }

    /**
     * Obtiene el valor de la propiedad seqnum.
     * 
     */
    public int getSeqnum() {
        return seqnum;
    }

    /**
     * Define el valor de la propiedad seqnum.
     * 
     */
    public void setSeqnum(int value) {
        this.seqnum = value;
    }

    /**
     * Obtiene el valor de la propiedad severety.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeverety() {
        return severety;
    }

    /**
     * Define el valor de la propiedad severety.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeverety(String value) {
        this.severety = value;
    }

}
