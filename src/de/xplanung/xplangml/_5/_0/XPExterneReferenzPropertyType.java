//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.06.04 um 02:29:48 PM CEST 
//


package de.xplanung.xplangml._5._0;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
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
 *         &lt;element ref="{http://www.xplanung.de/xplangml/5/0}XP_ExterneReferenz" minOccurs="0"/>
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

    @XmlElementRef(name = "XP_ExterneReferenz", namespace = "http://www.xplanung.de/xplangml/5/0", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends XPExterneReferenzType> xpExterneReferenz;

    /**
     * Ruft den Wert der xpExterneReferenz-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XPSpezExterneReferenzType }{@code >}
     *     {@link JAXBElement }{@code <}{@link XPExterneReferenzType }{@code >}
     *     
     */
    public JAXBElement<? extends XPExterneReferenzType> getXPExterneReferenz() {
        return xpExterneReferenz;
    }

    /**
     * Legt den Wert der xpExterneReferenz-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XPSpezExterneReferenzType }{@code >}
     *     {@link JAXBElement }{@code <}{@link XPExterneReferenzType }{@code >}
     *     
     */
    public void setXPExterneReferenz(JAXBElement<? extends XPExterneReferenzType> value) {
        this.xpExterneReferenz = value;
    }

}
