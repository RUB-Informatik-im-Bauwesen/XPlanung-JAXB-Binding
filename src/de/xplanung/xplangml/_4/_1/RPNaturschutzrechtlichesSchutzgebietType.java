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
 * Schutzgebiet nach Bundes-Naturschutzgesetz
 * 
 * <p>Java-Klasse für RP_NaturschutzrechtlichesSchutzgebietType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RP_NaturschutzrechtlichesSchutzgebietType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/4/1}RP_GeometrieobjektType">
 *       &lt;sequence>
 *         &lt;element name="zweckbestimmung" type="{http://www.xplanung.de/xplangml/4/1}XP_KlassifizSchutzgebietNaturschutzrecht" minOccurs="0"/>
 *         &lt;element name="istAusgleichsgebiet" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/4/1}_GenericApplicationPropertyOfRP_NaturschutzrechtlichesSchutzgebiet" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RP_NaturschutzrechtlichesSchutzgebietType", propOrder = {
    "zweckbestimmung",
    "istAusgleichsgebiet",
    "genericApplicationPropertyOfRPNaturschutzrechtlichesSchutzgebiet"
})
public class RPNaturschutzrechtlichesSchutzgebietType
    extends RPGeometrieobjektType
{

    protected String zweckbestimmung;
    protected Boolean istAusgleichsgebiet;
    @XmlElement(name = "_GenericApplicationPropertyOfRP_NaturschutzrechtlichesSchutzgebiet")
    protected List<Object> genericApplicationPropertyOfRPNaturschutzrechtlichesSchutzgebiet;

    /**
     * Ruft den Wert der zweckbestimmung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZweckbestimmung() {
        return zweckbestimmung;
    }

    /**
     * Legt den Wert der zweckbestimmung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZweckbestimmung(String value) {
        this.zweckbestimmung = value;
    }

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
     * Gets the value of the genericApplicationPropertyOfRPNaturschutzrechtlichesSchutzgebiet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfRPNaturschutzrechtlichesSchutzgebiet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfRPNaturschutzrechtlichesSchutzgebiet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfRPNaturschutzrechtlichesSchutzgebiet() {
        if (genericApplicationPropertyOfRPNaturschutzrechtlichesSchutzgebiet == null) {
            genericApplicationPropertyOfRPNaturschutzrechtlichesSchutzgebiet = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfRPNaturschutzrechtlichesSchutzgebiet;
    }

}
