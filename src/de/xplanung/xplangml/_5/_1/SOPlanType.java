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
import net.opengis.gml._3.CodeType;
import net.opengis.gml._3.ReferenceType;


/**
 * Klasse für sonstige, z. B. länderspezifische raumbezogene Planwerke.
 * 
 * <p>Java-Klasse für SO_PlanType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SO_PlanType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/5/1}XP_PlanType">
 *       &lt;sequence>
 *         &lt;element name="gemeinde" type="{http://www.xplanung.de/xplangml/5/1}XP_GemeindePropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="planaufstellendeGemeinde" type="{http://www.xplanung.de/xplangml/5/1}XP_GemeindePropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="planArt" type="{http://www.opengis.net/gml/3.2}CodeType"/>
 *         &lt;element name="plangeber" type="{http://www.xplanung.de/xplangml/5/1}XP_PlangeberPropertyType" minOccurs="0"/>
 *         &lt;element name="bereich" type="{http://www.opengis.net/gml/3.2}ReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/5/1}_GenericApplicationPropertyOfSO_Plan" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SO_PlanType", propOrder = {
    "gemeinde",
    "planaufstellendeGemeinde",
    "planArt",
    "plangeber",
    "bereich",
    "genericApplicationPropertyOfSOPlan"
})
public class SOPlanType
    extends XPPlanType
{

    protected List<XPGemeindePropertyType> gemeinde;
    protected List<XPGemeindePropertyType> planaufstellendeGemeinde;
    @XmlElement(required = true)
    protected CodeType planArt;
    protected XPPlangeberPropertyType plangeber;
    protected List<ReferenceType> bereich;
    @XmlElement(name = "_GenericApplicationPropertyOfSO_Plan")
    protected List<Object> genericApplicationPropertyOfSOPlan;

    /**
     * Gets the value of the gemeinde property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gemeinde property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGemeinde().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XPGemeindePropertyType }
     * 
     * 
     */
    public List<XPGemeindePropertyType> getGemeinde() {
        if (gemeinde == null) {
            gemeinde = new ArrayList<XPGemeindePropertyType>();
        }
        return this.gemeinde;
    }

    /**
     * Gets the value of the planaufstellendeGemeinde property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the planaufstellendeGemeinde property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlanaufstellendeGemeinde().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XPGemeindePropertyType }
     * 
     * 
     */
    public List<XPGemeindePropertyType> getPlanaufstellendeGemeinde() {
        if (planaufstellendeGemeinde == null) {
            planaufstellendeGemeinde = new ArrayList<XPGemeindePropertyType>();
        }
        return this.planaufstellendeGemeinde;
    }

    /**
     * Ruft den Wert der planArt-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getPlanArt() {
        return planArt;
    }

    /**
     * Legt den Wert der planArt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setPlanArt(CodeType value) {
        this.planArt = value;
    }

    /**
     * Ruft den Wert der plangeber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XPPlangeberPropertyType }
     *     
     */
    public XPPlangeberPropertyType getPlangeber() {
        return plangeber;
    }

    /**
     * Legt den Wert der plangeber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XPPlangeberPropertyType }
     *     
     */
    public void setPlangeber(XPPlangeberPropertyType value) {
        this.plangeber = value;
    }

    /**
     * Gets the value of the bereich property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bereich property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBereich().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenceType }
     * 
     * 
     */
    public List<ReferenceType> getBereich() {
        if (bereich == null) {
            bereich = new ArrayList<ReferenceType>();
        }
        return this.bereich;
    }

    /**
     * Gets the value of the genericApplicationPropertyOfSOPlan property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfSOPlan property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfSOPlan().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfSOPlan() {
        if (genericApplicationPropertyOfSOPlan == null) {
            genericApplicationPropertyOfSOPlan = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfSOPlan;
    }

}
