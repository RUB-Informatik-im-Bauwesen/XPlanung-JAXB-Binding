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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml._3.AngleType;
import net.opengis.gml._3.GeometryPropertyType;


/**
 * Textförmiges Präsentationsobjekt mit punktförmiger Festlegung der Textposition. Entspricht der ALKIS-Objektklasse AP_PTO.
 * 
 * 
 * <p>Java-Klasse für XP_PTOType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="XP_PTOType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/4/1}XP_TPOType">
 *       &lt;sequence>
 *         &lt;element name="position" type="{http://www.opengis.net/gml/3.2}GeometryPropertyType"/>
 *         &lt;element name="drehwinkel" type="{http://www.opengis.net/gml/3.2}AngleType" minOccurs="0"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/4/1}_GenericApplicationPropertyOfXP_PTO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XP_PTOType", propOrder = {
    "position",
    "drehwinkel",
    "genericApplicationPropertyOfXPPTO"
})
@XmlSeeAlso({
    XPNutzungsschabloneType.class
})
public class XPPTOType
    extends XPTPOType
{

    @XmlElement(required = true)
    protected GeometryPropertyType position;
    protected AngleType drehwinkel;
    @XmlElement(name = "_GenericApplicationPropertyOfXP_PTO")
    protected List<Object> genericApplicationPropertyOfXPPTO;

    /**
     * Ruft den Wert der position-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GeometryPropertyType }
     *     
     */
    public GeometryPropertyType getPosition() {
        return position;
    }

    /**
     * Legt den Wert der position-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GeometryPropertyType }
     *     
     */
    public void setPosition(GeometryPropertyType value) {
        this.position = value;
    }

    /**
     * Ruft den Wert der drehwinkel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AngleType }
     *     
     */
    public AngleType getDrehwinkel() {
        return drehwinkel;
    }

    /**
     * Legt den Wert der drehwinkel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AngleType }
     *     
     */
    public void setDrehwinkel(AngleType value) {
        this.drehwinkel = value;
    }

    /**
     * Gets the value of the genericApplicationPropertyOfXPPTO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfXPPTO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfXPPTO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfXPPTO() {
        if (genericApplicationPropertyOfXPPTO == null) {
            genericApplicationPropertyOfXPPTO = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfXPPTO;
    }

}
