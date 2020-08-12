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
import net.opengis.gml._3.CodeType;


/**
 * Darstellung von Flächen für den überörtlichen Verkehr und für die örtlichen Hauptverkehrszüge ( §5, Abs. 2, Nr. 3 BauGB).
 * 
 * 
 * <p>Java-Klasse für FP_StrassenverkehrType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FP_StrassenverkehrType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/4/1}FP_GeometrieobjektType">
 *       &lt;sequence>
 *         &lt;element name="zweckbestimmung" type="{http://www.xplanung.de/xplangml/4/1}FP_ZweckbestimmungStrassenverkehr" minOccurs="0"/>
 *         &lt;element name="besondereZweckbestimmung" type="{http://www.xplanung.de/xplangml/4/1}FP_BesondereZweckbestimmungStrassenverkehr" minOccurs="0"/>
 *         &lt;element name="detaillierteZweckbestimmung" type="{http://www.opengis.net/gml/3.2}CodeType" minOccurs="0"/>
 *         &lt;element name="nutzungsform" type="{http://www.xplanung.de/xplangml/4/1}XP_Nutzungsform" minOccurs="0"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/4/1}_GenericApplicationPropertyOfFP_Strassenverkehr" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FP_StrassenverkehrType", propOrder = {
    "zweckbestimmung",
    "besondereZweckbestimmung",
    "detaillierteZweckbestimmung",
    "nutzungsform",
    "genericApplicationPropertyOfFPStrassenverkehr"
})
public class FPStrassenverkehrType
    extends FPGeometrieobjektType
{

    protected String zweckbestimmung;
    protected String besondereZweckbestimmung;
    protected CodeType detaillierteZweckbestimmung;
    protected String nutzungsform;
    @XmlElement(name = "_GenericApplicationPropertyOfFP_Strassenverkehr")
    protected List<Object> genericApplicationPropertyOfFPStrassenverkehr;

    /**
     * Ruft den Wert der zweckbestimmung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZweckbestimmung() {
        return zweckbestimmung;
    }

    /**
     * Legt den Wert der zweckbestimmung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZweckbestimmung(String value) {
        this.zweckbestimmung = value;
    }

    /**
     * Ruft den Wert der besondereZweckbestimmung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBesondereZweckbestimmung() {
        return besondereZweckbestimmung;
    }

    /**
     * Legt den Wert der besondereZweckbestimmung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBesondereZweckbestimmung(String value) {
        this.besondereZweckbestimmung = value;
    }

    /**
     * Ruft den Wert der detaillierteZweckbestimmung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getDetaillierteZweckbestimmung() {
        return detaillierteZweckbestimmung;
    }

    /**
     * Legt den Wert der detaillierteZweckbestimmung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setDetaillierteZweckbestimmung(CodeType value) {
        this.detaillierteZweckbestimmung = value;
    }

    /**
     * Ruft den Wert der nutzungsform-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNutzungsform() {
        return nutzungsform;
    }

    /**
     * Legt den Wert der nutzungsform-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNutzungsform(String value) {
        this.nutzungsform = value;
    }

    /**
     * Gets the value of the genericApplicationPropertyOfFPStrassenverkehr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfFPStrassenverkehr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfFPStrassenverkehr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfFPStrassenverkehr() {
        if (genericApplicationPropertyOfFPStrassenverkehr == null) {
            genericApplicationPropertyOfFPStrassenverkehr = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfFPStrassenverkehr;
    }

}
