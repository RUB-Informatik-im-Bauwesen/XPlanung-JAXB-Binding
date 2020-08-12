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
 * <p>Java-Klasse für LP_RasterplanAenderungType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="LP_RasterplanAenderungType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/4/1}XP_RasterplanAenderungType">
 *       &lt;sequence>
 *         &lt;element name="aufstellungsbeschlussDatum" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="auslegungsDatum" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="tOeBbeteiligungsDatum" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="aenderungenBisDatum" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="entwurfsbeschlussDatum" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="planbeschlussDatum" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="inkrafttretenDatum" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="sonstVerfahrensDatum" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/4/1}_GenericApplicationPropertyOfLP_RasterplanAenderung" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LP_RasterplanAenderungType", propOrder = {
    "aufstellungsbeschlussDatum",
    "auslegungsDatum",
    "tOeBbeteiligungsDatum",
    "aenderungenBisDatum",
    "entwurfsbeschlussDatum",
    "planbeschlussDatum",
    "inkrafttretenDatum",
    "sonstVerfahrensDatum",
    "genericApplicationPropertyOfLPRasterplanAenderung"
})
public class LPRasterplanAenderungType
    extends XPRasterplanAenderungType
{

    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar aufstellungsbeschlussDatum;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar auslegungsDatum;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar tOeBbeteiligungsDatum;
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
    @XmlElement(name = "_GenericApplicationPropertyOfLP_RasterplanAenderung")
    protected List<Object> genericApplicationPropertyOfLPRasterplanAenderung;

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
     * Ruft den Wert der auslegungsDatum-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAuslegungsDatum() {
        return auslegungsDatum;
    }

    /**
     * Legt den Wert der auslegungsDatum-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAuslegungsDatum(XMLGregorianCalendar value) {
        this.auslegungsDatum = value;
    }

    /**
     * Ruft den Wert der tOeBbeteiligungsDatum-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTOeBbeteiligungsDatum() {
        return tOeBbeteiligungsDatum;
    }

    /**
     * Legt den Wert der tOeBbeteiligungsDatum-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTOeBbeteiligungsDatum(XMLGregorianCalendar value) {
        this.tOeBbeteiligungsDatum = value;
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
     * Gets the value of the genericApplicationPropertyOfLPRasterplanAenderung property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfLPRasterplanAenderung property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfLPRasterplanAenderung().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfLPRasterplanAenderung() {
        if (genericApplicationPropertyOfLPRasterplanAenderung == null) {
            genericApplicationPropertyOfLPRasterplanAenderung = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfLPRasterplanAenderung;
    }

}
