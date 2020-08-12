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


/**
 * Georeferenziertes Rasterbild der Änderung eines Basisplans. Die abgeleitete Klasse besitzt Datums-Attribute, die spezifisch für Flächennutzungspläne sind.
 * 
 * <p>Java-Klasse für FP_RasterplanAenderungType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FP_RasterplanAenderungType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/4/1}XP_RasterplanAenderungType">
 *       &lt;sequence>
 *         &lt;element name="aufstellungbeschlussDatum" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="auslegungsStartDatum" type="{http://www.w3.org/2001/XMLSchema}date" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="auslegungsEndDatum" type="{http://www.w3.org/2001/XMLSchema}date" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="traegerbeteiligungsStartDatum" type="{http://www.w3.org/2001/XMLSchema}date" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="traegerbeteiligungsEndDatum" type="{http://www.w3.org/2001/XMLSchema}date" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="aenderungenBisDatum" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="entwurfsbeschlussDatum" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="planbeschlussDatum" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="wirksamkeitsDatum" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/4/1}_GenericApplicationPropertyOfFP_RasterplanAenderung" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FP_RasterplanAenderungType", propOrder = {
    "aufstellungbeschlussDatum",
    "auslegungsStartDatum",
    "auslegungsEndDatum",
    "traegerbeteiligungsStartDatum",
    "traegerbeteiligungsEndDatum",
    "aenderungenBisDatum",
    "entwurfsbeschlussDatum",
    "planbeschlussDatum",
    "wirksamkeitsDatum",
    "genericApplicationPropertyOfFPRasterplanAenderung"
})
public class FPRasterplanAenderungType
    extends XPRasterplanAenderungType
{

    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar aufstellungbeschlussDatum;
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
    @XmlElement(name = "_GenericApplicationPropertyOfFP_RasterplanAenderung")
    protected List<Object> genericApplicationPropertyOfFPRasterplanAenderung;

    /**
     * Ruft den Wert der aufstellungbeschlussDatum-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAufstellungbeschlussDatum() {
        return aufstellungbeschlussDatum;
    }

    /**
     * Legt den Wert der aufstellungbeschlussDatum-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAufstellungbeschlussDatum(XMLGregorianCalendar value) {
        this.aufstellungbeschlussDatum = value;
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
     * Gets the value of the genericApplicationPropertyOfFPRasterplanAenderung property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfFPRasterplanAenderung property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfFPRasterplanAenderung().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfFPRasterplanAenderung() {
        if (genericApplicationPropertyOfFPRasterplanAenderung == null) {
            genericApplicationPropertyOfFPRasterplanAenderung = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfFPRasterplanAenderung;
    }

}
