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
import net.opengis.gml._3.AngleType;


/**
 * Einfahrt (§9 Abs. 1 Nr. 11 und Abs. 6 BauGB).
 * 
 * 
 * <p>Java-Klasse für BP_EinfahrtPunktType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="BP_EinfahrtPunktType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/4/1}BP_PunktobjektType">
 *       &lt;sequence>
 *         &lt;element name="richtung" type="{http://www.opengis.net/gml/3.2}AngleType"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/4/1}_GenericApplicationPropertyOfBP_EinfahrtPunkt" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BP_EinfahrtPunktType", propOrder = {
    "richtung",
    "genericApplicationPropertyOfBPEinfahrtPunkt"
})
public class BPEinfahrtPunktType
    extends BPPunktobjektType
{

    @XmlElement(required = true)
    protected AngleType richtung;
    @XmlElement(name = "_GenericApplicationPropertyOfBP_EinfahrtPunkt")
    protected List<Object> genericApplicationPropertyOfBPEinfahrtPunkt;

    /**
     * Ruft den Wert der richtung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AngleType }
     *     
     */
    public AngleType getRichtung() {
        return richtung;
    }

    /**
     * Legt den Wert der richtung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AngleType }
     *     
     */
    public void setRichtung(AngleType value) {
        this.richtung = value;
    }

    /**
     * Gets the value of the genericApplicationPropertyOfBPEinfahrtPunkt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfBPEinfahrtPunkt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfBPEinfahrtPunkt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfBPEinfahrtPunkt() {
        if (genericApplicationPropertyOfBPEinfahrtPunkt == null) {
            genericApplicationPropertyOfBPEinfahrtPunkt = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfBPEinfahrtPunkt;
    }

}
