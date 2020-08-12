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
import net.opengis.gml._3.ReferenceType;


/**
 * Festsetzung einer Flche fr die Einschrnkung oder den Ausschluss von Nebenanlagen nach $14 Absatz 1 Satz 3 BauNVO.
 * 
 * <p>Java-Klasse für BP_NebenanlagenAusschlussFlaecheType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="BP_NebenanlagenAusschlussFlaecheType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/5/0}BP_UeberlagerungsobjektType">
 *       &lt;sequence>
 *         &lt;element name="typ" type="{http://www.xplanung.de/xplangml/5/0}BP_NebenanlagenAusschlussTyp" minOccurs="0"/>
 *         &lt;element name="abweichungText" type="{http://www.opengis.net/gml/3.2}ReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/5/0}_GenericApplicationPropertyOfBP_NebenanlagenAusschlussFlaeche" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BP_NebenanlagenAusschlussFlaecheType", propOrder = {
    "typ",
    "abweichungText",
    "genericApplicationPropertyOfBPNebenanlagenAusschlussFlaeche"
})
public class BPNebenanlagenAusschlussFlaecheType
    extends BPUeberlagerungsobjektType
{

    protected String typ;
    protected List<ReferenceType> abweichungText;
    @XmlElement(name = "_GenericApplicationPropertyOfBP_NebenanlagenAusschlussFlaeche")
    protected List<Object> genericApplicationPropertyOfBPNebenanlagenAusschlussFlaeche;

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
     * Gets the value of the abweichungText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the abweichungText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbweichungText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenceType }
     * 
     * 
     */
    public List<ReferenceType> getAbweichungText() {
        if (abweichungText == null) {
            abweichungText = new ArrayList<ReferenceType>();
        }
        return this.abweichungText;
    }

    /**
     * Gets the value of the genericApplicationPropertyOfBPNebenanlagenAusschlussFlaeche property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfBPNebenanlagenAusschlussFlaeche property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfBPNebenanlagenAusschlussFlaeche().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfBPNebenanlagenAusschlussFlaeche() {
        if (genericApplicationPropertyOfBPNebenanlagenAusschlussFlaeche == null) {
            genericApplicationPropertyOfBPNebenanlagenAusschlussFlaeche = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfBPNebenanlagenAusschlussFlaeche;
    }

}
