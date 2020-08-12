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
import net.opengis.gml._3.LengthType;


/**
 * Festsetzung eines vom Bauordnungsrecht abweichenden Maßes der Tiefe der Abstandsfläche gemäß § 9 Abs 1. Nr. 2a BauGB
 * 
 * 
 * <p>Java-Klasse für BP_AbstandsFlaecheType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="BP_AbstandsFlaecheType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/4/1}BP_UeberlagerungsobjektType">
 *       &lt;sequence>
 *         &lt;element name="tiefe" type="{http://www.opengis.net/gml/3.2}LengthType" minOccurs="0"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/4/1}_GenericApplicationPropertyOfBP_AbstandsFlaeche" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BP_AbstandsFlaecheType", propOrder = {
    "tiefe",
    "genericApplicationPropertyOfBPAbstandsFlaeche"
})
public class BPAbstandsFlaecheType
    extends BPUeberlagerungsobjektType
{

    protected LengthType tiefe;
    @XmlElement(name = "_GenericApplicationPropertyOfBP_AbstandsFlaeche")
    protected List<Object> genericApplicationPropertyOfBPAbstandsFlaeche;

    /**
     * Ruft den Wert der tiefe-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getTiefe() {
        return tiefe;
    }

    /**
     * Legt den Wert der tiefe-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setTiefe(LengthType value) {
        this.tiefe = value;
    }

    /**
     * Gets the value of the genericApplicationPropertyOfBPAbstandsFlaeche property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfBPAbstandsFlaeche property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfBPAbstandsFlaeche().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfBPAbstandsFlaeche() {
        if (genericApplicationPropertyOfBPAbstandsFlaeche == null) {
            genericApplicationPropertyOfBPAbstandsFlaeche = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfBPAbstandsFlaeche;
    }

}
