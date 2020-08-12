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
import net.opengis.gml._3.CodeType;
import net.opengis.gml._3.ReferenceType;


/**
 * Abstrakte Oberklasse für alle XPlanGML-Fachobjekte. Die Attribute dieser Klasse werden über den Vererbungs-Mechanismus an alle Fachobjekte weitergegeben.
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
 *         &lt;element name="rechtsstand" type="{http://www.xplanung.de/xplangml/4/1}XP_Rechtsstand" minOccurs="0"/>
 *         &lt;element name="gesetzlicheGrundlage" type="{http://www.opengis.net/gml/3.2}CodeType" minOccurs="0"/>
 *         &lt;element name="textSchluessel" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="textSchluesselBegruendung" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="gliederung1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gliederung2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ebene" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="rechtsverbindlich" type="{http://www.xplanung.de/xplangml/4/1}XP_ExterneReferenzPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="informell" type="{http://www.xplanung.de/xplangml/4/1}XP_ExterneReferenzPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="hatGenerAttribut" type="{http://www.xplanung.de/xplangml/4/1}XP_GenerAttributPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="hoehenangabe" type="{http://www.xplanung.de/xplangml/4/1}XP_HoehenangabePropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="gehoertNachrichtlichZuBereich" type="{http://www.opengis.net/gml/3.2}ReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="wirdDargestelltDurch" type="{http://www.opengis.net/gml/3.2}ReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="refTextInhalt" type="{http://www.opengis.net/gml/3.2}ReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="refBegruendungInhalt" type="{http://www.opengis.net/gml/3.2}ReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/4/1}_GenericApplicationPropertyOfXP_Objekt" maxOccurs="unbounded" minOccurs="0"/>
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
    "textSchluessel",
    "textSchluesselBegruendung",
    "gliederung1",
    "gliederung2",
    "ebene",
    "rechtsverbindlich",
    "informell",
    "hatGenerAttribut",
    "hoehenangabe",
    "gehoertNachrichtlichZuBereich",
    "wirdDargestelltDurch",
    "refTextInhalt",
    "refBegruendungInhalt",
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
    protected List<String> textSchluessel;
    protected List<String> textSchluesselBegruendung;
    protected String gliederung1;
    protected String gliederung2;
    protected BigInteger ebene;
    protected List<XPExterneReferenzPropertyType> rechtsverbindlich;
    protected List<XPExterneReferenzPropertyType> informell;
    protected List<XPGenerAttributPropertyType> hatGenerAttribut;
    protected List<XPHoehenangabePropertyType> hoehenangabe;
    protected List<ReferenceType> gehoertNachrichtlichZuBereich;
    protected List<ReferenceType> wirdDargestelltDurch;
    protected List<ReferenceType> refTextInhalt;
    protected List<ReferenceType> refBegruendungInhalt;
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
     * Gets the value of the textSchluessel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the textSchluessel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTextSchluessel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTextSchluessel() {
        if (textSchluessel == null) {
            textSchluessel = new ArrayList<String>();
        }
        return this.textSchluessel;
    }

    /**
     * Gets the value of the textSchluesselBegruendung property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the textSchluesselBegruendung property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTextSchluesselBegruendung().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTextSchluesselBegruendung() {
        if (textSchluesselBegruendung == null) {
            textSchluesselBegruendung = new ArrayList<String>();
        }
        return this.textSchluesselBegruendung;
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
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEbene() {
        return ebene;
    }

    /**
     * Legt den Wert der ebene-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEbene(BigInteger value) {
        this.ebene = value;
    }

    /**
     * Gets the value of the rechtsverbindlich property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rechtsverbindlich property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRechtsverbindlich().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XPExterneReferenzPropertyType }
     * 
     * 
     */
    public List<XPExterneReferenzPropertyType> getRechtsverbindlich() {
        if (rechtsverbindlich == null) {
            rechtsverbindlich = new ArrayList<XPExterneReferenzPropertyType>();
        }
        return this.rechtsverbindlich;
    }

    /**
     * Gets the value of the informell property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the informell property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInformell().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XPExterneReferenzPropertyType }
     * 
     * 
     */
    public List<XPExterneReferenzPropertyType> getInformell() {
        if (informell == null) {
            informell = new ArrayList<XPExterneReferenzPropertyType>();
        }
        return this.informell;
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
     * Gets the value of the gehoertNachrichtlichZuBereich property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gehoertNachrichtlichZuBereich property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGehoertNachrichtlichZuBereich().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenceType }
     * 
     * 
     */
    public List<ReferenceType> getGehoertNachrichtlichZuBereich() {
        if (gehoertNachrichtlichZuBereich == null) {
            gehoertNachrichtlichZuBereich = new ArrayList<ReferenceType>();
        }
        return this.gehoertNachrichtlichZuBereich;
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
     * Gets the value of the refTextInhalt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refTextInhalt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefTextInhalt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenceType }
     * 
     * 
     */
    public List<ReferenceType> getRefTextInhalt() {
        if (refTextInhalt == null) {
            refTextInhalt = new ArrayList<ReferenceType>();
        }
        return this.refTextInhalt;
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
