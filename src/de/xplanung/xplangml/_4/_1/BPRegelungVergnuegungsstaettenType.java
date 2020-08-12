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
 * Festsetzung nach §9 Abs. 2b BauGB (Zulässigkeit von Vergnügungsstätten)
 * 
 * 
 * <p>Java-Klasse für BP_RegelungVergnuegungsstaettenType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="BP_RegelungVergnuegungsstaettenType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/4/1}BP_UeberlagerungsobjektType">
 *       &lt;sequence>
 *         &lt;element name="zulaessigkeit" type="{http://www.xplanung.de/xplangml/4/1}BP_ZulaessigkeitVergnuegungsstaetten" minOccurs="0"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/4/1}_GenericApplicationPropertyOfBP_RegelungVergnuegungsstaetten" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BP_RegelungVergnuegungsstaettenType", propOrder = {
    "zulaessigkeit",
    "genericApplicationPropertyOfBPRegelungVergnuegungsstaetten"
})
public class BPRegelungVergnuegungsstaettenType
    extends BPUeberlagerungsobjektType
{

    protected String zulaessigkeit;
    @XmlElement(name = "_GenericApplicationPropertyOfBP_RegelungVergnuegungsstaetten")
    protected List<Object> genericApplicationPropertyOfBPRegelungVergnuegungsstaetten;

    /**
     * Ruft den Wert der zulaessigkeit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZulaessigkeit() {
        return zulaessigkeit;
    }

    /**
     * Legt den Wert der zulaessigkeit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZulaessigkeit(String value) {
        this.zulaessigkeit = value;
    }

    /**
     * Gets the value of the genericApplicationPropertyOfBPRegelungVergnuegungsstaetten property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfBPRegelungVergnuegungsstaetten property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfBPRegelungVergnuegungsstaetten().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfBPRegelungVergnuegungsstaetten() {
        if (genericApplicationPropertyOfBPRegelungVergnuegungsstaetten == null) {
            genericApplicationPropertyOfBPRegelungVergnuegungsstaetten = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfBPRegelungVergnuegungsstaetten;
    }

}
