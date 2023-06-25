//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.06.24 a las 08:01:36 PM VET 
//


package com.sefspring.wsdls.sefservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para loadAmoView complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="loadAmoView"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="amo_like" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="manager" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="manager_like" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "loadAmoView", propOrder = {
    "amoLike",
    "manager",
    "managerLike"
})
public class LoadAmoView {

    @XmlElement(name = "amo_like")
    protected String amoLike;
    @XmlElement(nillable = true)
    protected List<String> manager;
    @XmlElement(name = "manager_like")
    protected String managerLike;

    /**
     * Obtiene el valor de la propiedad amoLike.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmoLike() {
        return amoLike;
    }

    /**
     * Define el valor de la propiedad amoLike.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmoLike(String value) {
        this.amoLike = value;
    }

    /**
     * Gets the value of the manager property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the manager property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManager().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getManager() {
        if (manager == null) {
            manager = new ArrayList<String>();
        }
        return this.manager;
    }

    /**
     * Obtiene el valor de la propiedad managerLike.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManagerLike() {
        return managerLike;
    }

    /**
     * Define el valor de la propiedad managerLike.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManagerLike(String value) {
        this.managerLike = value;
    }

}
