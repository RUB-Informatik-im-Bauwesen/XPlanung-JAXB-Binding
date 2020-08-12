//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2019.08.20 um 07:26:35 AM CEST 
//


package de.xplanung.xplangml._5._1;

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
 * Klasse zur Modellierung eines gesamten Flächennutzungsplans.
 * 
 * <p>Java-Klasse für FP_PlanType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FP_PlanType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/5/1}XP_PlanType">
 *       &lt;sequence>
 *         &lt;element name="gemeinde" type="{http://www.xplanung.de/xplangml/5/1}XP_GemeindePropertyType" maxOccurs="unbounded"/>
 *         &lt;element name="planaufstellendeGemeinde" type="{http://www.xplanung.de/xplangml/5/1}XP_GemeindePropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="plangeber" type="{http://www.xplanung.de/xplangml/5/1}XP_PlangeberPropertyType" minOccurs="0"/>
 *         &lt;element name="planArt" type="{http://www.xplanung.de/xplangml/5/1}FP_PlanArt"/>
 *         &lt;element name="sonstPlanArt" type="{http://www.opengis.net/gml/3.2}CodeType" minOccurs="0"/>
 *         &lt;element name="sachgebiet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="verfahren" type="{http://www.xplanung.de/xplangml/5/1}FP_Verfahren" minOccurs="0"/>
 *         &lt;element name="rechtsstand" type="{http://www.xplanung.de/xplangml/5/1}FP_Rechtsstand" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.opengis.net/gml/3.2}CodeType" minOccurs="0"/>
 *         &lt;element name="aufstellungsbeschlussDatum" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="auslegungsStartDatum" type="{http://www.w3.org/2001/XMLSchema}date" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="auslegungsEndDatum" type="{http://www.w3.org/2001/XMLSchema}date" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="traegerbeteiligungsStartDatum" type="{http://www.w3.org/2001/XMLSchema}date" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="traegerbeteiligungsEndDatum" type="{http://www.w3.org/2001/XMLSchema}date" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="aenderungenBisDatum" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="entwurfsbeschlussDatum" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="planbeschlussDatum" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="wirksamkeitsDatum" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="versionBauNVODatum" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="versionBauNVOText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="versionBauGBDatum" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="versionBauGBText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="versionSonstRechtsgrundlageDatum" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="versionSonstRechtsgrundlageText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bereich" type="{http://www.opengis.net/gml/3.2}ReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/5/1}_GenericApplicationPropertyOfFP_Plan" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FP_PlanType", propOrder = {
    "gemeinde",
    "planaufstellendeGemeinde",
    "plangeber",
    "planArt",
    "sonstPlanArt",
    "sachgebiet",
    "verfahren",
    "rechtsstand",
    "status",
    "aufstellungsbeschlussDatum",
    "auslegungsStartDatum",
    "auslegungsEndDatum",
    "traegerbeteiligungsStartDatum",
    "traegerbeteiligungsEndDatum",
    "aenderungenBisDatum",
    "entwurfsbeschlussDatum",
    "planbeschlussDatum",
    "wirksamkeitsDatum",
    "versionBauNVODatum",
    "versionBauNVOText",
    "versionBauGBDatum",
    "versionBauGBText",
    "versionSonstRechtsgrundlageDatum",
    "versionSonstRechtsgrundlageText",
    "bereich",
    "genericApplicationPropertyOfFPPlan"
})
public class FPPlanType
    extends XPPlanType
{

    @XmlElement(required = true)
    protected List<XPGemeindePropertyType> gemeinde;
    protected List<XPGemeindePropertyType> planaufstellendeGemeinde;
    protected XPPlangeberPropertyType plangeber;
    @XmlElement(required = true)
    protected String planArt;
    protected CodeType sonstPlanArt;
    protected String sachgebiet;
    protected String verfahren;
    protected String rechtsstand;
    protected CodeType status;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar aufstellungsbeschlussDatum;
    @XmlSchemaType(name = "date")
    protected List<XMLGregorianCalendar> auslegungsStartDatum;
    @XmlSchemaType(name = "date")
    protected List<XMLGregorianCalendar> auslegungsEndDatum;
    @XmlSchemaType(name = "date")
    protected List<XMLGregorianCalendar> traegerbeteiligungsStartDatum;
    @XmlSchemaType(name = "date")
    protected List<XMLGregorianCalendar> traegerbeteiligungsEndDatum;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar aenderungenBisDatum;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar entwurfsbeschlussDatum;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar planbeschlussDatum;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar wirksamkeitsDatum;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar versionBauNVODatum;
    protected String versionBauNVOText;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar versionBauGBDatum;
    protected String versionBauGBText;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar versionSonstRechtsgrundlageDatum;
    protected String versionSonstRechtsgrundlageText;
    protected List<ReferenceType> bereich;
    @XmlElement(name = "_GenericApplicationPropertyOfFP_Plan")
    protected List<Object> genericApplicationPropertyOfFPPlan;

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
     * Gets the value of the planaufstellendeGemeinde property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the planaufstellendeGemeinde property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlanaufstellendeGemeinde().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XPGemeindePropertyType }
     * 
     * 
     */
    public List<XPGemeindePropertyType> getPlanaufstellendeGemeinde() {
        if (planaufstellendeGemeinde == null) {
            planaufstellendeGemeinde = new ArrayList<XPGemeindePropertyType>();
        }
        return this.planaufstellendeGemeinde;
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
     * Ruft den Wert der planArt-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanArt() {
        return planArt;
    }

    /**
     * Legt den Wert der planArt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanArt(String value) {
        this.planArt = value;
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
     * Ruft den Wert der sachgebiet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSachgebiet() {
        return sachgebiet;
    }

    /**
     * Legt den Wert der sachgebiet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSachgebiet(String value) {
        this.sachgebiet = value;
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
     * Ruft den Wert der entwurfsbeschlussDatum-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEntwurfsbeschlussDatum() {
        return entwurfsbeschlussDatum;
    }

    /**
     * Legt den Wert der entwurfsbeschlussDatum-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEntwurfsbeschlussDatum(XMLGregorianCalendar value) {
        this.entwurfsbeschlussDatum = value;
    }

    /**
     * Ruft den Wert der planbeschlussDatum-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPlanbeschlussDatum() {
        return planbeschlussDatum;
    }

    /**
     * Legt den Wert der planbeschlussDatum-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPlanbeschlussDatum(XMLGregorianCalendar value) {
        this.planbeschlussDatum = value;
    }

    /**
     * Ruft den Wert der wirksamkeitsDatum-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getWirksamkeitsDatum() {
        return wirksamkeitsDatum;
    }

    /**
     * Legt den Wert der wirksamkeitsDatum-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setWirksamkeitsDatum(XMLGregorianCalendar value) {
        this.wirksamkeitsDatum = value;
    }

    /**
     * Ruft den Wert der versionBauNVODatum-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVersionBauNVODatum() {
        return versionBauNVODatum;
    }

    /**
     * Legt den Wert der versionBauNVODatum-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVersionBauNVODatum(XMLGregorianCalendar value) {
        this.versionBauNVODatum = value;
    }

    /**
     * Ruft den Wert der versionBauNVOText-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersionBauNVOText() {
        return versionBauNVOText;
    }

    /**
     * Legt den Wert der versionBauNVOText-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersionBauNVOText(String value) {
        this.versionBauNVOText = value;
    }

    /**
     * Ruft den Wert der versionBauGBDatum-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVersionBauGBDatum() {
        return versionBauGBDatum;
    }

    /**
     * Legt den Wert der versionBauGBDatum-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVersionBauGBDatum(XMLGregorianCalendar value) {
        this.versionBauGBDatum = value;
    }

    /**
     * Ruft den Wert der versionBauGBText-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersionBauGBText() {
        return versionBauGBText;
    }

    /**
     * Legt den Wert der versionBauGBText-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersionBauGBText(String value) {
        this.versionBauGBText = value;
    }

    /**
     * Ruft den Wert der versionSonstRechtsgrundlageDatum-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVersionSonstRechtsgrundlageDatum() {
        return versionSonstRechtsgrundlageDatum;
    }

    /**
     * Legt den Wert der versionSonstRechtsgrundlageDatum-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVersionSonstRechtsgrundlageDatum(XMLGregorianCalendar value) {
        this.versionSonstRechtsgrundlageDatum = value;
    }

    /**
     * Ruft den Wert der versionSonstRechtsgrundlageText-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersionSonstRechtsgrundlageText() {
        return versionSonstRechtsgrundlageText;
    }

    /**
     * Legt den Wert der versionSonstRechtsgrundlageText-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersionSonstRechtsgrundlageText(String value) {
        this.versionSonstRechtsgrundlageText = value;
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
     * Gets the value of the genericApplicationPropertyOfFPPlan property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfFPPlan property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfFPPlan().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfFPPlan() {
        if (genericApplicationPropertyOfFPPlan == null) {
            genericApplicationPropertyOfFPPlan = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfFPPlan;
    }

}
