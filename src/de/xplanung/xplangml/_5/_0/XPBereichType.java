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
import net.opengis.gml._3.AbstractFeatureType;
import net.opengis.gml._3.GeometryPropertyType;
import net.opengis.gml._3.ReferenceType;


/**
 * Abstrakte Oberklasse für die Modellierung von Bereichen. Ein Bereich fasst die Inhalte eines Plans nach bestimmten Kriterien zusammen.
 * 
 * <p>Java-Klasse für XP_BereichType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="XP_BereichType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractFeatureType">
 *       &lt;sequence>
 *         &lt;element name="nummer" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bedeutung" type="{http://www.xplanung.de/xplangml/5/0}XP_BedeutungenBereich" minOccurs="0"/>
 *         &lt;element name="detaillierteBedeutung" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="erstellungsMassstab" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="geltungsbereich" type="{http://www.opengis.net/gml/3.2}GeometryPropertyType" minOccurs="0"/>
 *         &lt;element name="rasterBasis" type="{http://www.opengis.net/gml/3.2}ReferenceType" minOccurs="0"/>
 *         &lt;element name="planinhalt" type="{http://www.opengis.net/gml/3.2}ReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="praesentationsobjekt" type="{http://www.opengis.net/gml/3.2}ReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/5/0}_GenericApplicationPropertyOfXP_Bereich" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XP_BereichType", propOrder = {
    "nummer",
    "name",
    "bedeutung",
    "detaillierteBedeutung",
    "erstellungsMassstab",
    "geltungsbereich",
    "rasterBasis",
    "planinhalt",
    "praesentationsobjekt",
    "genericApplicationPropertyOfXPBereich"
})
@XmlSeeAlso({
    RPBereichType.class,
    LPBereichType.class,
    BPBereichType.class,
    SOBereichType.class,
    FPBereichType.class
})
public abstract class XPBereichType
    extends AbstractFeatureType
{

    @XmlElement(defaultValue = "0")
    protected int nummer;
    protected String name;
    protected String bedeutung;
    protected String detaillierteBedeutung;
    protected Integer erstellungsMassstab;
    protected GeometryPropertyType geltungsbereich;
    protected ReferenceType rasterBasis;
    protected List<ReferenceType> planinhalt;
    protected List<ReferenceType> praesentationsobjekt;
    @XmlElement(name = "_GenericApplicationPropertyOfXP_Bereich")
    protected List<Object> genericApplicationPropertyOfXPBereich;

    /**
     * Ruft den Wert der nummer-Eigenschaft ab.
     * 
     */
    public int getNummer() {
        return nummer;
    }

    /**
     * Legt den Wert der nummer-Eigenschaft fest.
     * 
     */
    public void setNummer(int value) {
        this.nummer = value;
    }

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Ruft den Wert der bedeutung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBedeutung() {
        return bedeutung;
    }

    /**
     * Legt den Wert der bedeutung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBedeutung(String value) {
        this.bedeutung = value;
    }

    /**
     * Ruft den Wert der detaillierteBedeutung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetaillierteBedeutung() {
        return detaillierteBedeutung;
    }

    /**
     * Legt den Wert der detaillierteBedeutung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetaillierteBedeutung(String value) {
        this.detaillierteBedeutung = value;
    }

    /**
     * Ruft den Wert der erstellungsMassstab-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getErstellungsMassstab() {
        return erstellungsMassstab;
    }

    /**
     * Legt den Wert der erstellungsMassstab-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setErstellungsMassstab(Integer value) {
        this.erstellungsMassstab = value;
    }

    /**
     * Ruft den Wert der geltungsbereich-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GeometryPropertyType }
     *     
     */
    public GeometryPropertyType getGeltungsbereich() {
        return geltungsbereich;
    }

    /**
     * Legt den Wert der geltungsbereich-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GeometryPropertyType }
     *     
     */
    public void setGeltungsbereich(GeometryPropertyType value) {
        this.geltungsbereich = value;
    }

    /**
     * Ruft den Wert der rasterBasis-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getRasterBasis() {
        return rasterBasis;
    }

    /**
     * Legt den Wert der rasterBasis-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setRasterBasis(ReferenceType value) {
        this.rasterBasis = value;
    }

    /**
     * Gets the value of the planinhalt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the planinhalt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlaninhalt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenceType }
     * 
     * 
     */
    public List<ReferenceType> getPlaninhalt() {
        if (planinhalt == null) {
            planinhalt = new ArrayList<ReferenceType>();
        }
        return this.planinhalt;
    }

    /**
     * Gets the value of the praesentationsobjekt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the praesentationsobjekt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPraesentationsobjekt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenceType }
     * 
     * 
     */
    public List<ReferenceType> getPraesentationsobjekt() {
        if (praesentationsobjekt == null) {
            praesentationsobjekt = new ArrayList<ReferenceType>();
        }
        return this.praesentationsobjekt;
    }

    /**
     * Gets the value of the genericApplicationPropertyOfXPBereich property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfXPBereich property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfXPBereich().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfXPBereich() {
        if (genericApplicationPropertyOfXPBereich == null) {
            genericApplicationPropertyOfXPBereich = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfXPBereich;
    }

}
