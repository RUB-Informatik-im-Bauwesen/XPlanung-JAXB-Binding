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
 * Fläche, auf denen der Rückbau, die Änderung oder die Nutzungsänderung baulichen Anlagen der Genehmigung durch die Gemeinde bedarf (§172 BauGB)
 * 
 * Die Klasse wird als <b>veraltet </b>gekennzeichnet und fällt in XPlanGML V. 6.0 weg. Stattdessen sollte die Klasse SO_Gebiet verwendet werden.
 * 
 * <p>Java-Klasse für BP_ErhaltungsBereichFlaecheType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="BP_ErhaltungsBereichFlaecheType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/5/1}BP_UeberlagerungsobjektType">
 *       &lt;sequence>
 *         &lt;element name="grund" type="{http://www.xplanung.de/xplangml/5/1}BP_ErhaltungsGrund"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/5/1}_GenericApplicationPropertyOfBP_ErhaltungsBereichFlaeche" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BP_ErhaltungsBereichFlaecheType", propOrder = {
    "grund",
    "genericApplicationPropertyOfBPErhaltungsBereichFlaeche"
})
public class BPErhaltungsBereichFlaecheType
    extends BPUeberlagerungsobjektType
{

    @XmlElement(required = true)
    protected String grund;
    @XmlElement(name = "_GenericApplicationPropertyOfBP_ErhaltungsBereichFlaeche")
    protected List<Object> genericApplicationPropertyOfBPErhaltungsBereichFlaeche;

    /**
     * Ruft den Wert der grund-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrund() {
        return grund;
    }

    /**
     * Legt den Wert der grund-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrund(String value) {
        this.grund = value;
    }

    /**
     * Gets the value of the genericApplicationPropertyOfBPErhaltungsBereichFlaeche property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfBPErhaltungsBereichFlaeche property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfBPErhaltungsBereichFlaeche().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfBPErhaltungsBereichFlaeche() {
        if (genericApplicationPropertyOfBPErhaltungsBereichFlaeche == null) {
            genericApplicationPropertyOfBPErhaltungsBereichFlaeche = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfBPErhaltungsBereichFlaeche;
    }

}
