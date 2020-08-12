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
 * Flächen für die Wasserwirtschaft, den Hochwasserschutz  und die Regelungen des Wasserabflusses (§9 Abs. 1 Nr. 16 und Abs. 6a BauGB).
 * 
 * 
 * <p>Java-Klasse für BP_WasserwirtschaftsFlaecheType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="BP_WasserwirtschaftsFlaecheType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/5/0}BP_FlaechenobjektType">
 *       &lt;sequence>
 *         &lt;element name="zweckbestimmung" type="{http://www.xplanung.de/xplangml/5/0}XP_ZweckbestimmungWasserwirtschaft" minOccurs="0"/>
 *         &lt;element name="detaillierteZweckbestimmung" type="{http://www.opengis.net/gml/3.2}CodeType" minOccurs="0"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/5/0}_GenericApplicationPropertyOfBP_WasserwirtschaftsFlaeche" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BP_WasserwirtschaftsFlaecheType", propOrder = {
    "zweckbestimmung",
    "detaillierteZweckbestimmung",
    "genericApplicationPropertyOfBPWasserwirtschaftsFlaeche"
})
public class BPWasserwirtschaftsFlaecheType
    extends BPFlaechenobjektType
{

    protected String zweckbestimmung;
    protected CodeType detaillierteZweckbestimmung;
    @XmlElement(name = "_GenericApplicationPropertyOfBP_WasserwirtschaftsFlaeche")
    protected List<Object> genericApplicationPropertyOfBPWasserwirtschaftsFlaeche;

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
     * Gets the value of the genericApplicationPropertyOfBPWasserwirtschaftsFlaeche property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfBPWasserwirtschaftsFlaeche property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfBPWasserwirtschaftsFlaeche().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfBPWasserwirtschaftsFlaeche() {
        if (genericApplicationPropertyOfBPWasserwirtschaftsFlaeche == null) {
            genericApplicationPropertyOfBPWasserwirtschaftsFlaeche = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfBPWasserwirtschaftsFlaeche;
    }

}
