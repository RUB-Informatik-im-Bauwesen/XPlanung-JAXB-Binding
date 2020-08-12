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


/**
 * Schutzgebiet nach Bundes-Naturschutzgesetz.
 * 
 * <p>Java-Klasse für RP_NaturschutzrechtlichesSchutzgebietType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RP_NaturschutzrechtlichesSchutzgebietType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/5/1}RP_FreiraumType">
 *       &lt;sequence>
 *         &lt;element name="typ" type="{http://www.xplanung.de/xplangml/5/1}XP_KlassifizSchutzgebietNaturschutzrecht" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="istKernzone" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/5/1}_GenericApplicationPropertyOfRP_NaturschutzrechtlichesSchutzgebiet" maxOccurs="unbounded" minOccurs="0"/>
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
    "typ",
    "istKernzone",
    "genericApplicationPropertyOfRPNaturschutzrechtlichesSchutzgebiet"
})
public class RPNaturschutzrechtlichesSchutzgebietType
    extends RPFreiraumType
{

    protected List<String> typ;
    @XmlElement(defaultValue = "false")
    protected Boolean istKernzone;
    @XmlElement(name = "_GenericApplicationPropertyOfRP_NaturschutzrechtlichesSchutzgebiet")
    protected List<Object> genericApplicationPropertyOfRPNaturschutzrechtlichesSchutzgebiet;

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
     * Ruft den Wert der istKernzone-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIstKernzone() {
        return istKernzone;
    }

    /**
     * Legt den Wert der istKernzone-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIstKernzone(Boolean value) {
        this.istKernzone = value;
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
