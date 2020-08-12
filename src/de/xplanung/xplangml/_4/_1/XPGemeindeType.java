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
import javax.xml.bind.annotation.XmlType;


/**
 * Spezifikation einer Gemeinde
 * 
 * 
 * <p>Java-Klasse für XP_GemeindeType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="XP_GemeindeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ags" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gemeindeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ortsteilName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/4/1}_GenericApplicationPropertyOfXP_Gemeinde" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XP_GemeindeType", propOrder = {
    "ags",
    "rs",
    "gemeindeName",
    "ortsteilName",
    "genericApplicationPropertyOfXPGemeinde"
})
public class XPGemeindeType {

    protected String ags;
    protected String rs;
    protected String gemeindeName;
    protected String ortsteilName;
    @XmlElement(name = "_GenericApplicationPropertyOfXP_Gemeinde")
    protected List<Object> genericApplicationPropertyOfXPGemeinde;

    /**
     * Ruft den Wert der ags-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgs() {
        return ags;
    }

    /**
     * Legt den Wert der ags-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgs(String value) {
        this.ags = value;
    }

    /**
     * Ruft den Wert der rs-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRs() {
        return rs;
    }

    /**
     * Legt den Wert der rs-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRs(String value) {
        this.rs = value;
    }

    /**
     * Ruft den Wert der gemeindeName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGemeindeName() {
        return gemeindeName;
    }

    /**
     * Legt den Wert der gemeindeName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGemeindeName(String value) {
        this.gemeindeName = value;
    }

    /**
     * Ruft den Wert der ortsteilName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrtsteilName() {
        return ortsteilName;
    }

    /**
     * Legt den Wert der ortsteilName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrtsteilName(String value) {
        this.ortsteilName = value;
    }

    /**
     * Gets the value of the genericApplicationPropertyOfXPGemeinde property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfXPGemeinde property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfXPGemeinde().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfXPGemeinde() {
        if (genericApplicationPropertyOfXPGemeinde == null) {
            genericApplicationPropertyOfXPGemeinde = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfXPGemeinde;
    }

}
