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
 * <p>Java-Klasse für BP_WirksamkeitBedingungPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="BP_WirksamkeitBedingungPropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/4/1}BP_WirksamkeitBedingung" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BP_WirksamkeitBedingungPropertyType", propOrder = {
    "bpWirksamkeitBedingung"
})
public class BPWirksamkeitBedingungPropertyType {

    @XmlElement(name = "BP_WirksamkeitBedingung")
    protected BPWirksamkeitBedingungType bpWirksamkeitBedingung;

    /**
     * Ruft den Wert der bpWirksamkeitBedingung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BPWirksamkeitBedingungType }
     *     
     */
    public BPWirksamkeitBedingungType getBPWirksamkeitBedingung() {
        return bpWirksamkeitBedingung;
    }

    /**
     * Legt den Wert der bpWirksamkeitBedingung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BPWirksamkeitBedingungType }
     *     
     */
    public void setBPWirksamkeitBedingung(BPWirksamkeitBedingungType value) {
        this.bpWirksamkeitBedingung = value;
    }

}
