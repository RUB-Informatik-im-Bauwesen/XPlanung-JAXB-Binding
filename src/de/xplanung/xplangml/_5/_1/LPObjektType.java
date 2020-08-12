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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml._3.ReferenceType;


/**
 * Basisklasse für alle spezifischen Inhalte eines Landschaftsplans.
 * 
 * <p>Java-Klasse für LP_ObjektType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="LP_ObjektType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/5/1}XP_ObjektType">
 *       &lt;sequence>
 *         &lt;element name="rechtscharakter" type="{http://www.xplanung.de/xplangml/5/1}LP_Rechtscharakter"/>
 *         &lt;element name="konkretisierung" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="refTextInhalt" type="{http://www.opengis.net/gml/3.2}ReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/5/1}_GenericApplicationPropertyOfLP_Objekt" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LP_ObjektType", propOrder = {
    "rechtscharakter",
    "konkretisierung",
    "refTextInhalt",
    "genericApplicationPropertyOfLPObjekt"
})
@XmlSeeAlso({
    LPPunktobjektType.class,
    LPFlaechenobjektType.class,
    LPLinienobjektType.class,
    LPGeometrieobjektType.class
})
public abstract class LPObjektType
    extends XPObjektType
{

    @XmlElement(required = true)
    protected String rechtscharakter;
    protected String konkretisierung;
    protected List<ReferenceType> refTextInhalt;
    @XmlElement(name = "_GenericApplicationPropertyOfLP_Objekt")
    protected List<Object> genericApplicationPropertyOfLPObjekt;

    /**
     * Ruft den Wert der rechtscharakter-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRechtscharakter() {
        return rechtscharakter;
    }

    /**
     * Legt den Wert der rechtscharakter-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRechtscharakter(String value) {
        this.rechtscharakter = value;
    }

    /**
     * Ruft den Wert der konkretisierung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKonkretisierung() {
        return konkretisierung;
    }

    /**
     * Legt den Wert der konkretisierung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKonkretisierung(String value) {
        this.konkretisierung = value;
    }

    /**
     * Gets the value of the refTextInhalt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refTextInhalt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefTextInhalt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenceType }
     * 
     * 
     */
    public List<ReferenceType> getRefTextInhalt() {
        if (refTextInhalt == null) {
            refTextInhalt = new ArrayList<ReferenceType>();
        }
        return this.refTextInhalt;
    }

    /**
     * Gets the value of the genericApplicationPropertyOfLPObjekt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfLPObjekt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfLPObjekt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfLPObjekt() {
        if (genericApplicationPropertyOfLPObjekt == null) {
            genericApplicationPropertyOfLPObjekt = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfLPObjekt;
    }

}
