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
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml._3.LengthType;


/**
 * Spezifikation einer Angabe zur vertikalen Höhe oder zu einem Bereich vertikaler Höhen. Es ist möglich, spezifische Höhenangaben (z.B. die First- oder Traufhöhe eines Gebäudes) vorzugeben oder einzuschränken, oder den Gültigkeitsbereich eines Planinhalts auf eine bestimmte Höhe (<i>hZwingend</i>) bzw. einen Höhenbereich (<i>hMin </i>- <i>hMax</i>) zu beschränken, was vor allem bei der höhenabhängigen Festsetzung einer überbaubaren Grundstücksfläche (<i>BP_UeberbaubareGrundstuecksflaeche</i>), einer Baulinie (<i>BP_Baulinie</i>) oder einer Baugrenze (<i>BP_Baugrenze</i>) relevant ist. In diesem Fall bleiben die Attribute <i>bezugspunkt und abweichenderBezugspunkt </i>unbelegt.
 * 
 * <p>Java-Klasse für XP_HoehenangabeType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="XP_HoehenangabeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="abweichenderHoehenbezug" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hoehenbezug" type="{http://www.xplanung.de/xplangml/5/0}XP_ArtHoehenbezug" minOccurs="0"/>
 *         &lt;element name="abweichenderBezugspunkt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bezugspunkt" type="{http://www.xplanung.de/xplangml/5/0}XP_ArtHoehenbezugspunkt" minOccurs="0"/>
 *         &lt;element name="hMin" type="{http://www.opengis.net/gml/3.2}LengthType" minOccurs="0"/>
 *         &lt;element name="hMax" type="{http://www.opengis.net/gml/3.2}LengthType" minOccurs="0"/>
 *         &lt;element name="hZwingend" type="{http://www.opengis.net/gml/3.2}LengthType" minOccurs="0"/>
 *         &lt;element name="h" type="{http://www.opengis.net/gml/3.2}LengthType" minOccurs="0"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/5/0}_GenericApplicationPropertyOfXP_Hoehenangabe" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XP_HoehenangabeType", propOrder = {
    "abweichenderHoehenbezug",
    "hoehenbezug",
    "abweichenderBezugspunkt",
    "bezugspunkt",
    "hMin",
    "hMax",
    "hZwingend",
    "h",
    "genericApplicationPropertyOfXPHoehenangabe"
})
public class XPHoehenangabeType {

    protected String abweichenderHoehenbezug;
    protected String hoehenbezug;
    protected String abweichenderBezugspunkt;
    protected String bezugspunkt;
    protected LengthType hMin;
    protected LengthType hMax;
    protected LengthType hZwingend;
    protected LengthType h;
    @XmlElement(name = "_GenericApplicationPropertyOfXP_Hoehenangabe")
    protected List<Object> genericApplicationPropertyOfXPHoehenangabe;

    /**
     * Ruft den Wert der abweichenderHoehenbezug-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbweichenderHoehenbezug() {
        return abweichenderHoehenbezug;
    }

    /**
     * Legt den Wert der abweichenderHoehenbezug-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbweichenderHoehenbezug(String value) {
        this.abweichenderHoehenbezug = value;
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
     * Ruft den Wert der abweichenderBezugspunkt-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbweichenderBezugspunkt() {
        return abweichenderBezugspunkt;
    }

    /**
     * Legt den Wert der abweichenderBezugspunkt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbweichenderBezugspunkt(String value) {
        this.abweichenderBezugspunkt = value;
    }

    /**
     * Ruft den Wert der bezugspunkt-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBezugspunkt() {
        return bezugspunkt;
    }

    /**
     * Legt den Wert der bezugspunkt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBezugspunkt(String value) {
        this.bezugspunkt = value;
    }

    /**
     * Ruft den Wert der hMin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getHMin() {
        return hMin;
    }

    /**
     * Legt den Wert der hMin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setHMin(LengthType value) {
        this.hMin = value;
    }

    /**
     * Ruft den Wert der hMax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getHMax() {
        return hMax;
    }

    /**
     * Legt den Wert der hMax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setHMax(LengthType value) {
        this.hMax = value;
    }

    /**
     * Ruft den Wert der hZwingend-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getHZwingend() {
        return hZwingend;
    }

    /**
     * Legt den Wert der hZwingend-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setHZwingend(LengthType value) {
        this.hZwingend = value;
    }

    /**
     * Ruft den Wert der h-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getH() {
        return h;
    }

    /**
     * Legt den Wert der h-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setH(LengthType value) {
        this.h = value;
    }

    /**
     * Gets the value of the genericApplicationPropertyOfXPHoehenangabe property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfXPHoehenangabe property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfXPHoehenangabe().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfXPHoehenangabe() {
        if (genericApplicationPropertyOfXPHoehenangabe == null) {
            genericApplicationPropertyOfXPHoehenangabe = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfXPHoehenangabe;
    }

}
