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
 * Fläche, auf der ganz oder teilweise nur Wohngebäude, die mit Mitteln der sozialen Wohnraumförderung gefördert werden könnten, errichtet werden dürfen (§9, Abs. 1, Nr. 7 BauGB).
 * 
 * 
 * <p>Java-Klasse für BP_FoerderungsFlaecheType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="BP_FoerderungsFlaecheType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/5/1}BP_UeberlagerungsobjektType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/5/1}_GenericApplicationPropertyOfBP_FoerderungsFlaeche" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BP_FoerderungsFlaecheType", propOrder = {
    "genericApplicationPropertyOfBPFoerderungsFlaeche"
})
public class BPFoerderungsFlaecheType
    extends BPUeberlagerungsobjektType
{

    @XmlElement(name = "_GenericApplicationPropertyOfBP_FoerderungsFlaeche")
    protected List<Object> genericApplicationPropertyOfBPFoerderungsFlaeche;

    /**
     * Gets the value of the genericApplicationPropertyOfBPFoerderungsFlaeche property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfBPFoerderungsFlaeche property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfBPFoerderungsFlaeche().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfBPFoerderungsFlaeche() {
        if (genericApplicationPropertyOfBPFoerderungsFlaeche == null) {
            genericApplicationPropertyOfBPFoerderungsFlaeche = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfBPFoerderungsFlaeche;
    }

}
