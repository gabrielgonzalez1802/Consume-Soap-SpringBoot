//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.06.23 a las 07:32:33 PM VET 
//


package com.sefspring.wsdls;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para resultadosDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="resultadosDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="anio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="catestacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cluster" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codalert" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dateacknowledge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="datealert" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dateclearalert" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="diasfalla" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="duraciondias" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="horafalla" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="idalert" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="idestacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idregion" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="manager" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="managerclass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mercado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="minfalla" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nameFile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="neaffected" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="neaffectedclass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="noaplicadisp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nombreestacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="objeto" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="oclear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="opcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="operator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="operatorclear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="operatorr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pesoservicio" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="run" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="segfalla" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="semana" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="severity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="statusalert" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="timeS" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="timesupdate" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="tipocaseta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipoestacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="troubleticket" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="typeclear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="usu" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="vendor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultadosDTO", propOrder = {
    "anio",
    "catestacion",
    "cluster",
    "codalert",
    "dateacknowledge",
    "datealert",
    "dateclearalert",
    "description",
    "dia",
    "diasfalla",
    "duraciondias",
    "horafalla",
    "idalert",
    "idestacion",
    "idregion",
    "manager",
    "managerclass",
    "mercado",
    "mes",
    "minfalla",
    "nameFile",
    "neaffected",
    "neaffectedclass",
    "noaplicadisp",
    "nombreestacion",
    "objeto",
    "oclear",
    "opcion",
    "operator",
    "operatorclear",
    "operatorr",
    "pesoservicio",
    "run",
    "segfalla",
    "semana",
    "severity",
    "statusalert",
    "timeS",
    "timesupdate",
    "tipocaseta",
    "tipoestacion",
    "troubleticket",
    "typeclear",
    "usu",
    "vendor"
})
public class ResultadosDTO {

    protected String anio;
    protected String catestacion;
    protected String cluster;
    protected String codalert;
    protected String dateacknowledge;
    protected String datealert;
    protected String dateclearalert;
    protected String description;
    protected String dia;
    protected int diasfalla;
    protected double duraciondias;
    protected int horafalla;
    protected int idalert;
    protected String idestacion;
    protected long idregion;
    protected String manager;
    protected String managerclass;
    protected String mercado;
    protected String mes;
    protected int minfalla;
    protected String nameFile;
    protected String neaffected;
    protected String neaffectedclass;
    protected String noaplicadisp;
    protected String nombreestacion;
    protected Object objeto;
    protected String oclear;
    protected String opcion;
    protected String operator;
    protected String operatorclear;
    protected String operatorr;
    protected int pesoservicio;
    protected String run;
    protected int segfalla;
    protected String semana;
    protected String severity;
    protected String statusalert;
    protected int timeS;
    protected int timesupdate;
    protected String tipocaseta;
    protected String tipoestacion;
    protected int troubleticket;
    protected String typeclear;
    protected boolean usu;
    protected String vendor;

    /**
     * Obtiene el valor de la propiedad anio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnio() {
        return anio;
    }

    /**
     * Define el valor de la propiedad anio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnio(String value) {
        this.anio = value;
    }

    /**
     * Obtiene el valor de la propiedad catestacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatestacion() {
        return catestacion;
    }

    /**
     * Define el valor de la propiedad catestacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatestacion(String value) {
        this.catestacion = value;
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
     * Obtiene el valor de la propiedad dateacknowledge.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateacknowledge() {
        return dateacknowledge;
    }

    /**
     * Define el valor de la propiedad dateacknowledge.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateacknowledge(String value) {
        this.dateacknowledge = value;
    }

    /**
     * Obtiene el valor de la propiedad datealert.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatealert() {
        return datealert;
    }

    /**
     * Define el valor de la propiedad datealert.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatealert(String value) {
        this.datealert = value;
    }

    /**
     * Obtiene el valor de la propiedad dateclearalert.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateclearalert() {
        return dateclearalert;
    }

    /**
     * Define el valor de la propiedad dateclearalert.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateclearalert(String value) {
        this.dateclearalert = value;
    }

    /**
     * Obtiene el valor de la propiedad description.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Define el valor de la propiedad description.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Obtiene el valor de la propiedad dia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDia() {
        return dia;
    }

    /**
     * Define el valor de la propiedad dia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDia(String value) {
        this.dia = value;
    }

    /**
     * Obtiene el valor de la propiedad diasfalla.
     * 
     */
    public int getDiasfalla() {
        return diasfalla;
    }

    /**
     * Define el valor de la propiedad diasfalla.
     * 
     */
    public void setDiasfalla(int value) {
        this.diasfalla = value;
    }

    /**
     * Obtiene el valor de la propiedad duraciondias.
     * 
     */
    public double getDuraciondias() {
        return duraciondias;
    }

    /**
     * Define el valor de la propiedad duraciondias.
     * 
     */
    public void setDuraciondias(double value) {
        this.duraciondias = value;
    }

    /**
     * Obtiene el valor de la propiedad horafalla.
     * 
     */
    public int getHorafalla() {
        return horafalla;
    }

    /**
     * Define el valor de la propiedad horafalla.
     * 
     */
    public void setHorafalla(int value) {
        this.horafalla = value;
    }

    /**
     * Obtiene el valor de la propiedad idalert.
     * 
     */
    public int getIdalert() {
        return idalert;
    }

    /**
     * Define el valor de la propiedad idalert.
     * 
     */
    public void setIdalert(int value) {
        this.idalert = value;
    }

    /**
     * Obtiene el valor de la propiedad idestacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdestacion() {
        return idestacion;
    }

    /**
     * Define el valor de la propiedad idestacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdestacion(String value) {
        this.idestacion = value;
    }

    /**
     * Obtiene el valor de la propiedad idregion.
     * 
     */
    public long getIdregion() {
        return idregion;
    }

    /**
     * Define el valor de la propiedad idregion.
     * 
     */
    public void setIdregion(long value) {
        this.idregion = value;
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

    /**
     * Obtiene el valor de la propiedad managerclass.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManagerclass() {
        return managerclass;
    }

    /**
     * Define el valor de la propiedad managerclass.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManagerclass(String value) {
        this.managerclass = value;
    }

    /**
     * Obtiene el valor de la propiedad mercado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMercado() {
        return mercado;
    }

    /**
     * Define el valor de la propiedad mercado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMercado(String value) {
        this.mercado = value;
    }

    /**
     * Obtiene el valor de la propiedad mes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMes() {
        return mes;
    }

    /**
     * Define el valor de la propiedad mes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMes(String value) {
        this.mes = value;
    }

    /**
     * Obtiene el valor de la propiedad minfalla.
     * 
     */
    public int getMinfalla() {
        return minfalla;
    }

    /**
     * Define el valor de la propiedad minfalla.
     * 
     */
    public void setMinfalla(int value) {
        this.minfalla = value;
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
     * Obtiene el valor de la propiedad neaffected.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNeaffected() {
        return neaffected;
    }

    /**
     * Define el valor de la propiedad neaffected.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNeaffected(String value) {
        this.neaffected = value;
    }

    /**
     * Obtiene el valor de la propiedad neaffectedclass.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNeaffectedclass() {
        return neaffectedclass;
    }

    /**
     * Define el valor de la propiedad neaffectedclass.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNeaffectedclass(String value) {
        this.neaffectedclass = value;
    }

    /**
     * Obtiene el valor de la propiedad noaplicadisp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoaplicadisp() {
        return noaplicadisp;
    }

    /**
     * Define el valor de la propiedad noaplicadisp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoaplicadisp(String value) {
        this.noaplicadisp = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreestacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreestacion() {
        return nombreestacion;
    }

    /**
     * Define el valor de la propiedad nombreestacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreestacion(String value) {
        this.nombreestacion = value;
    }

    /**
     * Obtiene el valor de la propiedad objeto.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getObjeto() {
        return objeto;
    }

    /**
     * Define el valor de la propiedad objeto.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setObjeto(Object value) {
        this.objeto = value;
    }

    /**
     * Obtiene el valor de la propiedad oclear.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOclear() {
        return oclear;
    }

    /**
     * Define el valor de la propiedad oclear.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOclear(String value) {
        this.oclear = value;
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
     * Obtiene el valor de la propiedad operator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperator() {
        return operator;
    }

    /**
     * Define el valor de la propiedad operator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperator(String value) {
        this.operator = value;
    }

    /**
     * Obtiene el valor de la propiedad operatorclear.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatorclear() {
        return operatorclear;
    }

    /**
     * Define el valor de la propiedad operatorclear.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatorclear(String value) {
        this.operatorclear = value;
    }

    /**
     * Obtiene el valor de la propiedad operatorr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatorr() {
        return operatorr;
    }

    /**
     * Define el valor de la propiedad operatorr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatorr(String value) {
        this.operatorr = value;
    }

    /**
     * Obtiene el valor de la propiedad pesoservicio.
     * 
     */
    public int getPesoservicio() {
        return pesoservicio;
    }

    /**
     * Define el valor de la propiedad pesoservicio.
     * 
     */
    public void setPesoservicio(int value) {
        this.pesoservicio = value;
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
     * Obtiene el valor de la propiedad segfalla.
     * 
     */
    public int getSegfalla() {
        return segfalla;
    }

    /**
     * Define el valor de la propiedad segfalla.
     * 
     */
    public void setSegfalla(int value) {
        this.segfalla = value;
    }

    /**
     * Obtiene el valor de la propiedad semana.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSemana() {
        return semana;
    }

    /**
     * Define el valor de la propiedad semana.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSemana(String value) {
        this.semana = value;
    }

    /**
     * Obtiene el valor de la propiedad severity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeverity() {
        return severity;
    }

    /**
     * Define el valor de la propiedad severity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeverity(String value) {
        this.severity = value;
    }

    /**
     * Obtiene el valor de la propiedad statusalert.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusalert() {
        return statusalert;
    }

    /**
     * Define el valor de la propiedad statusalert.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusalert(String value) {
        this.statusalert = value;
    }

    /**
     * Obtiene el valor de la propiedad timeS.
     * 
     */
    public int getTimeS() {
        return timeS;
    }

    /**
     * Define el valor de la propiedad timeS.
     * 
     */
    public void setTimeS(int value) {
        this.timeS = value;
    }

    /**
     * Obtiene el valor de la propiedad timesupdate.
     * 
     */
    public int getTimesupdate() {
        return timesupdate;
    }

    /**
     * Define el valor de la propiedad timesupdate.
     * 
     */
    public void setTimesupdate(int value) {
        this.timesupdate = value;
    }

    /**
     * Obtiene el valor de la propiedad tipocaseta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipocaseta() {
        return tipocaseta;
    }

    /**
     * Define el valor de la propiedad tipocaseta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipocaseta(String value) {
        this.tipocaseta = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoestacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoestacion() {
        return tipoestacion;
    }

    /**
     * Define el valor de la propiedad tipoestacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoestacion(String value) {
        this.tipoestacion = value;
    }

    /**
     * Obtiene el valor de la propiedad troubleticket.
     * 
     */
    public int getTroubleticket() {
        return troubleticket;
    }

    /**
     * Define el valor de la propiedad troubleticket.
     * 
     */
    public void setTroubleticket(int value) {
        this.troubleticket = value;
    }

    /**
     * Obtiene el valor de la propiedad typeclear.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeclear() {
        return typeclear;
    }

    /**
     * Define el valor de la propiedad typeclear.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeclear(String value) {
        this.typeclear = value;
    }

    /**
     * Obtiene el valor de la propiedad usu.
     * 
     */
    public boolean isUsu() {
        return usu;
    }

    /**
     * Define el valor de la propiedad usu.
     * 
     */
    public void setUsu(boolean value) {
        this.usu = value;
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

}
