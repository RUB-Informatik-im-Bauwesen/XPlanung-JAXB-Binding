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
 * Die Klasse RP_Hochwasserschutz enthält Hochwasserschutz und vorbeugenden Hochwasserschutz.
 * Hochwasserschutz und vorbeugender Hochwasserschutz beinhaltet den Schutz von Siedlungen, Nutz- und Verkehrsflächen vor Überschwemmungen. Im Binnenland besteht der Hochwasserschutz vor allem in der Sicherung und Rückgewinnung von Auen, Wasserrückhalteflächen (Retentionsflächen) und überschwemmungsgefährdeten Bereichen. An der Nord- und Ostsee erfolgt der Schutz vor Sturmfluten hauptsächlich durch Deiche und Siele (Küstenschutz).
 * 
 * <p>Java-Klasse für RP_HochwasserschutzType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RP_HochwasserschutzType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/5/1}RP_FreiraumType">
 *       &lt;sequence>
 *         &lt;element name="typ" type="{http://www.xplanung.de/xplangml/5/1}RP_HochwasserschutzTypen" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/5/1}_GenericApplicationPropertyOfRP_Hochwasserschutz" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RP_HochwasserschutzType", propOrder = {
    "typ",
    "genericApplicationPropertyOfRPHochwasserschutz"
})
public class RPHochwasserschutzType
    extends RPFreiraumType
{

    protected List<String> typ;
    @XmlElement(name = "_GenericApplicationPropertyOfRP_Hochwasserschutz")
    protected List<Object> genericApplicationPropertyOfRPHochwasserschutz;

    /**
     * Gets the value of the typ property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the typ property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTyp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTyp() {
        if (typ == null) {
            typ = new ArrayList<String>();
        }
        return this.typ;
    }

    /**
     * Gets the value of the genericApplicationPropertyOfRPHochwasserschutz property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfRPHochwasserschutz property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfRPHochwasserschutz().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfRPHochwasserschutz() {
        if (genericApplicationPropertyOfRPHochwasserschutz == null) {
            genericApplicationPropertyOfRPHochwasserschutz = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfRPHochwasserschutz;
    }

}
