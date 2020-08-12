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
 * Basisklasse für alle Objekte eines Landschaftsplans mit variablem Raumbezug. Ein konkretes Objekt muss entweder punktförmigen, linienförmigen oder flächenhaften Raumbezug haben, gemischte Geometrie ist nicht zugelassen.
 * 
 * <p>Java-Klasse für LP_GeometrieobjektType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="LP_GeometrieobjektType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/4/1}LP_ObjektType">
 *       &lt;sequence>
 *         &lt;element name="position" type="{http://www.opengis.net/gml/3.2}GeometryPropertyType"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/4/1}_GenericApplicationPropertyOfLP_Geometrieobjekt" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LP_GeometrieobjektType", propOrder = {
    "position",
    "genericApplicationPropertyOfLPGeometrieobjekt"
})
@XmlSeeAlso({
    LPSchutzobjektLandesrechtType.class,
    LPAnpflanzungBindungErhaltungType.class,
    LPAusgleichType.class,
    LPPlanerischeVertiefungType.class,
    LPSchutzobjektInternatRechtType.class,
    LPDenkmalschutzrechtType.class,
    LPWasserrechtWirtschaftAbflussHochwSchutzType.class,
    LPBiotopverbundflaecheType.class,
    LPSchutzPflegeEntwicklungType.class,
    LPSchutzobjektBundesrechtType.class,
    LPErholungFreizeitType.class,
    LPGenerischesObjektType.class,
    LPBodenschutzrechtType.class,
    LPWasserrechtGemeingebrEinschraenkungNaturschutzType.class,
    LPNutzungsAusschlussType.class,
    LPLandschaftsbildType.class,
    LPSonstigesRechtType.class,
    LPWasserrechtSonstigeType.class,
    LPWasserrechtSchutzgebietType.class,
    LPForstrechtType.class,
    LPZwischennutzungType.class,
    LPNutzungserfordernisRegelungType.class
})
public abstract class LPGeometrieobjektType
    extends LPObjektType
{

    @XmlElement(required = true)
    protected GeometryPropertyType position;
    @XmlElement(name = "_GenericApplicationPropertyOfLP_Geometrieobjekt")
    protected List<Object> genericApplicationPropertyOfLPGeometrieobjekt;

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
     * Gets the value of the genericApplicationPropertyOfLPGeometrieobjekt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfLPGeometrieobjekt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfLPGeometrieobjekt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfLPGeometrieobjekt() {
        if (genericApplicationPropertyOfLPGeometrieobjekt == null) {
            genericApplicationPropertyOfLPGeometrieobjekt = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfLPGeometrieobjekt;
    }

}
