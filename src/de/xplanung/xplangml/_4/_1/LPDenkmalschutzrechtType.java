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
 * Gebiete und Gebietsteile mit rechtlichen Bindungen nach anderen Fachgesetzen (soweit sie für den Schutz, die Pflege und die Entwicklung von Natur und Landschaft bedeutsam sind). Hier: Flächen die dem Denkmalschutz unterliegen.
 * 
 * 
 * <p>Java-Klasse für LP_DenkmalschutzrechtType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="LP_DenkmalschutzrechtType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/4/1}LP_GeometrieobjektType">
 *       &lt;sequence>
 *         &lt;element name="detailTyp" type="{http://www.opengis.net/gml/3.2}CodeType" minOccurs="0"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/4/1}_GenericApplicationPropertyOfLP_Denkmalschutzrecht" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LP_DenkmalschutzrechtType", propOrder = {
    "detailTyp",
    "genericApplicationPropertyOfLPDenkmalschutzrecht"
})
public class LPDenkmalschutzrechtType
    extends LPGeometrieobjektType
{

    protected CodeType detailTyp;
    @XmlElement(name = "_GenericApplicationPropertyOfLP_Denkmalschutzrecht")
    protected List<Object> genericApplicationPropertyOfLPDenkmalschutzrecht;

    /**
     * Ruft den Wert der detailTyp-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getDetailTyp() {
        return detailTyp;
    }

    /**
     * Legt den Wert der detailTyp-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setDetailTyp(CodeType value) {
        this.detailTyp = value;
    }

    /**
     * Gets the value of the genericApplicationPropertyOfLPDenkmalschutzrecht property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfLPDenkmalschutzrecht property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfLPDenkmalschutzrecht().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfLPDenkmalschutzrecht() {
        if (genericApplicationPropertyOfLPDenkmalschutzrecht == null) {
            genericApplicationPropertyOfLPDenkmalschutzrecht = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfLPDenkmalschutzrecht;
    }

}
