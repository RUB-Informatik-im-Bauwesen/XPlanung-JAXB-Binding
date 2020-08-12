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


/**
 * Basisklasse für alle Objekte eines Landschaftsplans mit punktförmigem Raumbezug (Einzelpunkt oder Punktmenge).
 * 
 * <p>Java-Klasse für LP_PunktobjektType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="LP_PunktobjektType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/5/0}LP_ObjektType">
 *       &lt;sequence>
 *         &lt;element name="position" type="{http://www.opengis.net/gml/3.2}GeometryPropertyType"/>
 *         &lt;element name="nordwinkel" type="{http://www.opengis.net/gml/3.2}AngleType" minOccurs="0"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/5/0}_GenericApplicationPropertyOfLP_Punktobjekt" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LP_PunktobjektType", propOrder = {
    "position",
    "nordwinkel",
    "genericApplicationPropertyOfLPPunktobjekt"
})
public abstract class LPPunktobjektType
    extends LPObjektType
{

    @XmlElement(required = true)
    protected GeometryPropertyType position;
    protected AngleType nordwinkel;
    @XmlElement(name = "_GenericApplicationPropertyOfLP_Punktobjekt")
    protected List<Object> genericApplicationPropertyOfLPPunktobjekt;

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
     * Ruft den Wert der nordwinkel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AngleType }
     *     
     */
    public AngleType getNordwinkel() {
        return nordwinkel;
    }

    /**
     * Legt den Wert der nordwinkel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AngleType }
     *     
     */
    public void setNordwinkel(AngleType value) {
        this.nordwinkel = value;
    }

    /**
     * Gets the value of the genericApplicationPropertyOfLPPunktobjekt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfLPPunktobjekt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfLPPunktobjekt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfLPPunktobjekt() {
        if (genericApplicationPropertyOfLPPunktobjekt == null) {
            genericApplicationPropertyOfLPPunktobjekt = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfLPPunktobjekt;
    }

}
