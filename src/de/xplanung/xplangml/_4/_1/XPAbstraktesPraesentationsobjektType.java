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
 * Abstrakte Basisklasse für alle Präsentationsobjekte. Die Attribute entsprechen dem ALKIS-Objekt AP_GPO, wobei das Attribut "signaturnummer" in stylesheetId umbenannt wurde. Bei freien Präsentationsobjekten ist die Relation "dientZurDarstellungVon" unbelegt, bei gebundenen Präsentationsobjekten zeigt die Relation auf ein von XP_Objekt abgeleitetes Fachobjekt.
 * Freie Präsentationsobjekte dürfen ausschließlich zur graphischen Annotation eines Plans verwendet werden
 * Gebundene Präsentationsobjekte mit Raumbezug dienen ausschließlich dazu, Attributwerte des verbundenen Fachobjekts im Plan darzustellen. Die Namen der darzustellenden Fachobjekt-Attribute werden über das Attribut "art" spezifiziert.
 * 
 * 
 * <p>Java-Klasse für XP_AbstraktesPraesentationsobjektType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="XP_AbstraktesPraesentationsobjektType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractFeatureType">
 *       &lt;sequence>
 *         &lt;element name="stylesheetId" type="{http://www.opengis.net/gml/3.2}CodeType" minOccurs="0"/>
 *         &lt;element name="darstellungsprioritaet" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="art" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="index" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="gehoertZuBereich" type="{http://www.opengis.net/gml/3.2}ReferenceType" minOccurs="0"/>
 *         &lt;element name="dientZurDarstellungVon" type="{http://www.opengis.net/gml/3.2}ReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/4/1}_GenericApplicationPropertyOfXP_AbstraktesPraesentationsobjekt" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XP_AbstraktesPraesentationsobjektType", propOrder = {
    "stylesheetId",
    "darstellungsprioritaet",
    "art",
    "index",
    "gehoertZuBereich",
    "dientZurDarstellungVon",
    "genericApplicationPropertyOfXPAbstraktesPraesentationsobjekt"
})
@XmlSeeAlso({
    XPPraesentationsobjektType.class,
    XPFPOType.class,
    XPPPOType.class,
    XPLPOType.class,
    XPTPOType.class
})
public abstract class XPAbstraktesPraesentationsobjektType
    extends AbstractFeatureType
{

    protected CodeType stylesheetId;
    protected BigInteger darstellungsprioritaet;
    protected List<String> art;
    protected List<BigInteger> index;
    protected ReferenceType gehoertZuBereich;
    protected List<ReferenceType> dientZurDarstellungVon;
    @XmlElement(name = "_GenericApplicationPropertyOfXP_AbstraktesPraesentationsobjekt")
    protected List<Object> genericApplicationPropertyOfXPAbstraktesPraesentationsobjekt;

    /**
     * Ruft den Wert der stylesheetId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getStylesheetId() {
        return stylesheetId;
    }

    /**
     * Legt den Wert der stylesheetId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setStylesheetId(CodeType value) {
        this.stylesheetId = value;
    }

    /**
     * Ruft den Wert der darstellungsprioritaet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDarstellungsprioritaet() {
        return darstellungsprioritaet;
    }

    /**
     * Legt den Wert der darstellungsprioritaet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDarstellungsprioritaet(BigInteger value) {
        this.darstellungsprioritaet = value;
    }

    /**
     * Gets the value of the art property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the art property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getArt() {
        if (art == null) {
            art = new ArrayList<String>();
        }
        return this.art;
    }

    /**
     * Gets the value of the index property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the index property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndex().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * 
     * 
     */
    public List<BigInteger> getIndex() {
        if (index == null) {
            index = new ArrayList<BigInteger>();
        }
        return this.index;
    }

    /**
     * Ruft den Wert der gehoertZuBereich-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getGehoertZuBereich() {
        return gehoertZuBereich;
    }

    /**
     * Legt den Wert der gehoertZuBereich-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setGehoertZuBereich(ReferenceType value) {
        this.gehoertZuBereich = value;
    }

    /**
     * Gets the value of the dientZurDarstellungVon property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dientZurDarstellungVon property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDientZurDarstellungVon().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenceType }
     * 
     * 
     */
    public List<ReferenceType> getDientZurDarstellungVon() {
        if (dientZurDarstellungVon == null) {
            dientZurDarstellungVon = new ArrayList<ReferenceType>();
        }
        return this.dientZurDarstellungVon;
    }

    /**
     * Gets the value of the genericApplicationPropertyOfXPAbstraktesPraesentationsobjekt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfXPAbstraktesPraesentationsobjekt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfXPAbstraktesPraesentationsobjekt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfXPAbstraktesPraesentationsobjekt() {
        if (genericApplicationPropertyOfXPAbstraktesPraesentationsobjekt == null) {
            genericApplicationPropertyOfXPAbstraktesPraesentationsobjekt = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfXPAbstraktesPraesentationsobjekt;
    }

}
