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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import net.opengis.gml._3.CodeType;


/**
 * Verweis auf ein extern gespeichertes Dokument, einen extern gespeicherten, georeferenzierten Plan oder einen Datenbank-Eintrag. Einer der beiden Attribute "<i>referenzName</i>" bzw. "<i>referenzURL</i>" muss belegt sein.
 * 
 * <p>Java-Klasse für XP_ExterneReferenzType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="XP_ExterneReferenzType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="georefURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="georefMimeType" type="{http://www.opengis.net/gml/3.2}CodeType" minOccurs="0"/>
 *         &lt;element name="art" type="{http://www.xplanung.de/xplangml/5/1}XP_ExterneReferenzArt" minOccurs="0"/>
 *         &lt;element name="informationssystemURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="referenzName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="referenzURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="referenzMimeType" type="{http://www.opengis.net/gml/3.2}CodeType" minOccurs="0"/>
 *         &lt;element name="beschreibung" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="datum" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/5/1}_GenericApplicationPropertyOfXP_ExterneReferenz" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XP_ExterneReferenzType", propOrder = {
    "georefURL",
    "georefMimeType",
    "art",
    "informationssystemURL",
    "referenzName",
    "referenzURL",
    "referenzMimeType",
    "beschreibung",
    "datum",
    "genericApplicationPropertyOfXPExterneReferenz"
})
@XmlSeeAlso({
    XPSpezExterneReferenzType.class
})
public class XPExterneReferenzType {

    @XmlSchemaType(name = "anyURI")
    protected String georefURL;
    protected CodeType georefMimeType;
    @XmlSchemaType(name = "string")
    protected XPExterneReferenzArt art;
    @XmlSchemaType(name = "anyURI")
    protected String informationssystemURL;
    protected String referenzName;
    @XmlSchemaType(name = "anyURI")
    protected String referenzURL;
    protected CodeType referenzMimeType;
    protected String beschreibung;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datum;
    @XmlElement(name = "_GenericApplicationPropertyOfXP_ExterneReferenz")
    protected List<Object> genericApplicationPropertyOfXPExterneReferenz;

    /**
     * Ruft den Wert der georefURL-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeorefURL() {
        return georefURL;
    }

    /**
     * Legt den Wert der georefURL-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeorefURL(String value) {
        this.georefURL = value;
    }

    /**
     * Ruft den Wert der georefMimeType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getGeorefMimeType() {
        return georefMimeType;
    }

    /**
     * Legt den Wert der georefMimeType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setGeorefMimeType(CodeType value) {
        this.georefMimeType = value;
    }

    /**
     * Ruft den Wert der art-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XPExterneReferenzArt }
     *     
     */
    public XPExterneReferenzArt getArt() {
        return art;
    }

    /**
     * Legt den Wert der art-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XPExterneReferenzArt }
     *     
     */
    public void setArt(XPExterneReferenzArt value) {
        this.art = value;
    }

    /**
     * Ruft den Wert der informationssystemURL-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInformationssystemURL() {
        return informationssystemURL;
    }

    /**
     * Legt den Wert der informationssystemURL-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInformationssystemURL(String value) {
        this.informationssystemURL = value;
    }

    /**
     * Ruft den Wert der referenzName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenzName() {
        return referenzName;
    }

    /**
     * Legt den Wert der referenzName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenzName(String value) {
        this.referenzName = value;
    }

    /**
     * Ruft den Wert der referenzURL-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenzURL() {
        return referenzURL;
    }

    /**
     * Legt den Wert der referenzURL-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenzURL(String value) {
        this.referenzURL = value;
    }

    /**
     * Ruft den Wert der referenzMimeType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getReferenzMimeType() {
        return referenzMimeType;
    }

    /**
     * Legt den Wert der referenzMimeType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setReferenzMimeType(CodeType value) {
        this.referenzMimeType = value;
    }

    /**
     * Ruft den Wert der beschreibung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeschreibung() {
        return beschreibung;
    }

    /**
     * Legt den Wert der beschreibung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeschreibung(String value) {
        this.beschreibung = value;
    }

    /**
     * Ruft den Wert der datum-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatum() {
        return datum;
    }

    /**
     * Legt den Wert der datum-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatum(XMLGregorianCalendar value) {
        this.datum = value;
    }

    /**
     * Gets the value of the genericApplicationPropertyOfXPExterneReferenz property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfXPExterneReferenz property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfXPExterneReferenz().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfXPExterneReferenz() {
        if (genericApplicationPropertyOfXPExterneReferenz == null) {
            genericApplicationPropertyOfXPExterneReferenz = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfXPExterneReferenz;
    }

}
