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


/**
 * Klasse zur Modellierung aller Inhalte des Landschaftsplans, die durch keine spezifische XPlanung-Klasse repräsentiert werden können.
 * 
 * <p>Java-Klasse für LP_GenerischesObjektType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="LP_GenerischesObjektType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/5/0}LP_GeometrieobjektType">
 *       &lt;sequence>
 *         &lt;element name="zweckbestimmung" type="{http://www.opengis.net/gml/3.2}CodeType" minOccurs="0"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/5/0}_GenericApplicationPropertyOfLP_GenerischesObjekt" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LP_GenerischesObjektType", propOrder = {
    "zweckbestimmung",
    "genericApplicationPropertyOfLPGenerischesObjekt"
})
public class LPGenerischesObjektType
    extends LPGeometrieobjektType
{

    protected CodeType zweckbestimmung;
    @XmlElement(name = "_GenericApplicationPropertyOfLP_GenerischesObjekt")
    protected List<Object> genericApplicationPropertyOfLPGenerischesObjekt;

    /**
     * Ruft den Wert der zweckbestimmung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getZweckbestimmung() {
        return zweckbestimmung;
    }

    /**
     * Legt den Wert der zweckbestimmung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setZweckbestimmung(CodeType value) {
        this.zweckbestimmung = value;
    }

    /**
     * Gets the value of the genericApplicationPropertyOfLPGenerischesObjekt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfLPGenerischesObjekt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfLPGenerischesObjekt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfLPGenerischesObjekt() {
        if (genericApplicationPropertyOfLPGenerischesObjekt == null) {
            genericApplicationPropertyOfLPGenerischesObjekt = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfLPGenerischesObjekt;
    }

}
