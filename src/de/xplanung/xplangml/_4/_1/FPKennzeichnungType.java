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


/**
 * Kennzeichnungen gemäß §5 Abs. 3 BauGB.
 * 
 * 
 * <p>Java-Klasse für FP_KennzeichnungType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FP_KennzeichnungType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/4/1}FP_GeometrieobjektType">
 *       &lt;sequence>
 *         &lt;element name="zweckbestimmung" type="{http://www.xplanung.de/xplangml/4/1}XP_ZweckbestimmungKennzeichnung" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="weitereZweckbestimmung1" type="{http://www.xplanung.de/xplangml/4/1}XP_ZweckbestimmungKennzeichnung" minOccurs="0"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/4/1}_GenericApplicationPropertyOfFP_Kennzeichnung" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FP_KennzeichnungType", propOrder = {
    "zweckbestimmung",
    "weitereZweckbestimmung1",
    "genericApplicationPropertyOfFPKennzeichnung"
})
public class FPKennzeichnungType
    extends FPGeometrieobjektType
{

    protected List<String> zweckbestimmung;
    protected String weitereZweckbestimmung1;
    @XmlElement(name = "_GenericApplicationPropertyOfFP_Kennzeichnung")
    protected List<Object> genericApplicationPropertyOfFPKennzeichnung;

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
     * {@link String }
     * 
     * 
     */
    public List<String> getZweckbestimmung() {
        if (zweckbestimmung == null) {
            zweckbestimmung = new ArrayList<String>();
        }
        return this.zweckbestimmung;
    }

    /**
     * Ruft den Wert der weitereZweckbestimmung1-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeitereZweckbestimmung1() {
        return weitereZweckbestimmung1;
    }

    /**
     * Legt den Wert der weitereZweckbestimmung1-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeitereZweckbestimmung1(String value) {
        this.weitereZweckbestimmung1 = value;
    }

    /**
     * Gets the value of the genericApplicationPropertyOfFPKennzeichnung property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfFPKennzeichnung property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfFPKennzeichnung().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfFPKennzeichnung() {
        if (genericApplicationPropertyOfFPKennzeichnung == null) {
            genericApplicationPropertyOfFPKennzeichnung = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfFPKennzeichnung;
    }

}
