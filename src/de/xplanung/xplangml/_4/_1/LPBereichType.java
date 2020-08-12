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
 *     &lt;extension base="{http://www.xplanung.de/xplangml/4/1}XP_BereichType">
 *       &lt;sequence>
 *         &lt;element name="gehoertZuPlan" type="{http://www.opengis.net/gml/3.2}ReferenceType"/>
 *         &lt;element name="inhaltLPlan" type="{http://www.opengis.net/gml/3.2}ReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="rasterAenderung" type="{http://www.xplanung.de/xplangml/4/1}LP_RasterplanAenderungPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/4/1}_GenericApplicationPropertyOfLP_Bereich" maxOccurs="unbounded" minOccurs="0"/>
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
    "inhaltLPlan",
    "rasterAenderung",
    "genericApplicationPropertyOfLPBereich"
})
public class LPBereichType
    extends XPBereichType
{

    @XmlElement(required = true)
    protected ReferenceType gehoertZuPlan;
    protected List<ReferenceType> inhaltLPlan;
    protected List<LPRasterplanAenderungPropertyType> rasterAenderung;
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
     * Gets the value of the inhaltLPlan property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inhaltLPlan property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInhaltLPlan().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenceType }
     * 
     * 
     */
    public List<ReferenceType> getInhaltLPlan() {
        if (inhaltLPlan == null) {
            inhaltLPlan = new ArrayList<ReferenceType>();
        }
        return this.inhaltLPlan;
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
     * {@link LPRasterplanAenderungPropertyType }
     * 
     * 
     */
    public List<LPRasterplanAenderungPropertyType> getRasterAenderung() {
        if (rasterAenderung == null) {
            rasterAenderung = new ArrayList<LPRasterplanAenderungPropertyType>();
        }
        return this.rasterAenderung;
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
