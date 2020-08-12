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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml._3.AbstractFeatureType;


/**
 * Ein Abschnitt der textlich formulierten Inhalte  des Plans.
 * 
 * <p>Java-Klasse für XP_TextAbschnittType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="XP_TextAbschnittType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractFeatureType">
 *       &lt;sequence>
 *         &lt;element name="schluessel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gesetzlicheGrundlage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="refText" type="{http://www.xplanung.de/xplangml/4/1}XP_ExterneReferenzPropertyType" minOccurs="0"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/4/1}_GenericApplicationPropertyOfXP_TextAbschnitt" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XP_TextAbschnittType", propOrder = {
    "schluessel",
    "gesetzlicheGrundlage",
    "text",
    "refText",
    "genericApplicationPropertyOfXPTextAbschnitt"
})
@XmlSeeAlso({
    RPTextAbschnittType.class,
    SOTextAbschnittType.class,
    BPTextAbschnittType.class,
    FPTextAbschnittType.class,
    LPTextAbschnittType.class
})
public class XPTextAbschnittType
    extends AbstractFeatureType
{

    protected String schluessel;
    protected String gesetzlicheGrundlage;
    protected String text;
    protected XPExterneReferenzPropertyType refText;
    @XmlElement(name = "_GenericApplicationPropertyOfXP_TextAbschnitt")
    protected List<Object> genericApplicationPropertyOfXPTextAbschnitt;

    /**
     * Ruft den Wert der schluessel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchluessel() {
        return schluessel;
    }

    /**
     * Legt den Wert der schluessel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchluessel(String value) {
        this.schluessel = value;
    }

    /**
     * Ruft den Wert der gesetzlicheGrundlage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGesetzlicheGrundlage() {
        return gesetzlicheGrundlage;
    }

    /**
     * Legt den Wert der gesetzlicheGrundlage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGesetzlicheGrundlage(String value) {
        this.gesetzlicheGrundlage = value;
    }

    /**
     * Ruft den Wert der text-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Legt den Wert der text-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
    }

    /**
     * Ruft den Wert der refText-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XPExterneReferenzPropertyType }
     *     
     */
    public XPExterneReferenzPropertyType getRefText() {
        return refText;
    }

    /**
     * Legt den Wert der refText-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XPExterneReferenzPropertyType }
     *     
     */
    public void setRefText(XPExterneReferenzPropertyType value) {
        this.refText = value;
    }

    /**
     * Gets the value of the genericApplicationPropertyOfXPTextAbschnitt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfXPTextAbschnitt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfXPTextAbschnitt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfXPTextAbschnitt() {
        if (genericApplicationPropertyOfXPTextAbschnitt == null) {
            genericApplicationPropertyOfXPTextAbschnitt = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfXPTextAbschnitt;
    }

}
