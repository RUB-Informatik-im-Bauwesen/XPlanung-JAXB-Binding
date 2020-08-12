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
 * Georeferenziertes Rasterbild der Änderung eines Basisplans. Die abgeleitete Klasse besitzt Datums-Attribute, die spezifisch für Bebauungspläne sind.
 * 
 * 
 * <p>Java-Klasse für BP_RasterplanAenderungType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="BP_RasterplanAenderungType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/4/1}XP_RasterplanAenderungType">
 *       &lt;sequence>
 *         &lt;element name="aufstellungsbeschlussDatum" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="auslegungsStartDatum" type="{http://www.w3.org/2001/XMLSchema}date" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="auslegungsEndDatum" type="{http://www.w3.org/2001/XMLSchema}date" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="traegerbeteiligungsStartDatum" type="{http://www.w3.org/2001/XMLSchema}date" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="traegerbeteiligungsEndDatum" type="{http://www.w3.org/2001/XMLSchema}date" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="veraenderungssperreDatum" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="satzungsbeschlussDatum" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="rechtsverordnungsDatum" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="inkrafttretensDatum" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/4/1}_GenericApplicationPropertyOfBP_RasterplanAenderung" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BP_RasterplanAenderungType", propOrder = {
    "aufstellungsbeschlussDatum",
    "auslegungsStartDatum",
    "auslegungsEndDatum",
    "traegerbeteiligungsStartDatum",
    "traegerbeteiligungsEndDatum",
    "veraenderungssperreDatum",
    "satzungsbeschlussDatum",
    "rechtsverordnungsDatum",
    "inkrafttretensDatum",
    "genericApplicationPropertyOfBPRasterplanAenderung"
})
public class BPRasterplanAenderungType
    extends XPRasterplanAenderungType
{

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
    protected XMLGregorianCalendar veraenderungssperreDatum;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar satzungsbeschlussDatum;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar rechtsverordnungsDatum;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar inkrafttretensDatum;
    @XmlElement(name = "_GenericApplicationPropertyOfBP_RasterplanAenderung")
    protected List<Object> genericApplicationPropertyOfBPRasterplanAenderung;

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
     * Gets the value of the genericApplicationPropertyOfBPRasterplanAenderung property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfBPRasterplanAenderung property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfBPRasterplanAenderung().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfBPRasterplanAenderung() {
        if (genericApplicationPropertyOfBPRasterplanAenderung == null) {
            genericApplicationPropertyOfBPRasterplanAenderung = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfBPRasterplanAenderung;
    }

}
