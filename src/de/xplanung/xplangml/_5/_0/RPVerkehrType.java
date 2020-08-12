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
 * Enthält allgemeine Verkehrs-Infrastruktur, die auch multiple Typen (etwa Straße und Schiene) beinhalten kann. Die Klasse selbst vererbt an spezialisierte Verkehrsarten, ist aber nicht abstrakt (d.h. sie kann selbst auch verwendet werden).
 * 
 * <p>Java-Klasse für RP_VerkehrType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RP_VerkehrType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/5/0}RP_GeometrieobjektType">
 *       &lt;sequence>
 *         &lt;element name="allgemeinerTyp" type="{http://www.xplanung.de/xplangml/5/0}RP_VerkehrTypen" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.xplanung.de/xplangml/5/0}RP_VerkehrStatus" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="bezeichnung" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/5/0}_GenericApplicationPropertyOfRP_Verkehr" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RP_VerkehrType", propOrder = {
    "allgemeinerTyp",
    "status",
    "bezeichnung",
    "genericApplicationPropertyOfRPVerkehr"
})
@XmlSeeAlso({
    RPWasserverkehrType.class,
    RPSonstVerkehrType.class,
    RPLuftverkehrType.class,
    RPStrassenverkehrType.class,
    RPSchienenverkehrType.class
})
public class RPVerkehrType
    extends RPGeometrieobjektType
{

    protected List<String> allgemeinerTyp;
    protected List<String> status;
    protected String bezeichnung;
    @XmlElement(name = "_GenericApplicationPropertyOfRP_Verkehr")
    protected List<Object> genericApplicationPropertyOfRPVerkehr;

    /**
     * Gets the value of the allgemeinerTyp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allgemeinerTyp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllgemeinerTyp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAllgemeinerTyp() {
        if (allgemeinerTyp == null) {
            allgemeinerTyp = new ArrayList<String>();
        }
        return this.allgemeinerTyp;
    }

    /**
     * Gets the value of the status property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the status property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getStatus() {
        if (status == null) {
            status = new ArrayList<String>();
        }
        return this.status;
    }

    /**
     * Ruft den Wert der bezeichnung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBezeichnung() {
        return bezeichnung;
    }

    /**
     * Legt den Wert der bezeichnung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBezeichnung(String value) {
        this.bezeichnung = value;
    }

    /**
     * Gets the value of the genericApplicationPropertyOfRPVerkehr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfRPVerkehr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfRPVerkehr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfRPVerkehr() {
        if (genericApplicationPropertyOfRPVerkehr == null) {
            genericApplicationPropertyOfRPVerkehr = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfRPVerkehr;
    }

}
