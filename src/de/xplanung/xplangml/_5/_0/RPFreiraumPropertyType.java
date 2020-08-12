//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.06.04 um 02:29:48 PM CEST 
//


package de.xplanung.xplangml._5._0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.w3._1999.xlink.ActuateType;
import org.w3._1999.xlink.ShowType;
import org.w3._1999.xlink.TypeType;


/**
 * <p>Java-Klasse für RP_FreiraumPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RP_FreiraumPropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/5/0}RP_Freiraum" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opengis.net/gml/3.2}AssociationAttributeGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RP_FreiraumPropertyType", propOrder = {
    "rpFreiraum"
})
public class RPFreiraumPropertyType {

    @XmlElementRef(name = "RP_Freiraum", namespace = "http://www.xplanung.de/xplangml/5/0", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends RPFreiraumType> rpFreiraum;
    @XmlAttribute(name = "nilReason")
    protected List<String> nilReason;
    @XmlAttribute(name = "type", namespace = "http://www.w3.org/1999/xlink")
    protected TypeType type;
    @XmlAttribute(name = "href", namespace = "http://www.w3.org/1999/xlink")
    protected String href;
    @XmlAttribute(name = "role", namespace = "http://www.w3.org/1999/xlink")
    protected String role;
    @XmlAttribute(name = "arcrole", namespace = "http://www.w3.org/1999/xlink")
    protected String arcrole;
    @XmlAttribute(name = "title", namespace = "http://www.w3.org/1999/xlink")
    protected String title;
    @XmlAttribute(name = "show", namespace = "http://www.w3.org/1999/xlink")
    protected ShowType show;
    @XmlAttribute(name = "actuate", namespace = "http://www.w3.org/1999/xlink")
    protected ActuateType actuate;

    /**
     * Ruft den Wert der rpFreiraum-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RPHochwasserschutzType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPForstwirtschaftType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPGruenzugGruenzaesurType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPRadwegWanderwegType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPRohstoffType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPGewaesserType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPWasserschutzType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPFreiraumType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPSonstigerFreiraumschutzType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPBodenschutzType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPNaturschutzrechtlichesSchutzgebietType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPKlimaschutzType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPSportanlageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPLandwirtschaftType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPKulturlandschaftType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPNaturLandschaftType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPErneuerbareEnergieType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPErholungType }{@code >}
     *     
     */
    public JAXBElement<? extends RPFreiraumType> getRPFreiraum() {
        return rpFreiraum;
    }

    /**
     * Legt den Wert der rpFreiraum-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RPHochwasserschutzType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPForstwirtschaftType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPGruenzugGruenzaesurType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPRadwegWanderwegType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPRohstoffType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPGewaesserType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPWasserschutzType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPFreiraumType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPSonstigerFreiraumschutzType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPBodenschutzType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPNaturschutzrechtlichesSchutzgebietType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPKlimaschutzType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPSportanlageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPLandwirtschaftType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPKulturlandschaftType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPNaturLandschaftType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPErneuerbareEnergieType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RPErholungType }{@code >}
     *     
     */
    public void setRPFreiraum(JAXBElement<? extends RPFreiraumType> value) {
        this.rpFreiraum = value;
    }

    /**
     * Gets the value of the nilReason property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nilReason property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNilReason().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNilReason() {
        if (nilReason == null) {
            nilReason = new ArrayList<String>();
        }
        return this.nilReason;
    }

    /**
     * Ruft den Wert der type-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TypeType }
     *     
     */
    public TypeType getType() {
        if (type == null) {
            return TypeType.SIMPLE;
        } else {
            return type;
        }
    }

    /**
     * Legt den Wert der type-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeType }
     *     
     */
    public void setType(TypeType value) {
        this.type = value;
    }

    /**
     * Ruft den Wert der href-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHref() {
        return href;
    }

    /**
     * Legt den Wert der href-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHref(String value) {
        this.href = value;
    }

    /**
     * Ruft den Wert der role-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRole() {
        return role;
    }

    /**
     * Legt den Wert der role-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRole(String value) {
        this.role = value;
    }

    /**
     * Ruft den Wert der arcrole-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArcrole() {
        return arcrole;
    }

    /**
     * Legt den Wert der arcrole-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArcrole(String value) {
        this.arcrole = value;
    }

    /**
     * Ruft den Wert der title-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Legt den Wert der title-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Ruft den Wert der show-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ShowType }
     *     
     */
    public ShowType getShow() {
        return show;
    }

    /**
     * Legt den Wert der show-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ShowType }
     *     
     */
    public void setShow(ShowType value) {
        this.show = value;
    }

    /**
     * Ruft den Wert der actuate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ActuateType }
     *     
     */
    public ActuateType getActuate() {
        return actuate;
    }

    /**
     * Legt den Wert der actuate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ActuateType }
     *     
     */
    public void setActuate(ActuateType value) {
        this.actuate = value;
    }

}
