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
 * Raumkategorien sind nach bestimmten Kriterien abgegrenze Gebiete, in denen vergleichbare Strukturen bestehen und in denen die Raumordnung gleichartige Ziele verfolgt. Kriterien können z.B. siedlungsstrukturell, qualitativ oder potentialorientiert sein.
 * 
 * <p>Java-Klasse für RP_RaumkategorieType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RP_RaumkategorieType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/5/0}RP_GeometrieobjektType">
 *       &lt;sequence>
 *         &lt;element name="besondererTyp" type="{http://www.xplanung.de/xplangml/5/0}RP_BesondereRaumkategorieTypen" minOccurs="0"/>
 *         &lt;element name="typ" type="{http://www.xplanung.de/xplangml/5/0}RP_RaumkategorieTypen" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/5/0}_GenericApplicationPropertyOfRP_Raumkategorie" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RP_RaumkategorieType", propOrder = {
    "besondererTyp",
    "typ",
    "genericApplicationPropertyOfRPRaumkategorie"
})
public class RPRaumkategorieType
    extends RPGeometrieobjektType
{

    protected String besondererTyp;
    protected List<String> typ;
    @XmlElement(name = "_GenericApplicationPropertyOfRP_Raumkategorie")
    protected List<Object> genericApplicationPropertyOfRPRaumkategorie;

    /**
     * Ruft den Wert der besondererTyp-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBesondererTyp() {
        return besondererTyp;
    }

    /**
     * Legt den Wert der besondererTyp-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBesondererTyp(String value) {
        this.besondererTyp = value;
    }

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
     * Gets the value of the genericApplicationPropertyOfRPRaumkategorie property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfRPRaumkategorie property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfRPRaumkategorie().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfRPRaumkategorie() {
        if (genericApplicationPropertyOfRPRaumkategorie == null) {
            genericApplicationPropertyOfRPRaumkategorie = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfRPRaumkategorie;
    }

}
