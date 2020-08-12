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
 * Baufläche, für die eine zentrale Abwasserbeseitigung nicht vorgesehen ist (§ 5, Abs. 2, Nr. 1 BauGB).
 * 
 * <p>Java-Klasse für FP_KeineZentrAbwasserBeseitigungFlaecheType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FP_KeineZentrAbwasserBeseitigungFlaecheType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/5/0}FP_FlaechenobjektType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/5/0}_GenericApplicationPropertyOfFP_KeineZentrAbwasserBeseitigungFlaeche" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FP_KeineZentrAbwasserBeseitigungFlaecheType", propOrder = {
    "genericApplicationPropertyOfFPKeineZentrAbwasserBeseitigungFlaeche"
})
public class FPKeineZentrAbwasserBeseitigungFlaecheType
    extends FPFlaechenobjektType
{

    @XmlElement(name = "_GenericApplicationPropertyOfFP_KeineZentrAbwasserBeseitigungFlaeche")
    protected List<Object> genericApplicationPropertyOfFPKeineZentrAbwasserBeseitigungFlaeche;

    /**
     * Gets the value of the genericApplicationPropertyOfFPKeineZentrAbwasserBeseitigungFlaeche property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfFPKeineZentrAbwasserBeseitigungFlaeche property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfFPKeineZentrAbwasserBeseitigungFlaeche().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfFPKeineZentrAbwasserBeseitigungFlaeche() {
        if (genericApplicationPropertyOfFPKeineZentrAbwasserBeseitigungFlaeche == null) {
            genericApplicationPropertyOfFPKeineZentrAbwasserBeseitigungFlaeche = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfFPKeineZentrAbwasserBeseitigungFlaeche;
    }

}
