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
 * Sonstige Flächen und Maßnahmen zum Schutz, zur Pflege und zur Entwicklung von Natur und Landschaft, soweit sie nicht durch die Klasse LP_NutzungserfordernisRegelung modelliert werden.
 * 
 * <p>Java-Klasse für LP_SchutzPflegeEntwicklungType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="LP_SchutzPflegeEntwicklungType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/4/1}LP_GeometrieobjektType">
 *       &lt;sequence>
 *         &lt;element name="ziel" type="{http://www.xplanung.de/xplangml/4/1}XP_SPEZiele" minOccurs="0"/>
 *         &lt;element name="massnahme" type="{http://www.xplanung.de/xplangml/4/1}XP_SPEMassnahmenTypen" minOccurs="0"/>
 *         &lt;element name="massnahmeText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="massnahmeKuerzel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="istAusgleich" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/4/1}_GenericApplicationPropertyOfLP_SchutzPflegeEntwicklung" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LP_SchutzPflegeEntwicklungType", propOrder = {
    "ziel",
    "massnahme",
    "massnahmeText",
    "massnahmeKuerzel",
    "istAusgleich",
    "genericApplicationPropertyOfLPSchutzPflegeEntwicklung"
})
public class LPSchutzPflegeEntwicklungType
    extends LPGeometrieobjektType
{

    protected String ziel;
    protected String massnahme;
    protected String massnahmeText;
    protected String massnahmeKuerzel;
    protected Boolean istAusgleich;
    @XmlElement(name = "_GenericApplicationPropertyOfLP_SchutzPflegeEntwicklung")
    protected List<Object> genericApplicationPropertyOfLPSchutzPflegeEntwicklung;

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
     * Ruft den Wert der massnahme-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMassnahme() {
        return massnahme;
    }

    /**
     * Legt den Wert der massnahme-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMassnahme(String value) {
        this.massnahme = value;
    }

    /**
     * Ruft den Wert der massnahmeText-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMassnahmeText() {
        return massnahmeText;
    }

    /**
     * Legt den Wert der massnahmeText-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMassnahmeText(String value) {
        this.massnahmeText = value;
    }

    /**
     * Ruft den Wert der massnahmeKuerzel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMassnahmeKuerzel() {
        return massnahmeKuerzel;
    }

    /**
     * Legt den Wert der massnahmeKuerzel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMassnahmeKuerzel(String value) {
        this.massnahmeKuerzel = value;
    }

    /**
     * Ruft den Wert der istAusgleich-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIstAusgleich() {
        return istAusgleich;
    }

    /**
     * Legt den Wert der istAusgleich-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIstAusgleich(Boolean value) {
        this.istAusgleich = value;
    }

    /**
     * Gets the value of the genericApplicationPropertyOfLPSchutzPflegeEntwicklung property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfLPSchutzPflegeEntwicklung property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfLPSchutzPflegeEntwicklung().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfLPSchutzPflegeEntwicklung() {
        if (genericApplicationPropertyOfLPSchutzPflegeEntwicklung == null) {
            genericApplicationPropertyOfLPSchutzPflegeEntwicklung = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfLPSchutzPflegeEntwicklung;
    }

}
