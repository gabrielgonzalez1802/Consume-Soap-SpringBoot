//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.06.24 a las 08:01:38 PM VET 
//


package com.sefspring.wsdls.countryinfo;

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
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CountryIntPhoneCodeResult" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "countryIntPhoneCodeResult"
})
@XmlRootElement(name = "CountryIntPhoneCodeResponse")
public class CountryIntPhoneCodeResponse {

    @XmlElement(name = "CountryIntPhoneCodeResult", required = true)
    protected String countryIntPhoneCodeResult;

    /**
     * Obtiene el valor de la propiedad countryIntPhoneCodeResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryIntPhoneCodeResult() {
        return countryIntPhoneCodeResult;
    }

    /**
     * Define el valor de la propiedad countryIntPhoneCodeResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryIntPhoneCodeResult(String value) {
        this.countryIntPhoneCodeResult = value;
    }

}
