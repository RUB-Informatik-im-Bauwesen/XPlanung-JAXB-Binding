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
import net.opengis.gml._3.CodeType;


/**
 * Abgrenzung unterschiedlicher Nutzung, z.B. von Baugebieten wenn diese nach PlanzVO in der gleichen Farbe dargestellt werden, oder Abgrenzung unterschiedlicher Nutzungsmaße innerhalb eines Baugebiets ("Knödellinie", § 1 Abs. 4, § 16 Abs. 5 BauNVO).
 * 
 * <p>Java-Klasse für BP_NutzungsartenGrenzeType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="BP_NutzungsartenGrenzeType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/5/0}BP_LinienobjektType">
 *       &lt;sequence>
 *         &lt;element name="typ" type="{http://www.xplanung.de/xplangml/5/0}BP_AbgrenzungenTypen" minOccurs="0"/>
 *         &lt;element name="detailTyp" type="{http://www.opengis.net/gml/3.2}CodeType" minOccurs="0"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/5/0}_GenericApplicationPropertyOfBP_NutzungsartenGrenze" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BP_NutzungsartenGrenzeType", propOrder = {
    "typ",
    "detailTyp",
    "genericApplicationPropertyOfBPNutzungsartenGrenze"
})
public class BPNutzungsartenGrenzeType
    extends BPLinienobjektType
{

    protected String typ;
    protected CodeType detailTyp;
    @XmlElement(name = "_GenericApplicationPropertyOfBP_NutzungsartenGrenze")
    protected List<Object> genericApplicationPropertyOfBPNutzungsartenGrenze;

    /**
     * Ruft den Wert der typ-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTyp() {
        return typ;
    }

    /**
     * Legt den Wert der typ-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTyp(String value) {
        this.typ = value;
    }

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
     * Gets the value of the genericApplicationPropertyOfBPNutzungsartenGrenze property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfBPNutzungsartenGrenze property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfBPNutzungsartenGrenze().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfBPNutzungsartenGrenze() {
        if (genericApplicationPropertyOfBPNutzungsartenGrenze == null) {
            genericApplicationPropertyOfBPNutzungsartenGrenze = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfBPNutzungsartenGrenze;
    }

}
