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
 * Umgrenzung von Flächen für Maßnahmen zum Schutz, zur Pflege und zur Entwicklung von Natur und Landschaft (§5 Abs. 2, Nr. 10 BauGB)
 * 
 * 
 * <p>Java-Klasse für FP_SchutzPflegeEntwicklungType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FP_SchutzPflegeEntwicklungType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/4/1}FP_GeometrieobjektType">
 *       &lt;sequence>
 *         &lt;element name="ziel" type="{http://www.xplanung.de/xplangml/4/1}XP_SPEZiele" minOccurs="0"/>
 *         &lt;element name="massnahme" type="{http://www.xplanung.de/xplangml/4/1}XP_SPEMassnahmenDatenPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="weitereMassnahme1" type="{http://www.xplanung.de/xplangml/4/1}XP_SPEMassnahmenDatenPropertyType" minOccurs="0"/>
 *         &lt;element name="weitereMassnahme2" type="{http://www.xplanung.de/xplangml/4/1}XP_SPEMassnahmenDatenPropertyType" minOccurs="0"/>
 *         &lt;element name="istAusgleich" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/4/1}_GenericApplicationPropertyOfFP_SchutzPflegeEntwicklung" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FP_SchutzPflegeEntwicklungType", propOrder = {
    "ziel",
    "massnahme",
    "weitereMassnahme1",
    "weitereMassnahme2",
    "istAusgleich",
    "genericApplicationPropertyOfFPSchutzPflegeEntwicklung"
})
public class FPSchutzPflegeEntwicklungType
    extends FPGeometrieobjektType
{

    protected String ziel;
    protected List<XPSPEMassnahmenDatenPropertyType> massnahme;
    protected XPSPEMassnahmenDatenPropertyType weitereMassnahme1;
    protected XPSPEMassnahmenDatenPropertyType weitereMassnahme2;
    protected Boolean istAusgleich;
    @XmlElement(name = "_GenericApplicationPropertyOfFP_SchutzPflegeEntwicklung")
    protected List<Object> genericApplicationPropertyOfFPSchutzPflegeEntwicklung;

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
     * Ruft den Wert der istAusgleich-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIstAusgleich() {
        return istAusgleich;
    }

    /**
     * Legt den Wert der istAusgleich-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIstAusgleich(Boolean value) {
        this.istAusgleich = value;
    }

    /**
     * Gets the value of the genericApplicationPropertyOfFPSchutzPflegeEntwicklung property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfFPSchutzPflegeEntwicklung property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfFPSchutzPflegeEntwicklung().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfFPSchutzPflegeEntwicklung() {
        if (genericApplicationPropertyOfFPSchutzPflegeEntwicklung == null) {
            genericApplicationPropertyOfFPSchutzPflegeEntwicklung = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfFPSchutzPflegeEntwicklung;
    }

}
