//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.06.04 um 03:33:59 PM CEST 
//


package de.xplanung.xplangml._4._1;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml._3.LengthType;


/**
 * Festsetzung einer Baugrenze (§9 Abs. 1 Nr. 2 BauGB, §22 und 23 BauNVO). Über die Attribute <i>geschossMin </i>und <i>geschossMax </i>kann die Festsetzung auf einen Bereich von Geschossen beschränkt werden. Wenn eine Einschränkung der Festsetzung durch expliziter Höhenangaben erfolgen soll, ist dazu die Oberklassen-Relation <i>hoehenangabe </i>auf den komplexen Datentyp <i>XP_Hoehenangabe </i>zu verwenden. 
 * 
 * 
 * <p>Java-Klasse für BP_BauGrenzeType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="BP_BauGrenzeType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/4/1}BP_LinienobjektType">
 *       &lt;sequence>
 *         &lt;element name="bautiefe" type="{http://www.opengis.net/gml/3.2}LengthType" minOccurs="0"/>
 *         &lt;element name="geschossMin" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="geschossMax" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/4/1}_GenericApplicationPropertyOfBP_BauGrenze" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BP_BauGrenzeType", propOrder = {
    "bautiefe",
    "geschossMin",
    "geschossMax",
    "genericApplicationPropertyOfBPBauGrenze"
})
public class BPBauGrenzeType
    extends BPLinienobjektType
{

    protected LengthType bautiefe;
    protected BigInteger geschossMin;
    protected BigInteger geschossMax;
    @XmlElement(name = "_GenericApplicationPropertyOfBP_BauGrenze")
    protected List<Object> genericApplicationPropertyOfBPBauGrenze;

    /**
     * Ruft den Wert der bautiefe-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getBautiefe() {
        return bautiefe;
    }

    /**
     * Legt den Wert der bautiefe-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setBautiefe(LengthType value) {
        this.bautiefe = value;
    }

    /**
     * Ruft den Wert der geschossMin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGeschossMin() {
        return geschossMin;
    }

    /**
     * Legt den Wert der geschossMin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGeschossMin(BigInteger value) {
        this.geschossMin = value;
    }

    /**
     * Ruft den Wert der geschossMax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGeschossMax() {
        return geschossMax;
    }

    /**
     * Legt den Wert der geschossMax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGeschossMax(BigInteger value) {
        this.geschossMax = value;
    }

    /**
     * Gets the value of the genericApplicationPropertyOfBPBauGrenze property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfBPBauGrenze property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfBPBauGrenze().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfBPBauGrenze() {
        if (genericApplicationPropertyOfBPBauGrenze == null) {
            genericApplicationPropertyOfBPBauGrenze = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfBPBauGrenze;
    }

}
