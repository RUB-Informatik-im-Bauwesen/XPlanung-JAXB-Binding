//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.06.04 um 03:33:59 PM CEST 
//


package de.xplanung.xplangml._4._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für XP_DoubleAttributPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="XP_DoubleAttributPropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/4/1}XP_DoubleAttribut" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XP_DoubleAttributPropertyType", propOrder = {
    "xpDoubleAttribut"
})
public class XPDoubleAttributPropertyType {

    @XmlElement(name = "XP_DoubleAttribut")
    protected XPDoubleAttributType xpDoubleAttribut;

    /**
     * Ruft den Wert der xpDoubleAttribut-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XPDoubleAttributType }
     *     
     */
    public XPDoubleAttributType getXPDoubleAttribut() {
        return xpDoubleAttribut;
    }

    /**
     * Legt den Wert der xpDoubleAttribut-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XPDoubleAttributType }
     *     
     */
    public void setXPDoubleAttribut(XPDoubleAttributType value) {
        this.xpDoubleAttribut = value;
    }

}
