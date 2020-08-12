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
import net.opengis.gml._3.AngleType;
import net.opengis.gml._3.GeometryPropertyType;


/**
 * Basisklasse für alle Objekte mit variablem Raumbezug. Ein konkretes Objekt muss entweder punktförmigen, linienförmigen oder flächenhaften Raumbezug haben, gemischte Geometrie ist nicht zugelassen.
 * 
 * <p>Java-Klasse für SO_GeometrieobjektType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SO_GeometrieobjektType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/5/0}SO_ObjektType">
 *       &lt;sequence>
 *         &lt;element name="position" type="{http://www.opengis.net/gml/3.2}GeometryPropertyType"/>
 *         &lt;element name="flaechenschluss" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="flussrichtung" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="nordwinkel" type="{http://www.opengis.net/gml/3.2}AngleType" minOccurs="0"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/5/0}_GenericApplicationPropertyOfSO_Geometrieobjekt" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SO_GeometrieobjektType", propOrder = {
    "position",
    "flaechenschluss",
    "flussrichtung",
    "nordwinkel",
    "genericApplicationPropertyOfSOGeometrieobjekt"
})
@XmlSeeAlso({
    SOSchutzgebietNaturschutzrechtType.class,
    SODenkmalschutzrechtType.class,
    SOBodenschutzrechtType.class,
    SOStrassenverkehrsrechtType.class,
    SOForstrechtType.class,
    SOSonstigesRechtType.class,
    SOSchienenverkehrsrechtType.class,
    SOSchutzgebietSonstigesRechtType.class,
    SOWasserrechtType.class,
    SOLuftverkehrsrechtType.class,
    SOSchutzgebietWasserrechtType.class
})
public abstract class SOGeometrieobjektType
    extends SOObjektType
{

    @XmlElement(required = true)
    protected GeometryPropertyType position;
    @XmlElement(defaultValue = "false")
    protected Boolean flaechenschluss;
    protected Boolean flussrichtung;
    protected AngleType nordwinkel;
    @XmlElement(name = "_GenericApplicationPropertyOfSO_Geometrieobjekt")
    protected List<Object> genericApplicationPropertyOfSOGeometrieobjekt;

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
     * Gets the value of the genericApplicationPropertyOfSOGeometrieobjekt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfSOGeometrieobjekt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfSOGeometrieobjekt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfSOGeometrieobjekt() {
        if (genericApplicationPropertyOfSOGeometrieobjekt == null) {
            genericApplicationPropertyOfSOGeometrieobjekt = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfSOGeometrieobjekt;
    }

}
