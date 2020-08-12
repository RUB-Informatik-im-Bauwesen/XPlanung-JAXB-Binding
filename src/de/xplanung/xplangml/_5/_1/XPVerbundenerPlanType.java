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
 * Spezifikation eines anderen Plans, der mit dem Ausgangsplan verbunden ist und diesen ändert bzw. von ihm geändert wird.
 * 
 * 
 * <p>Java-Klasse für XP_VerbundenerPlanType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="XP_VerbundenerPlanType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="planName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rechtscharakter" type="{http://www.xplanung.de/xplangml/5/1}XP_RechtscharakterPlanaenderung"/>
 *         &lt;element name="nummer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="verbundenerPlan" type="{http://www.opengis.net/gml/3.2}ReferenceType" minOccurs="0"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/5/1}_GenericApplicationPropertyOfXP_VerbundenerPlan" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XP_VerbundenerPlanType", propOrder = {
    "planName",
    "rechtscharakter",
    "nummer",
    "verbundenerPlan",
    "genericApplicationPropertyOfXPVerbundenerPlan"
})
public class XPVerbundenerPlanType {

    protected String planName;
    @XmlElement(required = true)
    protected String rechtscharakter;
    protected String nummer;
    protected ReferenceType verbundenerPlan;
    @XmlElement(name = "_GenericApplicationPropertyOfXP_VerbundenerPlan")
    protected List<Object> genericApplicationPropertyOfXPVerbundenerPlan;

    /**
     * Ruft den Wert der planName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanName() {
        return planName;
    }

    /**
     * Legt den Wert der planName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanName(String value) {
        this.planName = value;
    }

    /**
     * Ruft den Wert der rechtscharakter-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRechtscharakter() {
        return rechtscharakter;
    }

    /**
     * Legt den Wert der rechtscharakter-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRechtscharakter(String value) {
        this.rechtscharakter = value;
    }

    /**
     * Ruft den Wert der nummer-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNummer() {
        return nummer;
    }

    /**
     * Legt den Wert der nummer-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNummer(String value) {
        this.nummer = value;
    }

    /**
     * Ruft den Wert der verbundenerPlan-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getVerbundenerPlan() {
        return verbundenerPlan;
    }

    /**
     * Legt den Wert der verbundenerPlan-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setVerbundenerPlan(ReferenceType value) {
        this.verbundenerPlan = value;
    }

    /**
     * Gets the value of the genericApplicationPropertyOfXPVerbundenerPlan property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfXPVerbundenerPlan property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfXPVerbundenerPlan().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfXPVerbundenerPlan() {
        if (genericApplicationPropertyOfXPVerbundenerPlan == null) {
            genericApplicationPropertyOfXPVerbundenerPlan = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfXPVerbundenerPlan;
    }

}
