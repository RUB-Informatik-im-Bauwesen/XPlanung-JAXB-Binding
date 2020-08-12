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
import net.opengis.gml._3.ReferenceType;


/**
 * Fläche für Gemeinschaftsanlagen für bestimmte räumliche Bereiche wie Kinderspielplätze, Freizeiteinrichtungen, Stellplätze und Garagen (§ 9 Abs. 1 Nr. 22 BauGB)
 * 
 * <p>Java-Klasse für BP_GemeinschaftsanlagenFlaecheType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="BP_GemeinschaftsanlagenFlaecheType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/5/1}BP_UeberlagerungsobjektType">
 *       &lt;sequence>
 *         &lt;element name="zweckbestimmung" type="{http://www.xplanung.de/xplangml/5/1}BP_ZweckbestimmungGemeinschaftsanlagen" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="detaillierteZweckbestimmung" type="{http://www.opengis.net/gml/3.2}CodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Zmax" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="eigentuemer" type="{http://www.opengis.net/gml/3.2}ReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/5/1}_GenericApplicationPropertyOfBP_GemeinschaftsanlagenFlaeche" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BP_GemeinschaftsanlagenFlaecheType", propOrder = {
    "zweckbestimmung",
    "detaillierteZweckbestimmung",
    "zmax",
    "eigentuemer",
    "genericApplicationPropertyOfBPGemeinschaftsanlagenFlaeche"
})
public class BPGemeinschaftsanlagenFlaecheType
    extends BPUeberlagerungsobjektType
{

    protected List<String> zweckbestimmung;
    protected List<CodeType> detaillierteZweckbestimmung;
    @XmlElement(name = "Zmax")
    protected Integer zmax;
    protected List<ReferenceType> eigentuemer;
    @XmlElement(name = "_GenericApplicationPropertyOfBP_GemeinschaftsanlagenFlaeche")
    protected List<Object> genericApplicationPropertyOfBPGemeinschaftsanlagenFlaeche;

    /**
     * Gets the value of the zweckbestimmung property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zweckbestimmung property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZweckbestimmung().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getZweckbestimmung() {
        if (zweckbestimmung == null) {
            zweckbestimmung = new ArrayList<String>();
        }
        return this.zweckbestimmung;
    }

    /**
     * Gets the value of the detaillierteZweckbestimmung property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the detaillierteZweckbestimmung property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetaillierteZweckbestimmung().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeType }
     * 
     * 
     */
    public List<CodeType> getDetaillierteZweckbestimmung() {
        if (detaillierteZweckbestimmung == null) {
            detaillierteZweckbestimmung = new ArrayList<CodeType>();
        }
        return this.detaillierteZweckbestimmung;
    }

    /**
     * Ruft den Wert der zmax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getZmax() {
        return zmax;
    }

    /**
     * Legt den Wert der zmax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setZmax(Integer value) {
        this.zmax = value;
    }

    /**
     * Gets the value of the eigentuemer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eigentuemer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEigentuemer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenceType }
     * 
     * 
     */
    public List<ReferenceType> getEigentuemer() {
        if (eigentuemer == null) {
            eigentuemer = new ArrayList<ReferenceType>();
        }
        return this.eigentuemer;
    }

    /**
     * Gets the value of the genericApplicationPropertyOfBPGemeinschaftsanlagenFlaeche property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfBPGemeinschaftsanlagenFlaeche property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfBPGemeinschaftsanlagenFlaeche().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfBPGemeinschaftsanlagenFlaeche() {
        if (genericApplicationPropertyOfBPGemeinschaftsanlagenFlaeche == null) {
            genericApplicationPropertyOfBPGemeinschaftsanlagenFlaeche = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfBPGemeinschaftsanlagenFlaeche;
    }

}
