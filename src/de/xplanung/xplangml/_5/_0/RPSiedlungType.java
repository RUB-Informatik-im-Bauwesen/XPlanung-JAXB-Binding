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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Allgemeines Siedlungsobjekt. Dieses vererbt an mehrere Spezialisierungen, ist aber selbst nicht abstrakt.
 * 
 * <p>Java-Klasse für RP_SiedlungType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RP_SiedlungType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/5/0}RP_GeometrieobjektType">
 *       &lt;sequence>
 *         &lt;element name="bauhoehenbeschraenkung" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="istSiedlungsbeschraenkung" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/5/0}_GenericApplicationPropertyOfRP_Siedlung" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RP_SiedlungType", propOrder = {
    "bauhoehenbeschraenkung",
    "istSiedlungsbeschraenkung",
    "genericApplicationPropertyOfRPSiedlung"
})
@XmlSeeAlso({
    RPSonstigerSiedlungsbereichType.class,
    RPIndustrieGewerbeType.class,
    RPWohnenSiedlungType.class,
    RPEinzelhandelType.class
})
public class RPSiedlungType
    extends RPGeometrieobjektType
{

    protected Integer bauhoehenbeschraenkung;
    @XmlElement(defaultValue = "false")
    protected Boolean istSiedlungsbeschraenkung;
    @XmlElement(name = "_GenericApplicationPropertyOfRP_Siedlung")
    protected List<Object> genericApplicationPropertyOfRPSiedlung;

    /**
     * Ruft den Wert der bauhoehenbeschraenkung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBauhoehenbeschraenkung() {
        return bauhoehenbeschraenkung;
    }

    /**
     * Legt den Wert der bauhoehenbeschraenkung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBauhoehenbeschraenkung(Integer value) {
        this.bauhoehenbeschraenkung = value;
    }

    /**
     * Ruft den Wert der istSiedlungsbeschraenkung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIstSiedlungsbeschraenkung() {
        return istSiedlungsbeschraenkung;
    }

    /**
     * Legt den Wert der istSiedlungsbeschraenkung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIstSiedlungsbeschraenkung(Boolean value) {
        this.istSiedlungsbeschraenkung = value;
    }

    /**
     * Gets the value of the genericApplicationPropertyOfRPSiedlung property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfRPSiedlung property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfRPSiedlung().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfRPSiedlung() {
        if (genericApplicationPropertyOfRPSiedlung == null) {
            genericApplicationPropertyOfRPSiedlung = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfRPSiedlung;
    }

}
