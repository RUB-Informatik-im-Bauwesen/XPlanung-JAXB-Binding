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
 * Unverbindliche Vormerkung späterer Planungsabsichten.
 * 
 * 
 * <p>Java-Klasse für BP_UnverbindlicheVormerkungType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="BP_UnverbindlicheVormerkungType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/5/1}BP_GeometrieobjektType">
 *       &lt;sequence>
 *         &lt;element name="vormerkung" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/5/1}_GenericApplicationPropertyOfBP_UnverbindlicheVormerkung" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BP_UnverbindlicheVormerkungType", propOrder = {
    "vormerkung",
    "genericApplicationPropertyOfBPUnverbindlicheVormerkung"
})
public class BPUnverbindlicheVormerkungType
    extends BPGeometrieobjektType
{

    protected String vormerkung;
    @XmlElement(name = "_GenericApplicationPropertyOfBP_UnverbindlicheVormerkung")
    protected List<Object> genericApplicationPropertyOfBPUnverbindlicheVormerkung;

    /**
     * Ruft den Wert der vormerkung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVormerkung() {
        return vormerkung;
    }

    /**
     * Legt den Wert der vormerkung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVormerkung(String value) {
        this.vormerkung = value;
    }

    /**
     * Gets the value of the genericApplicationPropertyOfBPUnverbindlicheVormerkung property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfBPUnverbindlicheVormerkung property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfBPUnverbindlicheVormerkung().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfBPUnverbindlicheVormerkung() {
        if (genericApplicationPropertyOfBPUnverbindlicheVormerkung == null) {
            genericApplicationPropertyOfBPUnverbindlicheVormerkung = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfBPUnverbindlicheVormerkung;
    }

}
