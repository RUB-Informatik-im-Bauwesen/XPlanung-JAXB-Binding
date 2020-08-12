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
import net.opengis.gml._3.AbstractFeatureType;
import net.opengis.gml._3.ReferenceType;


/**
 * Die Klasse RP_Legendenobjekt enthält Daten zur Legende und Darstellung im Ursprungsplan.
 * 
 * <p>Java-Klasse für RP_LegendenobjektType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RP_LegendenobjektType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractFeatureType">
 *       &lt;sequence>
 *         &lt;element name="legendenBezeichnung" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="reflegendenBild" type="{http://www.xplanung.de/xplangml/5/1}XP_ExterneReferenzPropertyType"/>
 *         &lt;element name="gehoertZuPraesentationsobjekt" type="{http://www.opengis.net/gml/3.2}ReferenceType" minOccurs="0"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/5/1}_GenericApplicationPropertyOfRP_Legendenobjekt" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RP_LegendenobjektType", propOrder = {
    "legendenBezeichnung",
    "reflegendenBild",
    "gehoertZuPraesentationsobjekt",
    "genericApplicationPropertyOfRPLegendenobjekt"
})
public class RPLegendenobjektType
    extends AbstractFeatureType
{

    @XmlElement(required = true)
    protected String legendenBezeichnung;
    @XmlElement(required = true)
    protected XPExterneReferenzPropertyType reflegendenBild;
    protected ReferenceType gehoertZuPraesentationsobjekt;
    @XmlElement(name = "_GenericApplicationPropertyOfRP_Legendenobjekt")
    protected List<Object> genericApplicationPropertyOfRPLegendenobjekt;

    /**
     * Ruft den Wert der legendenBezeichnung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegendenBezeichnung() {
        return legendenBezeichnung;
    }

    /**
     * Legt den Wert der legendenBezeichnung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegendenBezeichnung(String value) {
        this.legendenBezeichnung = value;
    }

    /**
     * Ruft den Wert der reflegendenBild-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XPExterneReferenzPropertyType }
     *     
     */
    public XPExterneReferenzPropertyType getReflegendenBild() {
        return reflegendenBild;
    }

    /**
     * Legt den Wert der reflegendenBild-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XPExterneReferenzPropertyType }
     *     
     */
    public void setReflegendenBild(XPExterneReferenzPropertyType value) {
        this.reflegendenBild = value;
    }

    /**
     * Ruft den Wert der gehoertZuPraesentationsobjekt-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getGehoertZuPraesentationsobjekt() {
        return gehoertZuPraesentationsobjekt;
    }

    /**
     * Legt den Wert der gehoertZuPraesentationsobjekt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setGehoertZuPraesentationsobjekt(ReferenceType value) {
        this.gehoertZuPraesentationsobjekt = value;
    }

    /**
     * Gets the value of the genericApplicationPropertyOfRPLegendenobjekt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfRPLegendenobjekt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfRPLegendenobjekt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfRPLegendenobjekt() {
        if (genericApplicationPropertyOfRPLegendenobjekt == null) {
            genericApplicationPropertyOfRPLegendenobjekt = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfRPLegendenobjekt;
    }

}
