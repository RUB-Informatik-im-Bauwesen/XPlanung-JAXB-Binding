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
 * Zu begrünende Grundstücksfläche
 * 
 * 
 * <p>Java-Klasse für LP_ZuBegruenendeGrundstueckflaecheType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="LP_ZuBegruenendeGrundstueckflaecheType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/5/0}LP_FlaechenobjektType">
 *       &lt;sequence>
 *         &lt;element name="gruenflaechenFaktor" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="gaertnerischanzulegen" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/5/0}_GenericApplicationPropertyOfLP_ZuBegruenendeGrundstueckflaeche" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LP_ZuBegruenendeGrundstueckflaecheType", propOrder = {
    "gruenflaechenFaktor",
    "gaertnerischanzulegen",
    "genericApplicationPropertyOfLPZuBegruenendeGrundstueckflaeche"
})
public class LPZuBegruenendeGrundstueckflaecheType
    extends LPFlaechenobjektType
{

    protected Double gruenflaechenFaktor;
    protected Boolean gaertnerischanzulegen;
    @XmlElement(name = "_GenericApplicationPropertyOfLP_ZuBegruenendeGrundstueckflaeche")
    protected List<Object> genericApplicationPropertyOfLPZuBegruenendeGrundstueckflaeche;

    /**
     * Ruft den Wert der gruenflaechenFaktor-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getGruenflaechenFaktor() {
        return gruenflaechenFaktor;
    }

    /**
     * Legt den Wert der gruenflaechenFaktor-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setGruenflaechenFaktor(Double value) {
        this.gruenflaechenFaktor = value;
    }

    /**
     * Ruft den Wert der gaertnerischanzulegen-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGaertnerischanzulegen() {
        return gaertnerischanzulegen;
    }

    /**
     * Legt den Wert der gaertnerischanzulegen-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGaertnerischanzulegen(Boolean value) {
        this.gaertnerischanzulegen = value;
    }

    /**
     * Gets the value of the genericApplicationPropertyOfLPZuBegruenendeGrundstueckflaeche property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfLPZuBegruenendeGrundstueckflaeche property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfLPZuBegruenendeGrundstueckflaeche().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfLPZuBegruenendeGrundstueckflaeche() {
        if (genericApplicationPropertyOfLPZuBegruenendeGrundstueckflaeche == null) {
            genericApplicationPropertyOfLPZuBegruenendeGrundstueckflaeche = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfLPZuBegruenendeGrundstueckflaeche;
    }

}
