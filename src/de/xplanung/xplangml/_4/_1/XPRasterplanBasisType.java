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
import net.opengis.gml._3.AbstractFeatureType;


/**
 * Georeferenzierte Rasterdarstellung eines Plans. Das über refScan referierte Rasterbild zeigt den Basisplan, dessen Geltungsbereich durch den Geltungsbereich des Gesamtplans (Attribut geltungsbereich von XP_Plan) repräsentiert ist. Diesem Basisplan können Änderungen überlagert sein, denen jeweils eigene Rasterbilder und Geltungsbereiche zugeordnet sind (XP_RasterplanAenderung und abgeleitete Klassen).
 * 
 * Im Standard sind nur georeferenzierte Rasterpläne zugelassen. Die über refScan referierte externe Referenz muss deshalb entweder vom Typ "PlanMitGeoreferenz" sein oder einen WMS-Request enthalten.
 * 
 * 
 * <p>Java-Klasse für XP_RasterplanBasisType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="XP_RasterplanBasisType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractFeatureType">
 *       &lt;sequence>
 *         &lt;element name="refScan" type="{http://www.xplanung.de/xplangml/4/1}XP_ExterneReferenzPropertyType" maxOccurs="unbounded"/>
 *         &lt;element name="refText" type="{http://www.xplanung.de/xplangml/4/1}XP_ExterneReferenzPropertyType" minOccurs="0"/>
 *         &lt;element name="refLegende" type="{http://www.xplanung.de/xplangml/4/1}XP_ExterneReferenzPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/4/1}_GenericApplicationPropertyOfXP_RasterplanBasis" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XP_RasterplanBasisType", propOrder = {
    "refScan",
    "refText",
    "refLegende",
    "genericApplicationPropertyOfXPRasterplanBasis"
})
public class XPRasterplanBasisType
    extends AbstractFeatureType
{

    @XmlElement(required = true)
    protected List<XPExterneReferenzPropertyType> refScan;
    protected XPExterneReferenzPropertyType refText;
    protected List<XPExterneReferenzPropertyType> refLegende;
    @XmlElement(name = "_GenericApplicationPropertyOfXP_RasterplanBasis")
    protected List<Object> genericApplicationPropertyOfXPRasterplanBasis;

    /**
     * Gets the value of the refScan property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refScan property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefScan().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XPExterneReferenzPropertyType }
     * 
     * 
     */
    public List<XPExterneReferenzPropertyType> getRefScan() {
        if (refScan == null) {
            refScan = new ArrayList<XPExterneReferenzPropertyType>();
        }
        return this.refScan;
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
     * Gets the value of the refLegende property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refLegende property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefLegende().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XPExterneReferenzPropertyType }
     * 
     * 
     */
    public List<XPExterneReferenzPropertyType> getRefLegende() {
        if (refLegende == null) {
            refLegende = new ArrayList<XPExterneReferenzPropertyType>();
        }
        return this.refLegende;
    }

    /**
     * Gets the value of the genericApplicationPropertyOfXPRasterplanBasis property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfXPRasterplanBasis property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfXPRasterplanBasis().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfXPRasterplanBasis() {
        if (genericApplicationPropertyOfXPRasterplanBasis == null) {
            genericApplicationPropertyOfXPRasterplanBasis = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfXPRasterplanBasis;
    }

}