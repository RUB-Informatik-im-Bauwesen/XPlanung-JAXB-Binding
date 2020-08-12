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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import net.opengis.gml._3.AbstractFeatureType;
import net.opengis.gml._3.GeometryPropertyType;
import net.opengis.gml._3.LengthType;
import net.opengis.gml._3.ReferenceType;


/**
 * Abstrakte Oberklasse für alle Klassen von raumbezogenen Plänen..
 * 
 * <p>Java-Klasse für XP_PlanType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="XP_PlanType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractFeatureType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nummer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="internalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="beschreibung" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="kommentar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="technHerstellDatum" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="genehmigungsDatum" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="untergangsDatum" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="aendert" type="{http://www.xplanung.de/xplangml/4/1}XP_VerbundenerPlanPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="wurdeGeaendertVon" type="{http://www.xplanung.de/xplangml/4/1}XP_VerbundenerPlanPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="erstellungsMassstab" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="xPlanGMLVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bezugshoehe" type="{http://www.opengis.net/gml/3.2}LengthType" minOccurs="0"/>
 *         &lt;element name="raeumlicherGeltungsbereich" type="{http://www.opengis.net/gml/3.2}GeometryPropertyType" minOccurs="0"/>
 *         &lt;element name="verfahrensMerkmale" type="{http://www.xplanung.de/xplangml/4/1}XP_VerfahrensMerkmalPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="rechtsverbindlich" type="{http://www.xplanung.de/xplangml/4/1}XP_ExterneReferenzPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="informell" type="{http://www.xplanung.de/xplangml/4/1}XP_ExterneReferenzPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="hatGenerAttribut" type="{http://www.xplanung.de/xplangml/4/1}XP_GenerAttributPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="refBeschreibung" type="{http://www.xplanung.de/xplangml/4/1}XP_ExterneReferenzPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="refBegruendung" type="{http://www.xplanung.de/xplangml/4/1}XP_ExterneReferenzPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="refExternalCodeList" type="{http://www.xplanung.de/xplangml/4/1}XP_ExterneReferenzPropertyType" minOccurs="0"/>
 *         &lt;element name="refLegende" type="{http://www.xplanung.de/xplangml/4/1}XP_ExterneReferenzPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="refRechtsplan" type="{http://www.xplanung.de/xplangml/4/1}XP_ExterneReferenzPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="refPlangrundlage" type="{http://www.xplanung.de/xplangml/4/1}XP_ExterneReferenzPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="texte" type="{http://www.opengis.net/gml/3.2}ReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="begruendungsTexte" type="{http://www.opengis.net/gml/3.2}ReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/4/1}_GenericApplicationPropertyOfXP_Plan" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XP_PlanType", propOrder = {
    "name",
    "nummer",
    "internalId",
    "beschreibung",
    "kommentar",
    "technHerstellDatum",
    "genehmigungsDatum",
    "untergangsDatum",
    "aendert",
    "wurdeGeaendertVon",
    "erstellungsMassstab",
    "xPlanGMLVersion",
    "bezugshoehe",
    "raeumlicherGeltungsbereich",
    "verfahrensMerkmale",
    "rechtsverbindlich",
    "informell",
    "hatGenerAttribut",
    "refBeschreibung",
    "refBegruendung",
    "refExternalCodeList",
    "refLegende",
    "refRechtsplan",
    "refPlangrundlage",
    "texte",
    "begruendungsTexte",
    "genericApplicationPropertyOfXPPlan"
})
@XmlSeeAlso({
    FPPlanType.class,
    SOPlanType.class,
    BPPlanType.class,
    RPPlanType.class,
    LPPlanType.class
})
public abstract class XPPlanType
    extends AbstractFeatureType
{

    protected String name;
    protected String nummer;
    protected String internalId;
    protected String beschreibung;
    protected String kommentar;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar technHerstellDatum;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar genehmigungsDatum;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar untergangsDatum;
    protected List<XPVerbundenerPlanPropertyType> aendert;
    protected List<XPVerbundenerPlanPropertyType> wurdeGeaendertVon;
    protected BigInteger erstellungsMassstab;
    protected String xPlanGMLVersion;
    protected LengthType bezugshoehe;
    protected GeometryPropertyType raeumlicherGeltungsbereich;
    protected List<XPVerfahrensMerkmalPropertyType> verfahrensMerkmale;
    protected List<XPExterneReferenzPropertyType> rechtsverbindlich;
    protected List<XPExterneReferenzPropertyType> informell;
    protected List<XPGenerAttributPropertyType> hatGenerAttribut;
    protected List<XPExterneReferenzPropertyType> refBeschreibung;
    protected List<XPExterneReferenzPropertyType> refBegruendung;
    protected XPExterneReferenzPropertyType refExternalCodeList;
    protected List<XPExterneReferenzPropertyType> refLegende;
    protected List<XPExterneReferenzPropertyType> refRechtsplan;
    protected List<XPExterneReferenzPropertyType> refPlangrundlage;
    protected List<ReferenceType> texte;
    protected List<ReferenceType> begruendungsTexte;
    @XmlElement(name = "_GenericApplicationPropertyOfXP_Plan")
    protected List<Object> genericApplicationPropertyOfXPPlan;

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
     * Ruft den Wert der nummer-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNummer() {
        return nummer;
    }

    /**
     * Legt den Wert der nummer-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNummer(String value) {
        this.nummer = value;
    }

    /**
     * Ruft den Wert der internalId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalId() {
        return internalId;
    }

    /**
     * Legt den Wert der internalId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalId(String value) {
        this.internalId = value;
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
     * Ruft den Wert der kommentar-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKommentar() {
        return kommentar;
    }

    /**
     * Legt den Wert der kommentar-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKommentar(String value) {
        this.kommentar = value;
    }

    /**
     * Ruft den Wert der technHerstellDatum-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTechnHerstellDatum() {
        return technHerstellDatum;
    }

    /**
     * Legt den Wert der technHerstellDatum-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTechnHerstellDatum(XMLGregorianCalendar value) {
        this.technHerstellDatum = value;
    }

    /**
     * Ruft den Wert der genehmigungsDatum-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGenehmigungsDatum() {
        return genehmigungsDatum;
    }

    /**
     * Legt den Wert der genehmigungsDatum-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGenehmigungsDatum(XMLGregorianCalendar value) {
        this.genehmigungsDatum = value;
    }

    /**
     * Ruft den Wert der untergangsDatum-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUntergangsDatum() {
        return untergangsDatum;
    }

    /**
     * Legt den Wert der untergangsDatum-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUntergangsDatum(XMLGregorianCalendar value) {
        this.untergangsDatum = value;
    }

    /**
     * Gets the value of the aendert property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aendert property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAendert().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XPVerbundenerPlanPropertyType }
     * 
     * 
     */
    public List<XPVerbundenerPlanPropertyType> getAendert() {
        if (aendert == null) {
            aendert = new ArrayList<XPVerbundenerPlanPropertyType>();
        }
        return this.aendert;
    }

    /**
     * Gets the value of the wurdeGeaendertVon property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wurdeGeaendertVon property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWurdeGeaendertVon().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XPVerbundenerPlanPropertyType }
     * 
     * 
     */
    public List<XPVerbundenerPlanPropertyType> getWurdeGeaendertVon() {
        if (wurdeGeaendertVon == null) {
            wurdeGeaendertVon = new ArrayList<XPVerbundenerPlanPropertyType>();
        }
        return this.wurdeGeaendertVon;
    }

    /**
     * Ruft den Wert der erstellungsMassstab-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getErstellungsMassstab() {
        return erstellungsMassstab;
    }

    /**
     * Legt den Wert der erstellungsMassstab-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setErstellungsMassstab(BigInteger value) {
        this.erstellungsMassstab = value;
    }

    /**
     * Ruft den Wert der xPlanGMLVersion-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXPlanGMLVersion() {
        return xPlanGMLVersion;
    }

    /**
     * Legt den Wert der xPlanGMLVersion-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXPlanGMLVersion(String value) {
        this.xPlanGMLVersion = value;
    }

    /**
     * Ruft den Wert der bezugshoehe-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getBezugshoehe() {
        return bezugshoehe;
    }

    /**
     * Legt den Wert der bezugshoehe-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setBezugshoehe(LengthType value) {
        this.bezugshoehe = value;
    }

    /**
     * Ruft den Wert der raeumlicherGeltungsbereich-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GeometryPropertyType }
     *     
     */
    public GeometryPropertyType getRaeumlicherGeltungsbereich() {
        return raeumlicherGeltungsbereich;
    }

    /**
     * Legt den Wert der raeumlicherGeltungsbereich-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GeometryPropertyType }
     *     
     */
    public void setRaeumlicherGeltungsbereich(GeometryPropertyType value) {
        this.raeumlicherGeltungsbereich = value;
    }

    /**
     * Gets the value of the verfahrensMerkmale property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the verfahrensMerkmale property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVerfahrensMerkmale().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XPVerfahrensMerkmalPropertyType }
     * 
     * 
     */
    public List<XPVerfahrensMerkmalPropertyType> getVerfahrensMerkmale() {
        if (verfahrensMerkmale == null) {
            verfahrensMerkmale = new ArrayList<XPVerfahrensMerkmalPropertyType>();
        }
        return this.verfahrensMerkmale;
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
     * Gets the value of the refBeschreibung property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refBeschreibung property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefBeschreibung().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XPExterneReferenzPropertyType }
     * 
     * 
     */
    public List<XPExterneReferenzPropertyType> getRefBeschreibung() {
        if (refBeschreibung == null) {
            refBeschreibung = new ArrayList<XPExterneReferenzPropertyType>();
        }
        return this.refBeschreibung;
    }

    /**
     * Gets the value of the refBegruendung property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refBegruendung property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefBegruendung().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XPExterneReferenzPropertyType }
     * 
     * 
     */
    public List<XPExterneReferenzPropertyType> getRefBegruendung() {
        if (refBegruendung == null) {
            refBegruendung = new ArrayList<XPExterneReferenzPropertyType>();
        }
        return this.refBegruendung;
    }

    /**
     * Ruft den Wert der refExternalCodeList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XPExterneReferenzPropertyType }
     *     
     */
    public XPExterneReferenzPropertyType getRefExternalCodeList() {
        return refExternalCodeList;
    }

    /**
     * Legt den Wert der refExternalCodeList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XPExterneReferenzPropertyType }
     *     
     */
    public void setRefExternalCodeList(XPExterneReferenzPropertyType value) {
        this.refExternalCodeList = value;
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
     * Gets the value of the refRechtsplan property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refRechtsplan property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefRechtsplan().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XPExterneReferenzPropertyType }
     * 
     * 
     */
    public List<XPExterneReferenzPropertyType> getRefRechtsplan() {
        if (refRechtsplan == null) {
            refRechtsplan = new ArrayList<XPExterneReferenzPropertyType>();
        }
        return this.refRechtsplan;
    }

    /**
     * Gets the value of the refPlangrundlage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refPlangrundlage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefPlangrundlage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XPExterneReferenzPropertyType }
     * 
     * 
     */
    public List<XPExterneReferenzPropertyType> getRefPlangrundlage() {
        if (refPlangrundlage == null) {
            refPlangrundlage = new ArrayList<XPExterneReferenzPropertyType>();
        }
        return this.refPlangrundlage;
    }

    /**
     * Gets the value of the texte property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the texte property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTexte().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenceType }
     * 
     * 
     */
    public List<ReferenceType> getTexte() {
        if (texte == null) {
            texte = new ArrayList<ReferenceType>();
        }
        return this.texte;
    }

    /**
     * Gets the value of the begruendungsTexte property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the begruendungsTexte property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBegruendungsTexte().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenceType }
     * 
     * 
     */
    public List<ReferenceType> getBegruendungsTexte() {
        if (begruendungsTexte == null) {
            begruendungsTexte = new ArrayList<ReferenceType>();
        }
        return this.begruendungsTexte;
    }

    /**
     * Gets the value of the genericApplicationPropertyOfXPPlan property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfXPPlan property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfXPPlan().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfXPPlan() {
        if (genericApplicationPropertyOfXPPlan == null) {
            genericApplicationPropertyOfXPPlan = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfXPPlan;
    }

}
