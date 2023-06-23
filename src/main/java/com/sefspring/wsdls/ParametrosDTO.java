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
 * <p>Clase Java para parametrosDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="parametrosDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="acknowledged" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="alar" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="alarms" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="amo_like" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="amoclass" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="amoclass_like" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="amos" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="auxalarms" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="busqueda_codalert" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="busqueda_codalertrep" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="campo_por" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="caseta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="categoria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="clear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cluster" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codalert" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codalertrep" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="criticidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desc_exc" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="desc_inc" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="estaciones" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="estatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fecha_alert_fin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fecha_alert_ini" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fecha_busqfin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fecha_busqini" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fecha_clear_fin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fecha_clear_ini" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fecha_open_fin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fecha_open_ini" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fecha_repfin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fecha_repini" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="formato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="genera_tt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="idAlert" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idEst" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="intervalo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isnull" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="list_opc" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="listaColumnas" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="login" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="manager" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="manager_like" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="managerclasses" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="mercado_like" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mercados" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="nameFile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nombre_plantilla" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nulle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="opcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rangoFecha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="regiones" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="run" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="t_alarma" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="talertas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="times_max" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="times_min" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="timesupdate_max" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="timesupdate_min" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipo_estacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tts" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="usuarios" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="vendor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nRep" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "parametrosDTO", propOrder = {
    "acknowledged",
    "alar",
    "alarms",
    "amoLike",
    "amoclass",
    "amoclassLike",
    "amos",
    "auxalarms",
    "busquedaCodalert",
    "busquedaCodalertrep",
    "campoPor",
    "caseta",
    "categoria",
    "clear",
    "cluster",
    "codalert",
    "codalertrep",
    "criticidad",
    "descExc",
    "descInc",
    "estaciones",
    "estatus",
    "fechaAlertFin",
    "fechaAlertIni",
    "fechaBusqfin",
    "fechaBusqini",
    "fechaClearFin",
    "fechaClearIni",
    "fechaOpenFin",
    "fechaOpenIni",
    "fechaRepfin",
    "fechaRepini",
    "formato",
    "generaTt",
    "id",
    "idAlert",
    "idEst",
    "intervalo",
    "isnull",
    "listOpc",
    "listaColumnas",
    "login",
    "manager",
    "managerLike",
    "managerclasses",
    "mercadoLike",
    "mercados",
    "nameFile",
    "nombrePlantilla",
    "nulle",
    "opcion",
    "rangoFecha",
    "regiones",
    "run",
    "tAlarma",
    "talertas",
    "timesMax",
    "timesMin",
    "timesupdateMax",
    "timesupdateMin",
    "tipoEstacion",
    "tts",
    "usuarios",
    "vendor",
    "nRep"
})
public class ParametrosDTO {

    protected String acknowledged;
    @XmlElement(nillable = true)
    protected List<String> alar;
    @XmlElement(nillable = true)
    protected List<String> alarms;
    @XmlElement(name = "amo_like")
    protected String amoLike;
    @XmlElement(nillable = true)
    protected List<String> amoclass;
    @XmlElement(name = "amoclass_like")
    protected String amoclassLike;
    @XmlElement(nillable = true)
    protected List<String> amos;
    protected String auxalarms;
    @XmlElement(name = "busqueda_codalert")
    protected String busquedaCodalert;
    @XmlElement(name = "busqueda_codalertrep")
    protected String busquedaCodalertrep;
    @XmlElement(name = "campo_por")
    protected String campoPor;
    protected String caseta;
    protected String categoria;
    protected String clear;
    protected String cluster;
    protected String codalert;
    protected String codalertrep;
    protected String criticidad;
    @XmlElement(name = "desc_exc", nillable = true)
    protected List<String> descExc;
    @XmlElement(name = "desc_inc", nillable = true)
    protected List<String> descInc;
    @XmlElement(nillable = true)
    protected List<String> estaciones;
    protected String estatus;
    @XmlElement(name = "fecha_alert_fin")
    protected String fechaAlertFin;
    @XmlElement(name = "fecha_alert_ini")
    protected String fechaAlertIni;
    @XmlElement(name = "fecha_busqfin")
    protected String fechaBusqfin;
    @XmlElement(name = "fecha_busqini")
    protected String fechaBusqini;
    @XmlElement(name = "fecha_clear_fin")
    protected String fechaClearFin;
    @XmlElement(name = "fecha_clear_ini")
    protected String fechaClearIni;
    @XmlElement(name = "fecha_open_fin")
    protected String fechaOpenFin;
    @XmlElement(name = "fecha_open_ini")
    protected String fechaOpenIni;
    @XmlElement(name = "fecha_repfin")
    protected String fechaRepfin;
    @XmlElement(name = "fecha_repini")
    protected String fechaRepini;
    protected String formato;
    @XmlElement(name = "genera_tt")
    protected String generaTt;
    protected long id;
    protected String idAlert;
    protected String idEst;
    protected String intervalo;
    protected String isnull;
    @XmlElement(name = "list_opc", nillable = true)
    protected List<String> listOpc;
    @XmlElement(nillable = true)
    protected List<String> listaColumnas;
    protected String login;
    @XmlElement(nillable = true)
    protected List<String> manager;
    @XmlElement(name = "manager_like")
    protected String managerLike;
    @XmlElement(nillable = true)
    protected List<String> managerclasses;
    @XmlElement(name = "mercado_like")
    protected String mercadoLike;
    @XmlElement(nillable = true)
    protected List<String> mercados;
    protected String nameFile;
    @XmlElement(name = "nombre_plantilla")
    protected String nombrePlantilla;
    protected String nulle;
    protected String opcion;
    protected String rangoFecha;
    @XmlElement(nillable = true)
    protected List<String> regiones;
    protected String run;
    @XmlElement(name = "t_alarma")
    protected String tAlarma;
    protected String talertas;
    @XmlElement(name = "times_max")
    protected String timesMax;
    @XmlElement(name = "times_min")
    protected String timesMin;
    @XmlElement(name = "timesupdate_max")
    protected String timesupdateMax;
    @XmlElement(name = "timesupdate_min")
    protected String timesupdateMin;
    @XmlElement(name = "tipo_estacion")
    protected String tipoEstacion;
    @XmlElement(nillable = true)
    protected List<String> tts;
    @XmlElement(nillable = true)
    protected List<String> usuarios;
    protected String vendor;
    protected String nRep;

    /**
     * Obtiene el valor de la propiedad acknowledged.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcknowledged() {
        return acknowledged;
    }

    /**
     * Define el valor de la propiedad acknowledged.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcknowledged(String value) {
        this.acknowledged = value;
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
     * Obtiene el valor de la propiedad amoclassLike.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmoclassLike() {
        return amoclassLike;
    }

    /**
     * Define el valor de la propiedad amoclassLike.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmoclassLike(String value) {
        this.amoclassLike = value;
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
     * Obtiene el valor de la propiedad auxalarms.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuxalarms() {
        return auxalarms;
    }

    /**
     * Define el valor de la propiedad auxalarms.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuxalarms(String value) {
        this.auxalarms = value;
    }

    /**
     * Obtiene el valor de la propiedad busquedaCodalert.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusquedaCodalert() {
        return busquedaCodalert;
    }

    /**
     * Define el valor de la propiedad busquedaCodalert.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusquedaCodalert(String value) {
        this.busquedaCodalert = value;
    }

    /**
     * Obtiene el valor de la propiedad busquedaCodalertrep.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusquedaCodalertrep() {
        return busquedaCodalertrep;
    }

    /**
     * Define el valor de la propiedad busquedaCodalertrep.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusquedaCodalertrep(String value) {
        this.busquedaCodalertrep = value;
    }

    /**
     * Obtiene el valor de la propiedad campoPor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampoPor() {
        return campoPor;
    }

    /**
     * Define el valor de la propiedad campoPor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampoPor(String value) {
        this.campoPor = value;
    }

    /**
     * Obtiene el valor de la propiedad caseta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseta() {
        return caseta;
    }

    /**
     * Define el valor de la propiedad caseta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseta(String value) {
        this.caseta = value;
    }

    /**
     * Obtiene el valor de la propiedad categoria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * Define el valor de la propiedad categoria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoria(String value) {
        this.categoria = value;
    }

    /**
     * Obtiene el valor de la propiedad clear.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClear() {
        return clear;
    }

    /**
     * Define el valor de la propiedad clear.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClear(String value) {
        this.clear = value;
    }

    /**
     * Obtiene el valor de la propiedad cluster.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCluster() {
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
    public void setCluster(String value) {
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
    public String getCodalert() {
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
    public void setCodalert(String value) {
        this.codalert = value;
    }

    /**
     * Obtiene el valor de la propiedad codalertrep.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodalertrep() {
        return codalertrep;
    }

    /**
     * Define el valor de la propiedad codalertrep.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodalertrep(String value) {
        this.codalertrep = value;
    }

    /**
     * Obtiene el valor de la propiedad criticidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCriticidad() {
        return criticidad;
    }

    /**
     * Define el valor de la propiedad criticidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCriticidad(String value) {
        this.criticidad = value;
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
     * Obtiene el valor de la propiedad estatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstatus() {
        return estatus;
    }

    /**
     * Define el valor de la propiedad estatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstatus(String value) {
        this.estatus = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaAlertFin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaAlertFin() {
        return fechaAlertFin;
    }

    /**
     * Define el valor de la propiedad fechaAlertFin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaAlertFin(String value) {
        this.fechaAlertFin = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaAlertIni.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaAlertIni() {
        return fechaAlertIni;
    }

    /**
     * Define el valor de la propiedad fechaAlertIni.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaAlertIni(String value) {
        this.fechaAlertIni = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaBusqfin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaBusqfin() {
        return fechaBusqfin;
    }

    /**
     * Define el valor de la propiedad fechaBusqfin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaBusqfin(String value) {
        this.fechaBusqfin = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaBusqini.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaBusqini() {
        return fechaBusqini;
    }

    /**
     * Define el valor de la propiedad fechaBusqini.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaBusqini(String value) {
        this.fechaBusqini = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaClearFin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaClearFin() {
        return fechaClearFin;
    }

    /**
     * Define el valor de la propiedad fechaClearFin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaClearFin(String value) {
        this.fechaClearFin = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaClearIni.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaClearIni() {
        return fechaClearIni;
    }

    /**
     * Define el valor de la propiedad fechaClearIni.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaClearIni(String value) {
        this.fechaClearIni = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaOpenFin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaOpenFin() {
        return fechaOpenFin;
    }

    /**
     * Define el valor de la propiedad fechaOpenFin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaOpenFin(String value) {
        this.fechaOpenFin = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaOpenIni.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaOpenIni() {
        return fechaOpenIni;
    }

    /**
     * Define el valor de la propiedad fechaOpenIni.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaOpenIni(String value) {
        this.fechaOpenIni = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaRepfin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaRepfin() {
        return fechaRepfin;
    }

    /**
     * Define el valor de la propiedad fechaRepfin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaRepfin(String value) {
        this.fechaRepfin = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaRepini.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaRepini() {
        return fechaRepini;
    }

    /**
     * Define el valor de la propiedad fechaRepini.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaRepini(String value) {
        this.fechaRepini = value;
    }

    /**
     * Obtiene el valor de la propiedad formato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormato() {
        return formato;
    }

    /**
     * Define el valor de la propiedad formato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormato(String value) {
        this.formato = value;
    }

    /**
     * Obtiene el valor de la propiedad generaTt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeneraTt() {
        return generaTt;
    }

    /**
     * Define el valor de la propiedad generaTt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeneraTt(String value) {
        this.generaTt = value;
    }

    /**
     * Obtiene el valor de la propiedad id.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad idAlert.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdAlert() {
        return idAlert;
    }

    /**
     * Define el valor de la propiedad idAlert.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdAlert(String value) {
        this.idAlert = value;
    }

    /**
     * Obtiene el valor de la propiedad idEst.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdEst() {
        return idEst;
    }

    /**
     * Define el valor de la propiedad idEst.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdEst(String value) {
        this.idEst = value;
    }

    /**
     * Obtiene el valor de la propiedad intervalo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntervalo() {
        return intervalo;
    }

    /**
     * Define el valor de la propiedad intervalo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntervalo(String value) {
        this.intervalo = value;
    }

    /**
     * Obtiene el valor de la propiedad isnull.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsnull() {
        return isnull;
    }

    /**
     * Define el valor de la propiedad isnull.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsnull(String value) {
        this.isnull = value;
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
     * Gets the value of the listaColumnas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaColumnas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaColumnas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getListaColumnas() {
        if (listaColumnas == null) {
            listaColumnas = new ArrayList<String>();
        }
        return this.listaColumnas;
    }

    /**
     * Obtiene el valor de la propiedad login.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogin() {
        return login;
    }

    /**
     * Define el valor de la propiedad login.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogin(String value) {
        this.login = value;
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
     * Obtiene el valor de la propiedad mercadoLike.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMercadoLike() {
        return mercadoLike;
    }

    /**
     * Define el valor de la propiedad mercadoLike.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMercadoLike(String value) {
        this.mercadoLike = value;
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
     * Obtiene el valor de la propiedad nameFile.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameFile() {
        return nameFile;
    }

    /**
     * Define el valor de la propiedad nameFile.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameFile(String value) {
        this.nameFile = value;
    }

    /**
     * Obtiene el valor de la propiedad nombrePlantilla.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombrePlantilla() {
        return nombrePlantilla;
    }

    /**
     * Define el valor de la propiedad nombrePlantilla.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombrePlantilla(String value) {
        this.nombrePlantilla = value;
    }

    /**
     * Obtiene el valor de la propiedad nulle.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNulle() {
        return nulle;
    }

    /**
     * Define el valor de la propiedad nulle.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNulle(String value) {
        this.nulle = value;
    }

    /**
     * Obtiene el valor de la propiedad opcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpcion() {
        return opcion;
    }

    /**
     * Define el valor de la propiedad opcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpcion(String value) {
        this.opcion = value;
    }

    /**
     * Obtiene el valor de la propiedad rangoFecha.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRangoFecha() {
        return rangoFecha;
    }

    /**
     * Define el valor de la propiedad rangoFecha.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRangoFecha(String value) {
        this.rangoFecha = value;
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
     * Obtiene el valor de la propiedad run.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRun() {
        return run;
    }

    /**
     * Define el valor de la propiedad run.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRun(String value) {
        this.run = value;
    }

    /**
     * Obtiene el valor de la propiedad tAlarma.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTAlarma() {
        return tAlarma;
    }

    /**
     * Define el valor de la propiedad tAlarma.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTAlarma(String value) {
        this.tAlarma = value;
    }

    /**
     * Obtiene el valor de la propiedad talertas.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTalertas() {
        return talertas;
    }

    /**
     * Define el valor de la propiedad talertas.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTalertas(String value) {
        this.talertas = value;
    }

    /**
     * Obtiene el valor de la propiedad timesMax.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimesMax() {
        return timesMax;
    }

    /**
     * Define el valor de la propiedad timesMax.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimesMax(String value) {
        this.timesMax = value;
    }

    /**
     * Obtiene el valor de la propiedad timesMin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimesMin() {
        return timesMin;
    }

    /**
     * Define el valor de la propiedad timesMin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimesMin(String value) {
        this.timesMin = value;
    }

    /**
     * Obtiene el valor de la propiedad timesupdateMax.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimesupdateMax() {
        return timesupdateMax;
    }

    /**
     * Define el valor de la propiedad timesupdateMax.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimesupdateMax(String value) {
        this.timesupdateMax = value;
    }

    /**
     * Obtiene el valor de la propiedad timesupdateMin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimesupdateMin() {
        return timesupdateMin;
    }

    /**
     * Define el valor de la propiedad timesupdateMin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimesupdateMin(String value) {
        this.timesupdateMin = value;
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
     * Obtiene el valor de la propiedad vendor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendor() {
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
    public void setVendor(String value) {
        this.vendor = value;
    }

    /**
     * Obtiene el valor de la propiedad nRep.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNRep() {
        return nRep;
    }

    /**
     * Define el valor de la propiedad nRep.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNRep(String value) {
        this.nRep = value;
    }

}
