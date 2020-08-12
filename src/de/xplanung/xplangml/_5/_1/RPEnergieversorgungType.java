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
 * Infrastruktur zur Energieversorgung. Beinhaltet Energieerzeugung und die Belieferung von Verbrauchern mit Nutzenergie. Erneuerbare Energie wie Windkraft wird im Normalfall auf die Klasse RP_ErneuerbareEnergie im Unterpaket Freiraumstruktur zugeordnet. Je nach Kontext kann aber auch eine Zuordnung auf RP_Energieversorgung stattfinden.
 * 
 * <p>Java-Klasse für RP_EnergieversorgungType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RP_EnergieversorgungType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/5/1}RP_GeometrieobjektType">
 *       &lt;sequence>
 *         &lt;element name="typ" type="{http://www.xplanung.de/xplangml/5/1}RP_EnergieversorgungTypen" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="primaerenergieTyp" type="{http://www.xplanung.de/xplangml/5/1}RP_PrimaerenergieTypen" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="spannung" type="{http://www.xplanung.de/xplangml/5/1}RP_SpannungTypen" minOccurs="0"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/5/1}_GenericApplicationPropertyOfRP_Energieversorgung" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RP_EnergieversorgungType", propOrder = {
    "typ",
    "primaerenergieTyp",
    "spannung",
    "genericApplicationPropertyOfRPEnergieversorgung"
})
public class RPEnergieversorgungType
    extends RPGeometrieobjektType
{

    protected List<String> typ;
    protected List<String> primaerenergieTyp;
    protected String spannung;
    @XmlElement(name = "_GenericApplicationPropertyOfRP_Energieversorgung")
    protected List<Object> genericApplicationPropertyOfRPEnergieversorgung;

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
     * Gets the value of the primaerenergieTyp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the primaerenergieTyp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrimaerenergieTyp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPrimaerenergieTyp() {
        if (primaerenergieTyp == null) {
            primaerenergieTyp = new ArrayList<String>();
        }
        return this.primaerenergieTyp;
    }

    /**
     * Ruft den Wert der spannung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpannung() {
        return spannung;
    }

    /**
     * Legt den Wert der spannung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpannung(String value) {
        this.spannung = value;
    }

    /**
     * Gets the value of the genericApplicationPropertyOfRPEnergieversorgung property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfRPEnergieversorgung property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfRPEnergieversorgung().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfRPEnergieversorgung() {
        if (genericApplicationPropertyOfRPEnergieversorgung == null) {
            genericApplicationPropertyOfRPEnergieversorgung = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfRPEnergieversorgung;
    }

}
