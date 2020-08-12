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
import net.opengis.gml._3.CodeType;
import net.opengis.gml._3.LengthType;


/**
 * Festsetzung der speziellen Bauweise / baulichen Besonderheit eines Gebäudes oder Bauwerks.
 * 
 * <p>Java-Klasse für BP_SpezielleBauweiseType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="BP_SpezielleBauweiseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/5/0}BP_UeberlagerungsobjektType">
 *       &lt;sequence>
 *         &lt;element name="typ" type="{http://www.xplanung.de/xplangml/5/0}BP_SpezielleBauweiseTypen" minOccurs="0"/>
 *         &lt;element name="sonstTyp" type="{http://www.opengis.net/gml/3.2}CodeType" minOccurs="0"/>
 *         &lt;element name="Bmin" type="{http://www.opengis.net/gml/3.2}LengthType" minOccurs="0"/>
 *         &lt;element name="Bmax" type="{http://www.opengis.net/gml/3.2}LengthType" minOccurs="0"/>
 *         &lt;element name="Tmin" type="{http://www.opengis.net/gml/3.2}LengthType" minOccurs="0"/>
 *         &lt;element name="Tmax" type="{http://www.opengis.net/gml/3.2}LengthType" minOccurs="0"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/5/0}_GenericApplicationPropertyOfBP_SpezielleBauweise" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BP_SpezielleBauweiseType", propOrder = {
    "typ",
    "sonstTyp",
    "bmin",
    "bmax",
    "tmin",
    "tmax",
    "genericApplicationPropertyOfBPSpezielleBauweise"
})
public class BPSpezielleBauweiseType
    extends BPUeberlagerungsobjektType
{

    protected String typ;
    protected CodeType sonstTyp;
    @XmlElement(name = "Bmin")
    protected LengthType bmin;
    @XmlElement(name = "Bmax")
    protected LengthType bmax;
    @XmlElement(name = "Tmin")
    protected LengthType tmin;
    @XmlElement(name = "Tmax")
    protected LengthType tmax;
    @XmlElement(name = "_GenericApplicationPropertyOfBP_SpezielleBauweise")
    protected List<Object> genericApplicationPropertyOfBPSpezielleBauweise;

    /**
     * Ruft den Wert der typ-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTyp() {
        return typ;
    }

    /**
     * Legt den Wert der typ-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTyp(String value) {
        this.typ = value;
    }

    /**
     * Ruft den Wert der sonstTyp-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getSonstTyp() {
        return sonstTyp;
    }

    /**
     * Legt den Wert der sonstTyp-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setSonstTyp(CodeType value) {
        this.sonstTyp = value;
    }

    /**
     * Ruft den Wert der bmin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getBmin() {
        return bmin;
    }

    /**
     * Legt den Wert der bmin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setBmin(LengthType value) {
        this.bmin = value;
    }

    /**
     * Ruft den Wert der bmax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getBmax() {
        return bmax;
    }

    /**
     * Legt den Wert der bmax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setBmax(LengthType value) {
        this.bmax = value;
    }

    /**
     * Ruft den Wert der tmin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getTmin() {
        return tmin;
    }

    /**
     * Legt den Wert der tmin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setTmin(LengthType value) {
        this.tmin = value;
    }

    /**
     * Ruft den Wert der tmax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getTmax() {
        return tmax;
    }

    /**
     * Legt den Wert der tmax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setTmax(LengthType value) {
        this.tmax = value;
    }

    /**
     * Gets the value of the genericApplicationPropertyOfBPSpezielleBauweise property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfBPSpezielleBauweise property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfBPSpezielleBauweise().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfBPSpezielleBauweise() {
        if (genericApplicationPropertyOfBPSpezielleBauweise == null) {
            genericApplicationPropertyOfBPSpezielleBauweise = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfBPSpezielleBauweise;
    }

}
