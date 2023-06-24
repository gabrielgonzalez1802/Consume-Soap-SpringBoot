//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.06.24 a las 07:50:38 PM VET 
//


package com.sefspring.wsdls.sefservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para managerClassDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="managerClassDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="idmc" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="idred" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nombreemc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nombrered" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "managerClassDTO", propOrder = {
    "id",
    "idmc",
    "idred",
    "nombreemc",
    "nombrered"
})
public class ManagerClassDTO {

    protected int id;
    protected int idmc;
    protected int idred;
    protected String nombreemc;
    protected String nombrered;

    /**
     * Obtiene el valor de la propiedad id.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad idmc.
     * 
     */
    public int getIdmc() {
        return idmc;
    }

    /**
     * Define el valor de la propiedad idmc.
     * 
     */
    public void setIdmc(int value) {
        this.idmc = value;
    }

    /**
     * Obtiene el valor de la propiedad idred.
     * 
     */
    public int getIdred() {
        return idred;
    }

    /**
     * Define el valor de la propiedad idred.
     * 
     */
    public void setIdred(int value) {
        this.idred = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreemc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreemc() {
        return nombreemc;
    }

    /**
     * Define el valor de la propiedad nombreemc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreemc(String value) {
        this.nombreemc = value;
    }

    /**
     * Obtiene el valor de la propiedad nombrered.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombrered() {
        return nombrered;
    }

    /**
     * Define el valor de la propiedad nombrered.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombrered(String value) {
        this.nombrered = value;
    }

}
