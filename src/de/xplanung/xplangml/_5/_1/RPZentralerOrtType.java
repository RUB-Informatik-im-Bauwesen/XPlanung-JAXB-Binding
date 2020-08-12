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
 * Zentrale Orte übernehmen die Versorgung ihrer Einwohner sowie Versorgungs und Entwicklungsfunktionen für den Einzugsbereich des Zentralen Ortes. Das zentralörtliche System ist hierarchisch gegliedert.
 * 
 * <p>Java-Klasse für RP_ZentralerOrtType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RP_ZentralerOrtType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/5/1}RP_GeometrieobjektType">
 *       &lt;sequence>
 *         &lt;element name="typ" type="{http://www.xplanung.de/xplangml/5/1}RP_ZentralerOrtTypen" maxOccurs="unbounded"/>
 *         &lt;element name="sonstigerTyp" type="{http://www.xplanung.de/xplangml/5/1}RP_ZentralerOrtSonstigeTypen" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/5/1}_GenericApplicationPropertyOfRP_ZentralerOrt" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RP_ZentralerOrtType", propOrder = {
    "typ",
    "sonstigerTyp",
    "genericApplicationPropertyOfRPZentralerOrt"
})
public class RPZentralerOrtType
    extends RPGeometrieobjektType
{

    @XmlElement(required = true)
    protected List<String> typ;
    protected List<String> sonstigerTyp;
    @XmlElement(name = "_GenericApplicationPropertyOfRP_ZentralerOrt")
    protected List<Object> genericApplicationPropertyOfRPZentralerOrt;

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
     * Gets the value of the sonstigerTyp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sonstigerTyp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSonstigerTyp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSonstigerTyp() {
        if (sonstigerTyp == null) {
            sonstigerTyp = new ArrayList<String>();
        }
        return this.sonstigerTyp;
    }

    /**
     * Gets the value of the genericApplicationPropertyOfRPZentralerOrt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfRPZentralerOrt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfRPZentralerOrt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfRPZentralerOrt() {
        if (genericApplicationPropertyOfRPZentralerOrt == null) {
            genericApplicationPropertyOfRPZentralerOrt = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfRPZentralerOrt;
    }

}
