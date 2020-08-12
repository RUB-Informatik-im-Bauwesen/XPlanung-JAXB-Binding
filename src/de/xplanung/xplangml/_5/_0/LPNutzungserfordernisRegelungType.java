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
import javax.xml.bind.annotation.XmlType;


/**
 * Flächen mit Nutzungserfordernissen und Nutzungsregelungen zum Schutz, zur Pflege und zur Entwicklung von Natur und Landschaft.
 * 
 * <p>Java-Klasse für LP_NutzungserfordernisRegelungType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="LP_NutzungserfordernisRegelungType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/5/0}LP_GeometrieobjektType">
 *       &lt;sequence>
 *         &lt;element name="ziel" type="{http://www.xplanung.de/xplangml/5/0}XP_SPEZiele" minOccurs="0"/>
 *         &lt;element name="regelung" type="{http://www.xplanung.de/xplangml/5/0}LP_Regelungen" minOccurs="0"/>
 *         &lt;element name="erfordernisRegelung" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="erfordernisRegelungKuerzel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/5/0}_GenericApplicationPropertyOfLP_NutzungserfordernisRegelung" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LP_NutzungserfordernisRegelungType", propOrder = {
    "ziel",
    "regelung",
    "erfordernisRegelung",
    "erfordernisRegelungKuerzel",
    "genericApplicationPropertyOfLPNutzungserfordernisRegelung"
})
public class LPNutzungserfordernisRegelungType
    extends LPGeometrieobjektType
{

    protected String ziel;
    protected String regelung;
    protected String erfordernisRegelung;
    protected String erfordernisRegelungKuerzel;
    @XmlElement(name = "_GenericApplicationPropertyOfLP_NutzungserfordernisRegelung")
    protected List<Object> genericApplicationPropertyOfLPNutzungserfordernisRegelung;

    /**
     * Ruft den Wert der ziel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZiel() {
        return ziel;
    }

    /**
     * Legt den Wert der ziel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZiel(String value) {
        this.ziel = value;
    }

    /**
     * Ruft den Wert der regelung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegelung() {
        return regelung;
    }

    /**
     * Legt den Wert der regelung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegelung(String value) {
        this.regelung = value;
    }

    /**
     * Ruft den Wert der erfordernisRegelung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErfordernisRegelung() {
        return erfordernisRegelung;
    }

    /**
     * Legt den Wert der erfordernisRegelung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErfordernisRegelung(String value) {
        this.erfordernisRegelung = value;
    }

    /**
     * Ruft den Wert der erfordernisRegelungKuerzel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErfordernisRegelungKuerzel() {
        return erfordernisRegelungKuerzel;
    }

    /**
     * Legt den Wert der erfordernisRegelungKuerzel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErfordernisRegelungKuerzel(String value) {
        this.erfordernisRegelungKuerzel = value;
    }

    /**
     * Gets the value of the genericApplicationPropertyOfLPNutzungserfordernisRegelung property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfLPNutzungserfordernisRegelung property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfLPNutzungserfordernisRegelung().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfLPNutzungserfordernisRegelung() {
        if (genericApplicationPropertyOfLPNutzungserfordernisRegelung == null) {
            genericApplicationPropertyOfLPNutzungserfordernisRegelung = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfLPNutzungserfordernisRegelung;
    }

}
