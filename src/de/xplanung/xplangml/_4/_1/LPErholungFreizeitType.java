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
 *     &lt;extension base="{http://www.xplanung.de/xplangml/4/1}LP_GeometrieobjektType">
 *       &lt;sequence>
 *         &lt;element name="funktion" type="{http://www.xplanung.de/xplangml/4/1}LP_ErholungFreizeitFunktionen" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="weitereFunktion1" type="{http://www.xplanung.de/xplangml/4/1}LP_ErholungFreizeitFunktionen" minOccurs="0"/>
 *         &lt;element name="weitereFunktion2" type="{http://www.xplanung.de/xplangml/4/1}LP_ErholungFreizeitFunktionen" minOccurs="0"/>
 *         &lt;element name="detaillierteFunktion" type="{http://www.opengis.net/gml/3.2}CodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="weitereDetailFunktion1" type="{http://www.opengis.net/gml/3.2}CodeType" minOccurs="0"/>
 *         &lt;element name="weitereDetailFunktion2" type="{http://www.opengis.net/gml/3.2}CodeType" minOccurs="0"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/4/1}_GenericApplicationPropertyOfLP_ErholungFreizeit" maxOccurs="unbounded" minOccurs="0"/>
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
    "weitereFunktion1",
    "weitereFunktion2",
    "detaillierteFunktion",
    "weitereDetailFunktion1",
    "weitereDetailFunktion2",
    "genericApplicationPropertyOfLPErholungFreizeit"
})
public class LPErholungFreizeitType
    extends LPGeometrieobjektType
{

    protected List<String> funktion;
    protected String weitereFunktion1;
    protected String weitereFunktion2;
    protected List<CodeType> detaillierteFunktion;
    protected CodeType weitereDetailFunktion1;
    protected CodeType weitereDetailFunktion2;
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
     * Ruft den Wert der weitereFunktion1-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeitereFunktion1() {
        return weitereFunktion1;
    }

    /**
     * Legt den Wert der weitereFunktion1-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeitereFunktion1(String value) {
        this.weitereFunktion1 = value;
    }

    /**
     * Ruft den Wert der weitereFunktion2-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeitereFunktion2() {
        return weitereFunktion2;
    }

    /**
     * Legt den Wert der weitereFunktion2-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeitereFunktion2(String value) {
        this.weitereFunktion2 = value;
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
     * Ruft den Wert der weitereDetailFunktion1-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getWeitereDetailFunktion1() {
        return weitereDetailFunktion1;
    }

    /**
     * Legt den Wert der weitereDetailFunktion1-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setWeitereDetailFunktion1(CodeType value) {
        this.weitereDetailFunktion1 = value;
    }

    /**
     * Ruft den Wert der weitereDetailFunktion2-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getWeitereDetailFunktion2() {
        return weitereDetailFunktion2;
    }

    /**
     * Legt den Wert der weitereDetailFunktion2-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setWeitereDetailFunktion2(CodeType value) {
        this.weitereDetailFunktion2 = value;
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
