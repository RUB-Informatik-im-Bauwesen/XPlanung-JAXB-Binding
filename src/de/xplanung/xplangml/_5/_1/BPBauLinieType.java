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
import net.opengis.gml._3.LengthType;


/**
 * Festsetzung einer Baulinie (§9 Abs. 1 Nr. 2 BauGB, §22 und 23 BauNVO). Über die Attribute <i>geschossMin </i>und <i>geschossMax </i>kann die Festsetzung auf einen Bereich von Geschossen beschränkt werden. Wenn eine Einschränkung der Festsetzung durch explizite Höhenangaben erfolgen soll, ist dazu die Oberklassen-Relation <i>hoehenangabe </i>auf den komplexen Datentyp <i>XP_Hoehenangabe </i>zu verwenden. 
 * Durch die Digitalisierungsreihenfolge der Linienstützpunkte muss sichergestellt sein, dass die überbaute Fläche (<i>BP_UeberbaubareGrundstuecksFlaeche</i>) relativ zur Laufrichtung auf der linken Seite liegt.
 * 
 * <p>Java-Klasse für BP_BauLinieType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="BP_BauLinieType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/5/1}BP_LinienobjektType">
 *       &lt;sequence>
 *         &lt;element name="bautiefe" type="{http://www.opengis.net/gml/3.2}LengthType" minOccurs="0"/>
 *         &lt;element name="geschossMin" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="geschossMax" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/5/1}_GenericApplicationPropertyOfBP_BauLinie" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BP_BauLinieType", propOrder = {
    "bautiefe",
    "geschossMin",
    "geschossMax",
    "genericApplicationPropertyOfBPBauLinie"
})
public class BPBauLinieType
    extends BPLinienobjektType
{

    protected LengthType bautiefe;
    protected Integer geschossMin;
    protected Integer geschossMax;
    @XmlElement(name = "_GenericApplicationPropertyOfBP_BauLinie")
    protected List<Object> genericApplicationPropertyOfBPBauLinie;

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
     * Ruft den Wert der geschossMin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGeschossMin() {
        return geschossMin;
    }

    /**
     * Legt den Wert der geschossMin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGeschossMin(Integer value) {
        this.geschossMin = value;
    }

    /**
     * Ruft den Wert der geschossMax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGeschossMax() {
        return geschossMax;
    }

    /**
     * Legt den Wert der geschossMax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGeschossMax(Integer value) {
        this.geschossMax = value;
    }

    /**
     * Gets the value of the genericApplicationPropertyOfBPBauLinie property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfBPBauLinie property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfBPBauLinie().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfBPBauLinie() {
        if (genericApplicationPropertyOfBPBauLinie == null) {
            genericApplicationPropertyOfBPBauLinie = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfBPBauLinie;
    }

}
