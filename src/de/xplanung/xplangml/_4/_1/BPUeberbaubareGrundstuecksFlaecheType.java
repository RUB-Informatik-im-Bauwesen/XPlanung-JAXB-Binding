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
import net.opengis.gml._3.AreaType;
import net.opengis.gml._3.LengthType;
import net.opengis.gml._3.ReferenceType;
import net.opengis.gml._3.VolumeType;


/**
 * Festsetzung der überbaubaren Grundstücksfläche (§9, Abs. 1, Nr. 2 BauGB). Über die Attribute <i>geschossMin </i>und <i>geschossMax </i>kann die Festsetzung auf einen Bereich von Geschossen beschränkt werden. Wenn eine Einschränkung der Festsetzung durch expliziter Höhenangaben erfolgen soll, ist dazu die Oberklassen-Relation <i>hoehenangabe </i>auf den komplexen Datentyp <i>XP_Hoehenangabe </i>zu verwenden. 
 * 
 * 
 * <p>Java-Klasse für BP_UeberbaubareGrundstuecksFlaecheType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="BP_UeberbaubareGrundstuecksFlaecheType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/4/1}BP_UeberlagerungsobjektType">
 *       &lt;sequence>
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
 *         &lt;element name="geschossMin" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="geschossMax" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="baugrenze" type="{http://www.opengis.net/gml/3.2}ReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="baulinie" type="{http://www.opengis.net/gml/3.2}ReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/4/1}_GenericApplicationPropertyOfBP_UeberbaubareGrundstuecksFlaeche" maxOccurs="unbounded" minOccurs="0"/>
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
    "geschossMin",
    "geschossMax",
    "baugrenze",
    "baulinie",
    "genericApplicationPropertyOfBPUeberbaubareGrundstuecksFlaeche"
})
public class BPUeberbaubareGrundstuecksFlaecheType
    extends BPUeberlagerungsobjektType
{

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
    protected BigInteger geschossMin;
    protected BigInteger geschossMax;
    protected List<ReferenceType> baugrenze;
    protected List<ReferenceType> baulinie;
    @XmlElement(name = "_GenericApplicationPropertyOfBP_UeberbaubareGrundstuecksFlaeche")
    protected List<Object> genericApplicationPropertyOfBPUeberbaubareGrundstuecksFlaeche;

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
     * Ruft den Wert der geschossMin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGeschossMin() {
        return geschossMin;
    }

    /**
     * Legt den Wert der geschossMin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGeschossMin(BigInteger value) {
        this.geschossMin = value;
    }

    /**
     * Ruft den Wert der geschossMax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGeschossMax() {
        return geschossMax;
    }

    /**
     * Legt den Wert der geschossMax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGeschossMax(BigInteger value) {
        this.geschossMax = value;
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
