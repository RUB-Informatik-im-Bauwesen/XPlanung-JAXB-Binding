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
 * Soziale Infrastruktur
 * 
 * 
 * <p>Java-Klasse für RP_SozialeInfrastrukturType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RP_SozialeInfrastrukturType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/4/1}RP_GeometrieobjektType">
 *       &lt;sequence>
 *         &lt;element name="gebietsTyp" type="{http://www.xplanung.de/xplangml/4/1}RP_GebietsTyp" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="typ" type="{http://www.xplanung.de/xplangml/4/1}RP_SozialeInfrastrukturTypen" minOccurs="0"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/4/1}_GenericApplicationPropertyOfRP_SozialeInfrastruktur" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RP_SozialeInfrastrukturType", propOrder = {
    "gebietsTyp",
    "typ",
    "genericApplicationPropertyOfRPSozialeInfrastruktur"
})
public class RPSozialeInfrastrukturType
    extends RPGeometrieobjektType
{

    protected List<String> gebietsTyp;
    protected String typ;
    @XmlElement(name = "_GenericApplicationPropertyOfRP_SozialeInfrastruktur")
    protected List<Object> genericApplicationPropertyOfRPSozialeInfrastruktur;

    /**
     * Gets the value of the gebietsTyp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gebietsTyp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGebietsTyp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getGebietsTyp() {
        if (gebietsTyp == null) {
            gebietsTyp = new ArrayList<String>();
        }
        return this.gebietsTyp;
    }

    /**
     * Ruft den Wert der typ-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTyp() {
        return typ;
    }

    /**
     * Legt den Wert der typ-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTyp(String value) {
        this.typ = value;
    }

    /**
     * Gets the value of the genericApplicationPropertyOfRPSozialeInfrastruktur property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfRPSozialeInfrastruktur property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfRPSozialeInfrastruktur().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfRPSozialeInfrastruktur() {
        if (genericApplicationPropertyOfRPSozialeInfrastruktur == null) {
            genericApplicationPropertyOfRPSozialeInfrastruktur = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfRPSozialeInfrastruktur;
    }

}
