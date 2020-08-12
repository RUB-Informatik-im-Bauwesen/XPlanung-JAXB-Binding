//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.06.04 um 03:33:59 PM CEST 
//


package de.xplanung.xplangml._4._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import net.opengis.gml._3.CodeType;
import net.opengis.gml._3.ReferenceType;


/**
 * Die Klasse modelliert einen Bebauungsplan
 * 
 * 
 * <p>Java-Klasse für BP_PlanType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="BP_PlanType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/4/1}XP_PlanType">
 *       &lt;sequence>
 *         &lt;element name="gemeinde" type="{http://www.xplanung.de/xplangml/4/1}XP_GemeindePropertyType" maxOccurs="unbounded"/>
 *         &lt;element name="plangeber" type="{http://www.xplanung.de/xplangml/4/1}XP_PlangeberPropertyType" minOccurs="0"/>
 *         &lt;element name="planArt" type="{http://www.xplanung.de/xplangml/4/1}BP_PlanArt" maxOccurs="unbounded"/>
 *         &lt;element name="sonstPlanArt" type="{http://www.opengis.net/gml/3.2}CodeType" minOccurs="0"/>
 *         &lt;element name="verfahren" type="{http://www.xplanung.de/xplangml/4/1}BP_Verfahren" minOccurs="0"/>
 *         &lt;element name="rechtsstand" type="{http://www.xplanung.de/xplangml/4/1}BP_Rechtsstand" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.opengis.net/gml/3.2}CodeType" minOccurs="0"/>
 *         &lt;element name="hoehenbezug" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="aenderungenBisDatum" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="aufstellungsbeschlussDatum" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="veraenderungssperreDatum" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="auslegungsStartDatum" type="{http://www.w3.org/2001/XMLSchema}date" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="auslegungsEndDatum" type="{http://www.w3.org/2001/XMLSchema}date" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="traegerbeteiligungsStartDatum" type="{http://www.w3.org/2001/XMLSchema}date" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="traegerbeteiligungsEndDatum" type="{http://www.w3.org/2001/XMLSchema}date" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="satzungsbeschlussDatum" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="rechtsverordnungsDatum" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="inkrafttretensDatum" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ausfertigungsDatum" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="veraenderungssperre" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="staedtebaulicherVertrag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="erschliessungsVertrag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="durchfuehrungsVertrag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="gruenordnungsplan" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="refKoordinatenListe" type="{http://www.xplanung.de/xplangml/4/1}XP_ExterneReferenzPropertyType" minOccurs="0"/>
 *         &lt;element name="refGrundstuecksverzeichnis" type="{http://www.xplanung.de/xplangml/4/1}XP_ExterneReferenzPropertyType" minOccurs="0"/>
 *         &lt;element name="refPflanzliste" type="{http://www.xplanung.de/xplangml/4/1}XP_ExterneReferenzPropertyType" minOccurs="0"/>
 *         &lt;element name="refUmweltbericht" type="{http://www.xplanung.de/xplangml/4/1}XP_ExterneReferenzPropertyType" minOccurs="0"/>
 *         &lt;element name="refSatzung" type="{http://www.xplanung.de/xplangml/4/1}XP_ExterneReferenzPropertyType" minOccurs="0"/>
 *         &lt;element name="refGruenordnungsplan" type="{http://www.xplanung.de/xplangml/4/1}XP_ExterneReferenzPropertyType" minOccurs="0"/>
 *         &lt;element name="bereich" type="{http://www.opengis.net/gml/3.2}ReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/4/1}_GenericApplicationPropertyOfBP_Plan" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BP_PlanType", propOrder = {
    "gemeinde",
    "plangeber",
    "planArt",
    "sonstPlanArt",
    "verfahren",
    "rechtsstand",
    "status",
    "hoehenbezug",
    "aenderungenBisDatum",
    "aufstellungsbeschlussDatum",
    "veraenderungssperreDatum",
    "auslegungsStartDatum",
    "auslegungsEndDatum",
    "traegerbeteiligungsStartDatum",
    "traegerbeteiligungsEndDatum",
    "satzungsbeschlussDatum",
    "rechtsverordnungsDatum",
    "inkrafttretensDatum",
    "ausfertigungsDatum",
    "veraenderungssperre",
    "staedtebaulicherVertrag",
    "erschliessungsVertrag",
    "durchfuehrungsVertrag",
    "gruenordnungsplan",
    "refKoordinatenListe",
    "refGrundstuecksverzeichnis",
    "refPflanzliste",
    "refUmweltbericht",
    "refSatzung",
    "refGruenordnungsplan",
    "bereich",
    "genericApplicationPropertyOfBPPlan"
})
public class BPPlanType
    extends XPPlanType
{

    @XmlElement(required = true)
    protected List<XPGemeindePropertyType> gemeinde;
    protected XPPlangeberPropertyType plangeber;
    @XmlElement(required = true)
    protected List<String> planArt;
    protected CodeType sonstPlanArt;
    protected String verfahren;
    protected String rechtsstand;
    protected CodeType status;
    protected String hoehenbezug;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar aenderungenBisDatum;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar aufstellungsbeschlussDatum;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar veraenderungssperreDatum;
    @XmlSchemaType(name = "date")
    protected List<XMLGregorianCalendar> auslegungsStartDatum;
    @XmlSchemaType(name = "date")
    protected List<XMLGregorianCalendar> auslegungsEndDatum;
    @XmlSchemaType(name = "date")
    protected List<XMLGregorianCalendar> traegerbeteiligungsStartDatum;
    @XmlSchemaType(name = "date")
    protected List<XMLGregorianCalendar> traegerbeteiligungsEndDatum;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar satzungsbeschlussDatum;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar rechtsverordnungsDatum;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar inkrafttretensDatum;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar ausfertigungsDatum;
    protected Boolean veraenderungssperre;
    protected Boolean staedtebaulicherVertrag;
    protected Boolean erschliessungsVertrag;
    protected Boolean durchfuehrungsVertrag;
    protected Boolean gruenordnungsplan;
    protected XPExterneReferenzPropertyType refKoordinatenListe;
    protected XPExterneReferenzPropertyType refGrundstuecksverzeichnis;
    protected XPExterneReferenzPropertyType refPflanzliste;
    protected XPExterneReferenzPropertyType refUmweltbericht;
    protected XPExterneReferenzPropertyType refSatzung;
    protected XPExterneReferenzPropertyType refGruenordnungsplan;
    protected List<ReferenceType> bereich;
    @XmlElement(name = "_GenericApplicationPropertyOfBP_Plan")
    protected List<Object> genericApplicationPropertyOfBPPlan;

    /**
     * Gets the value of the gemeinde property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gemeinde property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGemeinde().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XPGemeindePropertyType }
     * 
     * 
     */
    public List<XPGemeindePropertyType> getGemeinde() {
        if (gemeinde == null) {
            gemeinde = new ArrayList<XPGemeindePropertyType>();
        }
        return this.gemeinde;
    }

    /**
     * Ruft den Wert der plangeber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XPPlangeberPropertyType }
     *     
     */
    public XPPlangeberPropertyType getPlangeber() {
        return plangeber;
    }

    /**
     * Legt den Wert der plangeber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XPPlangeberPropertyType }
     *     
     */
    public void setPlangeber(XPPlangeberPropertyType value) {
        this.plangeber = value;
    }

    /**
     * Gets the value of the planArt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the planArt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlanArt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPlanArt() {
        if (planArt == null) {
            planArt = new ArrayList<String>();
        }
        return this.planArt;
    }

    /**
     * Ruft den Wert der sonstPlanArt-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getSonstPlanArt() {
        return sonstPlanArt;
    }

    /**
     * Legt den Wert der sonstPlanArt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setSonstPlanArt(CodeType value) {
        this.sonstPlanArt = value;
    }

    /**
     * Ruft den Wert der verfahren-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerfahren() {
        return verfahren;
    }

    /**
     * Legt den Wert der verfahren-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerfahren(String value) {
        this.verfahren = value;
    }

    /**
     * Ruft den Wert der rechtsstand-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRechtsstand() {
        return rechtsstand;
    }

    /**
     * Legt den Wert der rechtsstand-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRechtsstand(String value) {
        this.rechtsstand = value;
    }

    /**
     * Ruft den Wert der status-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getStatus() {
        return status;
    }

    /**
     * Legt den Wert der status-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setStatus(CodeType value) {
        this.status = value;
    }

    /**
     * Ruft den Wert der hoehenbezug-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoehenbezug() {
        return hoehenbezug;
    }

    /**
     * Legt den Wert der hoehenbezug-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoehenbezug(String value) {
        this.hoehenbezug = value;
    }

    /**
     * Ruft den Wert der aenderungenBisDatum-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAenderungenBisDatum() {
        return aenderungenBisDatum;
    }

    /**
     * Legt den Wert der aenderungenBisDatum-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAenderungenBisDatum(XMLGregorianCalendar value) {
        this.aenderungenBisDatum = value;
    }

    /**
     * Ruft den Wert der aufstellungsbeschlussDatum-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAufstellungsbeschlussDatum() {
        return aufstellungsbeschlussDatum;
    }

    /**
     * Legt den Wert der aufstellungsbeschlussDatum-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAufstellungsbeschlussDatum(XMLGregorianCalendar value) {
        this.aufstellungsbeschlussDatum = value;
    }

    /**
     * Ruft den Wert der veraenderungssperreDatum-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVeraenderungssperreDatum() {
        return veraenderungssperreDatum;
    }

    /**
     * Legt den Wert der veraenderungssperreDatum-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVeraenderungssperreDatum(XMLGregorianCalendar value) {
        this.veraenderungssperreDatum = value;
    }

    /**
     * Gets the value of the auslegungsStartDatum property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the auslegungsStartDatum property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuslegungsStartDatum().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XMLGregorianCalendar }
     * 
     * 
     */
    public List<XMLGregorianCalendar> getAuslegungsStartDatum() {
        if (auslegungsStartDatum == null) {
            auslegungsStartDatum = new ArrayList<XMLGregorianCalendar>();
        }
        return this.auslegungsStartDatum;
    }

    /**
     * Gets the value of the auslegungsEndDatum property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the auslegungsEndDatum property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuslegungsEndDatum().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XMLGregorianCalendar }
     * 
     * 
     */
    public List<XMLGregorianCalendar> getAuslegungsEndDatum() {
        if (auslegungsEndDatum == null) {
            auslegungsEndDatum = new ArrayList<XMLGregorianCalendar>();
        }
        return this.auslegungsEndDatum;
    }

    /**
     * Gets the value of the traegerbeteiligungsStartDatum property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the traegerbeteiligungsStartDatum property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTraegerbeteiligungsStartDatum().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XMLGregorianCalendar }
     * 
     * 
     */
    public List<XMLGregorianCalendar> getTraegerbeteiligungsStartDatum() {
        if (traegerbeteiligungsStartDatum == null) {
            traegerbeteiligungsStartDatum = new ArrayList<XMLGregorianCalendar>();
        }
        return this.traegerbeteiligungsStartDatum;
    }

    /**
     * Gets the value of the traegerbeteiligungsEndDatum property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the traegerbeteiligungsEndDatum property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTraegerbeteiligungsEndDatum().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XMLGregorianCalendar }
     * 
     * 
     */
    public List<XMLGregorianCalendar> getTraegerbeteiligungsEndDatum() {
        if (traegerbeteiligungsEndDatum == null) {
            traegerbeteiligungsEndDatum = new ArrayList<XMLGregorianCalendar>();
        }
        return this.traegerbeteiligungsEndDatum;
    }

    /**
     * Ruft den Wert der satzungsbeschlussDatum-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSatzungsbeschlussDatum() {
        return satzungsbeschlussDatum;
    }

    /**
     * Legt den Wert der satzungsbeschlussDatum-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSatzungsbeschlussDatum(XMLGregorianCalendar value) {
        this.satzungsbeschlussDatum = value;
    }

    /**
     * Ruft den Wert der rechtsverordnungsDatum-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRechtsverordnungsDatum() {
        return rechtsverordnungsDatum;
    }

    /**
     * Legt den Wert der rechtsverordnungsDatum-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRechtsverordnungsDatum(XMLGregorianCalendar value) {
        this.rechtsverordnungsDatum = value;
    }

    /**
     * Ruft den Wert der inkrafttretensDatum-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInkrafttretensDatum() {
        return inkrafttretensDatum;
    }

    /**
     * Legt den Wert der inkrafttretensDatum-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInkrafttretensDatum(XMLGregorianCalendar value) {
        this.inkrafttretensDatum = value;
    }

    /**
     * Ruft den Wert der ausfertigungsDatum-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAusfertigungsDatum() {
        return ausfertigungsDatum;
    }

    /**
     * Legt den Wert der ausfertigungsDatum-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAusfertigungsDatum(XMLGregorianCalendar value) {
        this.ausfertigungsDatum = value;
    }

    /**
     * Ruft den Wert der veraenderungssperre-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVeraenderungssperre() {
        return veraenderungssperre;
    }

    /**
     * Legt den Wert der veraenderungssperre-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVeraenderungssperre(Boolean value) {
        this.veraenderungssperre = value;
    }

    /**
     * Ruft den Wert der staedtebaulicherVertrag-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStaedtebaulicherVertrag() {
        return staedtebaulicherVertrag;
    }

    /**
     * Legt den Wert der staedtebaulicherVertrag-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStaedtebaulicherVertrag(Boolean value) {
        this.staedtebaulicherVertrag = value;
    }

    /**
     * Ruft den Wert der erschliessungsVertrag-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isErschliessungsVertrag() {
        return erschliessungsVertrag;
    }

    /**
     * Legt den Wert der erschliessungsVertrag-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setErschliessungsVertrag(Boolean value) {
        this.erschliessungsVertrag = value;
    }

    /**
     * Ruft den Wert der durchfuehrungsVertrag-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDurchfuehrungsVertrag() {
        return durchfuehrungsVertrag;
    }

    /**
     * Legt den Wert der durchfuehrungsVertrag-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDurchfuehrungsVertrag(Boolean value) {
        this.durchfuehrungsVertrag = value;
    }

    /**
     * Ruft den Wert der gruenordnungsplan-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGruenordnungsplan() {
        return gruenordnungsplan;
    }

    /**
     * Legt den Wert der gruenordnungsplan-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGruenordnungsplan(Boolean value) {
        this.gruenordnungsplan = value;
    }

    /**
     * Ruft den Wert der refKoordinatenListe-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XPExterneReferenzPropertyType }
     *     
     */
    public XPExterneReferenzPropertyType getRefKoordinatenListe() {
        return refKoordinatenListe;
    }

    /**
     * Legt den Wert der refKoordinatenListe-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XPExterneReferenzPropertyType }
     *     
     */
    public void setRefKoordinatenListe(XPExterneReferenzPropertyType value) {
        this.refKoordinatenListe = value;
    }

    /**
     * Ruft den Wert der refGrundstuecksverzeichnis-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XPExterneReferenzPropertyType }
     *     
     */
    public XPExterneReferenzPropertyType getRefGrundstuecksverzeichnis() {
        return refGrundstuecksverzeichnis;
    }

    /**
     * Legt den Wert der refGrundstuecksverzeichnis-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XPExterneReferenzPropertyType }
     *     
     */
    public void setRefGrundstuecksverzeichnis(XPExterneReferenzPropertyType value) {
        this.refGrundstuecksverzeichnis = value;
    }

    /**
     * Ruft den Wert der refPflanzliste-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XPExterneReferenzPropertyType }
     *     
     */
    public XPExterneReferenzPropertyType getRefPflanzliste() {
        return refPflanzliste;
    }

    /**
     * Legt den Wert der refPflanzliste-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XPExterneReferenzPropertyType }
     *     
     */
    public void setRefPflanzliste(XPExterneReferenzPropertyType value) {
        this.refPflanzliste = value;
    }

    /**
     * Ruft den Wert der refUmweltbericht-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XPExterneReferenzPropertyType }
     *     
     */
    public XPExterneReferenzPropertyType getRefUmweltbericht() {
        return refUmweltbericht;
    }

    /**
     * Legt den Wert der refUmweltbericht-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XPExterneReferenzPropertyType }
     *     
     */
    public void setRefUmweltbericht(XPExterneReferenzPropertyType value) {
        this.refUmweltbericht = value;
    }

    /**
     * Ruft den Wert der refSatzung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XPExterneReferenzPropertyType }
     *     
     */
    public XPExterneReferenzPropertyType getRefSatzung() {
        return refSatzung;
    }

    /**
     * Legt den Wert der refSatzung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XPExterneReferenzPropertyType }
     *     
     */
    public void setRefSatzung(XPExterneReferenzPropertyType value) {
        this.refSatzung = value;
    }

    /**
     * Ruft den Wert der refGruenordnungsplan-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XPExterneReferenzPropertyType }
     *     
     */
    public XPExterneReferenzPropertyType getRefGruenordnungsplan() {
        return refGruenordnungsplan;
    }

    /**
     * Legt den Wert der refGruenordnungsplan-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XPExterneReferenzPropertyType }
     *     
     */
    public void setRefGruenordnungsplan(XPExterneReferenzPropertyType value) {
        this.refGruenordnungsplan = value;
    }

    /**
     * Gets the value of the bereich property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bereich property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBereich().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenceType }
     * 
     * 
     */
    public List<ReferenceType> getBereich() {
        if (bereich == null) {
            bereich = new ArrayList<ReferenceType>();
        }
        return this.bereich;
    }

    /**
     * Gets the value of the genericApplicationPropertyOfBPPlan property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfBPPlan property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfBPPlan().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfBPPlan() {
        if (genericApplicationPropertyOfBPPlan == null) {
            genericApplicationPropertyOfBPPlan = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfBPPlan;
    }

}
