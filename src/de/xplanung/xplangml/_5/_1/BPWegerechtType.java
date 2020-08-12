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
import net.opengis.gml._3.LengthType;


/**
 * Festsetzung von Flächen, die mit Geh-, Fahr-, und Leitungsrechten zugunsten der Allgemeinheit, eines Erschließungsträgers, oder eines beschränkten Personenkreises belastet sind  (§ 9 Abs. 1 Nr. 21 und Abs. 6 BauGB).
 * 
 * <p>Java-Klasse für BP_WegerechtType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="BP_WegerechtType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/5/1}BP_GeometrieobjektType">
 *       &lt;sequence>
 *         &lt;element name="typ" type="{http://www.xplanung.de/xplangml/5/1}BP_WegerechtTypen" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="zugunstenVon" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="thema" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="breite" type="{http://www.opengis.net/gml/3.2}LengthType" minOccurs="0"/>
 *         &lt;element name="istSchmal" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/5/1}_GenericApplicationPropertyOfBP_Wegerecht" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BP_WegerechtType", propOrder = {
    "typ",
    "zugunstenVon",
    "thema",
    "breite",
    "istSchmal",
    "genericApplicationPropertyOfBPWegerecht"
})
public class BPWegerechtType
    extends BPGeometrieobjektType
{

    protected List<String> typ;
    protected String zugunstenVon;
    protected String thema;
    protected LengthType breite;
    protected Boolean istSchmal;
    @XmlElement(name = "_GenericApplicationPropertyOfBP_Wegerecht")
    protected List<Object> genericApplicationPropertyOfBPWegerecht;

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
     * Ruft den Wert der zugunstenVon-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZugunstenVon() {
        return zugunstenVon;
    }

    /**
     * Legt den Wert der zugunstenVon-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZugunstenVon(String value) {
        this.zugunstenVon = value;
    }

    /**
     * Ruft den Wert der thema-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThema() {
        return thema;
    }

    /**
     * Legt den Wert der thema-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThema(String value) {
        this.thema = value;
    }

    /**
     * Ruft den Wert der breite-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getBreite() {
        return breite;
    }

    /**
     * Legt den Wert der breite-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setBreite(LengthType value) {
        this.breite = value;
    }

    /**
     * Ruft den Wert der istSchmal-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIstSchmal() {
        return istSchmal;
    }

    /**
     * Legt den Wert der istSchmal-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIstSchmal(Boolean value) {
        this.istSchmal = value;
    }

    /**
     * Gets the value of the genericApplicationPropertyOfBPWegerecht property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfBPWegerecht property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfBPWegerecht().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfBPWegerecht() {
        if (genericApplicationPropertyOfBPWegerecht == null) {
            genericApplicationPropertyOfBPWegerecht = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfBPWegerecht;
    }

}
