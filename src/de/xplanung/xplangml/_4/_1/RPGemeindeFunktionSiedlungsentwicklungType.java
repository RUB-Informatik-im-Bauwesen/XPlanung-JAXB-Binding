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
 * Gemeindefunktion
 * 
 * <p>Java-Klasse für RP_GemeindeFunktionSiedlungsentwicklungType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RP_GemeindeFunktionSiedlungsentwicklungType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/4/1}RP_GeometrieobjektType">
 *       &lt;sequence>
 *         &lt;element name="gebietsTyp" type="{http://www.xplanung.de/xplangml/4/1}RP_GebietsTyp" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="funktion" type="{http://www.xplanung.de/xplangml/4/1}RP_Gemeindefunktionen" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/4/1}_GenericApplicationPropertyOfRP_GemeindeFunktionSiedlungsentwicklung" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RP_GemeindeFunktionSiedlungsentwicklungType", propOrder = {
    "gebietsTyp",
    "funktion",
    "genericApplicationPropertyOfRPGemeindeFunktionSiedlungsentwicklung"
})
public class RPGemeindeFunktionSiedlungsentwicklungType
    extends RPGeometrieobjektType
{

    protected List<String> gebietsTyp;
    protected List<String> funktion;
    @XmlElement(name = "_GenericApplicationPropertyOfRP_GemeindeFunktionSiedlungsentwicklung")
    protected List<Object> genericApplicationPropertyOfRPGemeindeFunktionSiedlungsentwicklung;

    /**
     * Gets the value of the gebietsTyp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gebietsTyp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGebietsTyp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getGebietsTyp() {
        if (gebietsTyp == null) {
            gebietsTyp = new ArrayList<String>();
        }
        return this.gebietsTyp;
    }

    /**
     * Gets the value of the funktion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the funktion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFunktion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFunktion() {
        if (funktion == null) {
            funktion = new ArrayList<String>();
        }
        return this.funktion;
    }

    /**
     * Gets the value of the genericApplicationPropertyOfRPGemeindeFunktionSiedlungsentwicklung property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfRPGemeindeFunktionSiedlungsentwicklung property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfRPGemeindeFunktionSiedlungsentwicklung().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfRPGemeindeFunktionSiedlungsentwicklung() {
        if (genericApplicationPropertyOfRPGemeindeFunktionSiedlungsentwicklung == null) {
            genericApplicationPropertyOfRPGemeindeFunktionSiedlungsentwicklung = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfRPGemeindeFunktionSiedlungsentwicklung;
    }

}
