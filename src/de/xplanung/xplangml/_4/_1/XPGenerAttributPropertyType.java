//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.06.04 um 03:33:59 PM CEST 
//


package de.xplanung.xplangml._4._1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für XP_GenerAttributPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="XP_GenerAttributPropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/4/1}XP_GenerAttribut" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XP_GenerAttributPropertyType", propOrder = {
    "xpGenerAttribut"
})
public class XPGenerAttributPropertyType {

    @XmlElementRef(name = "XP_GenerAttribut", namespace = "http://www.xplanung.de/xplangml/4/1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends XPGenerAttributType> xpGenerAttribut;

    /**
     * Ruft den Wert der xpGenerAttribut-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XPDatumAttributType }{@code >}
     *     {@link JAXBElement }{@code <}{@link XPGenerAttributType }{@code >}
     *     {@link JAXBElement }{@code <}{@link XPDoubleAttributType }{@code >}
     *     {@link JAXBElement }{@code <}{@link XPStringAttributType }{@code >}
     *     {@link JAXBElement }{@code <}{@link XPIntegerAttributType }{@code >}
     *     {@link JAXBElement }{@code <}{@link XPURLAttributType }{@code >}
     *     
     */
    public JAXBElement<? extends XPGenerAttributType> getXPGenerAttribut() {
        return xpGenerAttribut;
    }

    /**
     * Legt den Wert der xpGenerAttribut-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XPDatumAttributType }{@code >}
     *     {@link JAXBElement }{@code <}{@link XPGenerAttributType }{@code >}
     *     {@link JAXBElement }{@code <}{@link XPDoubleAttributType }{@code >}
     *     {@link JAXBElement }{@code <}{@link XPStringAttributType }{@code >}
     *     {@link JAXBElement }{@code <}{@link XPIntegerAttributType }{@code >}
     *     {@link JAXBElement }{@code <}{@link XPURLAttributType }{@code >}
     *     
     */
    public void setXPGenerAttribut(JAXBElement<? extends XPGenerAttributType> value) {
        this.xpGenerAttribut = value;
    }

}
