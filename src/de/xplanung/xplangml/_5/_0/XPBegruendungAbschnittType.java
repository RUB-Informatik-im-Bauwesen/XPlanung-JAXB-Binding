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
import net.opengis.gml._3.AbstractFeatureType;


/**
 * Ein Abschnitt der Begründung des Plans.
 * 
 * <p>Java-Klasse für XP_BegruendungAbschnittType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="XP_BegruendungAbschnittType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractFeatureType">
 *       &lt;sequence>
 *         &lt;element name="schluessel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="refText" type="{http://www.xplanung.de/xplangml/5/0}XP_ExterneReferenzPropertyType" minOccurs="0"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/5/0}_GenericApplicationPropertyOfXP_BegruendungAbschnitt" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XP_BegruendungAbschnittType", propOrder = {
    "schluessel",
    "text",
    "refText",
    "genericApplicationPropertyOfXPBegruendungAbschnitt"
})
public class XPBegruendungAbschnittType
    extends AbstractFeatureType
{

    protected String schluessel;
    protected String text;
    protected XPExterneReferenzPropertyType refText;
    @XmlElement(name = "_GenericApplicationPropertyOfXP_BegruendungAbschnitt")
    protected List<Object> genericApplicationPropertyOfXPBegruendungAbschnitt;

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
     * Gets the value of the genericApplicationPropertyOfXPBegruendungAbschnitt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfXPBegruendungAbschnitt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfXPBegruendungAbschnitt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfXPBegruendungAbschnitt() {
        if (genericApplicationPropertyOfXPBegruendungAbschnitt == null) {
            genericApplicationPropertyOfXPBegruendungAbschnitt = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfXPBegruendungAbschnitt;
    }

}
