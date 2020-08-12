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
import net.opengis.gml._3.AngleType;
import net.opengis.gml._3.CodeType;


/**
 * Zusammenfassung von Parametern zur Festlegung der zulässigen Dachformen.
 * 
 * <p>Java-Klasse für BP_DachgestaltungType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="BP_DachgestaltungType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DNmin" type="{http://www.opengis.net/gml/3.2}AngleType" minOccurs="0"/>
 *         &lt;element name="DNmax" type="{http://www.opengis.net/gml/3.2}AngleType" minOccurs="0"/>
 *         &lt;element name="DN" type="{http://www.opengis.net/gml/3.2}AngleType" minOccurs="0"/>
 *         &lt;element name="DNzwingend" type="{http://www.opengis.net/gml/3.2}AngleType" minOccurs="0"/>
 *         &lt;element name="dachform" type="{http://www.xplanung.de/xplangml/5/1}BP_Dachform" minOccurs="0"/>
 *         &lt;element name="detaillierteDachform" type="{http://www.opengis.net/gml/3.2}CodeType" minOccurs="0"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/5/1}_GenericApplicationPropertyOfBP_Dachgestaltung" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BP_DachgestaltungType", propOrder = {
    "dNmin",
    "dNmax",
    "dn",
    "dNzwingend",
    "dachform",
    "detaillierteDachform",
    "genericApplicationPropertyOfBPDachgestaltung"
})
public class BPDachgestaltungType {

    @XmlElement(name = "DNmin")
    protected AngleType dNmin;
    @XmlElement(name = "DNmax")
    protected AngleType dNmax;
    @XmlElement(name = "DN")
    protected AngleType dn;
    @XmlElement(name = "DNzwingend")
    protected AngleType dNzwingend;
    protected String dachform;
    protected CodeType detaillierteDachform;
    @XmlElement(name = "_GenericApplicationPropertyOfBP_Dachgestaltung")
    protected List<Object> genericApplicationPropertyOfBPDachgestaltung;

    /**
     * Ruft den Wert der dNmin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AngleType }
     *     
     */
    public AngleType getDNmin() {
        return dNmin;
    }

    /**
     * Legt den Wert der dNmin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AngleType }
     *     
     */
    public void setDNmin(AngleType value) {
        this.dNmin = value;
    }

    /**
     * Ruft den Wert der dNmax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AngleType }
     *     
     */
    public AngleType getDNmax() {
        return dNmax;
    }

    /**
     * Legt den Wert der dNmax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AngleType }
     *     
     */
    public void setDNmax(AngleType value) {
        this.dNmax = value;
    }

    /**
     * Ruft den Wert der dn-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AngleType }
     *     
     */
    public AngleType getDN() {
        return dn;
    }

    /**
     * Legt den Wert der dn-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AngleType }
     *     
     */
    public void setDN(AngleType value) {
        this.dn = value;
    }

    /**
     * Ruft den Wert der dNzwingend-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AngleType }
     *     
     */
    public AngleType getDNzwingend() {
        return dNzwingend;
    }

    /**
     * Legt den Wert der dNzwingend-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AngleType }
     *     
     */
    public void setDNzwingend(AngleType value) {
        this.dNzwingend = value;
    }

    /**
     * Ruft den Wert der dachform-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDachform() {
        return dachform;
    }

    /**
     * Legt den Wert der dachform-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDachform(String value) {
        this.dachform = value;
    }

    /**
     * Ruft den Wert der detaillierteDachform-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getDetaillierteDachform() {
        return detaillierteDachform;
    }

    /**
     * Legt den Wert der detaillierteDachform-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setDetaillierteDachform(CodeType value) {
        this.detaillierteDachform = value;
    }

    /**
     * Gets the value of the genericApplicationPropertyOfBPDachgestaltung property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfBPDachgestaltung property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfBPDachgestaltung().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfBPDachgestaltung() {
        if (genericApplicationPropertyOfBPDachgestaltung == null) {
            genericApplicationPropertyOfBPDachgestaltung = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfBPDachgestaltung;
    }

}
