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
 * Festlegung, Darstellung bzw. Festsetzung zum Landschaftsbild in einem  landschaftsplanerischen Planwerk.
 * 
 * <p>Java-Klasse für LP_LandschaftsbildType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="LP_LandschaftsbildType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/4/1}LP_GeometrieobjektType">
 *       &lt;sequence>
 *         &lt;element name="massnahme" type="{http://www.opengis.net/gml/3.2}CodeType" minOccurs="0"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/4/1}_GenericApplicationPropertyOfLP_Landschaftsbild" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LP_LandschaftsbildType", propOrder = {
    "massnahme",
    "genericApplicationPropertyOfLPLandschaftsbild"
})
public class LPLandschaftsbildType
    extends LPGeometrieobjektType
{

    protected CodeType massnahme;
    @XmlElement(name = "_GenericApplicationPropertyOfLP_Landschaftsbild")
    protected List<Object> genericApplicationPropertyOfLPLandschaftsbild;

    /**
     * Ruft den Wert der massnahme-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getMassnahme() {
        return massnahme;
    }

    /**
     * Legt den Wert der massnahme-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setMassnahme(CodeType value) {
        this.massnahme = value;
    }

    /**
     * Gets the value of the genericApplicationPropertyOfLPLandschaftsbild property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfLPLandschaftsbild property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfLPLandschaftsbild().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfLPLandschaftsbild() {
        if (genericApplicationPropertyOfLPLandschaftsbild == null) {
            genericApplicationPropertyOfLPLandschaftsbild = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfLPLandschaftsbild;
    }

}
