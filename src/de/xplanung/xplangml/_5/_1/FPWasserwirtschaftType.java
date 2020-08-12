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
import net.opengis.gml._3.CodeType;


/**
 * Flächen für den vorbeugenden Hochwasserschutz  (§5, Abs. 2, Nr. 7 BauGB)
 * 
 * <p>Java-Klasse für FP_WasserwirtschaftType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FP_WasserwirtschaftType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/5/1}FP_GeometrieobjektType">
 *       &lt;sequence>
 *         &lt;element name="zweckbestimmung" type="{http://www.xplanung.de/xplangml/5/1}XP_ZweckbestimmungWasserwirtschaft" minOccurs="0"/>
 *         &lt;element name="detaillierteZweckbestimmung" type="{http://www.opengis.net/gml/3.2}CodeType" minOccurs="0"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/5/1}_GenericApplicationPropertyOfFP_Wasserwirtschaft" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FP_WasserwirtschaftType", propOrder = {
    "zweckbestimmung",
    "detaillierteZweckbestimmung",
    "genericApplicationPropertyOfFPWasserwirtschaft"
})
public class FPWasserwirtschaftType
    extends FPGeometrieobjektType
{

    protected String zweckbestimmung;
    protected CodeType detaillierteZweckbestimmung;
    @XmlElement(name = "_GenericApplicationPropertyOfFP_Wasserwirtschaft")
    protected List<Object> genericApplicationPropertyOfFPWasserwirtschaft;

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
     * Gets the value of the genericApplicationPropertyOfFPWasserwirtschaft property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfFPWasserwirtschaft property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfFPWasserwirtschaft().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfFPWasserwirtschaft() {
        if (genericApplicationPropertyOfFPWasserwirtschaft == null) {
            genericApplicationPropertyOfFPWasserwirtschaft = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfFPWasserwirtschaft;
    }

}
