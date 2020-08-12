//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.06.04 um 02:29:48 PM CEST 
//


package de.xplanung.xplangml._5._0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml._3.AngleType;
import net.opengis.gml._3.GeometryPropertyType;
import net.opengis.gml._3.ReferenceType;


/**
 * Punktförmiges Präsentationsobjekt. Entspricht der ALKIS-Objektklasse AP_PPO.
 * 
 * 
 * <p>Java-Klasse für XP_PPOType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="XP_PPOType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/5/0}XP_AbstraktesPraesentationsobjektType">
 *       &lt;sequence>
 *         &lt;element name="position" type="{http://www.opengis.net/gml/3.2}GeometryPropertyType"/>
 *         &lt;element name="drehwinkel" type="{http://www.opengis.net/gml/3.2}AngleType" minOccurs="0"/>
 *         &lt;element name="skalierung" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="hat" type="{http://www.opengis.net/gml/3.2}ReferenceType" minOccurs="0"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/5/0}_GenericApplicationPropertyOfXP_PPO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XP_PPOType", propOrder = {
    "position",
    "drehwinkel",
    "skalierung",
    "hat",
    "genericApplicationPropertyOfXPPPO"
})
public class XPPPOType
    extends XPAbstraktesPraesentationsobjektType
{

    @XmlElement(required = true)
    protected GeometryPropertyType position;
    @XmlElement(defaultValue = "0")
    protected AngleType drehwinkel;
    @XmlElement(defaultValue = "1")
    protected Double skalierung;
    protected ReferenceType hat;
    @XmlElement(name = "_GenericApplicationPropertyOfXP_PPO")
    protected List<Object> genericApplicationPropertyOfXPPPO;

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
     * Ruft den Wert der skalierung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSkalierung() {
        return skalierung;
    }

    /**
     * Legt den Wert der skalierung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSkalierung(Double value) {
        this.skalierung = value;
    }

    /**
     * Ruft den Wert der hat-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getHat() {
        return hat;
    }

    /**
     * Legt den Wert der hat-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setHat(ReferenceType value) {
        this.hat = value;
    }

    /**
     * Gets the value of the genericApplicationPropertyOfXPPPO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfXPPPO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfXPPPO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfXPPPO() {
        if (genericApplicationPropertyOfXPPPO == null) {
            genericApplicationPropertyOfXPPPO = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfXPPPO;
    }

}
