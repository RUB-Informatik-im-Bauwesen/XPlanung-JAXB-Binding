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


/**
 * Entsorgungs-Infrastruktur Beinhaltet Abfallentsorgung und Abwasserentsorgung.
 * Abfälle sind Gegenstände, Stoffe oder Rückstände, deren sich der Besitzer entledigen will. Sie können verwertet oder beseitigt werden.
 * Abwasser beinhaltet durch häuslichen, gewerblichen, landwirtschaftlichen oder sonstigen Gebrauch verunreinigtes Wasser sowie abfließendes Niederschlagswasser bzw. in die Kanalisation fließendes Wasser.
 * 
 * <p>Java-Klasse für RP_EntsorgungType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RP_EntsorgungType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/5/1}RP_GeometrieobjektType">
 *       &lt;sequence>
 *         &lt;element name="typAE" type="{http://www.xplanung.de/xplangml/5/1}RP_AbfallentsorgungTypen" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="abfallTyp" type="{http://www.xplanung.de/xplangml/5/1}RP_AbfallTypen" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="typAW" type="{http://www.xplanung.de/xplangml/5/1}RP_AbwasserTypen" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="istAufschuettungAblagerung" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/5/1}_GenericApplicationPropertyOfRP_Entsorgung" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RP_EntsorgungType", propOrder = {
    "typAE",
    "abfallTyp",
    "typAW",
    "istAufschuettungAblagerung",
    "genericApplicationPropertyOfRPEntsorgung"
})
public class RPEntsorgungType
    extends RPGeometrieobjektType
{

    protected List<String> typAE;
    protected List<String> abfallTyp;
    protected List<String> typAW;
    @XmlElement(defaultValue = "false")
    protected Boolean istAufschuettungAblagerung;
    @XmlElement(name = "_GenericApplicationPropertyOfRP_Entsorgung")
    protected List<Object> genericApplicationPropertyOfRPEntsorgung;

    /**
     * Gets the value of the typAE property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the typAE property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTypAE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTypAE() {
        if (typAE == null) {
            typAE = new ArrayList<String>();
        }
        return this.typAE;
    }

    /**
     * Gets the value of the abfallTyp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the abfallTyp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbfallTyp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAbfallTyp() {
        if (abfallTyp == null) {
            abfallTyp = new ArrayList<String>();
        }
        return this.abfallTyp;
    }

    /**
     * Gets the value of the typAW property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the typAW property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTypAW().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTypAW() {
        if (typAW == null) {
            typAW = new ArrayList<String>();
        }
        return this.typAW;
    }

    /**
     * Ruft den Wert der istAufschuettungAblagerung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIstAufschuettungAblagerung() {
        return istAufschuettungAblagerung;
    }

    /**
     * Legt den Wert der istAufschuettungAblagerung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIstAufschuettungAblagerung(Boolean value) {
        this.istAufschuettungAblagerung = value;
    }

    /**
     * Gets the value of the genericApplicationPropertyOfRPEntsorgung property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfRPEntsorgung property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfRPEntsorgung().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfRPEntsorgung() {
        if (genericApplicationPropertyOfRPEntsorgung == null) {
            genericApplicationPropertyOfRPEntsorgung = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfRPEntsorgung;
    }

}
