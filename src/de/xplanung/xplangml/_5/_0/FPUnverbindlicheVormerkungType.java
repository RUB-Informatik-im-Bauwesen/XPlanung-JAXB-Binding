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
import javax.xml.bind.annotation.XmlType;


/**
 * Unverbindliche Vormerkung späterer Planungsabsichten
 * 
 * 
 * <p>Java-Klasse für FP_UnverbindlicheVormerkungType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FP_UnverbindlicheVormerkungType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/5/0}FP_GeometrieobjektType">
 *       &lt;sequence>
 *         &lt;element name="vormerkung" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/5/0}_GenericApplicationPropertyOfFP_UnverbindlicheVormerkung" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FP_UnverbindlicheVormerkungType", propOrder = {
    "vormerkung",
    "genericApplicationPropertyOfFPUnverbindlicheVormerkung"
})
public class FPUnverbindlicheVormerkungType
    extends FPGeometrieobjektType
{

    protected String vormerkung;
    @XmlElement(name = "_GenericApplicationPropertyOfFP_UnverbindlicheVormerkung")
    protected List<Object> genericApplicationPropertyOfFPUnverbindlicheVormerkung;

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
     * Gets the value of the genericApplicationPropertyOfFPUnverbindlicheVormerkung property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfFPUnverbindlicheVormerkung property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfFPUnverbindlicheVormerkung().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfFPUnverbindlicheVormerkung() {
        if (genericApplicationPropertyOfFPUnverbindlicheVormerkung == null) {
            genericApplicationPropertyOfFPUnverbindlicheVormerkung = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfFPUnverbindlicheVormerkung;
    }

}
