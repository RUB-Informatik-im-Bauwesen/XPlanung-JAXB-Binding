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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml._3.GeometryPropertyType;


/**
 * Basisklasse für alle Objekte mit flächenhaftem Raumbezug (eine Einzelfläche oder eine Menge von Flächen, die sich nicht überlappen dürfen).
 * 
 * <p>Java-Klasse für SO_FlaechenobjektType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SO_FlaechenobjektType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/5/0}SO_ObjektType">
 *       &lt;sequence>
 *         &lt;element name="position" type="{http://www.opengis.net/gml/3.2}GeometryPropertyType"/>
 *         &lt;element name="flaechenschluss" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/5/0}_GenericApplicationPropertyOfSO_Flaechenobjekt" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SO_FlaechenobjektType", propOrder = {
    "position",
    "flaechenschluss",
    "genericApplicationPropertyOfSOFlaechenobjekt"
})
@XmlSeeAlso({
    SOGebietType.class
})
public abstract class SOFlaechenobjektType
    extends SOObjektType
{

    @XmlElement(required = true)
    protected GeometryPropertyType position;
    protected boolean flaechenschluss;
    @XmlElement(name = "_GenericApplicationPropertyOfSO_Flaechenobjekt")
    protected List<Object> genericApplicationPropertyOfSOFlaechenobjekt;

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
     * Ruft den Wert der flaechenschluss-Eigenschaft ab.
     * 
     */
    public boolean isFlaechenschluss() {
        return flaechenschluss;
    }

    /**
     * Legt den Wert der flaechenschluss-Eigenschaft fest.
     * 
     */
    public void setFlaechenschluss(boolean value) {
        this.flaechenschluss = value;
    }

    /**
     * Gets the value of the genericApplicationPropertyOfSOFlaechenobjekt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfSOFlaechenobjekt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfSOFlaechenobjekt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfSOFlaechenobjekt() {
        if (genericApplicationPropertyOfSOFlaechenobjekt == null) {
            genericApplicationPropertyOfSOFlaechenobjekt = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfSOFlaechenobjekt;
    }

}
