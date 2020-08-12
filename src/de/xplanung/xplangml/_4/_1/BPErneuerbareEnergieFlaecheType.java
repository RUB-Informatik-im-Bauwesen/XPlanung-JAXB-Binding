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
 * Festsetzung nach §9 Abs. 1 Nr. 23b: Gebiete in denen bei der Errichtung von Gebäuden bestimmte bauliche Maßnahmen für den Einsatz erneuerbarer Energien wie insbesondere Solarenergie getroffen werden müssen.
 * 
 * 
 * <p>Java-Klasse für BP_ErneuerbareEnergieFlaecheType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="BP_ErneuerbareEnergieFlaecheType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/4/1}BP_UeberlagerungsobjektType">
 *       &lt;sequence>
 *         &lt;element name="technischeMaßnahme" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/4/1}_GenericApplicationPropertyOfBP_ErneuerbareEnergieFlaeche" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BP_ErneuerbareEnergieFlaecheType", propOrder = {
    "technischeMa\u00dfnahme",
    "genericApplicationPropertyOfBPErneuerbareEnergieFlaeche"
})
public class BPErneuerbareEnergieFlaecheType
    extends BPUeberlagerungsobjektType
{

    protected String technischeMaßnahme;
    @XmlElement(name = "_GenericApplicationPropertyOfBP_ErneuerbareEnergieFlaeche")
    protected List<Object> genericApplicationPropertyOfBPErneuerbareEnergieFlaeche;

    /**
     * Ruft den Wert der technischeMaßnahme-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTechnischeMaßnahme() {
        return technischeMaßnahme;
    }

    /**
     * Legt den Wert der technischeMaßnahme-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTechnischeMaßnahme(String value) {
        this.technischeMaßnahme = value;
    }

    /**
     * Gets the value of the genericApplicationPropertyOfBPErneuerbareEnergieFlaeche property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfBPErneuerbareEnergieFlaeche property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfBPErneuerbareEnergieFlaeche().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfBPErneuerbareEnergieFlaeche() {
        if (genericApplicationPropertyOfBPErneuerbareEnergieFlaeche == null) {
            genericApplicationPropertyOfBPErneuerbareEnergieFlaeche = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfBPErneuerbareEnergieFlaeche;
    }

}
