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
 * Spezifikation der Attribute für einer Schutz-, Pflege- oder Entwicklungsmaßnahme.
 * 
 * 
 * <p>Java-Klasse für XP_SPEMassnahmenDatenType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="XP_SPEMassnahmenDatenType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="klassifizMassnahme" type="{http://www.xplanung.de/xplangml/4/1}XP_SPEMassnahmenTypen" minOccurs="0"/>
 *         &lt;element name="massnahmeText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="massnahmeKuerzel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/4/1}_GenericApplicationPropertyOfXP_SPEMassnahmenDaten" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XP_SPEMassnahmenDatenType", propOrder = {
    "klassifizMassnahme",
    "massnahmeText",
    "massnahmeKuerzel",
    "genericApplicationPropertyOfXPSPEMassnahmenDaten"
})
public class XPSPEMassnahmenDatenType {

    protected String klassifizMassnahme;
    protected String massnahmeText;
    protected String massnahmeKuerzel;
    @XmlElement(name = "_GenericApplicationPropertyOfXP_SPEMassnahmenDaten")
    protected List<Object> genericApplicationPropertyOfXPSPEMassnahmenDaten;

    /**
     * Ruft den Wert der klassifizMassnahme-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKlassifizMassnahme() {
        return klassifizMassnahme;
    }

    /**
     * Legt den Wert der klassifizMassnahme-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKlassifizMassnahme(String value) {
        this.klassifizMassnahme = value;
    }

    /**
     * Ruft den Wert der massnahmeText-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMassnahmeText() {
        return massnahmeText;
    }

    /**
     * Legt den Wert der massnahmeText-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMassnahmeText(String value) {
        this.massnahmeText = value;
    }

    /**
     * Ruft den Wert der massnahmeKuerzel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMassnahmeKuerzel() {
        return massnahmeKuerzel;
    }

    /**
     * Legt den Wert der massnahmeKuerzel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMassnahmeKuerzel(String value) {
        this.massnahmeKuerzel = value;
    }

    /**
     * Gets the value of the genericApplicationPropertyOfXPSPEMassnahmenDaten property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfXPSPEMassnahmenDaten property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfXPSPEMassnahmenDaten().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfXPSPEMassnahmenDaten() {
        if (genericApplicationPropertyOfXPSPEMassnahmenDaten == null) {
            genericApplicationPropertyOfXPSPEMassnahmenDaten = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfXPSPEMassnahmenDaten;
    }

}
