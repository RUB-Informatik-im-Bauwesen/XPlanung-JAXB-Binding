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
import net.opengis.gml._3.CodeType;


/**
 * Gebiete und Gebietsteile mit rechtlichen Bindungen nach anderen Fachgesetzen (soweit sie für den Schutz, die Pflege und die Entwicklung von Natur und Landschaft bedeutsam sind). Hier: Sonstige wasserrechtliche Flächen.
 * 
 * 
 * <p>Java-Klasse für LP_WasserrechtSonstigeType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="LP_WasserrechtSonstigeType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/4/1}LP_GeometrieobjektType">
 *       &lt;sequence>
 *         &lt;element name="typ" type="{http://www.opengis.net/gml/3.2}CodeType" minOccurs="0"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/4/1}_GenericApplicationPropertyOfLP_WasserrechtSonstige" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LP_WasserrechtSonstigeType", propOrder = {
    "typ",
    "genericApplicationPropertyOfLPWasserrechtSonstige"
})
public class LPWasserrechtSonstigeType
    extends LPGeometrieobjektType
{

    protected CodeType typ;
    @XmlElement(name = "_GenericApplicationPropertyOfLP_WasserrechtSonstige")
    protected List<Object> genericApplicationPropertyOfLPWasserrechtSonstige;

    /**
     * Ruft den Wert der typ-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getTyp() {
        return typ;
    }

    /**
     * Legt den Wert der typ-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setTyp(CodeType value) {
        this.typ = value;
    }

    /**
     * Gets the value of the genericApplicationPropertyOfLPWasserrechtSonstige property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfLPWasserrechtSonstige property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfLPWasserrechtSonstige().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfLPWasserrechtSonstige() {
        if (genericApplicationPropertyOfLPWasserrechtSonstige == null) {
            genericApplicationPropertyOfLPWasserrechtSonstige = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfLPWasserrechtSonstige;
    }

}
