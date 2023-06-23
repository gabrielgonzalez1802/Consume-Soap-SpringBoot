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
 * <p>Clase Java para estacionesDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="estacionesDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="id_estacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="id_region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipo_estacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "estacionesDTO", propOrder = {
    "id",
    "idEstacion",
    "idRegion",
    "nombre",
    "tipoEstacion"
})
public class EstacionesDTO {

    protected int id;
    @XmlElement(name = "id_estacion")
    protected String idEstacion;
    @XmlElement(name = "id_region")
    protected String idRegion;
    protected String nombre;
    @XmlElement(name = "tipo_estacion")
    protected String tipoEstacion;

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
     * Obtiene el valor de la propiedad idEstacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdEstacion() {
        return idEstacion;
    }

    /**
     * Define el valor de la propiedad idEstacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdEstacion(String value) {
        this.idEstacion = value;
    }

    /**
     * Obtiene el valor de la propiedad idRegion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdRegion() {
        return idRegion;
    }

    /**
     * Define el valor de la propiedad idRegion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdRegion(String value) {
        this.idRegion = value;
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

    /**
     * Obtiene el valor de la propiedad tipoEstacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoEstacion() {
        return tipoEstacion;
    }

    /**
     * Define el valor de la propiedad tipoEstacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoEstacion(String value) {
        this.tipoEstacion = value;
    }

}
