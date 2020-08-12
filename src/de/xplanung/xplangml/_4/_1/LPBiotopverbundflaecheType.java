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
 * Biotop-Verbundfläche
 * 
 * 
 * <p>Java-Klasse für LP_BiotopverbundflaecheType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="LP_BiotopverbundflaecheType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/4/1}LP_GeometrieobjektType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/4/1}_GenericApplicationPropertyOfLP_Biotopverbundflaeche" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LP_BiotopverbundflaecheType", propOrder = {
    "genericApplicationPropertyOfLPBiotopverbundflaeche"
})
public class LPBiotopverbundflaecheType
    extends LPGeometrieobjektType
{

    @XmlElement(name = "_GenericApplicationPropertyOfLP_Biotopverbundflaeche")
    protected List<Object> genericApplicationPropertyOfLPBiotopverbundflaeche;

    /**
     * Gets the value of the genericApplicationPropertyOfLPBiotopverbundflaeche property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfLPBiotopverbundflaeche property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfLPBiotopverbundflaeche().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfLPBiotopverbundflaeche() {
        if (genericApplicationPropertyOfLPBiotopverbundflaeche == null) {
            genericApplicationPropertyOfLPBiotopverbundflaeche = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfLPBiotopverbundflaeche;
    }

}
