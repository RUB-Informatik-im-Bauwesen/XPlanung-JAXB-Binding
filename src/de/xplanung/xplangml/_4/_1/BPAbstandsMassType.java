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
import net.opengis.gml._3.LengthType;


/**
 * Darstellung von Maßpfeilen oder Maßkreisen in BPlänen um eine eindeutige Vermassung einzelner Festsetzungen zu erreichen.
 * 
 * 
 * <p>Java-Klasse für BP_AbstandsMassType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="BP_AbstandsMassType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/4/1}BP_GeometrieobjektType">
 *       &lt;sequence>
 *         &lt;element name="wert" type="{http://www.opengis.net/gml/3.2}LengthType"/>
 *         &lt;element name="startWinkel" type="{http://www.opengis.net/gml/3.2}AngleType" minOccurs="0"/>
 *         &lt;element name="endWinkel" type="{http://www.opengis.net/gml/3.2}AngleType" minOccurs="0"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/4/1}_GenericApplicationPropertyOfBP_AbstandsMass" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BP_AbstandsMassType", propOrder = {
    "wert",
    "startWinkel",
    "endWinkel",
    "genericApplicationPropertyOfBPAbstandsMass"
})
public class BPAbstandsMassType
    extends BPGeometrieobjektType
{

    @XmlElement(required = true)
    protected LengthType wert;
    protected AngleType startWinkel;
    protected AngleType endWinkel;
    @XmlElement(name = "_GenericApplicationPropertyOfBP_AbstandsMass")
    protected List<Object> genericApplicationPropertyOfBPAbstandsMass;

    /**
     * Ruft den Wert der wert-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getWert() {
        return wert;
    }

    /**
     * Legt den Wert der wert-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setWert(LengthType value) {
        this.wert = value;
    }

    /**
     * Ruft den Wert der startWinkel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AngleType }
     *     
     */
    public AngleType getStartWinkel() {
        return startWinkel;
    }

    /**
     * Legt den Wert der startWinkel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AngleType }
     *     
     */
    public void setStartWinkel(AngleType value) {
        this.startWinkel = value;
    }

    /**
     * Ruft den Wert der endWinkel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AngleType }
     *     
     */
    public AngleType getEndWinkel() {
        return endWinkel;
    }

    /**
     * Legt den Wert der endWinkel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AngleType }
     *     
     */
    public void setEndWinkel(AngleType value) {
        this.endWinkel = value;
    }

    /**
     * Gets the value of the genericApplicationPropertyOfBPAbstandsMass property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfBPAbstandsMass property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfBPAbstandsMass().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfBPAbstandsMass() {
        if (genericApplicationPropertyOfBPAbstandsMass == null) {
            genericApplicationPropertyOfBPAbstandsMass = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfBPAbstandsMass;
    }

}
