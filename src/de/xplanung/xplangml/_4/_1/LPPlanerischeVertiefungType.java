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
 * Bereiche, die einer planerischen Vertiefung bedürfen.
 * 
 * 
 * <p>Java-Klasse für LP_PlanerischeVertiefungType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="LP_PlanerischeVertiefungType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/4/1}LP_GeometrieobjektType">
 *       &lt;sequence>
 *         &lt;element name="vertiefung" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/4/1}_GenericApplicationPropertyOfLP_PlanerischeVertiefung" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LP_PlanerischeVertiefungType", propOrder = {
    "vertiefung",
    "genericApplicationPropertyOfLPPlanerischeVertiefung"
})
public class LPPlanerischeVertiefungType
    extends LPGeometrieobjektType
{

    protected String vertiefung;
    @XmlElement(name = "_GenericApplicationPropertyOfLP_PlanerischeVertiefung")
    protected List<Object> genericApplicationPropertyOfLPPlanerischeVertiefung;

    /**
     * Ruft den Wert der vertiefung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVertiefung() {
        return vertiefung;
    }

    /**
     * Legt den Wert der vertiefung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVertiefung(String value) {
        this.vertiefung = value;
    }

    /**
     * Gets the value of the genericApplicationPropertyOfLPPlanerischeVertiefung property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfLPPlanerischeVertiefung property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfLPPlanerischeVertiefung().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfLPPlanerischeVertiefung() {
        if (genericApplicationPropertyOfLPPlanerischeVertiefung == null) {
            genericApplicationPropertyOfLPPlanerischeVertiefung = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfLPPlanerischeVertiefung;
    }

}
