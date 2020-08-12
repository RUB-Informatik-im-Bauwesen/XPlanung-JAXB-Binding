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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Ausweisung einer Veränderungssperre, die nicht den gesamten Geltungsbereich des Plans umfasst. Bei Verwendung dieser Klasse muss das Attribut 'veraenderungssperre" des zugehörigen Plans (Klasse BP_Plan) auf "false" gesetzt werden.
 * 
 * 
 * <p>Java-Klasse für BP_VeraenderungssperreType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="BP_VeraenderungssperreType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/4/1}BP_UeberlagerungsobjektType">
 *       &lt;sequence>
 *         &lt;element name="gueltigkeitsDatum" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="verlaengerung" type="{http://www.xplanung.de/xplangml/4/1}XP_VerlaengerungVeraenderungssperre"/>
 *         &lt;element name="refBeschluss" type="{http://www.xplanung.de/xplangml/4/1}XP_ExterneReferenzPropertyType" minOccurs="0"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/4/1}_GenericApplicationPropertyOfBP_Veraenderungssperre" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BP_VeraenderungssperreType", propOrder = {
    "gueltigkeitsDatum",
    "verlaengerung",
    "refBeschluss",
    "genericApplicationPropertyOfBPVeraenderungssperre"
})
public class BPVeraenderungssperreType
    extends BPUeberlagerungsobjektType
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar gueltigkeitsDatum;
    @XmlElement(required = true)
    protected String verlaengerung;
    protected XPExterneReferenzPropertyType refBeschluss;
    @XmlElement(name = "_GenericApplicationPropertyOfBP_Veraenderungssperre")
    protected List<Object> genericApplicationPropertyOfBPVeraenderungssperre;

    /**
     * Ruft den Wert der gueltigkeitsDatum-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGueltigkeitsDatum() {
        return gueltigkeitsDatum;
    }

    /**
     * Legt den Wert der gueltigkeitsDatum-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGueltigkeitsDatum(XMLGregorianCalendar value) {
        this.gueltigkeitsDatum = value;
    }

    /**
     * Ruft den Wert der verlaengerung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerlaengerung() {
        return verlaengerung;
    }

    /**
     * Legt den Wert der verlaengerung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerlaengerung(String value) {
        this.verlaengerung = value;
    }

    /**
     * Ruft den Wert der refBeschluss-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XPExterneReferenzPropertyType }
     *     
     */
    public XPExterneReferenzPropertyType getRefBeschluss() {
        return refBeschluss;
    }

    /**
     * Legt den Wert der refBeschluss-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XPExterneReferenzPropertyType }
     *     
     */
    public void setRefBeschluss(XPExterneReferenzPropertyType value) {
        this.refBeschluss = value;
    }

    /**
     * Gets the value of the genericApplicationPropertyOfBPVeraenderungssperre property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfBPVeraenderungssperre property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfBPVeraenderungssperre().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfBPVeraenderungssperre() {
        if (genericApplicationPropertyOfBPVeraenderungssperre == null) {
            genericApplicationPropertyOfBPVeraenderungssperre = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfBPVeraenderungssperre;
    }

}
