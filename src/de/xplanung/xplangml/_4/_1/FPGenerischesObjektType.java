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
 * Klasse zur Modellierung aller Inhalte des FPlans, die keine nachrichtliche Übernahmen aus anderen Rechts-bereichen sind, aber durch keine andere Klasse des FPlan-Fachschemas dargestellt werden können.
 * 
 * 
 * <p>Java-Klasse für FP_GenerischesObjektType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FP_GenerischesObjektType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/4/1}FP_GeometrieobjektType">
 *       &lt;sequence>
 *         &lt;element name="zweckbestimmung" type="{http://www.opengis.net/gml/3.2}CodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="weitereZweckbestimmung1" type="{http://www.opengis.net/gml/3.2}CodeType" minOccurs="0"/>
 *         &lt;element name="weitereZweckbestimmung2" type="{http://www.opengis.net/gml/3.2}CodeType" minOccurs="0"/>
 *         &lt;element name="weitereZweckbestimmung3" type="{http://www.opengis.net/gml/3.2}CodeType" minOccurs="0"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/4/1}_GenericApplicationPropertyOfFP_GenerischesObjekt" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FP_GenerischesObjektType", propOrder = {
    "zweckbestimmung",
    "weitereZweckbestimmung1",
    "weitereZweckbestimmung2",
    "weitereZweckbestimmung3",
    "genericApplicationPropertyOfFPGenerischesObjekt"
})
public class FPGenerischesObjektType
    extends FPGeometrieobjektType
{

    protected List<CodeType> zweckbestimmung;
    protected CodeType weitereZweckbestimmung1;
    protected CodeType weitereZweckbestimmung2;
    protected CodeType weitereZweckbestimmung3;
    @XmlElement(name = "_GenericApplicationPropertyOfFP_GenerischesObjekt")
    protected List<Object> genericApplicationPropertyOfFPGenerischesObjekt;

    /**
     * Gets the value of the zweckbestimmung property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zweckbestimmung property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZweckbestimmung().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeType }
     * 
     * 
     */
    public List<CodeType> getZweckbestimmung() {
        if (zweckbestimmung == null) {
            zweckbestimmung = new ArrayList<CodeType>();
        }
        return this.zweckbestimmung;
    }

    /**
     * Ruft den Wert der weitereZweckbestimmung1-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getWeitereZweckbestimmung1() {
        return weitereZweckbestimmung1;
    }

    /**
     * Legt den Wert der weitereZweckbestimmung1-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setWeitereZweckbestimmung1(CodeType value) {
        this.weitereZweckbestimmung1 = value;
    }

    /**
     * Ruft den Wert der weitereZweckbestimmung2-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getWeitereZweckbestimmung2() {
        return weitereZweckbestimmung2;
    }

    /**
     * Legt den Wert der weitereZweckbestimmung2-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setWeitereZweckbestimmung2(CodeType value) {
        this.weitereZweckbestimmung2 = value;
    }

    /**
     * Ruft den Wert der weitereZweckbestimmung3-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getWeitereZweckbestimmung3() {
        return weitereZweckbestimmung3;
    }

    /**
     * Legt den Wert der weitereZweckbestimmung3-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setWeitereZweckbestimmung3(CodeType value) {
        this.weitereZweckbestimmung3 = value;
    }

    /**
     * Gets the value of the genericApplicationPropertyOfFPGenerischesObjekt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfFPGenerischesObjekt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfFPGenerischesObjekt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfFPGenerischesObjekt() {
        if (genericApplicationPropertyOfFPGenerischesObjekt == null) {
            genericApplicationPropertyOfFPGenerischesObjekt = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfFPGenerischesObjekt;
    }

}
