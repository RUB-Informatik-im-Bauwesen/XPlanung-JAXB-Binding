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
import net.opengis.gml._3.CodeType;
import net.opengis.gml._3.ReferenceType;


/**
 * Fläche für Gemeinschaftsanlagen für bestimmte räumliche Bereiche wie    Kinderspielplätze, Freizeiteinrichtungen, Stellplätze und Garagen (§9 Abs. 22 BauGB)
 * 
 * 
 * <p>Java-Klasse für BP_GemeinschaftsanlagenFlaecheType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="BP_GemeinschaftsanlagenFlaecheType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/4/1}BP_UeberlagerungsobjektType">
 *       &lt;sequence>
 *         &lt;element name="zweckbestimmung" type="{http://www.xplanung.de/xplangml/4/1}BP_ZweckbestimmungGemeinschaftsanlagen" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="weitereZweckbestimmung1" type="{http://www.xplanung.de/xplangml/4/1}BP_ZweckbestimmungGemeinschaftsanlagen" minOccurs="0"/>
 *         &lt;element name="weitereZweckbestimmung2" type="{http://www.xplanung.de/xplangml/4/1}BP_ZweckbestimmungGemeinschaftsanlagen" minOccurs="0"/>
 *         &lt;element name="weitereZweckbestimmung3" type="{http://www.xplanung.de/xplangml/4/1}BP_ZweckbestimmungGemeinschaftsanlagen" minOccurs="0"/>
 *         &lt;element name="weitereZweckbestimmung4" type="{http://www.xplanung.de/xplangml/4/1}BP_ZweckbestimmungGemeinschaftsanlagen" minOccurs="0"/>
 *         &lt;element name="detaillierteZweckbestimmung" type="{http://www.opengis.net/gml/3.2}CodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="weitereDetailZweckbestimmung1" type="{http://www.opengis.net/gml/3.2}CodeType" minOccurs="0"/>
 *         &lt;element name="weitereDetailZweckbestimmung2" type="{http://www.opengis.net/gml/3.2}CodeType" minOccurs="0"/>
 *         &lt;element name="weitereDetailZweckbestimmung3" type="{http://www.opengis.net/gml/3.2}CodeType" minOccurs="0"/>
 *         &lt;element name="weitereDetailZweckbestimmung4" type="{http://www.opengis.net/gml/3.2}CodeType" minOccurs="0"/>
 *         &lt;element name="Zmax" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="eigentuemer" type="{http://www.opengis.net/gml/3.2}ReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/4/1}_GenericApplicationPropertyOfBP_GemeinschaftsanlagenFlaeche" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BP_GemeinschaftsanlagenFlaecheType", propOrder = {
    "zweckbestimmung",
    "weitereZweckbestimmung1",
    "weitereZweckbestimmung2",
    "weitereZweckbestimmung3",
    "weitereZweckbestimmung4",
    "detaillierteZweckbestimmung",
    "weitereDetailZweckbestimmung1",
    "weitereDetailZweckbestimmung2",
    "weitereDetailZweckbestimmung3",
    "weitereDetailZweckbestimmung4",
    "zmax",
    "eigentuemer",
    "genericApplicationPropertyOfBPGemeinschaftsanlagenFlaeche"
})
public class BPGemeinschaftsanlagenFlaecheType
    extends BPUeberlagerungsobjektType
{

    protected List<String> zweckbestimmung;
    protected String weitereZweckbestimmung1;
    protected String weitereZweckbestimmung2;
    protected String weitereZweckbestimmung3;
    protected String weitereZweckbestimmung4;
    protected List<CodeType> detaillierteZweckbestimmung;
    protected CodeType weitereDetailZweckbestimmung1;
    protected CodeType weitereDetailZweckbestimmung2;
    protected CodeType weitereDetailZweckbestimmung3;
    protected CodeType weitereDetailZweckbestimmung4;
    @XmlElement(name = "Zmax")
    protected BigInteger zmax;
    protected List<ReferenceType> eigentuemer;
    @XmlElement(name = "_GenericApplicationPropertyOfBP_GemeinschaftsanlagenFlaeche")
    protected List<Object> genericApplicationPropertyOfBPGemeinschaftsanlagenFlaeche;

    /**
     * Gets the value of the zweckbestimmung property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zweckbestimmung property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZweckbestimmung().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getZweckbestimmung() {
        if (zweckbestimmung == null) {
            zweckbestimmung = new ArrayList<String>();
        }
        return this.zweckbestimmung;
    }

    /**
     * Ruft den Wert der weitereZweckbestimmung1-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeitereZweckbestimmung1() {
        return weitereZweckbestimmung1;
    }

    /**
     * Legt den Wert der weitereZweckbestimmung1-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeitereZweckbestimmung1(String value) {
        this.weitereZweckbestimmung1 = value;
    }

    /**
     * Ruft den Wert der weitereZweckbestimmung2-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeitereZweckbestimmung2() {
        return weitereZweckbestimmung2;
    }

    /**
     * Legt den Wert der weitereZweckbestimmung2-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeitereZweckbestimmung2(String value) {
        this.weitereZweckbestimmung2 = value;
    }

    /**
     * Ruft den Wert der weitereZweckbestimmung3-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeitereZweckbestimmung3() {
        return weitereZweckbestimmung3;
    }

    /**
     * Legt den Wert der weitereZweckbestimmung3-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeitereZweckbestimmung3(String value) {
        this.weitereZweckbestimmung3 = value;
    }

    /**
     * Ruft den Wert der weitereZweckbestimmung4-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeitereZweckbestimmung4() {
        return weitereZweckbestimmung4;
    }

    /**
     * Legt den Wert der weitereZweckbestimmung4-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeitereZweckbestimmung4(String value) {
        this.weitereZweckbestimmung4 = value;
    }

    /**
     * Gets the value of the detaillierteZweckbestimmung property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the detaillierteZweckbestimmung property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetaillierteZweckbestimmung().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeType }
     * 
     * 
     */
    public List<CodeType> getDetaillierteZweckbestimmung() {
        if (detaillierteZweckbestimmung == null) {
            detaillierteZweckbestimmung = new ArrayList<CodeType>();
        }
        return this.detaillierteZweckbestimmung;
    }

    /**
     * Ruft den Wert der weitereDetailZweckbestimmung1-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getWeitereDetailZweckbestimmung1() {
        return weitereDetailZweckbestimmung1;
    }

    /**
     * Legt den Wert der weitereDetailZweckbestimmung1-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setWeitereDetailZweckbestimmung1(CodeType value) {
        this.weitereDetailZweckbestimmung1 = value;
    }

    /**
     * Ruft den Wert der weitereDetailZweckbestimmung2-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getWeitereDetailZweckbestimmung2() {
        return weitereDetailZweckbestimmung2;
    }

    /**
     * Legt den Wert der weitereDetailZweckbestimmung2-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setWeitereDetailZweckbestimmung2(CodeType value) {
        this.weitereDetailZweckbestimmung2 = value;
    }

    /**
     * Ruft den Wert der weitereDetailZweckbestimmung3-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getWeitereDetailZweckbestimmung3() {
        return weitereDetailZweckbestimmung3;
    }

    /**
     * Legt den Wert der weitereDetailZweckbestimmung3-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setWeitereDetailZweckbestimmung3(CodeType value) {
        this.weitereDetailZweckbestimmung3 = value;
    }

    /**
     * Ruft den Wert der weitereDetailZweckbestimmung4-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getWeitereDetailZweckbestimmung4() {
        return weitereDetailZweckbestimmung4;
    }

    /**
     * Legt den Wert der weitereDetailZweckbestimmung4-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setWeitereDetailZweckbestimmung4(CodeType value) {
        this.weitereDetailZweckbestimmung4 = value;
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
     * Gets the value of the eigentuemer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eigentuemer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEigentuemer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenceType }
     * 
     * 
     */
    public List<ReferenceType> getEigentuemer() {
        if (eigentuemer == null) {
            eigentuemer = new ArrayList<ReferenceType>();
        }
        return this.eigentuemer;
    }

    /**
     * Gets the value of the genericApplicationPropertyOfBPGemeinschaftsanlagenFlaeche property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfBPGemeinschaftsanlagenFlaeche property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfBPGemeinschaftsanlagenFlaeche().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfBPGemeinschaftsanlagenFlaeche() {
        if (genericApplicationPropertyOfBPGemeinschaftsanlagenFlaeche == null) {
            genericApplicationPropertyOfBPGemeinschaftsanlagenFlaeche = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfBPGemeinschaftsanlagenFlaeche;
    }

}
