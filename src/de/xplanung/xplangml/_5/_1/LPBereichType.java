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
import net.opengis.gml._3.ReferenceType;


/**
 * Ein Bereich eines Landschaftsplans.
 * 
 * 
 * <p>Java-Klasse für LP_BereichType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="LP_BereichType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/5/1}XP_BereichType">
 *       &lt;sequence>
 *         &lt;element name="gehoertZuPlan" type="{http://www.opengis.net/gml/3.2}ReferenceType"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/5/1}_GenericApplicationPropertyOfLP_Bereich" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LP_BereichType", propOrder = {
    "gehoertZuPlan",
    "genericApplicationPropertyOfLPBereich"
})
public class LPBereichType
    extends XPBereichType
{

    @XmlElement(required = true)
    protected ReferenceType gehoertZuPlan;
    @XmlElement(name = "_GenericApplicationPropertyOfLP_Bereich")
    protected List<Object> genericApplicationPropertyOfLPBereich;

    /**
     * Ruft den Wert der gehoertZuPlan-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getGehoertZuPlan() {
        return gehoertZuPlan;
    }

    /**
     * Legt den Wert der gehoertZuPlan-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setGehoertZuPlan(ReferenceType value) {
        this.gehoertZuPlan = value;
    }

    /**
     * Gets the value of the genericApplicationPropertyOfLPBereich property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfLPBereich property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfLPBereich().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfLPBereich() {
        if (genericApplicationPropertyOfLPBereich == null) {
            genericApplicationPropertyOfLPBereich = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfLPBereich;
    }

}
