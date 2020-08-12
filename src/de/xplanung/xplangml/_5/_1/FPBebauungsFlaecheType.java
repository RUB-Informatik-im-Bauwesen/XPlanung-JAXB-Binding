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
import net.opengis.gml._3.CodeType;


/**
 * Darstellung einer für die Bebauung vorgesehenen Fläche (§ 5, Abs. 2, Nr. 1 BauGB).
 * 
 * <p>Java-Klasse für FP_BebauungsFlaecheType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FP_BebauungsFlaecheType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/5/1}FP_FlaechenschlussobjektType">
 *       &lt;sequence>
 *         &lt;element name="GFZ" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="GFZmin" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="GFZmax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="BMZ" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="GRZ" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="allgArtDerBaulNutzung" type="{http://www.xplanung.de/xplangml/5/1}XP_AllgArtDerBaulNutzung" minOccurs="0"/>
 *         &lt;element name="besondereArtDerBaulNutzung" type="{http://www.xplanung.de/xplangml/5/1}XP_BesondereArtDerBaulNutzung" minOccurs="0"/>
 *         &lt;element name="sonderNutzung" type="{http://www.xplanung.de/xplangml/5/1}XP_Sondernutzungen" minOccurs="0"/>
 *         &lt;element name="detaillierteArtDerBaulNutzung" type="{http://www.opengis.net/gml/3.2}CodeType" minOccurs="0"/>
 *         &lt;element name="nutzungText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/5/1}_GenericApplicationPropertyOfFP_BebauungsFlaeche" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FP_BebauungsFlaecheType", propOrder = {
    "gfz",
    "gfZmin",
    "gfZmax",
    "bmz",
    "grz",
    "allgArtDerBaulNutzung",
    "besondereArtDerBaulNutzung",
    "sonderNutzung",
    "detaillierteArtDerBaulNutzung",
    "nutzungText",
    "genericApplicationPropertyOfFPBebauungsFlaeche"
})
public class FPBebauungsFlaecheType
    extends FPFlaechenschlussobjektType
{

    @XmlElement(name = "GFZ")
    protected Double gfz;
    @XmlElement(name = "GFZmin")
    protected Double gfZmin;
    @XmlElement(name = "GFZmax")
    protected Double gfZmax;
    @XmlElement(name = "BMZ")
    protected Double bmz;
    @XmlElement(name = "GRZ")
    protected Double grz;
    protected String allgArtDerBaulNutzung;
    protected String besondereArtDerBaulNutzung;
    protected String sonderNutzung;
    protected CodeType detaillierteArtDerBaulNutzung;
    protected String nutzungText;
    @XmlElement(name = "_GenericApplicationPropertyOfFP_BebauungsFlaeche")
    protected List<Object> genericApplicationPropertyOfFPBebauungsFlaeche;

    /**
     * Ruft den Wert der gfz-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getGFZ() {
        return gfz;
    }

    /**
     * Legt den Wert der gfz-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setGFZ(Double value) {
        this.gfz = value;
    }

    /**
     * Ruft den Wert der gfZmin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getGFZmin() {
        return gfZmin;
    }

    /**
     * Legt den Wert der gfZmin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setGFZmin(Double value) {
        this.gfZmin = value;
    }

    /**
     * Ruft den Wert der gfZmax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getGFZmax() {
        return gfZmax;
    }

    /**
     * Legt den Wert der gfZmax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setGFZmax(Double value) {
        this.gfZmax = value;
    }

    /**
     * Ruft den Wert der bmz-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBMZ() {
        return bmz;
    }

    /**
     * Legt den Wert der bmz-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBMZ(Double value) {
        this.bmz = value;
    }

    /**
     * Ruft den Wert der grz-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getGRZ() {
        return grz;
    }

    /**
     * Legt den Wert der grz-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setGRZ(Double value) {
        this.grz = value;
    }

    /**
     * Ruft den Wert der allgArtDerBaulNutzung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllgArtDerBaulNutzung() {
        return allgArtDerBaulNutzung;
    }

    /**
     * Legt den Wert der allgArtDerBaulNutzung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllgArtDerBaulNutzung(String value) {
        this.allgArtDerBaulNutzung = value;
    }

    /**
     * Ruft den Wert der besondereArtDerBaulNutzung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBesondereArtDerBaulNutzung() {
        return besondereArtDerBaulNutzung;
    }

    /**
     * Legt den Wert der besondereArtDerBaulNutzung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBesondereArtDerBaulNutzung(String value) {
        this.besondereArtDerBaulNutzung = value;
    }

    /**
     * Ruft den Wert der sonderNutzung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSonderNutzung() {
        return sonderNutzung;
    }

    /**
     * Legt den Wert der sonderNutzung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSonderNutzung(String value) {
        this.sonderNutzung = value;
    }

    /**
     * Ruft den Wert der detaillierteArtDerBaulNutzung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getDetaillierteArtDerBaulNutzung() {
        return detaillierteArtDerBaulNutzung;
    }

    /**
     * Legt den Wert der detaillierteArtDerBaulNutzung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setDetaillierteArtDerBaulNutzung(CodeType value) {
        this.detaillierteArtDerBaulNutzung = value;
    }

    /**
     * Ruft den Wert der nutzungText-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNutzungText() {
        return nutzungText;
    }

    /**
     * Legt den Wert der nutzungText-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNutzungText(String value) {
        this.nutzungText = value;
    }

    /**
     * Gets the value of the genericApplicationPropertyOfFPBebauungsFlaeche property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfFPBebauungsFlaeche property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfFPBebauungsFlaeche().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfFPBebauungsFlaeche() {
        if (genericApplicationPropertyOfFPBebauungsFlaeche == null) {
            genericApplicationPropertyOfFPBebauungsFlaeche = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfFPBebauungsFlaeche;
    }

}
