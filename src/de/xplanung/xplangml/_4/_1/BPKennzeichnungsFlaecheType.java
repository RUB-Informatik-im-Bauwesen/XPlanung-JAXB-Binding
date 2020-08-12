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
 * Flächen für Kennzeichnungen gemäß §9 Abs. 5 BauGB.
 * 
 * 
 * <p>Java-Klasse für BP_KennzeichnungsFlaecheType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="BP_KennzeichnungsFlaecheType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/4/1}BP_FlaechenobjektType">
 *       &lt;sequence>
 *         &lt;element name="zweckbestimmung" type="{http://www.xplanung.de/xplangml/4/1}XP_ZweckbestimmungKennzeichnung" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="weitereZweckbestimmung" type="{http://www.xplanung.de/xplangml/4/1}XP_ZweckbestimmungKennzeichnung" minOccurs="0"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/4/1}_GenericApplicationPropertyOfBP_KennzeichnungsFlaeche" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BP_KennzeichnungsFlaecheType", propOrder = {
    "zweckbestimmung",
    "weitereZweckbestimmung",
    "genericApplicationPropertyOfBPKennzeichnungsFlaeche"
})
public class BPKennzeichnungsFlaecheType
    extends BPFlaechenobjektType
{

    protected List<String> zweckbestimmung;
    protected String weitereZweckbestimmung;
    @XmlElement(name = "_GenericApplicationPropertyOfBP_KennzeichnungsFlaeche")
    protected List<Object> genericApplicationPropertyOfBPKennzeichnungsFlaeche;

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
     * Ruft den Wert der weitereZweckbestimmung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeitereZweckbestimmung() {
        return weitereZweckbestimmung;
    }

    /**
     * Legt den Wert der weitereZweckbestimmung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeitereZweckbestimmung(String value) {
        this.weitereZweckbestimmung = value;
    }

    /**
     * Gets the value of the genericApplicationPropertyOfBPKennzeichnungsFlaeche property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfBPKennzeichnungsFlaeche property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfBPKennzeichnungsFlaeche().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfBPKennzeichnungsFlaeche() {
        if (genericApplicationPropertyOfBPKennzeichnungsFlaeche == null) {
            genericApplicationPropertyOfBPKennzeichnungsFlaeche = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfBPKennzeichnungsFlaeche;
    }

}
