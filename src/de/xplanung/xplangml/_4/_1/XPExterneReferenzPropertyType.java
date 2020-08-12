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
 * <p>Java-Klasse für XP_ExterneReferenzPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="XP_ExterneReferenzPropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/4/1}XP_ExterneReferenz" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XP_ExterneReferenzPropertyType", propOrder = {
    "xpExterneReferenz"
})
public class XPExterneReferenzPropertyType {

    @XmlElement(name = "XP_ExterneReferenz")
    protected XPExterneReferenzType xpExterneReferenz;

    /**
     * Ruft den Wert der xpExterneReferenz-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XPExterneReferenzType }
     *     
     */
    public XPExterneReferenzType getXPExterneReferenz() {
        return xpExterneReferenz;
    }

    /**
     * Legt den Wert der xpExterneReferenz-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XPExterneReferenzType }
     *     
     */
    public void setXPExterneReferenz(XPExterneReferenzType value) {
        this.xpExterneReferenz = value;
    }

}
