//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.06.23 a las 07:32:33 PM VET 
//


package com.sefspring.wsdls;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para managerDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="managerDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="clas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="id_manager" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="id_region" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="idclass" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "managerDTO", propOrder = {
    "clas",
    "id",
    "idManager",
    "idRegion",
    "idclass",
    "nombre"
})
public class ManagerDTO {

    protected String clas;
    protected int id;
    @XmlElement(name = "id_manager")
    protected long idManager;
    @XmlElement(name = "id_region")
    protected long idRegion;
    protected long idclass;
    protected String nombre;

    /**
     * Obtiene el valor de la propiedad clas.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClas() {
        return clas;
    }

    /**
     * Define el valor de la propiedad clas.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClas(String value) {
        this.clas = value;
    }

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
     * Obtiene el valor de la propiedad idRegion.
     * 
     */
    public long getIdRegion() {
        return idRegion;
    }

    /**
     * Define el valor de la propiedad idRegion.
     * 
     */
    public void setIdRegion(long value) {
        this.idRegion = value;
    }

    /**
     * Obtiene el valor de la propiedad idclass.
     * 
     */
    public long getIdclass() {
        return idclass;
    }

    /**
     * Define el valor de la propiedad idclass.
     * 
     */
    public void setIdclass(long value) {
        this.idclass = value;
    }

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

}
