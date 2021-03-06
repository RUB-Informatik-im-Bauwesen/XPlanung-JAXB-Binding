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


/**
 * Umgrenzung eines Denkmalgeschützten Ensembles, sofern es sich um eine Festsetzung des Bebauungsplans handelt (§9 Abs. 4 BauGB - landesrechtliche Regelung). Weltkulturerbe kann eigentlich nicht vorkommen.
 * 
 * 
 * <p>Java-Klasse für BP_DenkmalschutzEnsembleFlaecheType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="BP_DenkmalschutzEnsembleFlaecheType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/4/1}BP_UeberlagerungsobjektType">
 *       &lt;sequence>
 *         &lt;element name="denkmal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="weltkulturerbe" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/4/1}_GenericApplicationPropertyOfBP_DenkmalschutzEnsembleFlaeche" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BP_DenkmalschutzEnsembleFlaecheType", propOrder = {
    "denkmal",
    "weltkulturerbe",
    "genericApplicationPropertyOfBPDenkmalschutzEnsembleFlaeche"
})
public class BPDenkmalschutzEnsembleFlaecheType
    extends BPUeberlagerungsobjektType
{

    protected String denkmal;
    protected Boolean weltkulturerbe;
    @XmlElement(name = "_GenericApplicationPropertyOfBP_DenkmalschutzEnsembleFlaeche")
    protected List<Object> genericApplicationPropertyOfBPDenkmalschutzEnsembleFlaeche;

    /**
     * Ruft den Wert der denkmal-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDenkmal() {
        return denkmal;
    }

    /**
     * Legt den Wert der denkmal-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDenkmal(String value) {
        this.denkmal = value;
    }

    /**
     * Ruft den Wert der weltkulturerbe-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWeltkulturerbe() {
        return weltkulturerbe;
    }

    /**
     * Legt den Wert der weltkulturerbe-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWeltkulturerbe(Boolean value) {
        this.weltkulturerbe = value;
    }

    /**
     * Gets the value of the genericApplicationPropertyOfBPDenkmalschutzEnsembleFlaeche property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfBPDenkmalschutzEnsembleFlaeche property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfBPDenkmalschutzEnsembleFlaeche().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfBPDenkmalschutzEnsembleFlaeche() {
        if (genericApplicationPropertyOfBPDenkmalschutzEnsembleFlaeche == null) {
            genericApplicationPropertyOfBPDenkmalschutzEnsembleFlaeche = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfBPDenkmalschutzEnsembleFlaeche;
    }

}
