//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.06.04 um 02:29:48 PM CEST 
//


package de.xplanung.xplangml._5._0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml._3.ReferenceType;


/**
 * RP_Objekt ist die Basisklasse für alle spezifischen Festlegungen eines Raumordnungsplans. Sie selbst ist abstrakt, d.h. sie wird selbst nicht als eigenes Objekt verwendet, sondern vererbt nur ihre Attribute an spezielle Klassen.
 * 
 * <p>Java-Klasse für RP_ObjektType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RP_ObjektType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/5/0}XP_ObjektType">
 *       &lt;sequence>
 *         &lt;element name="rechtscharakter" type="{http://www.xplanung.de/xplangml/5/0}RP_Rechtscharakter"/>
 *         &lt;element name="konkretisierung" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gebietsTyp" type="{http://www.xplanung.de/xplangml/5/0}RP_GebietsTyp" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="kuestenmeer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="bedeutsamkeit" type="{http://www.xplanung.de/xplangml/5/0}RP_Bedeutsamkeit" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="istZweckbindung" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="refTextInhalt" type="{http://www.opengis.net/gml/3.2}ReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/5/0}_GenericApplicationPropertyOfRP_Objekt" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RP_ObjektType", propOrder = {
    "rechtscharakter",
    "konkretisierung",
    "gebietsTyp",
    "kuestenmeer",
    "bedeutsamkeit",
    "istZweckbindung",
    "refTextInhalt",
    "genericApplicationPropertyOfRPObjekt"
})
@XmlSeeAlso({
    RPGeometrieobjektType.class
})
public abstract class RPObjektType
    extends XPObjektType
{

    @XmlElement(required = true)
    protected String rechtscharakter;
    protected String konkretisierung;
    protected List<String> gebietsTyp;
    @XmlElement(defaultValue = "false")
    protected Boolean kuestenmeer;
    protected List<String> bedeutsamkeit;
    @XmlElement(defaultValue = "false")
    protected Boolean istZweckbindung;
    protected List<ReferenceType> refTextInhalt;
    @XmlElement(name = "_GenericApplicationPropertyOfRP_Objekt")
    protected List<Object> genericApplicationPropertyOfRPObjekt;

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
     * Ruft den Wert der konkretisierung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKonkretisierung() {
        return konkretisierung;
    }

    /**
     * Legt den Wert der konkretisierung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKonkretisierung(String value) {
        this.konkretisierung = value;
    }

    /**
     * Gets the value of the gebietsTyp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gebietsTyp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGebietsTyp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getGebietsTyp() {
        if (gebietsTyp == null) {
            gebietsTyp = new ArrayList<String>();
        }
        return this.gebietsTyp;
    }

    /**
     * Ruft den Wert der kuestenmeer-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isKuestenmeer() {
        return kuestenmeer;
    }

    /**
     * Legt den Wert der kuestenmeer-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKuestenmeer(Boolean value) {
        this.kuestenmeer = value;
    }

    /**
     * Gets the value of the bedeutsamkeit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bedeutsamkeit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBedeutsamkeit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBedeutsamkeit() {
        if (bedeutsamkeit == null) {
            bedeutsamkeit = new ArrayList<String>();
        }
        return this.bedeutsamkeit;
    }

    /**
     * Ruft den Wert der istZweckbindung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIstZweckbindung() {
        return istZweckbindung;
    }

    /**
     * Legt den Wert der istZweckbindung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIstZweckbindung(Boolean value) {
        this.istZweckbindung = value;
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
     * Gets the value of the genericApplicationPropertyOfRPObjekt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfRPObjekt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfRPObjekt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfRPObjekt() {
        if (genericApplicationPropertyOfRPObjekt == null) {
            genericApplicationPropertyOfRPObjekt = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfRPObjekt;
    }

}
