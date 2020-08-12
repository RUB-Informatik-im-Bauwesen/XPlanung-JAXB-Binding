//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2019.08.20 um 07:26:35 AM CEST 
//


package de.xplanung.xplangml._5._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml._3.GeometryPropertyType;


/**
 * Basisklasse für alle Objekte eines Bebauungsplans mit flächenhaftem Raumbezug. Die von BP_Flaechenobjekt abgeleiteten Fachobjekte können sowohl als Flächenschlussobjekte als auch als Überlagerungsobjekte auftreten.
 * 
 * 
 * <p>Java-Klasse für BP_FlaechenobjektType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="BP_FlaechenobjektType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/5/1}BP_ObjektType">
 *       &lt;sequence>
 *         &lt;element name="position" type="{http://www.opengis.net/gml/3.2}GeometryPropertyType"/>
 *         &lt;element name="flaechenschluss" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/5/1}_GenericApplicationPropertyOfBP_Flaechenobjekt" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BP_FlaechenobjektType", propOrder = {
    "position",
    "flaechenschluss",
    "genericApplicationPropertyOfBPFlaechenobjekt"
})
@XmlSeeAlso({
    BPBodenschaetzeFlaecheType.class,
    BPBesondererNutzungszweckFlaecheType.class,
    BPAusgleichsFlaecheType.class,
    BPAufschuettungsFlaecheType.class,
    BPKennzeichnungsFlaecheType.class,
    BPAbgrabungsFlaecheType.class,
    BPFlaechenschlussobjektType.class,
    BPWasserwirtschaftsFlaecheType.class,
    BPRekultivierungsFlaecheType.class,
    BPSchutzPflegeEntwicklungsFlaecheType.class,
    BPUeberlagerungsobjektType.class
})
public abstract class BPFlaechenobjektType
    extends BPObjektType
{

    @XmlElement(required = true)
    protected GeometryPropertyType position;
    protected boolean flaechenschluss;
    @XmlElement(name = "_GenericApplicationPropertyOfBP_Flaechenobjekt")
    protected List<Object> genericApplicationPropertyOfBPFlaechenobjekt;

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
     * Gets the value of the genericApplicationPropertyOfBPFlaechenobjekt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfBPFlaechenobjekt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfBPFlaechenobjekt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfBPFlaechenobjekt() {
        if (genericApplicationPropertyOfBPFlaechenobjekt == null) {
            genericApplicationPropertyOfBPFlaechenobjekt = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfBPFlaechenobjekt;
    }

}
