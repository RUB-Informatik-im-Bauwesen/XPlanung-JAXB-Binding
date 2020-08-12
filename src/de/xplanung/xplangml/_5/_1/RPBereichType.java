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
 * Die Klasse RP_Bereich modelliert einen Bereich eines Raumordnungsplans. Bereiche strukturieren Pläne räumlich und inhaltlich.
 * 
 * <p>Java-Klasse für RP_BereichType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RP_BereichType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/5/1}XP_BereichType">
 *       &lt;sequence>
 *         &lt;element name="versionBROG" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="versionBROGText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="versionLPLG" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="versionLPLGText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="geltungsmassstab" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="gehoertZuPlan" type="{http://www.opengis.net/gml/3.2}ReferenceType"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/5/1}_GenericApplicationPropertyOfRP_Bereich" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RP_BereichType", propOrder = {
    "versionBROG",
    "versionBROGText",
    "versionLPLG",
    "versionLPLGText",
    "geltungsmassstab",
    "gehoertZuPlan",
    "genericApplicationPropertyOfRPBereich"
})
public class RPBereichType
    extends XPBereichType
{

    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar versionBROG;
    protected String versionBROGText;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar versionLPLG;
    protected String versionLPLGText;
    protected Integer geltungsmassstab;
    @XmlElement(required = true)
    protected ReferenceType gehoertZuPlan;
    @XmlElement(name = "_GenericApplicationPropertyOfRP_Bereich")
    protected List<Object> genericApplicationPropertyOfRPBereich;

    /**
     * Ruft den Wert der versionBROG-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVersionBROG() {
        return versionBROG;
    }

    /**
     * Legt den Wert der versionBROG-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVersionBROG(XMLGregorianCalendar value) {
        this.versionBROG = value;
    }

    /**
     * Ruft den Wert der versionBROGText-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersionBROGText() {
        return versionBROGText;
    }

    /**
     * Legt den Wert der versionBROGText-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersionBROGText(String value) {
        this.versionBROGText = value;
    }

    /**
     * Ruft den Wert der versionLPLG-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVersionLPLG() {
        return versionLPLG;
    }

    /**
     * Legt den Wert der versionLPLG-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVersionLPLG(XMLGregorianCalendar value) {
        this.versionLPLG = value;
    }

    /**
     * Ruft den Wert der versionLPLGText-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersionLPLGText() {
        return versionLPLGText;
    }

    /**
     * Legt den Wert der versionLPLGText-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersionLPLGText(String value) {
        this.versionLPLGText = value;
    }

    /**
     * Ruft den Wert der geltungsmassstab-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGeltungsmassstab() {
        return geltungsmassstab;
    }

    /**
     * Legt den Wert der geltungsmassstab-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGeltungsmassstab(Integer value) {
        this.geltungsmassstab = value;
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
     * Gets the value of the genericApplicationPropertyOfRPBereich property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfRPBereich property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfRPBereich().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfRPBereich() {
        if (genericApplicationPropertyOfRPBereich == null) {
            genericApplicationPropertyOfRPBereich = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfRPBereich;
    }

}
