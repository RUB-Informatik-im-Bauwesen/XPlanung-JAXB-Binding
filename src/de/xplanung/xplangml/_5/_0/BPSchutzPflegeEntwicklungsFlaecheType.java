//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.06.04 um 02:29:48 PM CEST 
//


package de.xplanung.xplangml._5._0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Umgrenzung von Flächen für Maßnahmen zum Schutz, zur Pflege und zur Entwicklung von Natur und Landschaft (§9 Abs. 1 Nr. 20 und Abs. 4 BauGB)
 * 
 * <p>Java-Klasse für BP_SchutzPflegeEntwicklungsFlaecheType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="BP_SchutzPflegeEntwicklungsFlaecheType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/5/0}BP_FlaechenobjektType">
 *       &lt;sequence>
 *         &lt;element name="ziel" type="{http://www.xplanung.de/xplangml/5/0}XP_SPEZiele" minOccurs="0"/>
 *         &lt;element name="sonstZiel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="massnahme" type="{http://www.xplanung.de/xplangml/5/0}XP_SPEMassnahmenDatenPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="istAusgleich" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="refMassnahmenText" type="{http://www.xplanung.de/xplangml/5/0}XP_ExterneReferenzPropertyType" minOccurs="0"/>
 *         &lt;element name="refLandschaftsplan" type="{http://www.xplanung.de/xplangml/5/0}XP_ExterneReferenzPropertyType" minOccurs="0"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/5/0}_GenericApplicationPropertyOfBP_SchutzPflegeEntwicklungsFlaeche" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BP_SchutzPflegeEntwicklungsFlaecheType", propOrder = {
    "ziel",
    "sonstZiel",
    "massnahme",
    "istAusgleich",
    "refMassnahmenText",
    "refLandschaftsplan",
    "genericApplicationPropertyOfBPSchutzPflegeEntwicklungsFlaeche"
})
public class BPSchutzPflegeEntwicklungsFlaecheType
    extends BPFlaechenobjektType
{

    protected String ziel;
    protected String sonstZiel;
    protected List<XPSPEMassnahmenDatenPropertyType> massnahme;
    @XmlElement(defaultValue = "false")
    protected Boolean istAusgleich;
    protected XPExterneReferenzPropertyType refMassnahmenText;
    protected XPExterneReferenzPropertyType refLandschaftsplan;
    @XmlElement(name = "_GenericApplicationPropertyOfBP_SchutzPflegeEntwicklungsFlaeche")
    protected List<Object> genericApplicationPropertyOfBPSchutzPflegeEntwicklungsFlaeche;

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
     * Ruft den Wert der sonstZiel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSonstZiel() {
        return sonstZiel;
    }

    /**
     * Legt den Wert der sonstZiel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSonstZiel(String value) {
        this.sonstZiel = value;
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
     * Gets the value of the genericApplicationPropertyOfBPSchutzPflegeEntwicklungsFlaeche property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfBPSchutzPflegeEntwicklungsFlaeche property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfBPSchutzPflegeEntwicklungsFlaeche().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfBPSchutzPflegeEntwicklungsFlaeche() {
        if (genericApplicationPropertyOfBPSchutzPflegeEntwicklungsFlaeche == null) {
            genericApplicationPropertyOfBPSchutzPflegeEntwicklungsFlaeche = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfBPSchutzPflegeEntwicklungsFlaeche;
    }

}
