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


/**
 * Flächen für Aufschüttungen, Abgrabungen oder für die Gewinnung von Bodenschätzen (§ 9 Abs. 1 Nr. 17 und Abs. 6 BauGB). Hier: Flächen für Aufschüttungen
 * 
 * 
 * <p>Java-Klasse für BP_AufschuettungsFlaecheType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="BP_AufschuettungsFlaecheType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/5/0}BP_FlaechenobjektType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/5/0}_GenericApplicationPropertyOfBP_AufschuettungsFlaeche" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BP_AufschuettungsFlaecheType", propOrder = {
    "genericApplicationPropertyOfBPAufschuettungsFlaeche"
})
public class BPAufschuettungsFlaecheType
    extends BPFlaechenobjektType
{

    @XmlElement(name = "_GenericApplicationPropertyOfBP_AufschuettungsFlaeche")
    protected List<Object> genericApplicationPropertyOfBPAufschuettungsFlaeche;

    /**
     * Gets the value of the genericApplicationPropertyOfBPAufschuettungsFlaeche property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfBPAufschuettungsFlaeche property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfBPAufschuettungsFlaeche().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfBPAufschuettungsFlaeche() {
        if (genericApplicationPropertyOfBPAufschuettungsFlaeche == null) {
            genericApplicationPropertyOfBPAufschuettungsFlaeche = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfBPAufschuettungsFlaeche;
    }

}
