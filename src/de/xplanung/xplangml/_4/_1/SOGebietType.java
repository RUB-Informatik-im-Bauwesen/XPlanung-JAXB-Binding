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


/**
 * Umgrenzung eines sonstigen Gebietes nach BauGB
 * 
 * 
 * <p>Java-Klasse für SO_GebietType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SO_GebietType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/4/1}SO_FlaechenobjektType">
 *       &lt;sequence>
 *         &lt;element name="gemeinde" type="{http://www.xplanung.de/xplangml/4/1}XP_GemeindePropertyType" minOccurs="0"/>
 *         &lt;element name="gebietsArt" type="{http://www.xplanung.de/xplangml/4/1}SO_GebietsArt" minOccurs="0"/>
 *         &lt;element name="sonstGebietsArt" type="{http://www.opengis.net/gml/3.2}CodeType" minOccurs="0"/>
 *         &lt;element name="rechtsstandGebiet" type="{http://www.xplanung.de/xplangml/4/1}SO_RechtsstandGebietTyp" minOccurs="0"/>
 *         &lt;element name="sonstRechtsstandGebiet" type="{http://www.opengis.net/gml/3.2}CodeType" minOccurs="0"/>
 *         &lt;element name="aufstellungsbeschhlussDatum" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="durchfuehrungStartDatum" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="durchfuehrungEndDatum" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="traegerMassnahme" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/4/1}_GenericApplicationPropertyOfSO_Gebiet" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SO_GebietType", propOrder = {
    "gemeinde",
    "gebietsArt",
    "sonstGebietsArt",
    "rechtsstandGebiet",
    "sonstRechtsstandGebiet",
    "aufstellungsbeschhlussDatum",
    "durchfuehrungStartDatum",
    "durchfuehrungEndDatum",
    "traegerMassnahme",
    "genericApplicationPropertyOfSOGebiet"
})
public class SOGebietType
    extends SOFlaechenobjektType
{

    protected XPGemeindePropertyType gemeinde;
    protected String gebietsArt;
    protected CodeType sonstGebietsArt;
    protected String rechtsstandGebiet;
    protected CodeType sonstRechtsstandGebiet;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar aufstellungsbeschhlussDatum;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar durchfuehrungStartDatum;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar durchfuehrungEndDatum;
    protected String traegerMassnahme;
    @XmlElement(name = "_GenericApplicationPropertyOfSO_Gebiet")
    protected List<Object> genericApplicationPropertyOfSOGebiet;

    /**
     * Ruft den Wert der gemeinde-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XPGemeindePropertyType }
     *     
     */
    public XPGemeindePropertyType getGemeinde() {
        return gemeinde;
    }

    /**
     * Legt den Wert der gemeinde-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XPGemeindePropertyType }
     *     
     */
    public void setGemeinde(XPGemeindePropertyType value) {
        this.gemeinde = value;
    }

    /**
     * Ruft den Wert der gebietsArt-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGebietsArt() {
        return gebietsArt;
    }

    /**
     * Legt den Wert der gebietsArt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGebietsArt(String value) {
        this.gebietsArt = value;
    }

    /**
     * Ruft den Wert der sonstGebietsArt-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getSonstGebietsArt() {
        return sonstGebietsArt;
    }

    /**
     * Legt den Wert der sonstGebietsArt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setSonstGebietsArt(CodeType value) {
        this.sonstGebietsArt = value;
    }

    /**
     * Ruft den Wert der rechtsstandGebiet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRechtsstandGebiet() {
        return rechtsstandGebiet;
    }

    /**
     * Legt den Wert der rechtsstandGebiet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRechtsstandGebiet(String value) {
        this.rechtsstandGebiet = value;
    }

    /**
     * Ruft den Wert der sonstRechtsstandGebiet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getSonstRechtsstandGebiet() {
        return sonstRechtsstandGebiet;
    }

    /**
     * Legt den Wert der sonstRechtsstandGebiet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setSonstRechtsstandGebiet(CodeType value) {
        this.sonstRechtsstandGebiet = value;
    }

    /**
     * Ruft den Wert der aufstellungsbeschhlussDatum-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAufstellungsbeschhlussDatum() {
        return aufstellungsbeschhlussDatum;
    }

    /**
     * Legt den Wert der aufstellungsbeschhlussDatum-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAufstellungsbeschhlussDatum(XMLGregorianCalendar value) {
        this.aufstellungsbeschhlussDatum = value;
    }

    /**
     * Ruft den Wert der durchfuehrungStartDatum-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDurchfuehrungStartDatum() {
        return durchfuehrungStartDatum;
    }

    /**
     * Legt den Wert der durchfuehrungStartDatum-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDurchfuehrungStartDatum(XMLGregorianCalendar value) {
        this.durchfuehrungStartDatum = value;
    }

    /**
     * Ruft den Wert der durchfuehrungEndDatum-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDurchfuehrungEndDatum() {
        return durchfuehrungEndDatum;
    }

    /**
     * Legt den Wert der durchfuehrungEndDatum-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDurchfuehrungEndDatum(XMLGregorianCalendar value) {
        this.durchfuehrungEndDatum = value;
    }

    /**
     * Ruft den Wert der traegerMassnahme-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTraegerMassnahme() {
        return traegerMassnahme;
    }

    /**
     * Legt den Wert der traegerMassnahme-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTraegerMassnahme(String value) {
        this.traegerMassnahme = value;
    }

    /**
     * Gets the value of the genericApplicationPropertyOfSOGebiet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfSOGebiet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfSOGebiet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfSOGebiet() {
        if (genericApplicationPropertyOfSOGebiet == null) {
            genericApplicationPropertyOfSOGebiet = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfSOGebiet;
    }

}
