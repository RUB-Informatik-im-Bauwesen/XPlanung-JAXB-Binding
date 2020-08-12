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
 * Basisklasse für alle Objekte eines Flächennutzungsplans mit flächenhaftem Raumbezug (eine Einzelfläche oder eine Menge von Flächen, die sich nicht überlappen dürfen).  Die von <i>FP_Flaechenobjekt </i>abgeleiteten Fachobjekte können sowohl als Flächenschlussobjekte als auch als Überlagerungsobjekte auftreten.
 * 
 * <p>Java-Klasse für FP_FlaechenobjektType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FP_FlaechenobjektType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/5/0}FP_ObjektType">
 *       &lt;sequence>
 *         &lt;element name="position" type="{http://www.opengis.net/gml/3.2}GeometryPropertyType"/>
 *         &lt;element name="flaechenschluss" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/5/0}_GenericApplicationPropertyOfFP_Flaechenobjekt" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FP_FlaechenobjektType", propOrder = {
    "position",
    "flaechenschluss",
    "genericApplicationPropertyOfFPFlaechenobjekt"
})
@XmlSeeAlso({
    FPKeineZentrAbwasserBeseitigungFlaecheType.class,
    FPUeberlagerungsobjektType.class,
    FPAusgleichsFlaecheType.class,
    FPVorbehalteFlaecheType.class,
    FPFlaechenschlussobjektType.class
})
public abstract class FPFlaechenobjektType
    extends FPObjektType
{

    @XmlElement(required = true)
    protected GeometryPropertyType position;
    protected boolean flaechenschluss;
    @XmlElement(name = "_GenericApplicationPropertyOfFP_Flaechenobjekt")
    protected List<Object> genericApplicationPropertyOfFPFlaechenobjekt;

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
     * Gets the value of the genericApplicationPropertyOfFPFlaechenobjekt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfFPFlaechenobjekt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfFPFlaechenobjekt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfFPFlaechenobjekt() {
        if (genericApplicationPropertyOfFPFlaechenobjekt == null) {
            genericApplicationPropertyOfFPFlaechenobjekt = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfFPFlaechenobjekt;
    }

}
