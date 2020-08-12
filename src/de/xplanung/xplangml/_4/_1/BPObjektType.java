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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml._3.ReferenceType;


/**
 * Basisklasse für alle raumbezogenen Festsetzungen, Hinweise, Vermerke und Kennzeichnungen eines Bebauungsplans.
 * 
 * <p>Java-Klasse für BP_ObjektType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="BP_ObjektType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/4/1}XP_ObjektType">
 *       &lt;sequence>
 *         &lt;element name="rechtscharakter" type="{http://www.xplanung.de/xplangml/4/1}BP_Rechtscharakter" minOccurs="0"/>
 *         &lt;element name="startBedingung" type="{http://www.xplanung.de/xplangml/4/1}BP_WirksamkeitBedingungPropertyType" minOccurs="0"/>
 *         &lt;element name="endeBedingung" type="{http://www.xplanung.de/xplangml/4/1}BP_WirksamkeitBedingungPropertyType" minOccurs="0"/>
 *         &lt;element name="wirdAusgeglichenDurchFlaeche" type="{http://www.opengis.net/gml/3.2}ReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="wirdAusgeglichenDurchABE" type="{http://www.opengis.net/gml/3.2}ReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="wirdAusgeglichenDurchSPEMassnahme" type="{http://www.opengis.net/gml/3.2}ReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="wirdAusgeglichenDurchSPEFlaeche" type="{http://www.opengis.net/gml/3.2}ReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="wirdAusgeglichenDurchMassnahme" type="{http://www.opengis.net/gml/3.2}ReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="gehoertZuBP_Bereich" type="{http://www.opengis.net/gml/3.2}ReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/4/1}_GenericApplicationPropertyOfBP_Objekt" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BP_ObjektType", propOrder = {
    "rechtscharakter",
    "startBedingung",
    "endeBedingung",
    "wirdAusgeglichenDurchFlaeche",
    "wirdAusgeglichenDurchABE",
    "wirdAusgeglichenDurchSPEMassnahme",
    "wirdAusgeglichenDurchSPEFlaeche",
    "wirdAusgeglichenDurchMassnahme",
    "gehoertZuBPBereich",
    "genericApplicationPropertyOfBPObjekt"
})
@XmlSeeAlso({
    BPPunktobjektType.class,
    BPBaugebietType.class,
    BPLinienobjektType.class,
    BPFlaechenobjektType.class,
    BPGeometrieobjektType.class
})
public abstract class BPObjektType
    extends XPObjektType
{

    protected String rechtscharakter;
    protected BPWirksamkeitBedingungPropertyType startBedingung;
    protected BPWirksamkeitBedingungPropertyType endeBedingung;
    protected List<ReferenceType> wirdAusgeglichenDurchFlaeche;
    protected List<ReferenceType> wirdAusgeglichenDurchABE;
    protected List<ReferenceType> wirdAusgeglichenDurchSPEMassnahme;
    protected List<ReferenceType> wirdAusgeglichenDurchSPEFlaeche;
    protected List<ReferenceType> wirdAusgeglichenDurchMassnahme;
    @XmlElement(name = "gehoertZuBP_Bereich")
    protected List<ReferenceType> gehoertZuBPBereich;
    @XmlElement(name = "_GenericApplicationPropertyOfBP_Objekt")
    protected List<Object> genericApplicationPropertyOfBPObjekt;

    /**
     * Ruft den Wert der rechtscharakter-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRechtscharakter() {
        return rechtscharakter;
    }

    /**
     * Legt den Wert der rechtscharakter-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRechtscharakter(String value) {
        this.rechtscharakter = value;
    }

    /**
     * Ruft den Wert der startBedingung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BPWirksamkeitBedingungPropertyType }
     *     
     */
    public BPWirksamkeitBedingungPropertyType getStartBedingung() {
        return startBedingung;
    }

    /**
     * Legt den Wert der startBedingung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BPWirksamkeitBedingungPropertyType }
     *     
     */
    public void setStartBedingung(BPWirksamkeitBedingungPropertyType value) {
        this.startBedingung = value;
    }

    /**
     * Ruft den Wert der endeBedingung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BPWirksamkeitBedingungPropertyType }
     *     
     */
    public BPWirksamkeitBedingungPropertyType getEndeBedingung() {
        return endeBedingung;
    }

    /**
     * Legt den Wert der endeBedingung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BPWirksamkeitBedingungPropertyType }
     *     
     */
    public void setEndeBedingung(BPWirksamkeitBedingungPropertyType value) {
        this.endeBedingung = value;
    }

    /**
     * Gets the value of the wirdAusgeglichenDurchFlaeche property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wirdAusgeglichenDurchFlaeche property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWirdAusgeglichenDurchFlaeche().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenceType }
     * 
     * 
     */
    public List<ReferenceType> getWirdAusgeglichenDurchFlaeche() {
        if (wirdAusgeglichenDurchFlaeche == null) {
            wirdAusgeglichenDurchFlaeche = new ArrayList<ReferenceType>();
        }
        return this.wirdAusgeglichenDurchFlaeche;
    }

    /**
     * Gets the value of the wirdAusgeglichenDurchABE property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wirdAusgeglichenDurchABE property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWirdAusgeglichenDurchABE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenceType }
     * 
     * 
     */
    public List<ReferenceType> getWirdAusgeglichenDurchABE() {
        if (wirdAusgeglichenDurchABE == null) {
            wirdAusgeglichenDurchABE = new ArrayList<ReferenceType>();
        }
        return this.wirdAusgeglichenDurchABE;
    }

    /**
     * Gets the value of the wirdAusgeglichenDurchSPEMassnahme property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wirdAusgeglichenDurchSPEMassnahme property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWirdAusgeglichenDurchSPEMassnahme().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenceType }
     * 
     * 
     */
    public List<ReferenceType> getWirdAusgeglichenDurchSPEMassnahme() {
        if (wirdAusgeglichenDurchSPEMassnahme == null) {
            wirdAusgeglichenDurchSPEMassnahme = new ArrayList<ReferenceType>();
        }
        return this.wirdAusgeglichenDurchSPEMassnahme;
    }

    /**
     * Gets the value of the wirdAusgeglichenDurchSPEFlaeche property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wirdAusgeglichenDurchSPEFlaeche property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWirdAusgeglichenDurchSPEFlaeche().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenceType }
     * 
     * 
     */
    public List<ReferenceType> getWirdAusgeglichenDurchSPEFlaeche() {
        if (wirdAusgeglichenDurchSPEFlaeche == null) {
            wirdAusgeglichenDurchSPEFlaeche = new ArrayList<ReferenceType>();
        }
        return this.wirdAusgeglichenDurchSPEFlaeche;
    }

    /**
     * Gets the value of the wirdAusgeglichenDurchMassnahme property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wirdAusgeglichenDurchMassnahme property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWirdAusgeglichenDurchMassnahme().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenceType }
     * 
     * 
     */
    public List<ReferenceType> getWirdAusgeglichenDurchMassnahme() {
        if (wirdAusgeglichenDurchMassnahme == null) {
            wirdAusgeglichenDurchMassnahme = new ArrayList<ReferenceType>();
        }
        return this.wirdAusgeglichenDurchMassnahme;
    }

    /**
     * Gets the value of the gehoertZuBPBereich property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gehoertZuBPBereich property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGehoertZuBPBereich().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenceType }
     * 
     * 
     */
    public List<ReferenceType> getGehoertZuBPBereich() {
        if (gehoertZuBPBereich == null) {
            gehoertZuBPBereich = new ArrayList<ReferenceType>();
        }
        return this.gehoertZuBPBereich;
    }

    /**
     * Gets the value of the genericApplicationPropertyOfBPObjekt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfBPObjekt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfBPObjekt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfBPObjekt() {
        if (genericApplicationPropertyOfBPObjekt == null) {
            genericApplicationPropertyOfBPObjekt = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfBPObjekt;
    }

}
