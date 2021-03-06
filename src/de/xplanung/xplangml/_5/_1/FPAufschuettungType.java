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
import javax.xml.bind.annotation.XmlType;


/**
 * Flächen für Aufschüttungen, Abgrabungen oder für die Gewinnung von Bodenschätzen (§5, Abs. 2, Nr. 8 BauGB). Hier: Flächen für Aufschüttungen.
 * 
 * <p>Java-Klasse für FP_AufschuettungType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FP_AufschuettungType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/5/1}FP_GeometrieobjektType">
 *       &lt;sequence>
 *         &lt;element name="aufschuettungsmaterial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/5/1}_GenericApplicationPropertyOfFP_Aufschuettung" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FP_AufschuettungType", propOrder = {
    "aufschuettungsmaterial",
    "genericApplicationPropertyOfFPAufschuettung"
})
public class FPAufschuettungType
    extends FPGeometrieobjektType
{

    protected String aufschuettungsmaterial;
    @XmlElement(name = "_GenericApplicationPropertyOfFP_Aufschuettung")
    protected List<Object> genericApplicationPropertyOfFPAufschuettung;

    /**
     * Ruft den Wert der aufschuettungsmaterial-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAufschuettungsmaterial() {
        return aufschuettungsmaterial;
    }

    /**
     * Legt den Wert der aufschuettungsmaterial-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAufschuettungsmaterial(String value) {
        this.aufschuettungsmaterial = value;
    }

    /**
     * Gets the value of the genericApplicationPropertyOfFPAufschuettung property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfFPAufschuettung property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfFPAufschuettung().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfFPAufschuettung() {
        if (genericApplicationPropertyOfFPAufschuettung == null) {
            genericApplicationPropertyOfFPAufschuettung = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfFPAufschuettung;
    }

}
