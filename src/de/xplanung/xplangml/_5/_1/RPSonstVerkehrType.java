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
 * Sonstige Verkehrsinfrastruktur, die sich nicht eindeutig einem anderen Typ zuordnen lässt.
 * 
 * <p>Java-Klasse für RP_SonstVerkehrType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RP_SonstVerkehrType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/5/1}RP_VerkehrType">
 *       &lt;sequence>
 *         &lt;element name="typ" type="{http://www.xplanung.de/xplangml/5/1}RP_SonstVerkehrTypen" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/5/1}_GenericApplicationPropertyOfRP_SonstVerkehr" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RP_SonstVerkehrType", propOrder = {
    "typ",
    "genericApplicationPropertyOfRPSonstVerkehr"
})
public class RPSonstVerkehrType
    extends RPVerkehrType
{

    protected List<String> typ;
    @XmlElement(name = "_GenericApplicationPropertyOfRP_SonstVerkehr")
    protected List<Object> genericApplicationPropertyOfRPSonstVerkehr;

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
     * Gets the value of the genericApplicationPropertyOfRPSonstVerkehr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfRPSonstVerkehr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfRPSonstVerkehr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfRPSonstVerkehr() {
        if (genericApplicationPropertyOfRPSonstVerkehr == null) {
            genericApplicationPropertyOfRPSonstVerkehr = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfRPSonstVerkehr;
    }

}
