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


/**
 * Basisklasse für alle Objekte eines Bebauungsplans mit flächenhaftem Raumbezug, die auf Ebene 0 immer Flächenschlussobjekte sind.
 * Flächenschlussobjekte dürfen sich nicht überlappen, sondern nur an den Flächenrändern berühren, wobei die jeweiligen Stützpunkte der Randkurven übereinander liegen müssen. Die Vereinigung der Flächenschlussobjekte überdeckt den Geltungsbereich des Bebauungsplans vollständig. 
 * 
 * <p>Java-Klasse für BP_FlaechenschlussobjektType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="BP_FlaechenschlussobjektType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/5/1}BP_FlaechenobjektType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/5/1}_GenericApplicationPropertyOfBP_Flaechenschlussobjekt" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BP_FlaechenschlussobjektType", propOrder = {
    "genericApplicationPropertyOfBPFlaechenschlussobjekt"
})
@XmlSeeAlso({
    BPGruenFlaecheType.class,
    BPWaldFlaecheType.class,
    BPGemeinbedarfsFlaecheType.class,
    BPGewaesserFlaecheType.class,
    BPBaugebietsTeilFlaecheType.class,
    BPSpielSportanlagenFlaecheType.class,
    BPStrassenVerkehrsFlaecheType.class,
    BPKleintierhaltungFlaecheType.class,
    BPLandwirtschaftsFlaecheType.class
})
public abstract class BPFlaechenschlussobjektType
    extends BPFlaechenobjektType
{

    @XmlElement(name = "_GenericApplicationPropertyOfBP_Flaechenschlussobjekt")
    protected List<Object> genericApplicationPropertyOfBPFlaechenschlussobjekt;

    /**
     * Gets the value of the genericApplicationPropertyOfBPFlaechenschlussobjekt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfBPFlaechenschlussobjekt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfBPFlaechenschlussobjekt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfBPFlaechenschlussobjekt() {
        if (genericApplicationPropertyOfBPFlaechenschlussobjekt == null) {
            genericApplicationPropertyOfBPFlaechenschlussobjekt = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfBPFlaechenschlussobjekt;
    }

}
