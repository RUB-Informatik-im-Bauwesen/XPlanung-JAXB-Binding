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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import net.opengis.gml._3.ReferenceType;


/**
 * Diese Klasse modelliert einen Bereich eines Flächennutzungsplans.
 * 
 * <p>Java-Klasse für FP_BereichType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FP_BereichType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/5/1}XP_BereichType">
 *       &lt;sequence>
 *         &lt;element name="versionBauNVODatum" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="versionBauNVOText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="versionBauGBDatum" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="versionBauGBText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="versionSonstRechtsgrundlageDatum" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="versionSonstRechtsgrundlageText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gehoertZuPlan" type="{http://www.opengis.net/gml/3.2}ReferenceType"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/5/1}_GenericApplicationPropertyOfFP_Bereich" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FP_BereichType", propOrder = {
    "versionBauNVODatum",
    "versionBauNVOText",
    "versionBauGBDatum",
    "versionBauGBText",
    "versionSonstRechtsgrundlageDatum",
    "versionSonstRechtsgrundlageText",
    "gehoertZuPlan",
    "genericApplicationPropertyOfFPBereich"
})
public class FPBereichType
    extends XPBereichType
{

    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar versionBauNVODatum;
    protected String versionBauNVOText;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar versionBauGBDatum;
    protected String versionBauGBText;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar versionSonstRechtsgrundlageDatum;
    protected String versionSonstRechtsgrundlageText;
    @XmlElement(required = true)
    protected ReferenceType gehoertZuPlan;
    @XmlElement(name = "_GenericApplicationPropertyOfFP_Bereich")
    protected List<Object> genericApplicationPropertyOfFPBereich;

    /**
     * Ruft den Wert der versionBauNVODatum-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVersionBauNVODatum() {
        return versionBauNVODatum;
    }

    /**
     * Legt den Wert der versionBauNVODatum-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVersionBauNVODatum(XMLGregorianCalendar value) {
        this.versionBauNVODatum = value;
    }

    /**
     * Ruft den Wert der versionBauNVOText-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersionBauNVOText() {
        return versionBauNVOText;
    }

    /**
     * Legt den Wert der versionBauNVOText-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersionBauNVOText(String value) {
        this.versionBauNVOText = value;
    }

    /**
     * Ruft den Wert der versionBauGBDatum-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVersionBauGBDatum() {
        return versionBauGBDatum;
    }

    /**
     * Legt den Wert der versionBauGBDatum-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVersionBauGBDatum(XMLGregorianCalendar value) {
        this.versionBauGBDatum = value;
    }

    /**
     * Ruft den Wert der versionBauGBText-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersionBauGBText() {
        return versionBauGBText;
    }

    /**
     * Legt den Wert der versionBauGBText-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersionBauGBText(String value) {
        this.versionBauGBText = value;
    }

    /**
     * Ruft den Wert der versionSonstRechtsgrundlageDatum-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVersionSonstRechtsgrundlageDatum() {
        return versionSonstRechtsgrundlageDatum;
    }

    /**
     * Legt den Wert der versionSonstRechtsgrundlageDatum-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVersionSonstRechtsgrundlageDatum(XMLGregorianCalendar value) {
        this.versionSonstRechtsgrundlageDatum = value;
    }

    /**
     * Ruft den Wert der versionSonstRechtsgrundlageText-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersionSonstRechtsgrundlageText() {
        return versionSonstRechtsgrundlageText;
    }

    /**
     * Legt den Wert der versionSonstRechtsgrundlageText-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersionSonstRechtsgrundlageText(String value) {
        this.versionSonstRechtsgrundlageText = value;
    }

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
     * Gets the value of the genericApplicationPropertyOfFPBereich property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfFPBereich property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfFPBereich().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfFPBereich() {
        if (genericApplicationPropertyOfFPBereich == null) {
            genericApplicationPropertyOfFPBereich = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfFPBereich;
    }

}
