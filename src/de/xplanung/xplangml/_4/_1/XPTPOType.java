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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml._3.ReferenceType;


/**
 * Abstrakte Oberklasse für textliche Präsentationsobjekte. Entspricht der ALKIS Objektklasse AP_TPO
 * 
 * <p>Java-Klasse für XP_TPOType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="XP_TPOType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/4/1}XP_AbstraktesPraesentationsobjektType">
 *       &lt;sequence>
 *         &lt;element name="schriftinhalt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fontSperrung" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="skalierung" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="horizontaleAusrichtung" type="{http://www.xplanung.de/xplangml/4/1}XP_HorizontaleAusrichtung" minOccurs="0"/>
 *         &lt;element name="vertikaleAusrichtung" type="{http://www.xplanung.de/xplangml/4/1}XP_VertikaleAusrichtung" minOccurs="0"/>
 *         &lt;element name="hat" type="{http://www.opengis.net/gml/3.2}ReferenceType" minOccurs="0"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/4/1}_GenericApplicationPropertyOfXP_TPO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XP_TPOType", propOrder = {
    "schriftinhalt",
    "fontSperrung",
    "skalierung",
    "horizontaleAusrichtung",
    "vertikaleAusrichtung",
    "hat",
    "genericApplicationPropertyOfXPTPO"
})
@XmlSeeAlso({
    XPLTOType.class,
    XPPTOType.class
})
public abstract class XPTPOType
    extends XPAbstraktesPraesentationsobjektType
{

    protected String schriftinhalt;
    protected Double fontSperrung;
    protected Double skalierung;
    @XmlSchemaType(name = "string")
    protected XPHorizontaleAusrichtung horizontaleAusrichtung;
    @XmlSchemaType(name = "string")
    protected XPVertikaleAusrichtung vertikaleAusrichtung;
    protected ReferenceType hat;
    @XmlElement(name = "_GenericApplicationPropertyOfXP_TPO")
    protected List<Object> genericApplicationPropertyOfXPTPO;

    /**
     * Ruft den Wert der schriftinhalt-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchriftinhalt() {
        return schriftinhalt;
    }

    /**
     * Legt den Wert der schriftinhalt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchriftinhalt(String value) {
        this.schriftinhalt = value;
    }

    /**
     * Ruft den Wert der fontSperrung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFontSperrung() {
        return fontSperrung;
    }

    /**
     * Legt den Wert der fontSperrung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFontSperrung(Double value) {
        this.fontSperrung = value;
    }

    /**
     * Ruft den Wert der skalierung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSkalierung() {
        return skalierung;
    }

    /**
     * Legt den Wert der skalierung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSkalierung(Double value) {
        this.skalierung = value;
    }

    /**
     * Ruft den Wert der horizontaleAusrichtung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XPHorizontaleAusrichtung }
     *     
     */
    public XPHorizontaleAusrichtung getHorizontaleAusrichtung() {
        return horizontaleAusrichtung;
    }

    /**
     * Legt den Wert der horizontaleAusrichtung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XPHorizontaleAusrichtung }
     *     
     */
    public void setHorizontaleAusrichtung(XPHorizontaleAusrichtung value) {
        this.horizontaleAusrichtung = value;
    }

    /**
     * Ruft den Wert der vertikaleAusrichtung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XPVertikaleAusrichtung }
     *     
     */
    public XPVertikaleAusrichtung getVertikaleAusrichtung() {
        return vertikaleAusrichtung;
    }

    /**
     * Legt den Wert der vertikaleAusrichtung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XPVertikaleAusrichtung }
     *     
     */
    public void setVertikaleAusrichtung(XPVertikaleAusrichtung value) {
        this.vertikaleAusrichtung = value;
    }

    /**
     * Ruft den Wert der hat-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getHat() {
        return hat;
    }

    /**
     * Legt den Wert der hat-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setHat(ReferenceType value) {
        this.hat = value;
    }

    /**
     * Gets the value of the genericApplicationPropertyOfXPTPO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfXPTPO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfXPTPO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfXPTPO() {
        if (genericApplicationPropertyOfXPTPO == null) {
            genericApplicationPropertyOfXPTPO = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfXPTPO;
    }

}
