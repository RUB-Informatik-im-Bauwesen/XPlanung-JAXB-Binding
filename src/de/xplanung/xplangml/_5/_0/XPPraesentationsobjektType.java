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
 * Entspricht der ALKIS-Objektklasse AP_Darstellung mit dem Unterschied, dass auf das Attribut "positionierungssregel" verzichtet wurde.  Die Klasse darf nur als gebundenes Präsentationsobjekt verwendet werden. Die Standard-Darstellung des verbundenen Fachobjekts wird dann durch die über stylesheetId spezifizierte Darstellung ersetzt. Die Umsetzung dieses Konzeptes ist der Implementierung überlassen.
 * 
 * 
 * <p>Java-Klasse für XP_PraesentationsobjektType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="XP_PraesentationsobjektType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/5/0}XP_AbstraktesPraesentationsobjektType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/5/0}_GenericApplicationPropertyOfXP_Praesentationsobjekt" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XP_PraesentationsobjektType", propOrder = {
    "genericApplicationPropertyOfXPPraesentationsobjekt"
})
public class XPPraesentationsobjektType
    extends XPAbstraktesPraesentationsobjektType
{

    @XmlElement(name = "_GenericApplicationPropertyOfXP_Praesentationsobjekt")
    protected List<Object> genericApplicationPropertyOfXPPraesentationsobjekt;

    /**
     * Gets the value of the genericApplicationPropertyOfXPPraesentationsobjekt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfXPPraesentationsobjekt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfXPPraesentationsobjekt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfXPPraesentationsobjekt() {
        if (genericApplicationPropertyOfXPPraesentationsobjekt == null) {
            genericApplicationPropertyOfXPPraesentationsobjekt = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfXPPraesentationsobjekt;
    }

}
