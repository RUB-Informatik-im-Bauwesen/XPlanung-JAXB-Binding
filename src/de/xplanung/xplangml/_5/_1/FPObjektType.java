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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml._3.CodeType;
import net.opengis.gml._3.ReferenceType;


/**
 * Basisklasse für alle Fachobjekte des Flächennutzungsplans.
 * 
 * <p>Java-Klasse für FP_ObjektType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FP_ObjektType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/5/1}XP_ObjektType">
 *       &lt;sequence>
 *         &lt;element name="rechtscharakter" type="{http://www.xplanung.de/xplangml/5/1}FP_Rechtscharakter"/>
 *         &lt;element name="spezifischePraegung" type="{http://www.opengis.net/gml/3.2}CodeType" minOccurs="0"/>
 *         &lt;element name="refTextInhalt" type="{http://www.opengis.net/gml/3.2}ReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="wirdAusgeglichenDurchFlaeche" type="{http://www.opengis.net/gml/3.2}ReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="wirdAusgeglichenDurchSPE" type="{http://www.opengis.net/gml/3.2}ReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/5/1}_GenericApplicationPropertyOfFP_Objekt" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FP_ObjektType", propOrder = {
    "rechtscharakter",
    "spezifischePraegung",
    "refTextInhalt",
    "wirdAusgeglichenDurchFlaeche",
    "wirdAusgeglichenDurchSPE",
    "genericApplicationPropertyOfFPObjekt"
})
@XmlSeeAlso({
    FPLinienobjektType.class,
    FPFlaechenobjektType.class,
    FPGeometrieobjektType.class,
    FPPunktobjektType.class
})
public abstract class FPObjektType
    extends XPObjektType
{

    @XmlElement(required = true)
    protected String rechtscharakter;
    protected CodeType spezifischePraegung;
    protected List<ReferenceType> refTextInhalt;
    protected List<ReferenceType> wirdAusgeglichenDurchFlaeche;
    protected List<ReferenceType> wirdAusgeglichenDurchSPE;
    @XmlElement(name = "_GenericApplicationPropertyOfFP_Objekt")
    protected List<Object> genericApplicationPropertyOfFPObjekt;

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
     * Ruft den Wert der spezifischePraegung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getSpezifischePraegung() {
        return spezifischePraegung;
    }

    /**
     * Legt den Wert der spezifischePraegung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setSpezifischePraegung(CodeType value) {
        this.spezifischePraegung = value;
    }

    /**
     * Gets the value of the refTextInhalt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refTextInhalt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefTextInhalt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenceType }
     * 
     * 
     */
    public List<ReferenceType> getRefTextInhalt() {
        if (refTextInhalt == null) {
            refTextInhalt = new ArrayList<ReferenceType>();
        }
        return this.refTextInhalt;
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
     * Gets the value of the wirdAusgeglichenDurchSPE property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wirdAusgeglichenDurchSPE property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWirdAusgeglichenDurchSPE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenceType }
     * 
     * 
     */
    public List<ReferenceType> getWirdAusgeglichenDurchSPE() {
        if (wirdAusgeglichenDurchSPE == null) {
            wirdAusgeglichenDurchSPE = new ArrayList<ReferenceType>();
        }
        return this.wirdAusgeglichenDurchSPE;
    }

    /**
     * Gets the value of the genericApplicationPropertyOfFPObjekt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfFPObjekt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfFPObjekt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfFPObjekt() {
        if (genericApplicationPropertyOfFPObjekt == null) {
            genericApplicationPropertyOfFPObjekt = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfFPObjekt;
    }

}
