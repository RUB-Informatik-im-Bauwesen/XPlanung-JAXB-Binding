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
 * Festlegung nach Wasserrecht
 * 
 * 
 * <p>Java-Klasse für SO_WasserrechtType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SO_WasserrechtType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/5/1}SO_GeometrieobjektType">
 *       &lt;sequence>
 *         &lt;element name="artDerFestlegung" type="{http://www.xplanung.de/xplangml/5/1}SO_KlassifizNachWasserrecht" minOccurs="0"/>
 *         &lt;element name="detailArtDerFestlegung" type="{http://www.opengis.net/gml/3.2}CodeType" minOccurs="0"/>
 *         &lt;element name="istNatuerlichesUberschwemmungsgebiet" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nummer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/5/1}_GenericApplicationPropertyOfSO_Wasserrecht" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SO_WasserrechtType", propOrder = {
    "artDerFestlegung",
    "detailArtDerFestlegung",
    "istNatuerlichesUberschwemmungsgebiet",
    "name",
    "nummer",
    "genericApplicationPropertyOfSOWasserrecht"
})
public class SOWasserrechtType
    extends SOGeometrieobjektType
{

    protected String artDerFestlegung;
    protected CodeType detailArtDerFestlegung;
    @XmlElement(defaultValue = "false")
    protected Boolean istNatuerlichesUberschwemmungsgebiet;
    protected String name;
    protected String nummer;
    @XmlElement(name = "_GenericApplicationPropertyOfSO_Wasserrecht")
    protected List<Object> genericApplicationPropertyOfSOWasserrecht;

    /**
     * Ruft den Wert der artDerFestlegung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArtDerFestlegung() {
        return artDerFestlegung;
    }

    /**
     * Legt den Wert der artDerFestlegung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArtDerFestlegung(String value) {
        this.artDerFestlegung = value;
    }

    /**
     * Ruft den Wert der detailArtDerFestlegung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getDetailArtDerFestlegung() {
        return detailArtDerFestlegung;
    }

    /**
     * Legt den Wert der detailArtDerFestlegung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setDetailArtDerFestlegung(CodeType value) {
        this.detailArtDerFestlegung = value;
    }

    /**
     * Ruft den Wert der istNatuerlichesUberschwemmungsgebiet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIstNatuerlichesUberschwemmungsgebiet() {
        return istNatuerlichesUberschwemmungsgebiet;
    }

    /**
     * Legt den Wert der istNatuerlichesUberschwemmungsgebiet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIstNatuerlichesUberschwemmungsgebiet(Boolean value) {
        this.istNatuerlichesUberschwemmungsgebiet = value;
    }

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Ruft den Wert der nummer-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNummer() {
        return nummer;
    }

    /**
     * Legt den Wert der nummer-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNummer(String value) {
        this.nummer = value;
    }

    /**
     * Gets the value of the genericApplicationPropertyOfSOWasserrecht property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfSOWasserrecht property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfSOWasserrecht().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfSOWasserrecht() {
        if (genericApplicationPropertyOfSOWasserrecht == null) {
            genericApplicationPropertyOfSOWasserrecht = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfSOWasserrecht;
    }

}
