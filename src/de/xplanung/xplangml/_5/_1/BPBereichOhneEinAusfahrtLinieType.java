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


/**
 * Bereich ohne Ein- und Ausfahrt (§ 9 Abs. 1 Nr. 11 und Abs. 6 BauGB).
 * Durch die Digitalisierungsreihenfolge der Linienstützpunkte muss sichergestellt sein, dass der angrenzende Bereich ohne Ein- und Ausfahrt relativ zur Laufrichtung auf der linken Seite liegt.
 * 
 * <p>Java-Klasse für BP_BereichOhneEinAusfahrtLinieType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="BP_BereichOhneEinAusfahrtLinieType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/5/1}BP_LinienobjektType">
 *       &lt;sequence>
 *         &lt;element name="typ" type="{http://www.xplanung.de/xplangml/5/1}BP_BereichOhneEinAusfahrtTypen" minOccurs="0"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/5/1}_GenericApplicationPropertyOfBP_BereichOhneEinAusfahrtLinie" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BP_BereichOhneEinAusfahrtLinieType", propOrder = {
    "typ",
    "genericApplicationPropertyOfBPBereichOhneEinAusfahrtLinie"
})
public class BPBereichOhneEinAusfahrtLinieType
    extends BPLinienobjektType
{

    protected String typ;
    @XmlElement(name = "_GenericApplicationPropertyOfBP_BereichOhneEinAusfahrtLinie")
    protected List<Object> genericApplicationPropertyOfBPBereichOhneEinAusfahrtLinie;

    /**
     * Ruft den Wert der typ-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTyp() {
        return typ;
    }

    /**
     * Legt den Wert der typ-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTyp(String value) {
        this.typ = value;
    }

    /**
     * Gets the value of the genericApplicationPropertyOfBPBereichOhneEinAusfahrtLinie property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfBPBereichOhneEinAusfahrtLinie property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfBPBereichOhneEinAusfahrtLinie().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfBPBereichOhneEinAusfahrtLinie() {
        if (genericApplicationPropertyOfBPBereichOhneEinAusfahrtLinie == null) {
            genericApplicationPropertyOfBPBereichOhneEinAusfahrtLinie = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfBPBereichOhneEinAusfahrtLinie;
    }

}