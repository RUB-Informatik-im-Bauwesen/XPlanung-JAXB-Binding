//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2019.08.20 um 07:26:35 AM CEST 
//


package de.xplanung.xplangml._5._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für XP_StringAttributPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="XP_StringAttributPropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/5/1}XP_StringAttribut" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XP_StringAttributPropertyType", propOrder = {
    "xpStringAttribut"
})
public class XPStringAttributPropertyType {

    @XmlElement(name = "XP_StringAttribut")
    protected XPStringAttributType xpStringAttribut;

    /**
     * Ruft den Wert der xpStringAttribut-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XPStringAttributType }
     *     
     */
    public XPStringAttributType getXPStringAttribut() {
        return xpStringAttribut;
    }

    /**
     * Legt den Wert der xpStringAttribut-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XPStringAttributType }
     *     
     */
    public void setXPStringAttribut(XPStringAttributType value) {
        this.xpStringAttribut = value;
    }

}
