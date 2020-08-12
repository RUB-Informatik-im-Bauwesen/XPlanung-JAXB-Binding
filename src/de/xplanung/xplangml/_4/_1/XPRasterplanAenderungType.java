//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.06.04 um 03:33:59 PM CEST 
//


package de.xplanung.xplangml._4._1;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml._3.AbstractFeatureType;
import net.opengis.gml._3.GeometryPropertyType;


/**
 * Basisklasse für georeferenzierte Rasterdarstellungen von Änderungen des Basisplans, die nicht in die Rasterdarstellung XP_RasterplanBasis integriert sind.
 * Im Standard sind nur georeferenzierte Rasterpläne zugelassen. Die über refScan referierte externe Referenz muss deshalb entweder vom Typ "PlanMitGeoreferenz" sein oder einen WMS-Request enthalten.
 * 
 * <p>Java-Klasse für XP_RasterplanAenderungType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="XP_RasterplanAenderungType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractFeatureType">
 *       &lt;sequence>
 *         &lt;element name="nameAenderung" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nummerAenderung" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="beschreibung" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="refBeschreibung" type="{http://www.xplanung.de/xplangml/4/1}XP_ExterneReferenzPropertyType" minOccurs="0"/>
 *         &lt;element name="refBegruendung" type="{http://www.xplanung.de/xplangml/4/1}XP_ExterneReferenzPropertyType" minOccurs="0"/>
 *         &lt;element name="refScan" type="{http://www.xplanung.de/xplangml/4/1}XP_ExterneReferenzPropertyType" maxOccurs="unbounded"/>
 *         &lt;element name="refText" type="{http://www.xplanung.de/xplangml/4/1}XP_ExterneReferenzPropertyType" minOccurs="0"/>
 *         &lt;element name="refLegende" type="{http://www.xplanung.de/xplangml/4/1}XP_ExterneReferenzPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="geltungsbereichAenderung" type="{http://www.opengis.net/gml/3.2}GeometryPropertyType" minOccurs="0"/>
 *         &lt;element name="besonderheiten" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/4/1}_GenericApplicationPropertyOfXP_RasterplanAenderung" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XP_RasterplanAenderungType", propOrder = {
    "nameAenderung",
    "nummerAenderung",
    "beschreibung",
    "refBeschreibung",
    "refBegruendung",
    "refScan",
    "refText",
    "refLegende",
    "geltungsbereichAenderung",
    "besonderheiten",
    "genericApplicationPropertyOfXPRasterplanAenderung"
})
@XmlSeeAlso({
    RPRasterplanAenderungType.class,
    SORasterplanAenderungType.class,
    FPRasterplanAenderungType.class,
    BPRasterplanAenderungType.class,
    LPRasterplanAenderungType.class
})
public abstract class XPRasterplanAenderungType
    extends AbstractFeatureType
{

    protected String nameAenderung;
    protected BigInteger nummerAenderung;
    protected String beschreibung;
    protected XPExterneReferenzPropertyType refBeschreibung;
    protected XPExterneReferenzPropertyType refBegruendung;
    @XmlElement(required = true)
    protected List<XPExterneReferenzPropertyType> refScan;
    protected XPExterneReferenzPropertyType refText;
    protected List<XPExterneReferenzPropertyType> refLegende;
    protected GeometryPropertyType geltungsbereichAenderung;
    protected String besonderheiten;
    @XmlElement(name = "_GenericApplicationPropertyOfXP_RasterplanAenderung")
    protected List<Object> genericApplicationPropertyOfXPRasterplanAenderung;

    /**
     * Ruft den Wert der nameAenderung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameAenderung() {
        return nameAenderung;
    }

    /**
     * Legt den Wert der nameAenderung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameAenderung(String value) {
        this.nameAenderung = value;
    }

    /**
     * Ruft den Wert der nummerAenderung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNummerAenderung() {
        return nummerAenderung;
    }

    /**
     * Legt den Wert der nummerAenderung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNummerAenderung(BigInteger value) {
        this.nummerAenderung = value;
    }

    /**
     * Ruft den Wert der beschreibung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeschreibung() {
        return beschreibung;
    }

    /**
     * Legt den Wert der beschreibung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeschreibung(String value) {
        this.beschreibung = value;
    }

    /**
     * Ruft den Wert der refBeschreibung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XPExterneReferenzPropertyType }
     *     
     */
    public XPExterneReferenzPropertyType getRefBeschreibung() {
        return refBeschreibung;
    }

    /**
     * Legt den Wert der refBeschreibung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XPExterneReferenzPropertyType }
     *     
     */
    public void setRefBeschreibung(XPExterneReferenzPropertyType value) {
        this.refBeschreibung = value;
    }

    /**
     * Ruft den Wert der refBegruendung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XPExterneReferenzPropertyType }
     *     
     */
    public XPExterneReferenzPropertyType getRefBegruendung() {
        return refBegruendung;
    }

    /**
     * Legt den Wert der refBegruendung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XPExterneReferenzPropertyType }
     *     
     */
    public void setRefBegruendung(XPExterneReferenzPropertyType value) {
        this.refBegruendung = value;
    }

    /**
     * Gets the value of the refScan property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refScan property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefScan().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XPExterneReferenzPropertyType }
     * 
     * 
     */
    public List<XPExterneReferenzPropertyType> getRefScan() {
        if (refScan == null) {
            refScan = new ArrayList<XPExterneReferenzPropertyType>();
        }
        return this.refScan;
    }

    /**
     * Ruft den Wert der refText-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XPExterneReferenzPropertyType }
     *     
     */
    public XPExterneReferenzPropertyType getRefText() {
        return refText;
    }

    /**
     * Legt den Wert der refText-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XPExterneReferenzPropertyType }
     *     
     */
    public void setRefText(XPExterneReferenzPropertyType value) {
        this.refText = value;
    }

    /**
     * Gets the value of the refLegende property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refLegende property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefLegende().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XPExterneReferenzPropertyType }
     * 
     * 
     */
    public List<XPExterneReferenzPropertyType> getRefLegende() {
        if (refLegende == null) {
            refLegende = new ArrayList<XPExterneReferenzPropertyType>();
        }
        return this.refLegende;
    }

    /**
     * Ruft den Wert der geltungsbereichAenderung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GeometryPropertyType }
     *     
     */
    public GeometryPropertyType getGeltungsbereichAenderung() {
        return geltungsbereichAenderung;
    }

    /**
     * Legt den Wert der geltungsbereichAenderung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GeometryPropertyType }
     *     
     */
    public void setGeltungsbereichAenderung(GeometryPropertyType value) {
        this.geltungsbereichAenderung = value;
    }

    /**
     * Ruft den Wert der besonderheiten-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBesonderheiten() {
        return besonderheiten;
    }

    /**
     * Legt den Wert der besonderheiten-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBesonderheiten(String value) {
        this.besonderheiten = value;
    }

    /**
     * Gets the value of the genericApplicationPropertyOfXPRasterplanAenderung property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfXPRasterplanAenderung property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfXPRasterplanAenderung().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfXPRasterplanAenderung() {
        if (genericApplicationPropertyOfXPRasterplanAenderung == null) {
            genericApplicationPropertyOfXPRasterplanAenderung = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfXPRasterplanAenderung;
    }

}
