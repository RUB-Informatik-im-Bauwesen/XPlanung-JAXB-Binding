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
import net.opengis.gml._3.ReferenceType;


/**
 * Bereich eines sonstigen raumbezogenen Plans.
 * 
 * 
 * <p>Java-Klasse für SO_BereichType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SO_BereichType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/4/1}XP_BereichType">
 *       &lt;sequence>
 *         &lt;element name="gehoertZuPlan" type="{http://www.opengis.net/gml/3.2}ReferenceType"/>
 *         &lt;element name="inhaltSoPlan" type="{http://www.opengis.net/gml/3.2}ReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="rasterAenderung" type="{http://www.opengis.net/gml/3.2}ReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/4/1}_GenericApplicationPropertyOfSO_Bereich" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SO_BereichType", propOrder = {
    "gehoertZuPlan",
    "inhaltSoPlan",
    "rasterAenderung",
    "genericApplicationPropertyOfSOBereich"
})
public class SOBereichType
    extends XPBereichType
{

    @XmlElement(required = true)
    protected ReferenceType gehoertZuPlan;
    protected List<ReferenceType> inhaltSoPlan;
    protected List<ReferenceType> rasterAenderung;
    @XmlElement(name = "_GenericApplicationPropertyOfSO_Bereich")
    protected List<Object> genericApplicationPropertyOfSOBereich;

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
     * Gets the value of the inhaltSoPlan property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inhaltSoPlan property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInhaltSoPlan().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenceType }
     * 
     * 
     */
    public List<ReferenceType> getInhaltSoPlan() {
        if (inhaltSoPlan == null) {
            inhaltSoPlan = new ArrayList<ReferenceType>();
        }
        return this.inhaltSoPlan;
    }

    /**
     * Gets the value of the rasterAenderung property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rasterAenderung property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRasterAenderung().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenceType }
     * 
     * 
     */
    public List<ReferenceType> getRasterAenderung() {
        if (rasterAenderung == null) {
            rasterAenderung = new ArrayList<ReferenceType>();
        }
        return this.rasterAenderung;
    }

    /**
     * Gets the value of the genericApplicationPropertyOfSOBereich property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfSOBereich property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfSOBereich().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfSOBereich() {
        if (genericApplicationPropertyOfSOBereich == null) {
            genericApplicationPropertyOfSOBereich = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfSOBereich;
    }

}
