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


/**
 * Standorte für privilegierte Außenbereichsvorhaben und für sonstige Anlagen in Außenbereichen gem. § 35 Abs. 1 und 2 BauGB.
 * 
 * 
 * <p>Java-Klasse für FP_PrivilegiertesVorhabenType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FP_PrivilegiertesVorhabenType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/4/1}FP_GeometrieobjektType">
 *       &lt;sequence>
 *         &lt;element name="zweckbestimmung" type="{http://www.xplanung.de/xplangml/4/1}FP_ZweckbestimmungPrivilegiertesVorhaben" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="weitereZweckbestimmung1" type="{http://www.xplanung.de/xplangml/4/1}FP_ZweckbestimmungPrivilegiertesVorhaben" minOccurs="0"/>
 *         &lt;element name="weitereZweckbestimmung2" type="{http://www.xplanung.de/xplangml/4/1}FP_ZweckbestimmungPrivilegiertesVorhaben" minOccurs="0"/>
 *         &lt;element name="besondereZweckbestimmung" type="{http://www.xplanung.de/xplangml/4/1}FP_BesondZweckbestPrivilegiertesVorhaben" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="weitereBesondZweckbestimmung1" type="{http://www.xplanung.de/xplangml/4/1}FP_BesondZweckbestPrivilegiertesVorhaben" minOccurs="0"/>
 *         &lt;element name="weitereBesondZweckbestimmung2" type="{http://www.xplanung.de/xplangml/4/1}FP_BesondZweckbestPrivilegiertesVorhaben" minOccurs="0"/>
 *         &lt;element name="vorhaben" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/4/1}_GenericApplicationPropertyOfFP_PrivilegiertesVorhaben" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FP_PrivilegiertesVorhabenType", propOrder = {
    "zweckbestimmung",
    "weitereZweckbestimmung1",
    "weitereZweckbestimmung2",
    "besondereZweckbestimmung",
    "weitereBesondZweckbestimmung1",
    "weitereBesondZweckbestimmung2",
    "vorhaben",
    "genericApplicationPropertyOfFPPrivilegiertesVorhaben"
})
public class FPPrivilegiertesVorhabenType
    extends FPGeometrieobjektType
{

    protected List<String> zweckbestimmung;
    protected String weitereZweckbestimmung1;
    protected String weitereZweckbestimmung2;
    protected List<String> besondereZweckbestimmung;
    protected String weitereBesondZweckbestimmung1;
    protected String weitereBesondZweckbestimmung2;
    protected String vorhaben;
    @XmlElement(name = "_GenericApplicationPropertyOfFP_PrivilegiertesVorhaben")
    protected List<Object> genericApplicationPropertyOfFPPrivilegiertesVorhaben;

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
     * Ruft den Wert der vorhaben-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVorhaben() {
        return vorhaben;
    }

    /**
     * Legt den Wert der vorhaben-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVorhaben(String value) {
        this.vorhaben = value;
    }

    /**
     * Gets the value of the genericApplicationPropertyOfFPPrivilegiertesVorhaben property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfFPPrivilegiertesVorhaben property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfFPPrivilegiertesVorhaben().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfFPPrivilegiertesVorhaben() {
        if (genericApplicationPropertyOfFPPrivilegiertesVorhaben == null) {
            genericApplicationPropertyOfFPPrivilegiertesVorhaben = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfFPPrivilegiertesVorhaben;
    }

}
