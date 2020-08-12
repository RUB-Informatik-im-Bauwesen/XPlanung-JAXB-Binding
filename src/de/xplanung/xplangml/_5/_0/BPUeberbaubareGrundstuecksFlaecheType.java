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
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml._3.AngleType;
import net.opengis.gml._3.AreaType;
import net.opengis.gml._3.CodeType;
import net.opengis.gml._3.LengthType;
import net.opengis.gml._3.ReferenceType;
import net.opengis.gml._3.ScaleType;
import net.opengis.gml._3.VolumeType;


/**
 * Festsetzung der überbaubaren Grundstücksfläche (§9, Abs. 1, Nr. 2 BauGB). Über die Attribute <i>geschossMin </i>und <i>geschossMax </i>kann die Festsetzung auf einen Bereich von Geschossen beschränkt werden. Wenn eine Einschränkung der Festsetzung durch expliziter Höhenangaben erfolgen soll, ist dazu die Oberklassen-Relation <i>hoehenangabe </i>auf den komplexen Datentyp <i>XP_Hoehenangabe </i>zu verwenden. 
 * 
 * <p>Java-Klasse für BP_UeberbaubareGrundstuecksFlaecheType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="BP_UeberbaubareGrundstuecksFlaecheType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/5/0}BP_UeberlagerungsobjektType">
 *       &lt;sequence>
 *         &lt;element name="DNmin" type="{http://www.opengis.net/gml/3.2}AngleType" minOccurs="0"/>
 *         &lt;element name="DNmax" type="{http://www.opengis.net/gml/3.2}AngleType" minOccurs="0"/>
 *         &lt;element name="DN" type="{http://www.opengis.net/gml/3.2}AngleType" minOccurs="0"/>
 *         &lt;element name="DNZwingend" type="{http://www.opengis.net/gml/3.2}AngleType" minOccurs="0"/>
 *         &lt;element name="FR" type="{http://www.opengis.net/gml/3.2}AngleType" minOccurs="0"/>
 *         &lt;element name="dachform" type="{http://www.xplanung.de/xplangml/5/0}BP_Dachform" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="detaillierteDachform" type="{http://www.opengis.net/gml/3.2}CodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MaxZahlWohnungen" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Fmin" type="{http://www.opengis.net/gml/3.2}AreaType" minOccurs="0"/>
 *         &lt;element name="Fmax" type="{http://www.opengis.net/gml/3.2}AreaType" minOccurs="0"/>
 *         &lt;element name="Bmin" type="{http://www.opengis.net/gml/3.2}LengthType" minOccurs="0"/>
 *         &lt;element name="Bmax" type="{http://www.opengis.net/gml/3.2}LengthType" minOccurs="0"/>
 *         &lt;element name="Tmin" type="{http://www.opengis.net/gml/3.2}LengthType" minOccurs="0"/>
 *         &lt;element name="Tmax" type="{http://www.opengis.net/gml/3.2}LengthType" minOccurs="0"/>
 *         &lt;element name="GFZmin" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="GFZmax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="GFZ" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="GFZ_Ausn" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="GFmin" type="{http://www.opengis.net/gml/3.2}AreaType" minOccurs="0"/>
 *         &lt;element name="GFmax" type="{http://www.opengis.net/gml/3.2}AreaType" minOccurs="0"/>
 *         &lt;element name="GF" type="{http://www.opengis.net/gml/3.2}AreaType" minOccurs="0"/>
 *         &lt;element name="GF_Ausn" type="{http://www.opengis.net/gml/3.2}AreaType" minOccurs="0"/>
 *         &lt;element name="BMZ" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="BMZ_Ausn" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="BM" type="{http://www.opengis.net/gml/3.2}VolumeType" minOccurs="0"/>
 *         &lt;element name="BM_Ausn" type="{http://www.opengis.net/gml/3.2}VolumeType" minOccurs="0"/>
 *         &lt;element name="GRZmin" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="GRZmax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="GRZ" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="GRZ_Ausn" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="GRmin" type="{http://www.opengis.net/gml/3.2}AreaType" minOccurs="0"/>
 *         &lt;element name="GRmax" type="{http://www.opengis.net/gml/3.2}AreaType" minOccurs="0"/>
 *         &lt;element name="GR" type="{http://www.opengis.net/gml/3.2}AreaType" minOccurs="0"/>
 *         &lt;element name="GR_Ausn" type="{http://www.opengis.net/gml/3.2}AreaType" minOccurs="0"/>
 *         &lt;element name="Zmin" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Zmax" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Zzwingend" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Z" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Z_Ausn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Z_Staffel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Z_Dach" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ZUmin" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ZUmax" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ZUzwingend" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ZU" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ZU_Ausn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="wohnnutzungEGStrasse" type="{http://www.xplanung.de/xplangml/5/0}BP_Zulaessigkeit" minOccurs="0"/>
 *         &lt;element name="ZWohn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="GFAntWohnen" type="{http://www.opengis.net/gml/3.2}ScaleType" minOccurs="0"/>
 *         &lt;element name="GFWohnen" type="{http://www.opengis.net/gml/3.2}AreaType" minOccurs="0"/>
 *         &lt;element name="GFAntGewerbe" type="{http://www.opengis.net/gml/3.2}ScaleType" minOccurs="0"/>
 *         &lt;element name="GFGewerbe" type="{http://www.opengis.net/gml/3.2}AreaType" minOccurs="0"/>
 *         &lt;element name="bauweise" type="{http://www.xplanung.de/xplangml/5/0}BP_Bauweise" minOccurs="0"/>
 *         &lt;element name="abweichendeBauweise" type="{http://www.opengis.net/gml/3.2}CodeType" minOccurs="0"/>
 *         &lt;element name="vertikaleDifferenzierung" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="bebauungsArt" type="{http://www.xplanung.de/xplangml/5/0}BP_BebauungsArt" minOccurs="0"/>
 *         &lt;element name="bebauungVordereGrenze" type="{http://www.xplanung.de/xplangml/5/0}BP_GrenzBebauung" minOccurs="0"/>
 *         &lt;element name="bebauungRueckwaertigeGrenze" type="{http://www.xplanung.de/xplangml/5/0}BP_GrenzBebauung" minOccurs="0"/>
 *         &lt;element name="bebauungSeitlicheGrenze" type="{http://www.xplanung.de/xplangml/5/0}BP_GrenzBebauung" minOccurs="0"/>
 *         &lt;element name="refGebaeudequerschnitt" type="{http://www.xplanung.de/xplangml/5/0}XP_ExterneReferenzPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="baugrenze" type="{http://www.opengis.net/gml/3.2}ReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="baulinie" type="{http://www.opengis.net/gml/3.2}ReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="geschossMin" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="geschossMax" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/5/0}_GenericApplicationPropertyOfBP_UeberbaubareGrundstuecksFlaeche" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BP_UeberbaubareGrundstuecksFlaecheType", propOrder = {
    "dNmin",
    "dNmax",
    "dn",
    "dnZwingend",
    "fr",
    "dachform",
    "detaillierteDachform",
    "maxZahlWohnungen",
    "fmin",
    "fmax",
    "bmin",
    "bmax",
    "tmin",
    "tmax",
    "gfZmin",
    "gfZmax",
    "gfz",
    "gfzAusn",
    "gFmin",
    "gFmax",
    "gf",
    "gfAusn",
    "bmz",
    "bmzAusn",
    "bm",
    "bmAusn",
    "grZmin",
    "grZmax",
    "grz",
    "grzAusn",
    "gRmin",
    "gRmax",
    "gr",
    "grAusn",
    "zmin",
    "zmax",
    "zzwingend",
    "z",
    "zAusn",
    "zStaffel",
    "zDach",
    "zUmin",
    "zUmax",
    "zUzwingend",
    "zu",
    "zuAusn",
    "wohnnutzungEGStrasse",
    "zWohn",
    "gfAntWohnen",
    "gfWohnen",
    "gfAntGewerbe",
    "gfGewerbe",
    "bauweise",
    "abweichendeBauweise",
    "vertikaleDifferenzierung",
    "bebauungsArt",
    "bebauungVordereGrenze",
    "bebauungRueckwaertigeGrenze",
    "bebauungSeitlicheGrenze",
    "refGebaeudequerschnitt",
    "baugrenze",
    "baulinie",
    "geschossMin",
    "geschossMax",
    "genericApplicationPropertyOfBPUeberbaubareGrundstuecksFlaeche"
})
public class BPUeberbaubareGrundstuecksFlaecheType
    extends BPUeberlagerungsobjektType
{

    @XmlElement(name = "DNmin")
    protected AngleType dNmin;
    @XmlElement(name = "DNmax")
    protected AngleType dNmax;
    @XmlElement(name = "DN")
    protected AngleType dn;
    @XmlElement(name = "DNZwingend")
    protected AngleType dnZwingend;
    @XmlElement(name = "FR")
    protected AngleType fr;
    protected List<String> dachform;
    protected List<CodeType> detaillierteDachform;
    @XmlElement(name = "MaxZahlWohnungen")
    protected Integer maxZahlWohnungen;
    @XmlElement(name = "Fmin")
    protected AreaType fmin;
    @XmlElement(name = "Fmax")
    protected AreaType fmax;
    @XmlElement(name = "Bmin")
    protected LengthType bmin;
    @XmlElement(name = "Bmax")
    protected LengthType bmax;
    @XmlElement(name = "Tmin")
    protected LengthType tmin;
    @XmlElement(name = "Tmax")
    protected LengthType tmax;
    @XmlElement(name = "GFZmin")
    protected Double gfZmin;
    @XmlElement(name = "GFZmax")
    protected Double gfZmax;
    @XmlElement(name = "GFZ")
    protected Double gfz;
    @XmlElement(name = "GFZ_Ausn")
    protected Double gfzAusn;
    @XmlElement(name = "GFmin")
    protected AreaType gFmin;
    @XmlElement(name = "GFmax")
    protected AreaType gFmax;
    @XmlElement(name = "GF")
    protected AreaType gf;
    @XmlElement(name = "GF_Ausn")
    protected AreaType gfAusn;
    @XmlElement(name = "BMZ")
    protected Double bmz;
    @XmlElement(name = "BMZ_Ausn")
    protected Double bmzAusn;
    @XmlElement(name = "BM")
    protected VolumeType bm;
    @XmlElement(name = "BM_Ausn")
    protected VolumeType bmAusn;
    @XmlElement(name = "GRZmin")
    protected Double grZmin;
    @XmlElement(name = "GRZmax")
    protected Double grZmax;
    @XmlElement(name = "GRZ")
    protected Double grz;
    @XmlElement(name = "GRZ_Ausn")
    protected Double grzAusn;
    @XmlElement(name = "GRmin")
    protected AreaType gRmin;
    @XmlElement(name = "GRmax")
    protected AreaType gRmax;
    @XmlElement(name = "GR")
    protected AreaType gr;
    @XmlElement(name = "GR_Ausn")
    protected AreaType grAusn;
    @XmlElement(name = "Zmin")
    protected Integer zmin;
    @XmlElement(name = "Zmax")
    protected Integer zmax;
    @XmlElement(name = "Zzwingend")
    protected Integer zzwingend;
    @XmlElement(name = "Z")
    protected Integer z;
    @XmlElement(name = "Z_Ausn")
    protected Integer zAusn;
    @XmlElement(name = "Z_Staffel")
    protected Integer zStaffel;
    @XmlElement(name = "Z_Dach")
    protected Integer zDach;
    @XmlElement(name = "ZUmin")
    protected Integer zUmin;
    @XmlElement(name = "ZUmax")
    protected Integer zUmax;
    @XmlElement(name = "ZUzwingend")
    protected Integer zUzwingend;
    @XmlElement(name = "ZU")
    protected Integer zu;
    @XmlElement(name = "ZU_Ausn")
    protected Integer zuAusn;
    protected String wohnnutzungEGStrasse;
    @XmlElement(name = "ZWohn")
    protected Integer zWohn;
    @XmlElement(name = "GFAntWohnen")
    protected ScaleType gfAntWohnen;
    @XmlElement(name = "GFWohnen")
    protected AreaType gfWohnen;
    @XmlElement(name = "GFAntGewerbe")
    protected ScaleType gfAntGewerbe;
    @XmlElement(name = "GFGewerbe")
    protected AreaType gfGewerbe;
    protected String bauweise;
    protected CodeType abweichendeBauweise;
    @XmlElement(defaultValue = "false")
    protected Boolean vertikaleDifferenzierung;
    protected String bebauungsArt;
    protected String bebauungVordereGrenze;
    protected String bebauungRueckwaertigeGrenze;
    protected String bebauungSeitlicheGrenze;
    protected List<XPExterneReferenzPropertyType> refGebaeudequerschnitt;
    protected List<ReferenceType> baugrenze;
    protected List<ReferenceType> baulinie;
    protected Integer geschossMin;
    protected Integer geschossMax;
    @XmlElement(name = "_GenericApplicationPropertyOfBP_UeberbaubareGrundstuecksFlaeche")
    protected List<Object> genericApplicationPropertyOfBPUeberbaubareGrundstuecksFlaeche;

    /**
     * Ruft den Wert der dNmin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AngleType }
     *     
     */
    public AngleType getDNmin() {
        return dNmin;
    }

    /**
     * Legt den Wert der dNmin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AngleType }
     *     
     */
    public void setDNmin(AngleType value) {
        this.dNmin = value;
    }

    /**
     * Ruft den Wert der dNmax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AngleType }
     *     
     */
    public AngleType getDNmax() {
        return dNmax;
    }

    /**
     * Legt den Wert der dNmax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AngleType }
     *     
     */
    public void setDNmax(AngleType value) {
        this.dNmax = value;
    }

    /**
     * Ruft den Wert der dn-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AngleType }
     *     
     */
    public AngleType getDN() {
        return dn;
    }

    /**
     * Legt den Wert der dn-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AngleType }
     *     
     */
    public void setDN(AngleType value) {
        this.dn = value;
    }

    /**
     * Ruft den Wert der dnZwingend-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AngleType }
     *     
     */
    public AngleType getDNZwingend() {
        return dnZwingend;
    }

    /**
     * Legt den Wert der dnZwingend-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AngleType }
     *     
     */
    public void setDNZwingend(AngleType value) {
        this.dnZwingend = value;
    }

    /**
     * Ruft den Wert der fr-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AngleType }
     *     
     */
    public AngleType getFR() {
        return fr;
    }

    /**
     * Legt den Wert der fr-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AngleType }
     *     
     */
    public void setFR(AngleType value) {
        this.fr = value;
    }

    /**
     * Gets the value of the dachform property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dachform property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDachform().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDachform() {
        if (dachform == null) {
            dachform = new ArrayList<String>();
        }
        return this.dachform;
    }

    /**
     * Gets the value of the detaillierteDachform property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the detaillierteDachform property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetaillierteDachform().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeType }
     * 
     * 
     */
    public List<CodeType> getDetaillierteDachform() {
        if (detaillierteDachform == null) {
            detaillierteDachform = new ArrayList<CodeType>();
        }
        return this.detaillierteDachform;
    }

    /**
     * Ruft den Wert der maxZahlWohnungen-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxZahlWohnungen() {
        return maxZahlWohnungen;
    }

    /**
     * Legt den Wert der maxZahlWohnungen-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxZahlWohnungen(Integer value) {
        this.maxZahlWohnungen = value;
    }

    /**
     * Ruft den Wert der fmin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AreaType }
     *     
     */
    public AreaType getFmin() {
        return fmin;
    }

    /**
     * Legt den Wert der fmin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AreaType }
     *     
     */
    public void setFmin(AreaType value) {
        this.fmin = value;
    }

    /**
     * Ruft den Wert der fmax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AreaType }
     *     
     */
    public AreaType getFmax() {
        return fmax;
    }

    /**
     * Legt den Wert der fmax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AreaType }
     *     
     */
    public void setFmax(AreaType value) {
        this.fmax = value;
    }

    /**
     * Ruft den Wert der bmin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getBmin() {
        return bmin;
    }

    /**
     * Legt den Wert der bmin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setBmin(LengthType value) {
        this.bmin = value;
    }

    /**
     * Ruft den Wert der bmax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getBmax() {
        return bmax;
    }

    /**
     * Legt den Wert der bmax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setBmax(LengthType value) {
        this.bmax = value;
    }

    /**
     * Ruft den Wert der tmin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getTmin() {
        return tmin;
    }

    /**
     * Legt den Wert der tmin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setTmin(LengthType value) {
        this.tmin = value;
    }

    /**
     * Ruft den Wert der tmax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getTmax() {
        return tmax;
    }

    /**
     * Legt den Wert der tmax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setTmax(LengthType value) {
        this.tmax = value;
    }

    /**
     * Ruft den Wert der gfZmin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getGFZmin() {
        return gfZmin;
    }

    /**
     * Legt den Wert der gfZmin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setGFZmin(Double value) {
        this.gfZmin = value;
    }

    /**
     * Ruft den Wert der gfZmax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getGFZmax() {
        return gfZmax;
    }

    /**
     * Legt den Wert der gfZmax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setGFZmax(Double value) {
        this.gfZmax = value;
    }

    /**
     * Ruft den Wert der gfz-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getGFZ() {
        return gfz;
    }

    /**
     * Legt den Wert der gfz-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setGFZ(Double value) {
        this.gfz = value;
    }

    /**
     * Ruft den Wert der gfzAusn-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getGFZAusn() {
        return gfzAusn;
    }

    /**
     * Legt den Wert der gfzAusn-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setGFZAusn(Double value) {
        this.gfzAusn = value;
    }

    /**
     * Ruft den Wert der gFmin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AreaType }
     *     
     */
    public AreaType getGFmin() {
        return gFmin;
    }

    /**
     * Legt den Wert der gFmin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AreaType }
     *     
     */
    public void setGFmin(AreaType value) {
        this.gFmin = value;
    }

    /**
     * Ruft den Wert der gFmax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AreaType }
     *     
     */
    public AreaType getGFmax() {
        return gFmax;
    }

    /**
     * Legt den Wert der gFmax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AreaType }
     *     
     */
    public void setGFmax(AreaType value) {
        this.gFmax = value;
    }

    /**
     * Ruft den Wert der gf-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AreaType }
     *     
     */
    public AreaType getGF() {
        return gf;
    }

    /**
     * Legt den Wert der gf-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AreaType }
     *     
     */
    public void setGF(AreaType value) {
        this.gf = value;
    }

    /**
     * Ruft den Wert der gfAusn-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AreaType }
     *     
     */
    public AreaType getGFAusn() {
        return gfAusn;
    }

    /**
     * Legt den Wert der gfAusn-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AreaType }
     *     
     */
    public void setGFAusn(AreaType value) {
        this.gfAusn = value;
    }

    /**
     * Ruft den Wert der bmz-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBMZ() {
        return bmz;
    }

    /**
     * Legt den Wert der bmz-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBMZ(Double value) {
        this.bmz = value;
    }

    /**
     * Ruft den Wert der bmzAusn-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBMZAusn() {
        return bmzAusn;
    }

    /**
     * Legt den Wert der bmzAusn-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBMZAusn(Double value) {
        this.bmzAusn = value;
    }

    /**
     * Ruft den Wert der bm-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VolumeType }
     *     
     */
    public VolumeType getBM() {
        return bm;
    }

    /**
     * Legt den Wert der bm-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeType }
     *     
     */
    public void setBM(VolumeType value) {
        this.bm = value;
    }

    /**
     * Ruft den Wert der bmAusn-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VolumeType }
     *     
     */
    public VolumeType getBMAusn() {
        return bmAusn;
    }

    /**
     * Legt den Wert der bmAusn-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeType }
     *     
     */
    public void setBMAusn(VolumeType value) {
        this.bmAusn = value;
    }

    /**
     * Ruft den Wert der grZmin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getGRZmin() {
        return grZmin;
    }

    /**
     * Legt den Wert der grZmin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setGRZmin(Double value) {
        this.grZmin = value;
    }

    /**
     * Ruft den Wert der grZmax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getGRZmax() {
        return grZmax;
    }

    /**
     * Legt den Wert der grZmax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setGRZmax(Double value) {
        this.grZmax = value;
    }

    /**
     * Ruft den Wert der grz-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getGRZ() {
        return grz;
    }

    /**
     * Legt den Wert der grz-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setGRZ(Double value) {
        this.grz = value;
    }

    /**
     * Ruft den Wert der grzAusn-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getGRZAusn() {
        return grzAusn;
    }

    /**
     * Legt den Wert der grzAusn-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setGRZAusn(Double value) {
        this.grzAusn = value;
    }

    /**
     * Ruft den Wert der gRmin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AreaType }
     *     
     */
    public AreaType getGRmin() {
        return gRmin;
    }

    /**
     * Legt den Wert der gRmin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AreaType }
     *     
     */
    public void setGRmin(AreaType value) {
        this.gRmin = value;
    }

    /**
     * Ruft den Wert der gRmax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AreaType }
     *     
     */
    public AreaType getGRmax() {
        return gRmax;
    }

    /**
     * Legt den Wert der gRmax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AreaType }
     *     
     */
    public void setGRmax(AreaType value) {
        this.gRmax = value;
    }

    /**
     * Ruft den Wert der gr-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AreaType }
     *     
     */
    public AreaType getGR() {
        return gr;
    }

    /**
     * Legt den Wert der gr-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AreaType }
     *     
     */
    public void setGR(AreaType value) {
        this.gr = value;
    }

    /**
     * Ruft den Wert der grAusn-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AreaType }
     *     
     */
    public AreaType getGRAusn() {
        return grAusn;
    }

    /**
     * Legt den Wert der grAusn-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AreaType }
     *     
     */
    public void setGRAusn(AreaType value) {
        this.grAusn = value;
    }

    /**
     * Ruft den Wert der zmin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getZmin() {
        return zmin;
    }

    /**
     * Legt den Wert der zmin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setZmin(Integer value) {
        this.zmin = value;
    }

    /**
     * Ruft den Wert der zmax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getZmax() {
        return zmax;
    }

    /**
     * Legt den Wert der zmax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setZmax(Integer value) {
        this.zmax = value;
    }

    /**
     * Ruft den Wert der zzwingend-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getZzwingend() {
        return zzwingend;
    }

    /**
     * Legt den Wert der zzwingend-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setZzwingend(Integer value) {
        this.zzwingend = value;
    }

    /**
     * Ruft den Wert der z-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getZ() {
        return z;
    }

    /**
     * Legt den Wert der z-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setZ(Integer value) {
        this.z = value;
    }

    /**
     * Ruft den Wert der zAusn-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getZAusn() {
        return zAusn;
    }

    /**
     * Legt den Wert der zAusn-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setZAusn(Integer value) {
        this.zAusn = value;
    }

    /**
     * Ruft den Wert der zStaffel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getZStaffel() {
        return zStaffel;
    }

    /**
     * Legt den Wert der zStaffel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setZStaffel(Integer value) {
        this.zStaffel = value;
    }

    /**
     * Ruft den Wert der zDach-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getZDach() {
        return zDach;
    }

    /**
     * Legt den Wert der zDach-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setZDach(Integer value) {
        this.zDach = value;
    }

    /**
     * Ruft den Wert der zUmin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getZUmin() {
        return zUmin;
    }

    /**
     * Legt den Wert der zUmin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setZUmin(Integer value) {
        this.zUmin = value;
    }

    /**
     * Ruft den Wert der zUmax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getZUmax() {
        return zUmax;
    }

    /**
     * Legt den Wert der zUmax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setZUmax(Integer value) {
        this.zUmax = value;
    }

    /**
     * Ruft den Wert der zUzwingend-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getZUzwingend() {
        return zUzwingend;
    }

    /**
     * Legt den Wert der zUzwingend-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setZUzwingend(Integer value) {
        this.zUzwingend = value;
    }

    /**
     * Ruft den Wert der zu-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getZU() {
        return zu;
    }

    /**
     * Legt den Wert der zu-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setZU(Integer value) {
        this.zu = value;
    }

    /**
     * Ruft den Wert der zuAusn-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getZUAusn() {
        return zuAusn;
    }

    /**
     * Legt den Wert der zuAusn-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setZUAusn(Integer value) {
        this.zuAusn = value;
    }

    /**
     * Ruft den Wert der wohnnutzungEGStrasse-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWohnnutzungEGStrasse() {
        return wohnnutzungEGStrasse;
    }

    /**
     * Legt den Wert der wohnnutzungEGStrasse-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWohnnutzungEGStrasse(String value) {
        this.wohnnutzungEGStrasse = value;
    }

    /**
     * Ruft den Wert der zWohn-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getZWohn() {
        return zWohn;
    }

    /**
     * Legt den Wert der zWohn-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setZWohn(Integer value) {
        this.zWohn = value;
    }

    /**
     * Ruft den Wert der gfAntWohnen-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ScaleType }
     *     
     */
    public ScaleType getGFAntWohnen() {
        return gfAntWohnen;
    }

    /**
     * Legt den Wert der gfAntWohnen-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaleType }
     *     
     */
    public void setGFAntWohnen(ScaleType value) {
        this.gfAntWohnen = value;
    }

    /**
     * Ruft den Wert der gfWohnen-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AreaType }
     *     
     */
    public AreaType getGFWohnen() {
        return gfWohnen;
    }

    /**
     * Legt den Wert der gfWohnen-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AreaType }
     *     
     */
    public void setGFWohnen(AreaType value) {
        this.gfWohnen = value;
    }

    /**
     * Ruft den Wert der gfAntGewerbe-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ScaleType }
     *     
     */
    public ScaleType getGFAntGewerbe() {
        return gfAntGewerbe;
    }

    /**
     * Legt den Wert der gfAntGewerbe-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaleType }
     *     
     */
    public void setGFAntGewerbe(ScaleType value) {
        this.gfAntGewerbe = value;
    }

    /**
     * Ruft den Wert der gfGewerbe-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AreaType }
     *     
     */
    public AreaType getGFGewerbe() {
        return gfGewerbe;
    }

    /**
     * Legt den Wert der gfGewerbe-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AreaType }
     *     
     */
    public void setGFGewerbe(AreaType value) {
        this.gfGewerbe = value;
    }

    /**
     * Ruft den Wert der bauweise-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBauweise() {
        return bauweise;
    }

    /**
     * Legt den Wert der bauweise-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBauweise(String value) {
        this.bauweise = value;
    }

    /**
     * Ruft den Wert der abweichendeBauweise-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getAbweichendeBauweise() {
        return abweichendeBauweise;
    }

    /**
     * Legt den Wert der abweichendeBauweise-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setAbweichendeBauweise(CodeType value) {
        this.abweichendeBauweise = value;
    }

    /**
     * Ruft den Wert der vertikaleDifferenzierung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVertikaleDifferenzierung() {
        return vertikaleDifferenzierung;
    }

    /**
     * Legt den Wert der vertikaleDifferenzierung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVertikaleDifferenzierung(Boolean value) {
        this.vertikaleDifferenzierung = value;
    }

    /**
     * Ruft den Wert der bebauungsArt-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBebauungsArt() {
        return bebauungsArt;
    }

    /**
     * Legt den Wert der bebauungsArt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBebauungsArt(String value) {
        this.bebauungsArt = value;
    }

    /**
     * Ruft den Wert der bebauungVordereGrenze-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBebauungVordereGrenze() {
        return bebauungVordereGrenze;
    }

    /**
     * Legt den Wert der bebauungVordereGrenze-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBebauungVordereGrenze(String value) {
        this.bebauungVordereGrenze = value;
    }

    /**
     * Ruft den Wert der bebauungRueckwaertigeGrenze-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBebauungRueckwaertigeGrenze() {
        return bebauungRueckwaertigeGrenze;
    }

    /**
     * Legt den Wert der bebauungRueckwaertigeGrenze-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBebauungRueckwaertigeGrenze(String value) {
        this.bebauungRueckwaertigeGrenze = value;
    }

    /**
     * Ruft den Wert der bebauungSeitlicheGrenze-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBebauungSeitlicheGrenze() {
        return bebauungSeitlicheGrenze;
    }

    /**
     * Legt den Wert der bebauungSeitlicheGrenze-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBebauungSeitlicheGrenze(String value) {
        this.bebauungSeitlicheGrenze = value;
    }

    /**
     * Gets the value of the refGebaeudequerschnitt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refGebaeudequerschnitt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefGebaeudequerschnitt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XPExterneReferenzPropertyType }
     * 
     * 
     */
    public List<XPExterneReferenzPropertyType> getRefGebaeudequerschnitt() {
        if (refGebaeudequerschnitt == null) {
            refGebaeudequerschnitt = new ArrayList<XPExterneReferenzPropertyType>();
        }
        return this.refGebaeudequerschnitt;
    }

    /**
     * Gets the value of the baugrenze property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the baugrenze property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBaugrenze().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenceType }
     * 
     * 
     */
    public List<ReferenceType> getBaugrenze() {
        if (baugrenze == null) {
            baugrenze = new ArrayList<ReferenceType>();
        }
        return this.baugrenze;
    }

    /**
     * Gets the value of the baulinie property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the baulinie property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBaulinie().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenceType }
     * 
     * 
     */
    public List<ReferenceType> getBaulinie() {
        if (baulinie == null) {
            baulinie = new ArrayList<ReferenceType>();
        }
        return this.baulinie;
    }

    /**
     * Ruft den Wert der geschossMin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGeschossMin() {
        return geschossMin;
    }

    /**
     * Legt den Wert der geschossMin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGeschossMin(Integer value) {
        this.geschossMin = value;
    }

    /**
     * Ruft den Wert der geschossMax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGeschossMax() {
        return geschossMax;
    }

    /**
     * Legt den Wert der geschossMax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGeschossMax(Integer value) {
        this.geschossMax = value;
    }

    /**
     * Gets the value of the genericApplicationPropertyOfBPUeberbaubareGrundstuecksFlaeche property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfBPUeberbaubareGrundstuecksFlaeche property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfBPUeberbaubareGrundstuecksFlaeche().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfBPUeberbaubareGrundstuecksFlaeche() {
        if (genericApplicationPropertyOfBPUeberbaubareGrundstuecksFlaeche == null) {
            genericApplicationPropertyOfBPUeberbaubareGrundstuecksFlaeche = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfBPUeberbaubareGrundstuecksFlaeche;
    }

}
