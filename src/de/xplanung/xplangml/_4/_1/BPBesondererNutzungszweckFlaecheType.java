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
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml._3.AngleType;
import net.opengis.gml._3.AreaType;
import net.opengis.gml._3.CodeType;
import net.opengis.gml._3.LengthType;
import net.opengis.gml._3.VolumeType;


/**
 * Festsetzung einer Fläche mit besonderem Nutzungszweck, der durch besondere städtebauliche Gründe erfordert wird (§9 Abs. 1 Nr. 9 BauGB.)
 * 
 * 
 * <p>Java-Klasse für BP_BesondererNutzungszweckFlaecheType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="BP_BesondererNutzungszweckFlaecheType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/4/1}BP_FlaechenobjektType">
 *       &lt;sequence>
 *         &lt;element name="DNmin" type="{http://www.opengis.net/gml/3.2}AngleType" minOccurs="0"/>
 *         &lt;element name="DNmax" type="{http://www.opengis.net/gml/3.2}AngleType" minOccurs="0"/>
 *         &lt;element name="DN" type="{http://www.opengis.net/gml/3.2}AngleType" minOccurs="0"/>
 *         &lt;element name="DNZwingend" type="{http://www.opengis.net/gml/3.2}AngleType" minOccurs="0"/>
 *         &lt;element name="FR" type="{http://www.opengis.net/gml/3.2}AngleType" minOccurs="0"/>
 *         &lt;element name="dachform" type="{http://www.xplanung.de/xplangml/4/1}BP_Dachform" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="detaillierteDachform" type="{http://www.opengis.net/gml/3.2}CodeType" minOccurs="0"/>
 *         &lt;element name="MaxZahlWohnungen" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
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
 *         &lt;element name="BMZmin" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="BMZmax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="BMZ" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="BMZ_Ausn" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="BMmin" type="{http://www.opengis.net/gml/3.2}VolumeType" minOccurs="0"/>
 *         &lt;element name="BMmax" type="{http://www.opengis.net/gml/3.2}VolumeType" minOccurs="0"/>
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
 *         &lt;element name="Zmin" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="Zmax" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="Zzwingend" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="Z" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="Z_Ausn" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="Z_Staffel" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="Z_Dach" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="ZUmin" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="ZUmax" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="ZUzwingend" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="ZU" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="ZU_Ausn" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="zweckbestimmung" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/4/1}_GenericApplicationPropertyOfBP_BesondererNutzungszweckFlaeche" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BP_BesondererNutzungszweckFlaecheType", propOrder = {
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
    "bmZmin",
    "bmZmax",
    "bmz",
    "bmzAusn",
    "bMmin",
    "bMmax",
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
    "zweckbestimmung",
    "genericApplicationPropertyOfBPBesondererNutzungszweckFlaeche"
})
public class BPBesondererNutzungszweckFlaecheType
    extends BPFlaechenobjektType
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
    protected CodeType detaillierteDachform;
    @XmlElement(name = "MaxZahlWohnungen")
    protected BigInteger maxZahlWohnungen;
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
    @XmlElement(name = "BMZmin")
    protected Double bmZmin;
    @XmlElement(name = "BMZmax")
    protected Double bmZmax;
    @XmlElement(name = "BMZ")
    protected Double bmz;
    @XmlElement(name = "BMZ_Ausn")
    protected Double bmzAusn;
    @XmlElement(name = "BMmin")
    protected VolumeType bMmin;
    @XmlElement(name = "BMmax")
    protected VolumeType bMmax;
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
    protected BigInteger zmin;
    @XmlElement(name = "Zmax")
    protected BigInteger zmax;
    @XmlElement(name = "Zzwingend")
    protected BigInteger zzwingend;
    @XmlElement(name = "Z")
    protected BigInteger z;
    @XmlElement(name = "Z_Ausn")
    protected BigInteger zAusn;
    @XmlElement(name = "Z_Staffel")
    protected BigInteger zStaffel;
    @XmlElement(name = "Z_Dach")
    protected BigInteger zDach;
    @XmlElement(name = "ZUmin")
    protected BigInteger zUmin;
    @XmlElement(name = "ZUmax")
    protected BigInteger zUmax;
    @XmlElement(name = "ZUzwingend")
    protected BigInteger zUzwingend;
    @XmlElement(name = "ZU")
    protected BigInteger zu;
    @XmlElement(name = "ZU_Ausn")
    protected BigInteger zuAusn;
    protected String zweckbestimmung;
    @XmlElement(name = "_GenericApplicationPropertyOfBP_BesondererNutzungszweckFlaeche")
    protected List<Object> genericApplicationPropertyOfBPBesondererNutzungszweckFlaeche;

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
     * Ruft den Wert der detaillierteDachform-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getDetaillierteDachform() {
        return detaillierteDachform;
    }

    /**
     * Legt den Wert der detaillierteDachform-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setDetaillierteDachform(CodeType value) {
        this.detaillierteDachform = value;
    }

    /**
     * Ruft den Wert der maxZahlWohnungen-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxZahlWohnungen() {
        return maxZahlWohnungen;
    }

    /**
     * Legt den Wert der maxZahlWohnungen-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxZahlWohnungen(BigInteger value) {
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
     * Ruft den Wert der bmZmin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBMZmin() {
        return bmZmin;
    }

    /**
     * Legt den Wert der bmZmin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBMZmin(Double value) {
        this.bmZmin = value;
    }

    /**
     * Ruft den Wert der bmZmax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBMZmax() {
        return bmZmax;
    }

    /**
     * Legt den Wert der bmZmax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBMZmax(Double value) {
        this.bmZmax = value;
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
     * Ruft den Wert der bMmin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VolumeType }
     *     
     */
    public VolumeType getBMmin() {
        return bMmin;
    }

    /**
     * Legt den Wert der bMmin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeType }
     *     
     */
    public void setBMmin(VolumeType value) {
        this.bMmin = value;
    }

    /**
     * Ruft den Wert der bMmax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VolumeType }
     *     
     */
    public VolumeType getBMmax() {
        return bMmax;
    }

    /**
     * Legt den Wert der bMmax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeType }
     *     
     */
    public void setBMmax(VolumeType value) {
        this.bMmax = value;
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
     *     {@link BigInteger }
     *     
     */
    public BigInteger getZmin() {
        return zmin;
    }

    /**
     * Legt den Wert der zmin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setZmin(BigInteger value) {
        this.zmin = value;
    }

    /**
     * Ruft den Wert der zmax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getZmax() {
        return zmax;
    }

    /**
     * Legt den Wert der zmax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setZmax(BigInteger value) {
        this.zmax = value;
    }

    /**
     * Ruft den Wert der zzwingend-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getZzwingend() {
        return zzwingend;
    }

    /**
     * Legt den Wert der zzwingend-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setZzwingend(BigInteger value) {
        this.zzwingend = value;
    }

    /**
     * Ruft den Wert der z-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getZ() {
        return z;
    }

    /**
     * Legt den Wert der z-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setZ(BigInteger value) {
        this.z = value;
    }

    /**
     * Ruft den Wert der zAusn-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getZAusn() {
        return zAusn;
    }

    /**
     * Legt den Wert der zAusn-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setZAusn(BigInteger value) {
        this.zAusn = value;
    }

    /**
     * Ruft den Wert der zStaffel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getZStaffel() {
        return zStaffel;
    }

    /**
     * Legt den Wert der zStaffel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setZStaffel(BigInteger value) {
        this.zStaffel = value;
    }

    /**
     * Ruft den Wert der zDach-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getZDach() {
        return zDach;
    }

    /**
     * Legt den Wert der zDach-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setZDach(BigInteger value) {
        this.zDach = value;
    }

    /**
     * Ruft den Wert der zUmin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getZUmin() {
        return zUmin;
    }

    /**
     * Legt den Wert der zUmin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setZUmin(BigInteger value) {
        this.zUmin = value;
    }

    /**
     * Ruft den Wert der zUmax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getZUmax() {
        return zUmax;
    }

    /**
     * Legt den Wert der zUmax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setZUmax(BigInteger value) {
        this.zUmax = value;
    }

    /**
     * Ruft den Wert der zUzwingend-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getZUzwingend() {
        return zUzwingend;
    }

    /**
     * Legt den Wert der zUzwingend-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setZUzwingend(BigInteger value) {
        this.zUzwingend = value;
    }

    /**
     * Ruft den Wert der zu-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getZU() {
        return zu;
    }

    /**
     * Legt den Wert der zu-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setZU(BigInteger value) {
        this.zu = value;
    }

    /**
     * Ruft den Wert der zuAusn-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getZUAusn() {
        return zuAusn;
    }

    /**
     * Legt den Wert der zuAusn-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setZUAusn(BigInteger value) {
        this.zuAusn = value;
    }

    /**
     * Ruft den Wert der zweckbestimmung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZweckbestimmung() {
        return zweckbestimmung;
    }

    /**
     * Legt den Wert der zweckbestimmung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZweckbestimmung(String value) {
        this.zweckbestimmung = value;
    }

    /**
     * Gets the value of the genericApplicationPropertyOfBPBesondererNutzungszweckFlaeche property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfBPBesondererNutzungszweckFlaeche property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfBPBesondererNutzungszweckFlaeche().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfBPBesondererNutzungszweckFlaeche() {
        if (genericApplicationPropertyOfBPBesondererNutzungszweckFlaeche == null) {
            genericApplicationPropertyOfBPBesondererNutzungszweckFlaeche = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfBPBesondererNutzungszweckFlaeche;
    }

}
