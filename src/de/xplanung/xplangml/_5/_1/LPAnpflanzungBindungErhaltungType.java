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
import net.opengis.gml._3.LengthType;


/**
 * Festsetzungen zum Erhalten und Anpflanzen von Bäumen, Sträuchern und sonstigen Bepflanzungen in einem Planwerk mit landschaftsplanerischen Festsetzungen. Die Festsetzungen können durch eine Spezifizierung eines Kronendurchmessers (z.B. für Baumpflanzungen), die Pflanztiefe und Mindesthöhe von Anpflanzungen (z.B. bei der Anpflanzung von Hecken) oder durch botanische Spezifizierung differenziert werden.
 * 
 * <p>Java-Klasse für LP_AnpflanzungBindungErhaltungType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="LP_AnpflanzungBindungErhaltungType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/5/1}LP_GeometrieobjektType">
 *       &lt;sequence>
 *         &lt;element name="massnahme" type="{http://www.xplanung.de/xplangml/5/1}XP_ABEMassnahmenTypen" minOccurs="0"/>
 *         &lt;element name="gegenstand" type="{http://www.xplanung.de/xplangml/5/1}XP_AnpflanzungBindungErhaltungsGegenstand" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="kronendurchmesser" type="{http://www.opengis.net/gml/3.2}LengthType" minOccurs="0"/>
 *         &lt;element name="pflanztiefe" type="{http://www.opengis.net/gml/3.2}LengthType" minOccurs="0"/>
 *         &lt;element name="istAusgleich" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="pflanzart" type="{http://www.opengis.net/gml/3.2}CodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="mindesthoehe" type="{http://www.opengis.net/gml/3.2}LengthType" minOccurs="0"/>
 *         &lt;element name="anzahl" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/5/1}_GenericApplicationPropertyOfLP_AnpflanzungBindungErhaltung" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LP_AnpflanzungBindungErhaltungType", propOrder = {
    "massnahme",
    "gegenstand",
    "kronendurchmesser",
    "pflanztiefe",
    "istAusgleich",
    "pflanzart",
    "mindesthoehe",
    "anzahl",
    "genericApplicationPropertyOfLPAnpflanzungBindungErhaltung"
})
public class LPAnpflanzungBindungErhaltungType
    extends LPGeometrieobjektType
{

    protected String massnahme;
    protected List<String> gegenstand;
    protected LengthType kronendurchmesser;
    protected LengthType pflanztiefe;
    @XmlElement(defaultValue = "false")
    protected Boolean istAusgleich;
    protected List<CodeType> pflanzart;
    protected LengthType mindesthoehe;
    protected Integer anzahl;
    @XmlElement(name = "_GenericApplicationPropertyOfLP_AnpflanzungBindungErhaltung")
    protected List<Object> genericApplicationPropertyOfLPAnpflanzungBindungErhaltung;

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
     * Gets the value of the pflanzart property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pflanzart property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPflanzart().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeType }
     * 
     * 
     */
    public List<CodeType> getPflanzart() {
        if (pflanzart == null) {
            pflanzart = new ArrayList<CodeType>();
        }
        return this.pflanzart;
    }

    /**
     * Ruft den Wert der mindesthoehe-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getMindesthoehe() {
        return mindesthoehe;
    }

    /**
     * Legt den Wert der mindesthoehe-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setMindesthoehe(LengthType value) {
        this.mindesthoehe = value;
    }

    /**
     * Ruft den Wert der anzahl-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAnzahl() {
        return anzahl;
    }

    /**
     * Legt den Wert der anzahl-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAnzahl(Integer value) {
        this.anzahl = value;
    }

    /**
     * Gets the value of the genericApplicationPropertyOfLPAnpflanzungBindungErhaltung property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfLPAnpflanzungBindungErhaltung property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfLPAnpflanzungBindungErhaltung().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfLPAnpflanzungBindungErhaltung() {
        if (genericApplicationPropertyOfLPAnpflanzungBindungErhaltung == null) {
            genericApplicationPropertyOfLPAnpflanzungBindungErhaltung = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfLPAnpflanzungBindungErhaltung;
    }

}
