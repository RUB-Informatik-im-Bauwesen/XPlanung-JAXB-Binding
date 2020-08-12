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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import net.opengis.gml._3.ReferenceType;


/**
 * Diese Klasse modelliert einen Bereich eines Bebauungsplans, z.B. eine vertikale Ebene.
 * 
 * 
 * <p>Java-Klasse für BP_BereichType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="BP_BereichType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/4/1}XP_BereichType">
 *       &lt;sequence>
 *         &lt;element name="versionBauNVO" type="{http://www.xplanung.de/xplangml/4/1}XP_VersionBauNVO" minOccurs="0"/>
 *         &lt;element name="versionBauNVOText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="versionBauGB" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="versionBauGBText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gehoertZuPlan" type="{http://www.opengis.net/gml/3.2}ReferenceType"/>
 *         &lt;element name="inhaltBPlan" type="{http://www.opengis.net/gml/3.2}ReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="rasterAenderung" type="{http://www.opengis.net/gml/3.2}ReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/4/1}_GenericApplicationPropertyOfBP_Bereich" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BP_BereichType", propOrder = {
    "versionBauNVO",
    "versionBauNVOText",
    "versionBauGB",
    "versionBauGBText",
    "gehoertZuPlan",
    "inhaltBPlan",
    "rasterAenderung",
    "genericApplicationPropertyOfBPBereich"
})
public class BPBereichType
    extends XPBereichType
{

    protected String versionBauNVO;
    protected String versionBauNVOText;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar versionBauGB;
    protected String versionBauGBText;
    @XmlElement(required = true)
    protected ReferenceType gehoertZuPlan;
    protected List<ReferenceType> inhaltBPlan;
    protected List<ReferenceType> rasterAenderung;
    @XmlElement(name = "_GenericApplicationPropertyOfBP_Bereich")
    protected List<Object> genericApplicationPropertyOfBPBereich;

    /**
     * Ruft den Wert der versionBauNVO-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersionBauNVO() {
        return versionBauNVO;
    }

    /**
     * Legt den Wert der versionBauNVO-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersionBauNVO(String value) {
        this.versionBauNVO = value;
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
     * Ruft den Wert der versionBauGB-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVersionBauGB() {
        return versionBauGB;
    }

    /**
     * Legt den Wert der versionBauGB-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVersionBauGB(XMLGregorianCalendar value) {
        this.versionBauGB = value;
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
     * Gets the value of the inhaltBPlan property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inhaltBPlan property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInhaltBPlan().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenceType }
     * 
     * 
     */
    public List<ReferenceType> getInhaltBPlan() {
        if (inhaltBPlan == null) {
            inhaltBPlan = new ArrayList<ReferenceType>();
        }
        return this.inhaltBPlan;
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
     * Gets the value of the genericApplicationPropertyOfBPBereich property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfBPBereich property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfBPBereich().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfBPBereich() {
        if (genericApplicationPropertyOfBPBereich == null) {
            genericApplicationPropertyOfBPBereich = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfBPBereich;
    }

}
