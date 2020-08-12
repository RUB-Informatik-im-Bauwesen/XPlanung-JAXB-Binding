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
import net.opengis.gml._3.CodeType;


/**
 * Sonstige Gebiete, Objekte, Zweckbestimmungen oder Maßnahmen mit besonderen Funktionen für die landschaftsgebundene Erholung und Freizeit.
 * 
 * <p>Java-Klasse für LP_ErholungFreizeitType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="LP_ErholungFreizeitType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/5/0}LP_GeometrieobjektType">
 *       &lt;sequence>
 *         &lt;element name="funktion" type="{http://www.xplanung.de/xplangml/5/0}LP_ErholungFreizeitFunktionen" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="detaillierteFunktion" type="{http://www.opengis.net/gml/3.2}CodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/5/0}_GenericApplicationPropertyOfLP_ErholungFreizeit" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LP_ErholungFreizeitType", propOrder = {
    "funktion",
    "detaillierteFunktion",
    "genericApplicationPropertyOfLPErholungFreizeit"
})
public class LPErholungFreizeitType
    extends LPGeometrieobjektType
{

    protected List<String> funktion;
    protected List<CodeType> detaillierteFunktion;
    @XmlElement(name = "_GenericApplicationPropertyOfLP_ErholungFreizeit")
    protected List<Object> genericApplicationPropertyOfLPErholungFreizeit;

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
     * Gets the value of the detaillierteFunktion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the detaillierteFunktion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetaillierteFunktion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeType }
     * 
     * 
     */
    public List<CodeType> getDetaillierteFunktion() {
        if (detaillierteFunktion == null) {
            detaillierteFunktion = new ArrayList<CodeType>();
        }
        return this.detaillierteFunktion;
    }

    /**
     * Gets the value of the genericApplicationPropertyOfLPErholungFreizeit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfLPErholungFreizeit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfLPErholungFreizeit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfLPErholungFreizeit() {
        if (genericApplicationPropertyOfLPErholungFreizeit == null) {
            genericApplicationPropertyOfLPErholungFreizeit = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfLPErholungFreizeit;
    }

}
