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
 * Freizeit, Erholung und Tourismus.
 * 
 * <p>Java-Klasse für RP_ErholungType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RP_ErholungType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/5/1}RP_FreiraumType">
 *       &lt;sequence>
 *         &lt;element name="typErholung" type="{http://www.xplanung.de/xplangml/5/1}RP_ErholungTypen" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="typTourismus" type="{http://www.xplanung.de/xplangml/5/1}RP_TourismusTypen" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="besondererTyp" type="{http://www.xplanung.de/xplangml/5/1}RP_BesondereTourismusErholungTypen" minOccurs="0"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/5/1}_GenericApplicationPropertyOfRP_Erholung" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RP_ErholungType", propOrder = {
    "typErholung",
    "typTourismus",
    "besondererTyp",
    "genericApplicationPropertyOfRPErholung"
})
public class RPErholungType
    extends RPFreiraumType
{

    protected List<String> typErholung;
    protected List<String> typTourismus;
    protected String besondererTyp;
    @XmlElement(name = "_GenericApplicationPropertyOfRP_Erholung")
    protected List<Object> genericApplicationPropertyOfRPErholung;

    /**
     * Gets the value of the typErholung property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the typErholung property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTypErholung().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTypErholung() {
        if (typErholung == null) {
            typErholung = new ArrayList<String>();
        }
        return this.typErholung;
    }

    /**
     * Gets the value of the typTourismus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the typTourismus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTypTourismus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTypTourismus() {
        if (typTourismus == null) {
            typTourismus = new ArrayList<String>();
        }
        return this.typTourismus;
    }

    /**
     * Ruft den Wert der besondererTyp-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBesondererTyp() {
        return besondererTyp;
    }

    /**
     * Legt den Wert der besondererTyp-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBesondererTyp(String value) {
        this.besondererTyp = value;
    }

    /**
     * Gets the value of the genericApplicationPropertyOfRPErholung property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfRPErholung property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfRPErholung().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfRPErholung() {
        if (genericApplicationPropertyOfRPErholung == null) {
            genericApplicationPropertyOfRPErholung = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfRPErholung;
    }

}
