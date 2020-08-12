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
 * Modelliert einen allgemeinen Planungsraum.
 * 
 * <p>Java-Klasse für RP_PlanungsraumType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RP_PlanungsraumType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/5/0}RP_GeometrieobjektType">
 *       &lt;sequence>
 *         &lt;element name="planungsraumBeschreibung" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/5/0}_GenericApplicationPropertyOfRP_Planungsraum" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RP_PlanungsraumType", propOrder = {
    "planungsraumBeschreibung",
    "genericApplicationPropertyOfRPPlanungsraum"
})
public class RPPlanungsraumType
    extends RPGeometrieobjektType
{

    protected String planungsraumBeschreibung;
    @XmlElement(name = "_GenericApplicationPropertyOfRP_Planungsraum")
    protected List<Object> genericApplicationPropertyOfRPPlanungsraum;

    /**
     * Ruft den Wert der planungsraumBeschreibung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanungsraumBeschreibung() {
        return planungsraumBeschreibung;
    }

    /**
     * Legt den Wert der planungsraumBeschreibung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanungsraumBeschreibung(String value) {
        this.planungsraumBeschreibung = value;
    }

    /**
     * Gets the value of the genericApplicationPropertyOfRPPlanungsraum property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfRPPlanungsraum property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfRPPlanungsraum().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfRPPlanungsraum() {
        if (genericApplicationPropertyOfRPPlanungsraum == null) {
            genericApplicationPropertyOfRPPlanungsraum = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfRPPlanungsraum;
    }

}
