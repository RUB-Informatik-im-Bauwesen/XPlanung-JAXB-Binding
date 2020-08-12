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
 * Flächen und Maßnahmen zum Ausgleich von Eingriffen im Sinne des § 8 und 8a BNatSchG (in Verbindung mit § 1a BauGB, Ausgleichs- und Ersatzmaßnahmen).
 * 
 * <p>Java-Klasse für LP_AusgleichType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="LP_AusgleichType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/5/0}LP_GeometrieobjektType">
 *       &lt;sequence>
 *         &lt;element name="ziel" type="{http://www.xplanung.de/xplangml/5/0}XP_SPEZiele" minOccurs="0"/>
 *         &lt;element name="massnahme" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="massnahmeKuerzel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/5/0}_GenericApplicationPropertyOfLP_Ausgleich" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LP_AusgleichType", propOrder = {
    "ziel",
    "massnahme",
    "massnahmeKuerzel",
    "genericApplicationPropertyOfLPAusgleich"
})
public class LPAusgleichType
    extends LPGeometrieobjektType
{

    protected String ziel;
    protected String massnahme;
    protected String massnahmeKuerzel;
    @XmlElement(name = "_GenericApplicationPropertyOfLP_Ausgleich")
    protected List<Object> genericApplicationPropertyOfLPAusgleich;

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
     * Gets the value of the genericApplicationPropertyOfLPAusgleich property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfLPAusgleich property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfLPAusgleich().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfLPAusgleich() {
        if (genericApplicationPropertyOfLPAusgleich == null) {
            genericApplicationPropertyOfLPAusgleich = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfLPAusgleich;
    }

}
