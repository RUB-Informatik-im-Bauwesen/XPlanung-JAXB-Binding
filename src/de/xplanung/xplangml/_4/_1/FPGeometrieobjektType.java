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
import net.opengis.gml._3.GeometryPropertyType;


/**
 * Basisklasse für alle Objekte eines Flächennutzungsplans mit variablem Raumbezug. Ein konkretes Objekt muss entweder punktförmigen, linienförmigen oder flächenhaften Raumbezug haben, gemischte Geometrie ist nicht zugelassen.
 * 
 * <p>Java-Klasse für FP_GeometrieobjektType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FP_GeometrieobjektType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/4/1}FP_ObjektType">
 *       &lt;sequence>
 *         &lt;element name="position" type="{http://www.opengis.net/gml/3.2}GeometryPropertyType"/>
 *         &lt;element name="flaechenschluss" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/4/1}_GenericApplicationPropertyOfFP_Geometrieobjekt" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FP_GeometrieobjektType", propOrder = {
    "position",
    "flaechenschluss",
    "genericApplicationPropertyOfFPGeometrieobjekt"
})
@XmlSeeAlso({
    FPAbgrabungType.class,
    FPStrassenverkehrType.class,
    FPAufschuettungType.class,
    FPKennzeichnungType.class,
    FPWasserwirtschaftType.class,
    FPAnpassungKlimawandelType.class,
    FPBodenschaetzeType.class,
    FPGemeinbedarfType.class,
    FPGewaesserType.class,
    FPSchutzPflegeEntwicklungType.class,
    FPGenerischesObjektType.class,
    FPGruenType.class,
    FPPrivilegiertesVorhabenType.class,
    FPVerEntsorgungType.class,
    FPSpielSportanlageType.class,
    FPUnverbindlicheVormerkungType.class
})
public abstract class FPGeometrieobjektType
    extends FPObjektType
{

    @XmlElement(required = true)
    protected GeometryPropertyType position;
    protected Boolean flaechenschluss;
    @XmlElement(name = "_GenericApplicationPropertyOfFP_Geometrieobjekt")
    protected List<Object> genericApplicationPropertyOfFPGeometrieobjekt;

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
     * Gets the value of the genericApplicationPropertyOfFPGeometrieobjekt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfFPGeometrieobjekt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfFPGeometrieobjekt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfFPGeometrieobjekt() {
        if (genericApplicationPropertyOfFPGeometrieobjekt == null) {
            genericApplicationPropertyOfFPGeometrieobjekt = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfFPGeometrieobjekt;
    }

}
