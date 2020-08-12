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
 * Fläche für technische oder bauliche Maßnahmen nach § 9, Abs. 1, Nr. 23 BauGB.
 * 
 * <p>Java-Klasse für BP_TechnischeMassnahmenFlaecheType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="BP_TechnischeMassnahmenFlaecheType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/5/1}BP_UeberlagerungsobjektType">
 *       &lt;sequence>
 *         &lt;element name="zweckbestimmung" type="{http://www.xplanung.de/xplangml/5/1}BP_ZweckbestimmungenTMF"/>
 *         &lt;element name="technischeMassnahme" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/5/1}_GenericApplicationPropertyOfBP_TechnischeMassnahmenFlaeche" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BP_TechnischeMassnahmenFlaecheType", propOrder = {
    "zweckbestimmung",
    "technischeMassnahme",
    "genericApplicationPropertyOfBPTechnischeMassnahmenFlaeche"
})
public class BPTechnischeMassnahmenFlaecheType
    extends BPUeberlagerungsobjektType
{

    @XmlElement(required = true)
    protected String zweckbestimmung;
    protected String technischeMassnahme;
    @XmlElement(name = "_GenericApplicationPropertyOfBP_TechnischeMassnahmenFlaeche")
    protected List<Object> genericApplicationPropertyOfBPTechnischeMassnahmenFlaeche;

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
     * Ruft den Wert der technischeMassnahme-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTechnischeMassnahme() {
        return technischeMassnahme;
    }

    /**
     * Legt den Wert der technischeMassnahme-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTechnischeMassnahme(String value) {
        this.technischeMassnahme = value;
    }

    /**
     * Gets the value of the genericApplicationPropertyOfBPTechnischeMassnahmenFlaeche property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfBPTechnischeMassnahmenFlaeche property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfBPTechnischeMassnahmenFlaeche().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfBPTechnischeMassnahmenFlaeche() {
        if (genericApplicationPropertyOfBPTechnischeMassnahmenFlaeche == null) {
            genericApplicationPropertyOfBPTechnischeMassnahmenFlaeche = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfBPTechnischeMassnahmenFlaeche;
    }

}
