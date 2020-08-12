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
 * Flächen für Aufschüttungen, Abgrabungen oder für die Gewinnung von Bodenschätzen (§5, Abs. 2, Nr. 8 BauGB. Hier: Flächen für Bodenschätze.
 * 
 * 
 * <p>Java-Klasse für FP_BodenschaetzeType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FP_BodenschaetzeType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/5/0}FP_GeometrieobjektType">
 *       &lt;sequence>
 *         &lt;element name="abbaugut" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/5/0}_GenericApplicationPropertyOfFP_Bodenschaetze" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FP_BodenschaetzeType", propOrder = {
    "abbaugut",
    "genericApplicationPropertyOfFPBodenschaetze"
})
public class FPBodenschaetzeType
    extends FPGeometrieobjektType
{

    protected String abbaugut;
    @XmlElement(name = "_GenericApplicationPropertyOfFP_Bodenschaetze")
    protected List<Object> genericApplicationPropertyOfFPBodenschaetze;

    /**
     * Ruft den Wert der abbaugut-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbbaugut() {
        return abbaugut;
    }

    /**
     * Legt den Wert der abbaugut-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbbaugut(String value) {
        this.abbaugut = value;
    }

    /**
     * Gets the value of the genericApplicationPropertyOfFPBodenschaetze property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfFPBodenschaetze property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfFPBodenschaetze().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfFPBodenschaetze() {
        if (genericApplicationPropertyOfFPBodenschaetze == null) {
            genericApplicationPropertyOfFPBodenschaetze = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfFPBodenschaetze;
    }

}
