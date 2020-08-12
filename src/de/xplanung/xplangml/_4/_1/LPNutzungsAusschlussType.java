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
 * Flächen und Objekte die bestimmte geplante oder absehbare Nutzungsänderungen nicht erfahren sollen.
 * 
 * 
 * <p>Java-Klasse für LP_NutzungsAusschlussType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="LP_NutzungsAusschlussType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/4/1}LP_GeometrieobjektType">
 *       &lt;sequence>
 *         &lt;element name="auszuschliessendeNutzungen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="auszuschliessendeNutzungenKuerzel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="begruendung" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="begruendungKuerzel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/4/1}_GenericApplicationPropertyOfLP_NutzungsAusschluss" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LP_NutzungsAusschlussType", propOrder = {
    "auszuschliessendeNutzungen",
    "auszuschliessendeNutzungenKuerzel",
    "begruendung",
    "begruendungKuerzel",
    "genericApplicationPropertyOfLPNutzungsAusschluss"
})
public class LPNutzungsAusschlussType
    extends LPGeometrieobjektType
{

    protected String auszuschliessendeNutzungen;
    protected String auszuschliessendeNutzungenKuerzel;
    protected String begruendung;
    protected String begruendungKuerzel;
    @XmlElement(name = "_GenericApplicationPropertyOfLP_NutzungsAusschluss")
    protected List<Object> genericApplicationPropertyOfLPNutzungsAusschluss;

    /**
     * Ruft den Wert der auszuschliessendeNutzungen-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuszuschliessendeNutzungen() {
        return auszuschliessendeNutzungen;
    }

    /**
     * Legt den Wert der auszuschliessendeNutzungen-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuszuschliessendeNutzungen(String value) {
        this.auszuschliessendeNutzungen = value;
    }

    /**
     * Ruft den Wert der auszuschliessendeNutzungenKuerzel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuszuschliessendeNutzungenKuerzel() {
        return auszuschliessendeNutzungenKuerzel;
    }

    /**
     * Legt den Wert der auszuschliessendeNutzungenKuerzel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuszuschliessendeNutzungenKuerzel(String value) {
        this.auszuschliessendeNutzungenKuerzel = value;
    }

    /**
     * Ruft den Wert der begruendung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBegruendung() {
        return begruendung;
    }

    /**
     * Legt den Wert der begruendung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBegruendung(String value) {
        this.begruendung = value;
    }

    /**
     * Ruft den Wert der begruendungKuerzel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBegruendungKuerzel() {
        return begruendungKuerzel;
    }

    /**
     * Legt den Wert der begruendungKuerzel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBegruendungKuerzel(String value) {
        this.begruendungKuerzel = value;
    }

    /**
     * Gets the value of the genericApplicationPropertyOfLPNutzungsAusschluss property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfLPNutzungsAusschluss property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfLPNutzungsAusschluss().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfLPNutzungsAusschluss() {
        if (genericApplicationPropertyOfLPNutzungsAusschluss == null) {
            genericApplicationPropertyOfLPNutzungsAusschluss = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfLPNutzungsAusschluss;
    }

}
