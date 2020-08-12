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
 * Schienenverkehr-Infrastruktur.
 * 
 * <p>Java-Klasse für RP_SchienenverkehrType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RP_SchienenverkehrType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/5/0}RP_VerkehrType">
 *       &lt;sequence>
 *         &lt;element name="typ" type="{http://www.xplanung.de/xplangml/5/0}RP_SchienenverkehrTypen" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="besondererTyp" type="{http://www.xplanung.de/xplangml/5/0}RP_BesondererSchienenverkehrTypen" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/5/0}_GenericApplicationPropertyOfRP_Schienenverkehr" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RP_SchienenverkehrType", propOrder = {
    "typ",
    "besondererTyp",
    "genericApplicationPropertyOfRPSchienenverkehr"
})
public class RPSchienenverkehrType
    extends RPVerkehrType
{

    protected List<String> typ;
    protected List<String> besondererTyp;
    @XmlElement(name = "_GenericApplicationPropertyOfRP_Schienenverkehr")
    protected List<Object> genericApplicationPropertyOfRPSchienenverkehr;

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
     * Gets the value of the besondererTyp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the besondererTyp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBesondererTyp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBesondererTyp() {
        if (besondererTyp == null) {
            besondererTyp = new ArrayList<String>();
        }
        return this.besondererTyp;
    }

    /**
     * Gets the value of the genericApplicationPropertyOfRPSchienenverkehr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfRPSchienenverkehr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfRPSchienenverkehr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfRPSchienenverkehr() {
        if (genericApplicationPropertyOfRPSchienenverkehr == null) {
            genericApplicationPropertyOfRPSchienenverkehr = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfRPSchienenverkehr;
    }

}
