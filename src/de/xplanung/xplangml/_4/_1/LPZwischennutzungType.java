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
 * Flächen und Maßnahmen mit zeitlich befristeten Bindungen zum Schutz, zur Pflege und zur Entwicklung von Natur und Landschaft ("Zwischennutzungsvorgaben").
 * 
 * <p>Java-Klasse für LP_ZwischennutzungType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="LP_ZwischennutzungType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/4/1}LP_GeometrieobjektType">
 *       &lt;sequence>
 *         &lt;element name="ziel" type="{http://www.xplanung.de/xplangml/4/1}XP_SPEZiele" minOccurs="0"/>
 *         &lt;element name="bindung" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bindungKuerzel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/4/1}_GenericApplicationPropertyOfLP_Zwischennutzung" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LP_ZwischennutzungType", propOrder = {
    "ziel",
    "bindung",
    "bindungKuerzel",
    "genericApplicationPropertyOfLPZwischennutzung"
})
public class LPZwischennutzungType
    extends LPGeometrieobjektType
{

    protected String ziel;
    protected String bindung;
    protected String bindungKuerzel;
    @XmlElement(name = "_GenericApplicationPropertyOfLP_Zwischennutzung")
    protected List<Object> genericApplicationPropertyOfLPZwischennutzung;

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
     * Ruft den Wert der bindung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBindung() {
        return bindung;
    }

    /**
     * Legt den Wert der bindung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBindung(String value) {
        this.bindung = value;
    }

    /**
     * Ruft den Wert der bindungKuerzel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBindungKuerzel() {
        return bindungKuerzel;
    }

    /**
     * Legt den Wert der bindungKuerzel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBindungKuerzel(String value) {
        this.bindungKuerzel = value;
    }

    /**
     * Gets the value of the genericApplicationPropertyOfLPZwischennutzung property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfLPZwischennutzung property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfLPZwischennutzung().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfLPZwischennutzung() {
        if (genericApplicationPropertyOfLPZwischennutzung == null) {
            genericApplicationPropertyOfLPZwischennutzung = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfLPZwischennutzung;
    }

}
