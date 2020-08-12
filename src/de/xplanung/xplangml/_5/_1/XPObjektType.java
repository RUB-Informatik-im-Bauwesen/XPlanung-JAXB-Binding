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
import net.opengis.gml._3.AbstractFeatureType;
import net.opengis.gml._3.CodeType;
import net.opengis.gml._3.ReferenceType;


/**
 * Abstrakte Oberklasse für alle XPlanung-Fachobjekte. Die Attribute dieser Klasse werden über den Vererbungs-Mechanismus an alle Fachobjekte weitergegeben.
 * 
 * <p>Java-Klasse für XP_ObjektType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="XP_ObjektType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractFeatureType">
 *       &lt;sequence>
 *         &lt;element name="uuid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rechtsstand" type="{http://www.xplanung.de/xplangml/5/1}XP_Rechtsstand" minOccurs="0"/>
 *         &lt;element name="gesetzlicheGrundlage" type="{http://www.opengis.net/gml/3.2}CodeType" minOccurs="0"/>
 *         &lt;element name="gliederung1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gliederung2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ebene" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="hatGenerAttribut" type="{http://www.xplanung.de/xplangml/5/1}XP_GenerAttributPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="hoehenangabe" type="{http://www.xplanung.de/xplangml/5/1}XP_HoehenangabePropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="externeReferenz" type="{http://www.xplanung.de/xplangml/5/1}XP_SpezExterneReferenzPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="gehoertZuBereich" type="{http://www.opengis.net/gml/3.2}ReferenceType" minOccurs="0"/>
 *         &lt;element name="wirdDargestelltDurch" type="{http://www.opengis.net/gml/3.2}ReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="refBegruendungInhalt" type="{http://www.opengis.net/gml/3.2}ReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="startBedingung" type="{http://www.xplanung.de/xplangml/5/1}XP_WirksamkeitBedingungPropertyType" minOccurs="0"/>
 *         &lt;element name="endeBedingung" type="{http://www.xplanung.de/xplangml/5/1}XP_WirksamkeitBedingungPropertyType" minOccurs="0"/>
 *         &lt;element name="aufschrift" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/5/1}_GenericApplicationPropertyOfXP_Objekt" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XP_ObjektType", propOrder = {
    "uuid",
    "text",
    "rechtsstand",
    "gesetzlicheGrundlage",
    "gliederung1",
    "gliederung2",
    "ebene",
    "hatGenerAttribut",
    "hoehenangabe",
    "externeReferenz",
    "gehoertZuBereich",
    "wirdDargestelltDurch",
    "refBegruendungInhalt",
    "startBedingung",
    "endeBedingung",
    "aufschrift",
    "genericApplicationPropertyOfXPObjekt"
})
@XmlSeeAlso({
    FPObjektType.class,
    SOObjektType.class,
    LPObjektType.class,
    BPObjektType.class,
    RPObjektType.class
})
public abstract class XPObjektType
    extends AbstractFeatureType
{

    protected String uuid;
    protected String text;
    protected String rechtsstand;
    protected CodeType gesetzlicheGrundlage;
    protected String gliederung1;
    protected String gliederung2;
    @XmlElement(defaultValue = "0")
    protected Integer ebene;
    protected List<XPGenerAttributPropertyType> hatGenerAttribut;
    protected List<XPHoehenangabePropertyType> hoehenangabe;
    protected List<XPSpezExterneReferenzPropertyType> externeReferenz;
    protected ReferenceType gehoertZuBereich;
    protected List<ReferenceType> wirdDargestelltDurch;
    protected List<ReferenceType> refBegruendungInhalt;
    protected XPWirksamkeitBedingungPropertyType startBedingung;
    protected XPWirksamkeitBedingungPropertyType endeBedingung;
    protected String aufschrift;
    @XmlElement(name = "_GenericApplicationPropertyOfXP_Objekt")
    protected List<Object> genericApplicationPropertyOfXPObjekt;

    /**
     * Ruft den Wert der uuid-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * Legt den Wert der uuid-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUuid(String value) {
        this.uuid = value;
    }

    /**
     * Ruft den Wert der text-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Legt den Wert der text-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
    }

    /**
     * Ruft den Wert der rechtsstand-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRechtsstand() {
        return rechtsstand;
    }

    /**
     * Legt den Wert der rechtsstand-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRechtsstand(String value) {
        this.rechtsstand = value;
    }

    /**
     * Ruft den Wert der gesetzlicheGrundlage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getGesetzlicheGrundlage() {
        return gesetzlicheGrundlage;
    }

    /**
     * Legt den Wert der gesetzlicheGrundlage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setGesetzlicheGrundlage(CodeType value) {
        this.gesetzlicheGrundlage = value;
    }

    /**
     * Ruft den Wert der gliederung1-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGliederung1() {
        return gliederung1;
    }

    /**
     * Legt den Wert der gliederung1-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGliederung1(String value) {
        this.gliederung1 = value;
    }

    /**
     * Ruft den Wert der gliederung2-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGliederung2() {
        return gliederung2;
    }

    /**
     * Legt den Wert der gliederung2-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGliederung2(String value) {
        this.gliederung2 = value;
    }

    /**
     * Ruft den Wert der ebene-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEbene() {
        return ebene;
    }

    /**
     * Legt den Wert der ebene-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEbene(Integer value) {
        this.ebene = value;
    }

    /**
     * Gets the value of the hatGenerAttribut property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hatGenerAttribut property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHatGenerAttribut().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XPGenerAttributPropertyType }
     * 
     * 
     */
    public List<XPGenerAttributPropertyType> getHatGenerAttribut() {
        if (hatGenerAttribut == null) {
            hatGenerAttribut = new ArrayList<XPGenerAttributPropertyType>();
        }
        return this.hatGenerAttribut;
    }

    /**
     * Gets the value of the hoehenangabe property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hoehenangabe property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHoehenangabe().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XPHoehenangabePropertyType }
     * 
     * 
     */
    public List<XPHoehenangabePropertyType> getHoehenangabe() {
        if (hoehenangabe == null) {
            hoehenangabe = new ArrayList<XPHoehenangabePropertyType>();
        }
        return this.hoehenangabe;
    }

    /**
     * Gets the value of the externeReferenz property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the externeReferenz property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExterneReferenz().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XPSpezExterneReferenzPropertyType }
     * 
     * 
     */
    public List<XPSpezExterneReferenzPropertyType> getExterneReferenz() {
        if (externeReferenz == null) {
            externeReferenz = new ArrayList<XPSpezExterneReferenzPropertyType>();
        }
        return this.externeReferenz;
    }

    /**
     * Ruft den Wert der gehoertZuBereich-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getGehoertZuBereich() {
        return gehoertZuBereich;
    }

    /**
     * Legt den Wert der gehoertZuBereich-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setGehoertZuBereich(ReferenceType value) {
        this.gehoertZuBereich = value;
    }

    /**
     * Gets the value of the wirdDargestelltDurch property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wirdDargestelltDurch property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWirdDargestelltDurch().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenceType }
     * 
     * 
     */
    public List<ReferenceType> getWirdDargestelltDurch() {
        if (wirdDargestelltDurch == null) {
            wirdDargestelltDurch = new ArrayList<ReferenceType>();
        }
        return this.wirdDargestelltDurch;
    }

    /**
     * Gets the value of the refBegruendungInhalt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refBegruendungInhalt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefBegruendungInhalt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenceType }
     * 
     * 
     */
    public List<ReferenceType> getRefBegruendungInhalt() {
        if (refBegruendungInhalt == null) {
            refBegruendungInhalt = new ArrayList<ReferenceType>();
        }
        return this.refBegruendungInhalt;
    }

    /**
     * Ruft den Wert der startBedingung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XPWirksamkeitBedingungPropertyType }
     *     
     */
    public XPWirksamkeitBedingungPropertyType getStartBedingung() {
        return startBedingung;
    }

    /**
     * Legt den Wert der startBedingung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XPWirksamkeitBedingungPropertyType }
     *     
     */
    public void setStartBedingung(XPWirksamkeitBedingungPropertyType value) {
        this.startBedingung = value;
    }

    /**
     * Ruft den Wert der endeBedingung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XPWirksamkeitBedingungPropertyType }
     *     
     */
    public XPWirksamkeitBedingungPropertyType getEndeBedingung() {
        return endeBedingung;
    }

    /**
     * Legt den Wert der endeBedingung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XPWirksamkeitBedingungPropertyType }
     *     
     */
    public void setEndeBedingung(XPWirksamkeitBedingungPropertyType value) {
        this.endeBedingung = value;
    }

    /**
     * Ruft den Wert der aufschrift-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAufschrift() {
        return aufschrift;
    }

    /**
     * Legt den Wert der aufschrift-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAufschrift(String value) {
        this.aufschrift = value;
    }

    /**
     * Gets the value of the genericApplicationPropertyOfXPObjekt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfXPObjekt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfXPObjekt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfXPObjekt() {
        if (genericApplicationPropertyOfXPObjekt == null) {
            genericApplicationPropertyOfXPObjekt = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfXPObjekt;
    }

}
