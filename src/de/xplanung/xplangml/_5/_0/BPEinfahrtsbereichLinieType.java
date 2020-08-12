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


/**
 * Linienhaft modellierter Einfahrtsbereich (§9 Abs. 1 Nr. 11 und Abs. 6 BauGB).
 * Durch die Digitalisierungsreihenfolge der Linienstützpunkte muss sichergestellt sein, dass die  angrenzende Einfahrt relativ zur Laufrichtung auf der linken Seite liegt.
 * 
 * <p>Java-Klasse für BP_EinfahrtsbereichLinieType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="BP_EinfahrtsbereichLinieType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/5/0}BP_LinienobjektType">
 *       &lt;sequence>
 *         &lt;element name="typ" type="{http://www.xplanung.de/xplangml/5/0}BP_EinfahrtTypen" minOccurs="0"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/5/0}_GenericApplicationPropertyOfBP_EinfahrtsbereichLinie" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BP_EinfahrtsbereichLinieType", propOrder = {
    "typ",
    "genericApplicationPropertyOfBPEinfahrtsbereichLinie"
})
public class BPEinfahrtsbereichLinieType
    extends BPLinienobjektType
{

    protected String typ;
    @XmlElement(name = "_GenericApplicationPropertyOfBP_EinfahrtsbereichLinie")
    protected List<Object> genericApplicationPropertyOfBPEinfahrtsbereichLinie;

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
     * Gets the value of the genericApplicationPropertyOfBPEinfahrtsbereichLinie property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfBPEinfahrtsbereichLinie property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfBPEinfahrtsbereichLinie().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfBPEinfahrtsbereichLinie() {
        if (genericApplicationPropertyOfBPEinfahrtsbereichLinie == null) {
            genericApplicationPropertyOfBPEinfahrtsbereichLinie = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfBPEinfahrtsbereichLinie;
    }

}
