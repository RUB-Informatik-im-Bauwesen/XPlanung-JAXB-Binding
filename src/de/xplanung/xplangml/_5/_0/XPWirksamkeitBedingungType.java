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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Spezifikation von Bedingungen für die Wirksamkeit oder Unwirksamkeit einer Festsetzung.
 * 
 * <p>Java-Klasse für XP_WirksamkeitBedingungType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="XP_WirksamkeitBedingungType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bedingung" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="datumAbsolut" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="datumRelativ" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/5/0}_GenericApplicationPropertyOfXP_WirksamkeitBedingung" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XP_WirksamkeitBedingungType", propOrder = {
    "bedingung",
    "datumAbsolut",
    "datumRelativ",
    "genericApplicationPropertyOfXPWirksamkeitBedingung"
})
public class XPWirksamkeitBedingungType {

    protected String bedingung;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumAbsolut;
    protected Duration datumRelativ;
    @XmlElement(name = "_GenericApplicationPropertyOfXP_WirksamkeitBedingung")
    protected List<Object> genericApplicationPropertyOfXPWirksamkeitBedingung;

    /**
     * Ruft den Wert der bedingung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBedingung() {
        return bedingung;
    }

    /**
     * Legt den Wert der bedingung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBedingung(String value) {
        this.bedingung = value;
    }

    /**
     * Ruft den Wert der datumAbsolut-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumAbsolut() {
        return datumAbsolut;
    }

    /**
     * Legt den Wert der datumAbsolut-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumAbsolut(XMLGregorianCalendar value) {
        this.datumAbsolut = value;
    }

    /**
     * Ruft den Wert der datumRelativ-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getDatumRelativ() {
        return datumRelativ;
    }

    /**
     * Legt den Wert der datumRelativ-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setDatumRelativ(Duration value) {
        this.datumRelativ = value;
    }

    /**
     * Gets the value of the genericApplicationPropertyOfXPWirksamkeitBedingung property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfXPWirksamkeitBedingung property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfXPWirksamkeitBedingung().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfXPWirksamkeitBedingung() {
        if (genericApplicationPropertyOfXPWirksamkeitBedingung == null) {
            genericApplicationPropertyOfXPWirksamkeitBedingung = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfXPWirksamkeitBedingung;
    }

}
