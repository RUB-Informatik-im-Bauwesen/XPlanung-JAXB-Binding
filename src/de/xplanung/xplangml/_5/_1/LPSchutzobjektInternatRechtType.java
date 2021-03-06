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
 * Sonstige Schutzgebiete und Schutzobjekte nach internationalem Recht.
 * 
 * 
 * <p>Java-Klasse für LP_SchutzobjektInternatRechtType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="LP_SchutzobjektInternatRechtType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/5/1}LP_GeometrieobjektType">
 *       &lt;sequence>
 *         &lt;element name="typ" type="{http://www.xplanung.de/xplangml/5/1}LP_InternatSchutzobjektTypen" minOccurs="0"/>
 *         &lt;element name="sonstTyp" type="{http://www.opengis.net/gml/3.2}CodeType" minOccurs="0"/>
 *         &lt;element name="eigenname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/5/1}_GenericApplicationPropertyOfLP_SchutzobjektInternatRecht" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LP_SchutzobjektInternatRechtType", propOrder = {
    "typ",
    "sonstTyp",
    "eigenname",
    "genericApplicationPropertyOfLPSchutzobjektInternatRecht"
})
public class LPSchutzobjektInternatRechtType
    extends LPGeometrieobjektType
{

    protected String typ;
    protected CodeType sonstTyp;
    protected String eigenname;
    @XmlElement(name = "_GenericApplicationPropertyOfLP_SchutzobjektInternatRecht")
    protected List<Object> genericApplicationPropertyOfLPSchutzobjektInternatRecht;

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
     * Ruft den Wert der sonstTyp-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getSonstTyp() {
        return sonstTyp;
    }

    /**
     * Legt den Wert der sonstTyp-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setSonstTyp(CodeType value) {
        this.sonstTyp = value;
    }

    /**
     * Ruft den Wert der eigenname-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEigenname() {
        return eigenname;
    }

    /**
     * Legt den Wert der eigenname-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEigenname(String value) {
        this.eigenname = value;
    }

    /**
     * Gets the value of the genericApplicationPropertyOfLPSchutzobjektInternatRecht property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfLPSchutzobjektInternatRecht property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfLPSchutzobjektInternatRecht().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfLPSchutzobjektInternatRecht() {
        if (genericApplicationPropertyOfLPSchutzobjektInternatRecht == null) {
            genericApplicationPropertyOfLPSchutzobjektInternatRecht = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfLPSchutzobjektInternatRecht;
    }

}
