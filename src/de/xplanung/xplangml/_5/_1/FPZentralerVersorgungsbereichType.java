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
import net.opengis.gml._3.CodeType;


/**
 * Darstellung nach § 5 Abs. 2 Nr. 2d (Ausstattung des Gemeindegebietes mit zentralen Versorgungsbereichen).
 * 
 * 
 * <p>Java-Klasse für FP_ZentralerVersorgungsbereichType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FP_ZentralerVersorgungsbereichType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/5/1}FP_UeberlagerungsobjektType">
 *       &lt;sequence>
 *         &lt;element name="auspraegung" type="{http://www.opengis.net/gml/3.2}CodeType" minOccurs="0"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/5/1}_GenericApplicationPropertyOfFP_ZentralerVersorgungsbereich" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FP_ZentralerVersorgungsbereichType", propOrder = {
    "auspraegung",
    "genericApplicationPropertyOfFPZentralerVersorgungsbereich"
})
public class FPZentralerVersorgungsbereichType
    extends FPUeberlagerungsobjektType
{

    protected CodeType auspraegung;
    @XmlElement(name = "_GenericApplicationPropertyOfFP_ZentralerVersorgungsbereich")
    protected List<Object> genericApplicationPropertyOfFPZentralerVersorgungsbereich;

    /**
     * Ruft den Wert der auspraegung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getAuspraegung() {
        return auspraegung;
    }

    /**
     * Legt den Wert der auspraegung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setAuspraegung(CodeType value) {
        this.auspraegung = value;
    }

    /**
     * Gets the value of the genericApplicationPropertyOfFPZentralerVersorgungsbereich property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfFPZentralerVersorgungsbereich property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfFPZentralerVersorgungsbereich().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfFPZentralerVersorgungsbereich() {
        if (genericApplicationPropertyOfFPZentralerVersorgungsbereich == null) {
            genericApplicationPropertyOfFPZentralerVersorgungsbereich = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfFPZentralerVersorgungsbereich;
    }

}
