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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Allgemeines Freiraumobjekt.
 * Freiräume sind naturnahem Zustand, oder beinhalten Nutzungsformen, die mit seinen ökologischen Grundfunktionen überwiegend verträglich sind (z.B. Land- oder Forstwirtschaft). Freiraum ist somit ein Gegenbegriff zur Siedlungsstruktur.
 * 
 * <p>Java-Klasse für RP_FreiraumType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RP_FreiraumType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/5/0}RP_GeometrieobjektType">
 *       &lt;sequence>
 *         &lt;element name="istAusgleichsgebiet" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="imVerbund" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/5/0}_GenericApplicationPropertyOfRP_Freiraum" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RP_FreiraumType", propOrder = {
    "istAusgleichsgebiet",
    "imVerbund",
    "genericApplicationPropertyOfRPFreiraum"
})
@XmlSeeAlso({
    RPForstwirtschaftType.class,
    RPRadwegWanderwegType.class,
    RPKlimaschutzType.class,
    RPSonstigerFreiraumschutzType.class,
    RPSportanlageType.class,
    RPBodenschutzType.class,
    RPErholungType.class,
    RPKulturlandschaftType.class,
    RPRohstoffType.class,
    RPGewaesserType.class,
    RPWasserschutzType.class,
    RPNaturschutzrechtlichesSchutzgebietType.class,
    RPGruenzugGruenzaesurType.class,
    RPHochwasserschutzType.class,
    RPLandwirtschaftType.class,
    RPNaturLandschaftType.class,
    RPErneuerbareEnergieType.class
})
public class RPFreiraumType
    extends RPGeometrieobjektType
{

    @XmlElement(defaultValue = "false")
    protected Boolean istAusgleichsgebiet;
    @XmlElement(defaultValue = "false")
    protected Boolean imVerbund;
    @XmlElement(name = "_GenericApplicationPropertyOfRP_Freiraum")
    protected List<Object> genericApplicationPropertyOfRPFreiraum;

    /**
     * Ruft den Wert der istAusgleichsgebiet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIstAusgleichsgebiet() {
        return istAusgleichsgebiet;
    }

    /**
     * Legt den Wert der istAusgleichsgebiet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIstAusgleichsgebiet(Boolean value) {
        this.istAusgleichsgebiet = value;
    }

    /**
     * Ruft den Wert der imVerbund-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isImVerbund() {
        return imVerbund;
    }

    /**
     * Legt den Wert der imVerbund-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setImVerbund(Boolean value) {
        this.imVerbund = value;
    }

    /**
     * Gets the value of the genericApplicationPropertyOfRPFreiraum property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfRPFreiraum property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfRPFreiraum().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfRPFreiraum() {
        if (genericApplicationPropertyOfRPFreiraum == null) {
            genericApplicationPropertyOfRPFreiraum = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfRPFreiraum;
    }

}
