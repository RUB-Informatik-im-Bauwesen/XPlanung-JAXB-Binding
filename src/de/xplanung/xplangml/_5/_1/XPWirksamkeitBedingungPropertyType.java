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
 * <p>Java-Klasse für XP_WirksamkeitBedingungPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="XP_WirksamkeitBedingungPropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/5/1}XP_WirksamkeitBedingung" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XP_WirksamkeitBedingungPropertyType", propOrder = {
    "xpWirksamkeitBedingung"
})
public class XPWirksamkeitBedingungPropertyType {

    @XmlElement(name = "XP_WirksamkeitBedingung")
    protected XPWirksamkeitBedingungType xpWirksamkeitBedingung;

    /**
     * Ruft den Wert der xpWirksamkeitBedingung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XPWirksamkeitBedingungType }
     *     
     */
    public XPWirksamkeitBedingungType getXPWirksamkeitBedingung() {
        return xpWirksamkeitBedingung;
    }

    /**
     * Legt den Wert der xpWirksamkeitBedingung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XPWirksamkeitBedingungType }
     *     
     */
    public void setXPWirksamkeitBedingung(XPWirksamkeitBedingungType value) {
        this.xpWirksamkeitBedingung = value;
    }

}
