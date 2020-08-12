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
 * Festsetzung einer Einzelmaßnahme zum Ausgleich im Sinne des § 1a Abs.3 und §9 Abs. 1a BauGB.
 * 
 * 
 * <p>Java-Klasse für BP_AusgleichsMassnahmeType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="BP_AusgleichsMassnahmeType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/4/1}BP_GeometrieobjektType">
 *       &lt;sequence>
 *         &lt;element name="ziel" type="{http://www.xplanung.de/xplangml/4/1}XP_SPEZiele" minOccurs="0"/>
 *         &lt;element name="massnahme" type="{http://www.xplanung.de/xplangml/4/1}XP_SPEMassnahmenDatenPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="weitereMassnahme1" type="{http://www.xplanung.de/xplangml/4/1}XP_SPEMassnahmenDatenPropertyType" minOccurs="0"/>
 *         &lt;element name="weitereMassnahme2" type="{http://www.xplanung.de/xplangml/4/1}XP_SPEMassnahmenDatenPropertyType" minOccurs="0"/>
 *         &lt;element name="refMassnahmenText" type="{http://www.xplanung.de/xplangml/4/1}XP_ExterneReferenzPropertyType" minOccurs="0"/>
 *         &lt;element name="refLandschaftsplan" type="{http://www.xplanung.de/xplangml/4/1}XP_ExterneReferenzPropertyType" minOccurs="0"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/4/1}_GenericApplicationPropertyOfBP_AusgleichsMassnahme" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BP_AusgleichsMassnahmeType", propOrder = {
    "ziel",
    "massnahme",
    "weitereMassnahme1",
    "weitereMassnahme2",
    "refMassnahmenText",
    "refLandschaftsplan",
    "genericApplicationPropertyOfBPAusgleichsMassnahme"
})
public class BPAusgleichsMassnahmeType
    extends BPGeometrieobjektType
{

    protected String ziel;
    protected List<XPSPEMassnahmenDatenPropertyType> massnahme;
    protected XPSPEMassnahmenDatenPropertyType weitereMassnahme1;
    protected XPSPEMassnahmenDatenPropertyType weitereMassnahme2;
    protected XPExterneReferenzPropertyType refMassnahmenText;
    protected XPExterneReferenzPropertyType refLandschaftsplan;
    @XmlElement(name = "_GenericApplicationPropertyOfBP_AusgleichsMassnahme")
    protected List<Object> genericApplicationPropertyOfBPAusgleichsMassnahme;

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
     * Gets the value of the massnahme property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the massnahme property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMassnahme().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XPSPEMassnahmenDatenPropertyType }
     * 
     * 
     */
    public List<XPSPEMassnahmenDatenPropertyType> getMassnahme() {
        if (massnahme == null) {
            massnahme = new ArrayList<XPSPEMassnahmenDatenPropertyType>();
        }
        return this.massnahme;
    }

    /**
     * Ruft den Wert der weitereMassnahme1-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XPSPEMassnahmenDatenPropertyType }
     *     
     */
    public XPSPEMassnahmenDatenPropertyType getWeitereMassnahme1() {
        return weitereMassnahme1;
    }

    /**
     * Legt den Wert der weitereMassnahme1-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XPSPEMassnahmenDatenPropertyType }
     *     
     */
    public void setWeitereMassnahme1(XPSPEMassnahmenDatenPropertyType value) {
        this.weitereMassnahme1 = value;
    }

    /**
     * Ruft den Wert der weitereMassnahme2-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XPSPEMassnahmenDatenPropertyType }
     *     
     */
    public XPSPEMassnahmenDatenPropertyType getWeitereMassnahme2() {
        return weitereMassnahme2;
    }

    /**
     * Legt den Wert der weitereMassnahme2-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XPSPEMassnahmenDatenPropertyType }
     *     
     */
    public void setWeitereMassnahme2(XPSPEMassnahmenDatenPropertyType value) {
        this.weitereMassnahme2 = value;
    }

    /**
     * Ruft den Wert der refMassnahmenText-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XPExterneReferenzPropertyType }
     *     
     */
    public XPExterneReferenzPropertyType getRefMassnahmenText() {
        return refMassnahmenText;
    }

    /**
     * Legt den Wert der refMassnahmenText-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XPExterneReferenzPropertyType }
     *     
     */
    public void setRefMassnahmenText(XPExterneReferenzPropertyType value) {
        this.refMassnahmenText = value;
    }

    /**
     * Ruft den Wert der refLandschaftsplan-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XPExterneReferenzPropertyType }
     *     
     */
    public XPExterneReferenzPropertyType getRefLandschaftsplan() {
        return refLandschaftsplan;
    }

    /**
     * Legt den Wert der refLandschaftsplan-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XPExterneReferenzPropertyType }
     *     
     */
    public void setRefLandschaftsplan(XPExterneReferenzPropertyType value) {
        this.refLandschaftsplan = value;
    }

    /**
     * Gets the value of the genericApplicationPropertyOfBPAusgleichsMassnahme property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfBPAusgleichsMassnahme property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfBPAusgleichsMassnahme().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfBPAusgleichsMassnahme() {
        if (genericApplicationPropertyOfBPAusgleichsMassnahme == null) {
            genericApplicationPropertyOfBPAusgleichsMassnahme = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfBPAusgleichsMassnahme;
    }

}
