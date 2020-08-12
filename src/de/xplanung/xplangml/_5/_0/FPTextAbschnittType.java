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
 * Texlich formulierter Inhalt eines Flächennutzungsplans, der einen anderen Rechtscharakter als das zugrunde liegende Fachobjekt hat (Attribut <i>rechtscharakter </i>des Fachobjektes), oder dem Plan als Ganzes zugeordnet ist.
 * 
 * <p>Java-Klasse für FP_TextAbschnittType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FP_TextAbschnittType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/5/0}XP_TextAbschnittType">
 *       &lt;sequence>
 *         &lt;element name="rechtscharakter" type="{http://www.xplanung.de/xplangml/5/0}FP_Rechtscharakter"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/5/0}_GenericApplicationPropertyOfFP_TextAbschnitt" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FP_TextAbschnittType", propOrder = {
    "rechtscharakter",
    "genericApplicationPropertyOfFPTextAbschnitt"
})
public class FPTextAbschnittType
    extends XPTextAbschnittType
{

    @XmlElement(required = true)
    protected String rechtscharakter;
    @XmlElement(name = "_GenericApplicationPropertyOfFP_TextAbschnitt")
    protected List<Object> genericApplicationPropertyOfFPTextAbschnitt;

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
     * Gets the value of the genericApplicationPropertyOfFPTextAbschnitt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfFPTextAbschnitt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfFPTextAbschnitt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfFPTextAbschnitt() {
        if (genericApplicationPropertyOfFPTextAbschnitt == null) {
            genericApplicationPropertyOfFPTextAbschnitt = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfFPTextAbschnitt;
    }

}
