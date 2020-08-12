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
 * Festsetzung von Waldflächen  (§9, Abs. 1, Nr. 18b BauGB).
 * 
 * 
 * <p>Java-Klasse für BP_WaldFlaecheType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="BP_WaldFlaecheType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/4/1}BP_FlaechenschlussobjektType">
 *       &lt;sequence>
 *         &lt;element name="zweckbestimmung" type="{http://www.xplanung.de/xplangml/4/1}XP_ZweckbestimmungWald" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="weitereZweckbestimmung1" type="{http://www.xplanung.de/xplangml/4/1}XP_ZweckbestimmungWald" minOccurs="0"/>
 *         &lt;element name="weitereZweckbestimmung2" type="{http://www.xplanung.de/xplangml/4/1}XP_ZweckbestimmungWald" minOccurs="0"/>
 *         &lt;element name="detaillierteZweckbestimmung" type="{http://www.opengis.net/gml/3.2}CodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="weitereDetailZweckbestimmung1" type="{http://www.opengis.net/gml/3.2}CodeType" minOccurs="0"/>
 *         &lt;element name="weitereDetailZweckbestimmung2" type="{http://www.opengis.net/gml/3.2}CodeType" minOccurs="0"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/4/1}_GenericApplicationPropertyOfBP_WaldFlaeche" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BP_WaldFlaecheType", propOrder = {
    "zweckbestimmung",
    "weitereZweckbestimmung1",
    "weitereZweckbestimmung2",
    "detaillierteZweckbestimmung",
    "weitereDetailZweckbestimmung1",
    "weitereDetailZweckbestimmung2",
    "genericApplicationPropertyOfBPWaldFlaeche"
})
public class BPWaldFlaecheType
    extends BPFlaechenschlussobjektType
{

    protected List<String> zweckbestimmung;
    protected String weitereZweckbestimmung1;
    protected String weitereZweckbestimmung2;
    protected List<CodeType> detaillierteZweckbestimmung;
    protected CodeType weitereDetailZweckbestimmung1;
    protected CodeType weitereDetailZweckbestimmung2;
    @XmlElement(name = "_GenericApplicationPropertyOfBP_WaldFlaeche")
    protected List<Object> genericApplicationPropertyOfBPWaldFlaeche;

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
     * Gets the value of the genericApplicationPropertyOfBPWaldFlaeche property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfBPWaldFlaeche property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfBPWaldFlaeche().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfBPWaldFlaeche() {
        if (genericApplicationPropertyOfBPWaldFlaeche == null) {
            genericApplicationPropertyOfBPWaldFlaeche = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfBPWaldFlaeche;
    }

}
