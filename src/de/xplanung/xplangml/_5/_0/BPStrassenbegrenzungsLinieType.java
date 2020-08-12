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
import net.opengis.gml._3.LengthType;


/**
 * Straßenbegrenzungslinie (§ 9 Abs. 1 Nr. 11 und Abs. 6 BauGB) .
 * Durch die Digitalisierungsreihenfolge der Linienstützpunkte muss sichergestellt sein, dass die abzugrenzende Straßenfläche relativ zur Laufrichtung auf der linken Seite liegt.
 * 
 * <p>Java-Klasse für BP_StrassenbegrenzungsLinieType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="BP_StrassenbegrenzungsLinieType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/5/0}BP_LinienobjektType">
 *       &lt;sequence>
 *         &lt;element name="bautiefe" type="{http://www.opengis.net/gml/3.2}LengthType" minOccurs="0"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/5/0}_GenericApplicationPropertyOfBP_StrassenbegrenzungsLinie" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BP_StrassenbegrenzungsLinieType", propOrder = {
    "bautiefe",
    "genericApplicationPropertyOfBPStrassenbegrenzungsLinie"
})
public class BPStrassenbegrenzungsLinieType
    extends BPLinienobjektType
{

    protected LengthType bautiefe;
    @XmlElement(name = "_GenericApplicationPropertyOfBP_StrassenbegrenzungsLinie")
    protected List<Object> genericApplicationPropertyOfBPStrassenbegrenzungsLinie;

    /**
     * Ruft den Wert der bautiefe-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getBautiefe() {
        return bautiefe;
    }

    /**
     * Legt den Wert der bautiefe-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setBautiefe(LengthType value) {
        this.bautiefe = value;
    }

    /**
     * Gets the value of the genericApplicationPropertyOfBPStrassenbegrenzungsLinie property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfBPStrassenbegrenzungsLinie property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfBPStrassenbegrenzungsLinie().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfBPStrassenbegrenzungsLinie() {
        if (genericApplicationPropertyOfBPStrassenbegrenzungsLinie == null) {
            genericApplicationPropertyOfBPStrassenbegrenzungsLinie = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfBPStrassenbegrenzungsLinie;
    }

}
