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
import net.opengis.gml._3.AngleType;
import net.opengis.gml._3.GeometryPropertyType;


/**
 * Basisklasse für alle Objekte eines Bebauungsplans mit variablem Raumbezug. Das bedeutet, die abgeleiteten Objekte können kontextabhängig mit Punkt-, Linien- oder Flächengeometrie gebildet. Die Aggregation von Punkten, Linien oder Flächen ist zulässig, nicht aber die Mischung von Punkt-, Linien- und Flächengeometrie.
 * 
 * <p>Java-Klasse für BP_GeometrieobjektType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="BP_GeometrieobjektType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/5/1}BP_ObjektType">
 *       &lt;sequence>
 *         &lt;element name="position" type="{http://www.opengis.net/gml/3.2}GeometryPropertyType"/>
 *         &lt;element name="flaechenschluss" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="flussrichtung" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="nordwinkel" type="{http://www.opengis.net/gml/3.2}AngleType" minOccurs="0"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/5/1}_GenericApplicationPropertyOfBP_Geometrieobjekt" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BP_GeometrieobjektType", propOrder = {
    "position",
    "flaechenschluss",
    "flussrichtung",
    "nordwinkel",
    "genericApplicationPropertyOfBPGeometrieobjekt"
})
@XmlSeeAlso({
    BPHoehenMassType.class,
    BPAusgleichsMassnahmeType.class,
    BPSchutzPflegeEntwicklungsMassnahmeType.class,
    BPFestsetzungNachLandesrechtType.class,
    BPGemeinschaftsanlagenZuordnungType.class,
    BPAbstandsMassType.class,
    BPVerkehrsflaecheBesondererZweckbestimmungType.class,
    BPImmissionsschutzType.class,
    BPLandwirtschaftType.class,
    BPVerEntsorgungType.class,
    BPStrassenkoerperType.class,
    BPAnpflanzungBindungErhaltungType.class,
    BPWegerechtType.class,
    BPGenerischesObjektType.class,
    BPUnverbindlicheVormerkungType.class
})
public abstract class BPGeometrieobjektType
    extends BPObjektType
{

    @XmlElement(required = true)
    protected GeometryPropertyType position;
    @XmlElement(defaultValue = "false")
    protected Boolean flaechenschluss;
    protected Boolean flussrichtung;
    protected AngleType nordwinkel;
    @XmlElement(name = "_GenericApplicationPropertyOfBP_Geometrieobjekt")
    protected List<Object> genericApplicationPropertyOfBPGeometrieobjekt;

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
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFlaechenschluss() {
        return flaechenschluss;
    }

    /**
     * Legt den Wert der flaechenschluss-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFlaechenschluss(Boolean value) {
        this.flaechenschluss = value;
    }

    /**
     * Ruft den Wert der flussrichtung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFlussrichtung() {
        return flussrichtung;
    }

    /**
     * Legt den Wert der flussrichtung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFlussrichtung(Boolean value) {
        this.flussrichtung = value;
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
     * Gets the value of the genericApplicationPropertyOfBPGeometrieobjekt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfBPGeometrieobjekt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfBPGeometrieobjekt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfBPGeometrieobjekt() {
        if (genericApplicationPropertyOfBPGeometrieobjekt == null) {
            genericApplicationPropertyOfBPGeometrieobjekt = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfBPGeometrieobjekt;
    }

}
