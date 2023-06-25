//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.06.24 a las 08:01:36 PM VET 
//


package com.sefspring.wsdls.sefservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para sefDetalleAlertaViewDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="sefDetalleAlertaViewDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CLUSTER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CODALERT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DATEALERT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HOURSALERT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IDESTACION" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="LASTDESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LASTSEVERITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MANAGERCLASS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NEAFFECTED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NOMBREESTACION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="STATUSALERT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TROUBLETICKET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VENDOR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sefDetalleAlertaViewDTO", propOrder = {
    "cluster",
    "codalert",
    "datealert",
    "hoursalert",
    "idestacion",
    "lastdescription",
    "lastseverity",
    "managerclass",
    "neaffected",
    "nombreestacion",
    "statusalert",
    "troubleticket",
    "vendor"
})
public class SefDetalleAlertaViewDTO {

    @XmlElement(name = "CLUSTER")
    protected String cluster;
    @XmlElement(name = "CODALERT")
    protected String codalert;
    @XmlElement(name = "DATEALERT")
    protected String datealert;
    @XmlElement(name = "HOURSALERT")
    protected String hoursalert;
    @XmlElement(name = "IDESTACION")
    protected int idestacion;
    @XmlElement(name = "LASTDESCRIPTION")
    protected String lastdescription;
    @XmlElement(name = "LASTSEVERITY")
    protected String lastseverity;
    @XmlElement(name = "MANAGERCLASS")
    protected String managerclass;
    @XmlElement(name = "NEAFFECTED")
    protected String neaffected;
    @XmlElement(name = "NOMBREESTACION")
    protected String nombreestacion;
    @XmlElement(name = "STATUSALERT")
    protected String statusalert;
    @XmlElement(name = "TROUBLETICKET")
    protected String troubleticket;
    @XmlElement(name = "VENDOR")
    protected String vendor;

    /**
     * Obtiene el valor de la propiedad cluster.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLUSTER() {
        return cluster;
    }

    /**
     * Define el valor de la propiedad cluster.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLUSTER(String value) {
        this.cluster = value;
    }

    /**
     * Obtiene el valor de la propiedad codalert.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODALERT() {
        return codalert;
    }

    /**
     * Define el valor de la propiedad codalert.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODALERT(String value) {
        this.codalert = value;
    }

    /**
     * Obtiene el valor de la propiedad datealert.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATEALERT() {
        return datealert;
    }

    /**
     * Define el valor de la propiedad datealert.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATEALERT(String value) {
        this.datealert = value;
    }

    /**
     * Obtiene el valor de la propiedad hoursalert.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHOURSALERT() {
        return hoursalert;
    }

    /**
     * Define el valor de la propiedad hoursalert.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHOURSALERT(String value) {
        this.hoursalert = value;
    }

    /**
     * Obtiene el valor de la propiedad idestacion.
     * 
     */
    public int getIDESTACION() {
        return idestacion;
    }

    /**
     * Define el valor de la propiedad idestacion.
     * 
     */
    public void setIDESTACION(int value) {
        this.idestacion = value;
    }

    /**
     * Obtiene el valor de la propiedad lastdescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLASTDESCRIPTION() {
        return lastdescription;
    }

    /**
     * Define el valor de la propiedad lastdescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLASTDESCRIPTION(String value) {
        this.lastdescription = value;
    }

    /**
     * Obtiene el valor de la propiedad lastseverity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLASTSEVERITY() {
        return lastseverity;
    }

    /**
     * Define el valor de la propiedad lastseverity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLASTSEVERITY(String value) {
        this.lastseverity = value;
    }

    /**
     * Obtiene el valor de la propiedad managerclass.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMANAGERCLASS() {
        return managerclass;
    }

    /**
     * Define el valor de la propiedad managerclass.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMANAGERCLASS(String value) {
        this.managerclass = value;
    }

    /**
     * Obtiene el valor de la propiedad neaffected.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNEAFFECTED() {
        return neaffected;
    }

    /**
     * Define el valor de la propiedad neaffected.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNEAFFECTED(String value) {
        this.neaffected = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreestacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMBREESTACION() {
        return nombreestacion;
    }

    /**
     * Define el valor de la propiedad nombreestacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMBREESTACION(String value) {
        this.nombreestacion = value;
    }

    /**
     * Obtiene el valor de la propiedad statusalert.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTATUSALERT() {
        return statusalert;
    }

    /**
     * Define el valor de la propiedad statusalert.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTATUSALERT(String value) {
        this.statusalert = value;
    }

    /**
     * Obtiene el valor de la propiedad troubleticket.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTROUBLETICKET() {
        return troubleticket;
    }

    /**
     * Define el valor de la propiedad troubleticket.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTROUBLETICKET(String value) {
        this.troubleticket = value;
    }

    /**
     * Obtiene el valor de la propiedad vendor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVENDOR() {
        return vendor;
    }

    /**
     * Define el valor de la propiedad vendor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVENDOR(String value) {
        this.vendor = value;
    }

}
