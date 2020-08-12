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
import net.opengis.gml._3.LengthType;


/**
 * Für einzelne Flächen oder für ein Bebauungsplangebiet oder Teile davon sowie für Teile baulicher Anlagen mit Ausnahme der für landwirtschaftliche Nutzungen oder Wald festgesetzten Flächen:
 * a) Festsetzung des Anpflanzens von Bäumen, Sträuchern und sonstigen Bepflanzungen;
 * b) Festsetzung von Bindungen für Bepflanzungen und für die Erhaltung von Bäumen, Sträuchern und sonstigen Bepflanzungen sowie von Gewässern;  (§9 Abs. 1 Nr. 25 und Abs. 4 BauGB)
 * 
 * 
 * <p>Java-Klasse für BP_AnpflanzungBindungErhaltungType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="BP_AnpflanzungBindungErhaltungType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/4/1}BP_GeometrieobjektType">
 *       &lt;sequence>
 *         &lt;element name="massnahme" type="{http://www.xplanung.de/xplangml/4/1}XP_ABEMassnahmenTypen" minOccurs="0"/>
 *         &lt;element name="gegenstand" type="{http://www.xplanung.de/xplangml/4/1}XP_AnpflanzungBindungErhaltungsGegenstand" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="kronendurchmesser" type="{http://www.opengis.net/gml/3.2}LengthType" minOccurs="0"/>
 *         &lt;element name="pflanztiefe" type="{http://www.opengis.net/gml/3.2}LengthType" minOccurs="0"/>
 *         &lt;element name="istAusgleich" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/4/1}_GenericApplicationPropertyOfBP_AnpflanzungBindungErhaltung" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BP_AnpflanzungBindungErhaltungType", propOrder = {
    "massnahme",
    "gegenstand",
    "kronendurchmesser",
    "pflanztiefe",
    "istAusgleich",
    "genericApplicationPropertyOfBPAnpflanzungBindungErhaltung"
})
public class BPAnpflanzungBindungErhaltungType
    extends BPGeometrieobjektType
{

    protected String massnahme;
    protected List<String> gegenstand;
    protected LengthType kronendurchmesser;
    protected LengthType pflanztiefe;
    protected Boolean istAusgleich;
    @XmlElement(name = "_GenericApplicationPropertyOfBP_AnpflanzungBindungErhaltung")
    protected List<Object> genericApplicationPropertyOfBPAnpflanzungBindungErhaltung;

    /**
     * Ruft den Wert der massnahme-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMassnahme() {
        return massnahme;
    }

    /**
     * Legt den Wert der massnahme-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMassnahme(String value) {
        this.massnahme = value;
    }

    /**
     * Gets the value of the gegenstand property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gegenstand property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGegenstand().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getGegenstand() {
        if (gegenstand == null) {
            gegenstand = new ArrayList<String>();
        }
        return this.gegenstand;
    }

    /**
     * Ruft den Wert der kronendurchmesser-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getKronendurchmesser() {
        return kronendurchmesser;
    }

    /**
     * Legt den Wert der kronendurchmesser-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setKronendurchmesser(LengthType value) {
        this.kronendurchmesser = value;
    }

    /**
     * Ruft den Wert der pflanztiefe-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getPflanztiefe() {
        return pflanztiefe;
    }

    /**
     * Legt den Wert der pflanztiefe-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setPflanztiefe(LengthType value) {
        this.pflanztiefe = value;
    }

    /**
     * Ruft den Wert der istAusgleich-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIstAusgleich() {
        return istAusgleich;
    }

    /**
     * Legt den Wert der istAusgleich-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIstAusgleich(Boolean value) {
        this.istAusgleich = value;
    }

    /**
     * Gets the value of the genericApplicationPropertyOfBPAnpflanzungBindungErhaltung property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfBPAnpflanzungBindungErhaltung property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfBPAnpflanzungBindungErhaltung().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfBPAnpflanzungBindungErhaltung() {
        if (genericApplicationPropertyOfBPAnpflanzungBindungErhaltung == null) {
            genericApplicationPropertyOfBPAnpflanzungBindungErhaltung = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfBPAnpflanzungBindungErhaltung;
    }

}
