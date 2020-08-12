//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.06.04 um 03:33:59 PM CEST 
//


package de.xplanung.xplangml._4._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml._3.CodeType;


/**
 * Flächen für Versorgungsanlagen, für die Abfallentsorgung und Abwasserbeseitigung sowie für Ablagerungen (§5, Abs. 2, Nr. 4 BauGB).
 * 
 * 
 * <p>Java-Klasse für FP_VerEntsorgungType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FP_VerEntsorgungType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/4/1}FP_GeometrieobjektType">
 *       &lt;sequence>
 *         &lt;element name="zweckbestimmung" type="{http://www.xplanung.de/xplangml/4/1}XP_ZweckbestimmungVerEntsorgung" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="weitereZweckbestimmung1" type="{http://www.xplanung.de/xplangml/4/1}XP_ZweckbestimmungVerEntsorgung" minOccurs="0"/>
 *         &lt;element name="weitereZweckbestimmung2" type="{http://www.xplanung.de/xplangml/4/1}XP_ZweckbestimmungVerEntsorgung" minOccurs="0"/>
 *         &lt;element name="weitereZweckbestimmung3" type="{http://www.xplanung.de/xplangml/4/1}XP_ZweckbestimmungVerEntsorgung" minOccurs="0"/>
 *         &lt;element name="besondereZweckbestimmung" type="{http://www.xplanung.de/xplangml/4/1}XP_BesondereZweckbestimmungVerEntsorgung" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="weitereBesondZweckbestimmung1" type="{http://www.xplanung.de/xplangml/4/1}XP_BesondereZweckbestimmungVerEntsorgung" minOccurs="0"/>
 *         &lt;element name="weitereBesondZweckbestimmung2" type="{http://www.xplanung.de/xplangml/4/1}XP_BesondereZweckbestimmungVerEntsorgung" minOccurs="0"/>
 *         &lt;element name="weitereBesondZweckbestimmung3" type="{http://www.xplanung.de/xplangml/4/1}XP_BesondereZweckbestimmungVerEntsorgung" minOccurs="0"/>
 *         &lt;element name="detaillierteZweckbestimmung" type="{http://www.opengis.net/gml/3.2}CodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="weitereDetailZweckbestimmung1" type="{http://www.opengis.net/gml/3.2}CodeType" minOccurs="0"/>
 *         &lt;element name="weitereDetailZweckbestimmung2" type="{http://www.opengis.net/gml/3.2}CodeType" minOccurs="0"/>
 *         &lt;element name="weitereDetailZweckbestimmung3" type="{http://www.opengis.net/gml/3.2}CodeType" minOccurs="0"/>
 *         &lt;element name="textlicheErgaenzung" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/4/1}_GenericApplicationPropertyOfFP_VerEntsorgung" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FP_VerEntsorgungType", propOrder = {
    "zweckbestimmung",
    "weitereZweckbestimmung1",
    "weitereZweckbestimmung2",
    "weitereZweckbestimmung3",
    "besondereZweckbestimmung",
    "weitereBesondZweckbestimmung1",
    "weitereBesondZweckbestimmung2",
    "weitereBesondZweckbestimmung3",
    "detaillierteZweckbestimmung",
    "weitereDetailZweckbestimmung1",
    "weitereDetailZweckbestimmung2",
    "weitereDetailZweckbestimmung3",
    "textlicheErgaenzung",
    "genericApplicationPropertyOfFPVerEntsorgung"
})
public class FPVerEntsorgungType
    extends FPGeometrieobjektType
{

    protected List<String> zweckbestimmung;
    protected String weitereZweckbestimmung1;
    protected String weitereZweckbestimmung2;
    protected String weitereZweckbestimmung3;
    protected List<String> besondereZweckbestimmung;
    protected String weitereBesondZweckbestimmung1;
    protected String weitereBesondZweckbestimmung2;
    protected String weitereBesondZweckbestimmung3;
    protected List<CodeType> detaillierteZweckbestimmung;
    protected CodeType weitereDetailZweckbestimmung1;
    protected CodeType weitereDetailZweckbestimmung2;
    protected CodeType weitereDetailZweckbestimmung3;
    protected String textlicheErgaenzung;
    @XmlElement(name = "_GenericApplicationPropertyOfFP_VerEntsorgung")
    protected List<Object> genericApplicationPropertyOfFPVerEntsorgung;

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
     * Gets the value of the besondereZweckbestimmung property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the besondereZweckbestimmung property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBesondereZweckbestimmung().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBesondereZweckbestimmung() {
        if (besondereZweckbestimmung == null) {
            besondereZweckbestimmung = new ArrayList<String>();
        }
        return this.besondereZweckbestimmung;
    }

    /**
     * Ruft den Wert der weitereBesondZweckbestimmung1-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeitereBesondZweckbestimmung1() {
        return weitereBesondZweckbestimmung1;
    }

    /**
     * Legt den Wert der weitereBesondZweckbestimmung1-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeitereBesondZweckbestimmung1(String value) {
        this.weitereBesondZweckbestimmung1 = value;
    }

    /**
     * Ruft den Wert der weitereBesondZweckbestimmung2-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeitereBesondZweckbestimmung2() {
        return weitereBesondZweckbestimmung2;
    }

    /**
     * Legt den Wert der weitereBesondZweckbestimmung2-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeitereBesondZweckbestimmung2(String value) {
        this.weitereBesondZweckbestimmung2 = value;
    }

    /**
     * Ruft den Wert der weitereBesondZweckbestimmung3-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeitereBesondZweckbestimmung3() {
        return weitereBesondZweckbestimmung3;
    }

    /**
     * Legt den Wert der weitereBesondZweckbestimmung3-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeitereBesondZweckbestimmung3(String value) {
        this.weitereBesondZweckbestimmung3 = value;
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
     * Ruft den Wert der textlicheErgaenzung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextlicheErgaenzung() {
        return textlicheErgaenzung;
    }

    /**
     * Legt den Wert der textlicheErgaenzung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextlicheErgaenzung(String value) {
        this.textlicheErgaenzung = value;
    }

    /**
     * Gets the value of the genericApplicationPropertyOfFPVerEntsorgung property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfFPVerEntsorgung property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfFPVerEntsorgung().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfFPVerEntsorgung() {
        if (genericApplicationPropertyOfFPVerEntsorgung == null) {
            genericApplicationPropertyOfFPVerEntsorgung = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfFPVerEntsorgung;
    }

}
