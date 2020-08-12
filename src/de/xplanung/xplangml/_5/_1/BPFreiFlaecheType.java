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
 * Umgrenzung der Flächen, die von der Bebauung freizuhalten sind, und ihre Nutzung (§ 9 Abs. 1 Nr. 10 BauGB).
 * 
 * 
 * <p>Java-Klasse für BP_FreiFlaecheType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="BP_FreiFlaecheType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/5/1}BP_UeberlagerungsobjektType">
 *       &lt;sequence>
 *         &lt;element name="nutzung" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/5/1}_GenericApplicationPropertyOfBP_FreiFlaeche" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BP_FreiFlaecheType", propOrder = {
    "nutzung",
    "genericApplicationPropertyOfBPFreiFlaeche"
})
public class BPFreiFlaecheType
    extends BPUeberlagerungsobjektType
{

    protected String nutzung;
    @XmlElement(name = "_GenericApplicationPropertyOfBP_FreiFlaeche")
    protected List<Object> genericApplicationPropertyOfBPFreiFlaeche;

    /**
     * Ruft den Wert der nutzung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNutzung() {
        return nutzung;
    }

    /**
     * Legt den Wert der nutzung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNutzung(String value) {
        this.nutzung = value;
    }

    /**
     * Gets the value of the genericApplicationPropertyOfBPFreiFlaeche property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfBPFreiFlaeche property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfBPFreiFlaeche().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfBPFreiFlaeche() {
        if (genericApplicationPropertyOfBPFreiFlaeche == null) {
            genericApplicationPropertyOfBPFreiFlaeche = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfBPFreiFlaeche;
    }

}
