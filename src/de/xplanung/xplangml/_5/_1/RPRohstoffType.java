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
import javax.xml.bind.annotation.XmlType;


/**
 * Rohstoff, inklusive Rohstoffprospektion, Rohstoffsicherung, Rohstoffabbau, Bergbau und Bergbaufolgelandschaft.
 * 
 * <p>Java-Klasse für RP_RohstoffType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RP_RohstoffType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/5/1}RP_FreiraumType">
 *       &lt;sequence>
 *         &lt;element name="rohstoffTyp" type="{http://www.xplanung.de/xplangml/5/1}RP_RohstoffTypen" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="detaillierterRohstoffTyp" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="folgenutzung" type="{http://www.xplanung.de/xplangml/5/1}RP_BergbauFolgenutzung" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="folgenutzungText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="zeitstufe" type="{http://www.xplanung.de/xplangml/5/1}RP_Zeitstufen" minOccurs="0"/>
 *         &lt;element name="zeitstufeText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tiefe" type="{http://www.xplanung.de/xplangml/5/1}RP_BodenschatzTiefen" minOccurs="0"/>
 *         &lt;element name="bergbauplanungTyp" type="{http://www.xplanung.de/xplangml/5/1}RP_BergbauplanungTypen" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="istAufschuettungAblagerung" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/5/1}_GenericApplicationPropertyOfRP_Rohstoff" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RP_RohstoffType", propOrder = {
    "rohstoffTyp",
    "detaillierterRohstoffTyp",
    "folgenutzung",
    "folgenutzungText",
    "zeitstufe",
    "zeitstufeText",
    "tiefe",
    "bergbauplanungTyp",
    "istAufschuettungAblagerung",
    "genericApplicationPropertyOfRPRohstoff"
})
public class RPRohstoffType
    extends RPFreiraumType
{

    protected List<String> rohstoffTyp;
    protected List<String> detaillierterRohstoffTyp;
    protected List<String> folgenutzung;
    protected String folgenutzungText;
    protected String zeitstufe;
    protected String zeitstufeText;
    protected String tiefe;
    protected List<String> bergbauplanungTyp;
    @XmlElement(defaultValue = "false")
    protected Boolean istAufschuettungAblagerung;
    @XmlElement(name = "_GenericApplicationPropertyOfRP_Rohstoff")
    protected List<Object> genericApplicationPropertyOfRPRohstoff;

    /**
     * Gets the value of the rohstoffTyp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rohstoffTyp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRohstoffTyp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRohstoffTyp() {
        if (rohstoffTyp == null) {
            rohstoffTyp = new ArrayList<String>();
        }
        return this.rohstoffTyp;
    }

    /**
     * Gets the value of the detaillierterRohstoffTyp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the detaillierterRohstoffTyp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetaillierterRohstoffTyp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDetaillierterRohstoffTyp() {
        if (detaillierterRohstoffTyp == null) {
            detaillierterRohstoffTyp = new ArrayList<String>();
        }
        return this.detaillierterRohstoffTyp;
    }

    /**
     * Gets the value of the folgenutzung property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the folgenutzung property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFolgenutzung().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFolgenutzung() {
        if (folgenutzung == null) {
            folgenutzung = new ArrayList<String>();
        }
        return this.folgenutzung;
    }

    /**
     * Ruft den Wert der folgenutzungText-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFolgenutzungText() {
        return folgenutzungText;
    }

    /**
     * Legt den Wert der folgenutzungText-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFolgenutzungText(String value) {
        this.folgenutzungText = value;
    }

    /**
     * Ruft den Wert der zeitstufe-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZeitstufe() {
        return zeitstufe;
    }

    /**
     * Legt den Wert der zeitstufe-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZeitstufe(String value) {
        this.zeitstufe = value;
    }

    /**
     * Ruft den Wert der zeitstufeText-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZeitstufeText() {
        return zeitstufeText;
    }

    /**
     * Legt den Wert der zeitstufeText-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZeitstufeText(String value) {
        this.zeitstufeText = value;
    }

    /**
     * Ruft den Wert der tiefe-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTiefe() {
        return tiefe;
    }

    /**
     * Legt den Wert der tiefe-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTiefe(String value) {
        this.tiefe = value;
    }

    /**
     * Gets the value of the bergbauplanungTyp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bergbauplanungTyp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBergbauplanungTyp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBergbauplanungTyp() {
        if (bergbauplanungTyp == null) {
            bergbauplanungTyp = new ArrayList<String>();
        }
        return this.bergbauplanungTyp;
    }

    /**
     * Ruft den Wert der istAufschuettungAblagerung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIstAufschuettungAblagerung() {
        return istAufschuettungAblagerung;
    }

    /**
     * Legt den Wert der istAufschuettungAblagerung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIstAufschuettungAblagerung(Boolean value) {
        this.istAufschuettungAblagerung = value;
    }

    /**
     * Gets the value of the genericApplicationPropertyOfRPRohstoff property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfRPRohstoff property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfRPRohstoff().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfRPRohstoff() {
        if (genericApplicationPropertyOfRPRohstoff == null) {
            genericApplicationPropertyOfRPRohstoff = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfRPRohstoff;
    }

}
