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
 * Sonstiger Siedlungsbereich.
 * 
 * <p>Java-Klasse für RP_SonstigerSiedlungsbereichType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RP_SonstigerSiedlungsbereichType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/5/0}RP_SiedlungType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/5/0}_GenericApplicationPropertyOfRP_SonstigerSiedlungsbereich" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RP_SonstigerSiedlungsbereichType", propOrder = {
    "genericApplicationPropertyOfRPSonstigerSiedlungsbereich"
})
public class RPSonstigerSiedlungsbereichType
    extends RPSiedlungType
{

    @XmlElement(name = "_GenericApplicationPropertyOfRP_SonstigerSiedlungsbereich")
    protected List<Object> genericApplicationPropertyOfRPSonstigerSiedlungsbereich;

    /**
     * Gets the value of the genericApplicationPropertyOfRPSonstigerSiedlungsbereich property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfRPSonstigerSiedlungsbereich property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfRPSonstigerSiedlungsbereich().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfRPSonstigerSiedlungsbereich() {
        if (genericApplicationPropertyOfRPSonstigerSiedlungsbereich == null) {
            genericApplicationPropertyOfRPSonstigerSiedlungsbereich = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfRPSonstigerSiedlungsbereich;
    }

}
