//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.06.25 a las 02:41:02 PM VET 
//


package com.sefspring.wsdls.sefservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para consultarMercadoByidMercado complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="consultarMercadoByidMercado"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idMercado" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="idRegion" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultarMercadoByidMercado", propOrder = {
    "idMercado",
    "idRegion"
})
public class ConsultarMercadoByidMercado {

    protected int idMercado;
    protected int idRegion;

    /**
     * Obtiene el valor de la propiedad idMercado.
     * 
     */
    public int getIdMercado() {
        return idMercado;
    }

    /**
     * Define el valor de la propiedad idMercado.
     * 
     */
    public void setIdMercado(int value) {
        this.idMercado = value;
    }

    /**
     * Obtiene el valor de la propiedad idRegion.
     * 
     */
    public int getIdRegion() {
        return idRegion;
    }

    /**
     * Define el valor de la propiedad idRegion.
     * 
     */
    public void setIdRegion(int value) {
        this.idRegion = value;
    }

}
