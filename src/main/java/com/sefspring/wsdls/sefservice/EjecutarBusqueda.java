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
 * <p>Clase Java para ejecutarBusqueda complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ejecutarBusqueda"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="parametrosDTO" type="{http://service.sefws.telefonica.com.ve/}parametrosDTO" minOccurs="0"/&gt;
 *         &lt;element name="region_sel" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="list_inc" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="list_exc" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="list_usu" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="list_opc" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="alarmas" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="alarmasCod" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="mercado_sel" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="managerclass_sel" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="manager_sel" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="amoclass_sel" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="amo_sel" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="estacion_sel" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="tt_sel" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ejecutarBusqueda", propOrder = {
    "parametrosDTO",
    "regionSel",
    "listInc",
    "listExc",
    "listUsu",
    "listOpc",
    "alarmas",
    "alarmasCod",
    "mercadoSel",
    "managerclassSel",
    "managerSel",
    "amoclassSel",
    "amoSel",
    "estacionSel",
    "ttSel"
})
public class EjecutarBusqueda {

    protected ParametrosDTO parametrosDTO;
    @XmlElement(name = "region_sel")
    protected List<String> regionSel;
    @XmlElement(name = "list_inc")
    protected List<String> listInc;
    @XmlElement(name = "list_exc")
    protected List<String> listExc;
    @XmlElement(name = "list_usu")
    protected List<String> listUsu;
    @XmlElement(name = "list_opc")
    protected List<String> listOpc;
    protected List<String> alarmas;
    protected List<String> alarmasCod;
    @XmlElement(name = "mercado_sel")
    protected List<String> mercadoSel;
    @XmlElement(name = "managerclass_sel")
    protected List<String> managerclassSel;
    @XmlElement(name = "manager_sel")
    protected List<String> managerSel;
    @XmlElement(name = "amoclass_sel")
    protected List<String> amoclassSel;
    @XmlElement(name = "amo_sel")
    protected List<String> amoSel;
    @XmlElement(name = "estacion_sel")
    protected List<String> estacionSel;
    @XmlElement(name = "tt_sel")
    protected List<String> ttSel;

    /**
     * Obtiene el valor de la propiedad parametrosDTO.
     * 
     * @return
     *     possible object is
     *     {@link ParametrosDTO }
     *     
     */
    public ParametrosDTO getParametrosDTO() {
        return parametrosDTO;
    }

    /**
     * Define el valor de la propiedad parametrosDTO.
     * 
     * @param value
     *     allowed object is
     *     {@link ParametrosDTO }
     *     
     */
    public void setParametrosDTO(ParametrosDTO value) {
        this.parametrosDTO = value;
    }

    /**
     * Gets the value of the regionSel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the regionSel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegionSel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRegionSel() {
        if (regionSel == null) {
            regionSel = new ArrayList<String>();
        }
        return this.regionSel;
    }

    /**
     * Gets the value of the listInc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listInc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListInc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getListInc() {
        if (listInc == null) {
            listInc = new ArrayList<String>();
        }
        return this.listInc;
    }

    /**
     * Gets the value of the listExc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listExc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListExc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getListExc() {
        if (listExc == null) {
            listExc = new ArrayList<String>();
        }
        return this.listExc;
    }

    /**
     * Gets the value of the listUsu property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listUsu property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListUsu().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getListUsu() {
        if (listUsu == null) {
            listUsu = new ArrayList<String>();
        }
        return this.listUsu;
    }

    /**
     * Gets the value of the listOpc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listOpc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListOpc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getListOpc() {
        if (listOpc == null) {
            listOpc = new ArrayList<String>();
        }
        return this.listOpc;
    }

    /**
     * Gets the value of the alarmas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alarmas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlarmas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAlarmas() {
        if (alarmas == null) {
            alarmas = new ArrayList<String>();
        }
        return this.alarmas;
    }

    /**
     * Gets the value of the alarmasCod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alarmasCod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlarmasCod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAlarmasCod() {
        if (alarmasCod == null) {
            alarmasCod = new ArrayList<String>();
        }
        return this.alarmasCod;
    }

    /**
     * Gets the value of the mercadoSel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mercadoSel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMercadoSel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMercadoSel() {
        if (mercadoSel == null) {
            mercadoSel = new ArrayList<String>();
        }
        return this.mercadoSel;
    }

    /**
     * Gets the value of the managerclassSel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the managerclassSel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManagerclassSel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getManagerclassSel() {
        if (managerclassSel == null) {
            managerclassSel = new ArrayList<String>();
        }
        return this.managerclassSel;
    }

    /**
     * Gets the value of the managerSel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the managerSel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManagerSel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getManagerSel() {
        if (managerSel == null) {
            managerSel = new ArrayList<String>();
        }
        return this.managerSel;
    }

    /**
     * Gets the value of the amoclassSel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the amoclassSel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAmoclassSel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAmoclassSel() {
        if (amoclassSel == null) {
            amoclassSel = new ArrayList<String>();
        }
        return this.amoclassSel;
    }

    /**
     * Gets the value of the amoSel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the amoSel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAmoSel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAmoSel() {
        if (amoSel == null) {
            amoSel = new ArrayList<String>();
        }
        return this.amoSel;
    }

    /**
     * Gets the value of the estacionSel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the estacionSel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEstacionSel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEstacionSel() {
        if (estacionSel == null) {
            estacionSel = new ArrayList<String>();
        }
        return this.estacionSel;
    }

    /**
     * Gets the value of the ttSel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ttSel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTtSel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTtSel() {
        if (ttSel == null) {
            ttSel = new ArrayList<String>();
        }
        return this.ttSel;
    }

}
