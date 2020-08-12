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
 * Festsetzung von Gebieten, in denen zum Schutz vor schädlichen Umwelteinwirkungen im Sinne des Bundes-Immissionsschutzgesetzes bestimmte Luft verunreinigende Stoffe nicht oder nur beschränkt verwendet werden dürfen (§9, Abs. 1, Nr. 23a BauGB).
 * 
 * 
 * <p>Java-Klasse für BP_LuftreinhalteFlaecheType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="BP_LuftreinhalteFlaecheType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/4/1}BP_UeberlagerungsobjektType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/4/1}_GenericApplicationPropertyOfBP_LuftreinhalteFlaeche" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BP_LuftreinhalteFlaecheType", propOrder = {
    "genericApplicationPropertyOfBPLuftreinhalteFlaeche"
})
public class BPLuftreinhalteFlaecheType
    extends BPUeberlagerungsobjektType
{

    @XmlElement(name = "_GenericApplicationPropertyOfBP_LuftreinhalteFlaeche")
    protected List<Object> genericApplicationPropertyOfBPLuftreinhalteFlaeche;

    /**
     * Gets the value of the genericApplicationPropertyOfBPLuftreinhalteFlaeche property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfBPLuftreinhalteFlaeche property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfBPLuftreinhalteFlaeche().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfBPLuftreinhalteFlaeche() {
        if (genericApplicationPropertyOfBPLuftreinhalteFlaeche == null) {
            genericApplicationPropertyOfBPLuftreinhalteFlaeche = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfBPLuftreinhalteFlaeche;
    }

}
