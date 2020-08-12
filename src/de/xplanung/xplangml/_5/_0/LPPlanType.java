//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.06.04 um 02:29:48 PM CEST 
//


package de.xplanung.xplangml._5._0;

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
 * Die Klasse modelliert ein Planwerk mit landschaftsplanerischen Festlegungen, Darstellungen bzw. Festsetzungen.
 * 
 * <p>Java-Klasse für LP_PlanType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="LP_PlanType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/5/0}XP_PlanType">
 *       &lt;sequence>
 *         &lt;element name="bundesland" type="{http://www.xplanung.de/xplangml/5/0}XP_Bundeslaender"/>
 *         &lt;element name="rechtlicheAussenwirkung" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="planArt" type="{http://www.xplanung.de/xplangml/5/0}LP_PlanArt" maxOccurs="unbounded"/>
 *         &lt;element name="sonstPlanArt" type="{http://www.opengis.net/gml/3.2}CodeType" minOccurs="0"/>
 *         &lt;element name="planungstraegerGKZ" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="planungstraeger" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rechtsstand" type="{http://www.xplanung.de/xplangml/5/0}LP_Rechtsstand" minOccurs="0"/>
 *         &lt;element name="aufstellungsbeschlussDatum" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="auslegungsDatum" type="{http://www.w3.org/2001/XMLSchema}date" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="tOeBbeteiligungsDatum" type="{http://www.w3.org/2001/XMLSchema}date" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="oeffentlichkeitsbeteiligungDatum" type="{http://www.w3.org/2001/XMLSchema}date" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="aenderungenBisDatum" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="entwurfsbeschlussDatum" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="planbeschlussDatum" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="inkrafttretenDatum" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="sonstVerfahrensDatum" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="bereich" type="{http://www.opengis.net/gml/3.2}ReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/5/0}_GenericApplicationPropertyOfLP_Plan" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LP_PlanType", propOrder = {
    "bundesland",
    "rechtlicheAussenwirkung",
    "planArt",
    "sonstPlanArt",
    "planungstraegerGKZ",
    "planungstraeger",
    "rechtsstand",
    "aufstellungsbeschlussDatum",
    "auslegungsDatum",
    "tOeBbeteiligungsDatum",
    "oeffentlichkeitsbeteiligungDatum",
    "aenderungenBisDatum",
    "entwurfsbeschlussDatum",
    "planbeschlussDatum",
    "inkrafttretenDatum",
    "sonstVerfahrensDatum",
    "bereich",
    "genericApplicationPropertyOfLPPlan"
})
public class LPPlanType
    extends XPPlanType
{

    @XmlElement(required = true)
    protected String bundesland;
    protected boolean rechtlicheAussenwirkung;
    @XmlElement(required = true)
    protected List<String> planArt;
    protected CodeType sonstPlanArt;
    @XmlElement(required = true)
    protected String planungstraegerGKZ;
    protected String planungstraeger;
    protected String rechtsstand;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar aufstellungsbeschlussDatum;
    @XmlSchemaType(name = "date")
    protected List<XMLGregorianCalendar> auslegungsDatum;
    @XmlSchemaType(name = "date")
    protected List<XMLGregorianCalendar> tOeBbeteiligungsDatum;
    @XmlSchemaType(name = "date")
    protected List<XMLGregorianCalendar> oeffentlichkeitsbeteiligungDatum;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar aenderungenBisDatum;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar entwurfsbeschlussDatum;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar planbeschlussDatum;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar inkrafttretenDatum;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar sonstVerfahrensDatum;
    protected List<ReferenceType> bereich;
    @XmlElement(name = "_GenericApplicationPropertyOfLP_Plan")
    protected List<Object> genericApplicationPropertyOfLPPlan;

    /**
     * Ruft den Wert der bundesland-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBundesland() {
        return bundesland;
    }

    /**
     * Legt den Wert der bundesland-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBundesland(String value) {
        this.bundesland = value;
    }

    /**
     * Ruft den Wert der rechtlicheAussenwirkung-Eigenschaft ab.
     * 
     */
    public boolean isRechtlicheAussenwirkung() {
        return rechtlicheAussenwirkung;
    }

    /**
     * Legt den Wert der rechtlicheAussenwirkung-Eigenschaft fest.
     * 
     */
    public void setRechtlicheAussenwirkung(boolean value) {
        this.rechtlicheAussenwirkung = value;
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
     * Ruft den Wert der planungstraegerGKZ-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanungstraegerGKZ() {
        return planungstraegerGKZ;
    }

    /**
     * Legt den Wert der planungstraegerGKZ-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanungstraegerGKZ(String value) {
        this.planungstraegerGKZ = value;
    }

    /**
     * Ruft den Wert der planungstraeger-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanungstraeger() {
        return planungstraeger;
    }

    /**
     * Legt den Wert der planungstraeger-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanungstraeger(String value) {
        this.planungstraeger = value;
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
     * Gets the value of the auslegungsDatum property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the auslegungsDatum property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuslegungsDatum().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XMLGregorianCalendar }
     * 
     * 
     */
    public List<XMLGregorianCalendar> getAuslegungsDatum() {
        if (auslegungsDatum == null) {
            auslegungsDatum = new ArrayList<XMLGregorianCalendar>();
        }
        return this.auslegungsDatum;
    }

    /**
     * Gets the value of the tOeBbeteiligungsDatum property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tOeBbeteiligungsDatum property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTOeBbeteiligungsDatum().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XMLGregorianCalendar }
     * 
     * 
     */
    public List<XMLGregorianCalendar> getTOeBbeteiligungsDatum() {
        if (tOeBbeteiligungsDatum == null) {
            tOeBbeteiligungsDatum = new ArrayList<XMLGregorianCalendar>();
        }
        return this.tOeBbeteiligungsDatum;
    }

    /**
     * Gets the value of the oeffentlichkeitsbeteiligungDatum property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the oeffentlichkeitsbeteiligungDatum property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOeffentlichkeitsbeteiligungDatum().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XMLGregorianCalendar }
     * 
     * 
     */
    public List<XMLGregorianCalendar> getOeffentlichkeitsbeteiligungDatum() {
        if (oeffentlichkeitsbeteiligungDatum == null) {
            oeffentlichkeitsbeteiligungDatum = new ArrayList<XMLGregorianCalendar>();
        }
        return this.oeffentlichkeitsbeteiligungDatum;
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
     * Ruft den Wert der inkrafttretenDatum-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInkrafttretenDatum() {
        return inkrafttretenDatum;
    }

    /**
     * Legt den Wert der inkrafttretenDatum-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInkrafttretenDatum(XMLGregorianCalendar value) {
        this.inkrafttretenDatum = value;
    }

    /**
     * Ruft den Wert der sonstVerfahrensDatum-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSonstVerfahrensDatum() {
        return sonstVerfahrensDatum;
    }

    /**
     * Legt den Wert der sonstVerfahrensDatum-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSonstVerfahrensDatum(XMLGregorianCalendar value) {
        this.sonstVerfahrensDatum = value;
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
     * Gets the value of the genericApplicationPropertyOfLPPlan property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfLPPlan property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfLPPlan().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfLPPlan() {
        if (genericApplicationPropertyOfLPPlan == null) {
            genericApplicationPropertyOfLPPlan = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfLPPlan;
    }

}
