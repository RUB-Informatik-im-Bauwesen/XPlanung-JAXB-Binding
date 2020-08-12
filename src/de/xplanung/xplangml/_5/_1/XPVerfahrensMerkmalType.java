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
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Vermerk eines am Planungsverfahrens beteiligten Akteurs.
 * 
 * 
 * <p>Java-Klasse für XP_VerfahrensMerkmalType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="XP_VerfahrensMerkmalType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vermerk" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="datum" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="signatur" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="signiert" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/5/1}_GenericApplicationPropertyOfXP_VerfahrensMerkmal" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XP_VerfahrensMerkmalType", propOrder = {
    "vermerk",
    "datum",
    "signatur",
    "signiert",
    "genericApplicationPropertyOfXPVerfahrensMerkmal"
})
public class XPVerfahrensMerkmalType {

    @XmlElement(required = true)
    protected String vermerk;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datum;
    @XmlElement(required = true)
    protected String signatur;
    protected boolean signiert;
    @XmlElement(name = "_GenericApplicationPropertyOfXP_VerfahrensMerkmal")
    protected List<Object> genericApplicationPropertyOfXPVerfahrensMerkmal;

    /**
     * Ruft den Wert der vermerk-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVermerk() {
        return vermerk;
    }

    /**
     * Legt den Wert der vermerk-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVermerk(String value) {
        this.vermerk = value;
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
     * Ruft den Wert der signatur-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignatur() {
        return signatur;
    }

    /**
     * Legt den Wert der signatur-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignatur(String value) {
        this.signatur = value;
    }

    /**
     * Ruft den Wert der signiert-Eigenschaft ab.
     * 
     */
    public boolean isSigniert() {
        return signiert;
    }

    /**
     * Legt den Wert der signiert-Eigenschaft fest.
     * 
     */
    public void setSigniert(boolean value) {
        this.signiert = value;
    }

    /**
     * Gets the value of the genericApplicationPropertyOfXPVerfahrensMerkmal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfXPVerfahrensMerkmal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfXPVerfahrensMerkmal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfXPVerfahrensMerkmal() {
        if (genericApplicationPropertyOfXPVerfahrensMerkmal == null) {
            genericApplicationPropertyOfXPVerfahrensMerkmal = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfXPVerfahrensMerkmal;
    }

}
