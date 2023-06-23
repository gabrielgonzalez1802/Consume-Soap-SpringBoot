//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.06.23 a las 07:32:33 PM VET 
//


package com.sefspring.wsdls;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para guardaPlantilla complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="guardaPlantilla"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="parametrosDTO" type="{http://service.sefws.telefonica.com.ve/}parametrosDTO" minOccurs="0"/&gt;
 *         &lt;element name="regiones" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="listacolumnas" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="desc_inc" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="desc_exc" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="usuarios" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="list_opc" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="alarms" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="alar" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="mercados" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="managerclasses" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="manager" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="amoclass" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="amos" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="estaciones" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="tts" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "guardaPlantilla", propOrder = {
    "parametrosDTO",
    "regiones",
    "listacolumnas",
    "descInc",
    "descExc",
    "usuarios",
    "listOpc",
    "alarms",
    "alar",
    "mercados",
    "managerclasses",
    "manager",
    "amoclass",
    "amos",
    "estaciones",
    "tts"
})
public class GuardaPlantilla {

    protected ParametrosDTO parametrosDTO;
    protected List<String> regiones;
    protected List<String> listacolumnas;
    @XmlElement(name = "desc_inc")
    protected List<String> descInc;
    @XmlElement(name = "desc_exc")
    protected List<String> descExc;
    protected List<String> usuarios;
    @XmlElement(name = "list_opc")
    protected List<String> listOpc;
    protected List<String> alarms;
    protected List<String> alar;
    protected List<String> mercados;
    protected List<String> managerclasses;
    protected List<String> manager;
    protected List<String> amoclass;
    protected List<String> amos;
    protected List<String> estaciones;
    protected List<String> tts;

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
     * Gets the value of the regiones property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the regiones property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegiones().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRegiones() {
        if (regiones == null) {
            regiones = new ArrayList<String>();
        }
        return this.regiones;
    }

    /**
     * Gets the value of the listacolumnas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listacolumnas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListacolumnas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getListacolumnas() {
        if (listacolumnas == null) {
            listacolumnas = new ArrayList<String>();
        }
        return this.listacolumnas;
    }

    /**
     * Gets the value of the descInc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the descInc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescInc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDescInc() {
        if (descInc == null) {
            descInc = new ArrayList<String>();
        }
        return this.descInc;
    }

    /**
     * Gets the value of the descExc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the descExc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescExc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDescExc() {
        if (descExc == null) {
            descExc = new ArrayList<String>();
        }
        return this.descExc;
    }

    /**
     * Gets the value of the usuarios property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the usuarios property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUsuarios().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getUsuarios() {
        if (usuarios == null) {
            usuarios = new ArrayList<String>();
        }
        return this.usuarios;
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
     * Gets the value of the alarms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alarms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlarms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAlarms() {
        if (alarms == null) {
            alarms = new ArrayList<String>();
        }
        return this.alarms;
    }

    /**
     * Gets the value of the alar property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alar property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlar().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAlar() {
        if (alar == null) {
            alar = new ArrayList<String>();
        }
        return this.alar;
    }

    /**
     * Gets the value of the mercados property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mercados property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMercados().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMercados() {
        if (mercados == null) {
            mercados = new ArrayList<String>();
        }
        return this.mercados;
    }

    /**
     * Gets the value of the managerclasses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the managerclasses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManagerclasses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getManagerclasses() {
        if (managerclasses == null) {
            managerclasses = new ArrayList<String>();
        }
        return this.managerclasses;
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
     * Gets the value of the amoclass property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the amoclass property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAmoclass().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAmoclass() {
        if (amoclass == null) {
            amoclass = new ArrayList<String>();
        }
        return this.amoclass;
    }

    /**
     * Gets the value of the amos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the amos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAmos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAmos() {
        if (amos == null) {
            amos = new ArrayList<String>();
        }
        return this.amos;
    }

    /**
     * Gets the value of the estaciones property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the estaciones property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEstaciones().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEstaciones() {
        if (estaciones == null) {
            estaciones = new ArrayList<String>();
        }
        return this.estaciones;
    }

    /**
     * Gets the value of the tts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTts() {
        if (tts == null) {
            tts = new ArrayList<String>();
        }
        return this.tts;
    }

}
