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
 * <p>Java-Klasse für FP_VorbehalteFlaecheType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FP_VorbehalteFlaecheType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/4/1}FP_FlaechenobjektType">
 *       &lt;sequence>
 *         &lt;element name="vorbehalt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/4/1}_GenericApplicationPropertyOfFP_VorbehalteFlaeche" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FP_VorbehalteFlaecheType", propOrder = {
    "vorbehalt",
    "genericApplicationPropertyOfFPVorbehalteFlaeche"
})
public class FPVorbehalteFlaecheType
    extends FPFlaechenobjektType
{

    protected String vorbehalt;
    @XmlElement(name = "_GenericApplicationPropertyOfFP_VorbehalteFlaeche")
    protected List<Object> genericApplicationPropertyOfFPVorbehalteFlaeche;

    /**
     * Ruft den Wert der vorbehalt-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVorbehalt() {
        return vorbehalt;
    }

    /**
     * Legt den Wert der vorbehalt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVorbehalt(String value) {
        this.vorbehalt = value;
    }

    /**
     * Gets the value of the genericApplicationPropertyOfFPVorbehalteFlaeche property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfFPVorbehalteFlaeche property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfFPVorbehalteFlaeche().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfFPVorbehalteFlaeche() {
        if (genericApplicationPropertyOfFPVorbehalteFlaeche == null) {
            genericApplicationPropertyOfFPVorbehalteFlaeche = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfFPVorbehalteFlaeche;
    }

}
