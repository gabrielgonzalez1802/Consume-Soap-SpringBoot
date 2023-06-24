//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.06.24 a las 07:50:38 PM VET 
//


package com.sefspring.wsdls.sefservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para amoClassDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="amoClassDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="amoClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="id_amoClass" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="id_manager" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="manager" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "amoClassDTO", propOrder = {
    "amoClass",
    "idAmoClass",
    "idManager",
    "manager"
})
public class AmoClassDTO {

    protected String amoClass;
    @XmlElement(name = "id_amoClass")
    protected long idAmoClass;
    @XmlElement(name = "id_manager")
    protected long idManager;
    protected String manager;

    /**
     * Obtiene el valor de la propiedad amoClass.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmoClass() {
        return amoClass;
    }

    /**
     * Define el valor de la propiedad amoClass.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmoClass(String value) {
        this.amoClass = value;
    }

    /**
     * Obtiene el valor de la propiedad idAmoClass.
     * 
     */
    public long getIdAmoClass() {
        return idAmoClass;
    }

    /**
     * Define el valor de la propiedad idAmoClass.
     * 
     */
    public void setIdAmoClass(long value) {
        this.idAmoClass = value;
    }

    /**
     * Obtiene el valor de la propiedad idManager.
     * 
     */
    public long getIdManager() {
        return idManager;
    }

    /**
     * Define el valor de la propiedad idManager.
     * 
     */
    public void setIdManager(long value) {
        this.idManager = value;
    }

    /**
     * Obtiene el valor de la propiedad manager.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManager() {
        return manager;
    }

    /**
     * Define el valor de la propiedad manager.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManager(String value) {
        this.manager = value;
    }

}
