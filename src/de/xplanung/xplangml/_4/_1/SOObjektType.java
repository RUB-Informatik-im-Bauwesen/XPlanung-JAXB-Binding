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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml._3.CodeType;
import net.opengis.gml._3.ReferenceType;


/**
 * Basisklasse für die Inhalte sonstiger raumbezogener Planwerke sowie von Klassen zur Modellierung nachrichtlicher Übernahmen.
 * 
 * <p>Java-Klasse für SO_ObjektType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SO_ObjektType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/4/1}XP_ObjektType">
 *       &lt;sequence>
 *         &lt;element name="rechtscharakter" type="{http://www.xplanung.de/xplangml/4/1}SO_Rechtscharakter" minOccurs="0"/>
 *         &lt;element name="sonstRechtscharakter" type="{http://www.opengis.net/gml/3.2}CodeType" minOccurs="0"/>
 *         &lt;element name="gehoertZuSO_Bereich" type="{http://www.opengis.net/gml/3.2}ReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/4/1}_GenericApplicationPropertyOfSO_Objekt" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SO_ObjektType", propOrder = {
    "rechtscharakter",
    "sonstRechtscharakter",
    "gehoertZuSOBereich",
    "genericApplicationPropertyOfSOObjekt"
})
@XmlSeeAlso({
    SOFlaechenobjektType.class,
    SOLinienobjektType.class,
    SOPunktobjektType.class,
    SOGeometrieobjektType.class
})
public class SOObjektType
    extends XPObjektType
{

    protected String rechtscharakter;
    protected CodeType sonstRechtscharakter;
    @XmlElement(name = "gehoertZuSO_Bereich")
    protected List<ReferenceType> gehoertZuSOBereich;
    @XmlElement(name = "_GenericApplicationPropertyOfSO_Objekt")
    protected List<Object> genericApplicationPropertyOfSOObjekt;

    /**
     * Ruft den Wert der rechtscharakter-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRechtscharakter() {
        return rechtscharakter;
    }

    /**
     * Legt den Wert der rechtscharakter-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRechtscharakter(String value) {
        this.rechtscharakter = value;
    }

    /**
     * Ruft den Wert der sonstRechtscharakter-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getSonstRechtscharakter() {
        return sonstRechtscharakter;
    }

    /**
     * Legt den Wert der sonstRechtscharakter-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setSonstRechtscharakter(CodeType value) {
        this.sonstRechtscharakter = value;
    }

    /**
     * Gets the value of the gehoertZuSOBereich property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gehoertZuSOBereich property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGehoertZuSOBereich().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenceType }
     * 
     * 
     */
    public List<ReferenceType> getGehoertZuSOBereich() {
        if (gehoertZuSOBereich == null) {
            gehoertZuSOBereich = new ArrayList<ReferenceType>();
        }
        return this.gehoertZuSOBereich;
    }

    /**
     * Gets the value of the genericApplicationPropertyOfSOObjekt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfSOObjekt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfSOObjekt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfSOObjekt() {
        if (genericApplicationPropertyOfSOObjekt == null) {
            genericApplicationPropertyOfSOObjekt = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfSOObjekt;
    }

}
