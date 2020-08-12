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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Basisklasse für alle Objekte eines Flächennutzungsplans mit flächenhaftem Raumbezug, die immer Flächenschlussobjekte sind.
 * Flächenschlussobjekte dürfen sich nicht überlappen, sondern nur an den Flächenrändern berühren, wobei die jeweiligen Stützpunkte der Randkurven übereinander liegen müssen. Die Vereinigung der Flächenschlussobjekte überdeckt den Geltungsbereich des Flächennutzungsplans vollständig. 
 * 
 * <p>Java-Klasse für FP_FlaechenschlussobjektType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FP_FlaechenschlussobjektType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/5/0}FP_FlaechenobjektType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/5/0}_GenericApplicationPropertyOfFP_Flaechenschlussobjekt" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FP_FlaechenschlussobjektType", propOrder = {
    "genericApplicationPropertyOfFPFlaechenschlussobjekt"
})
@XmlSeeAlso({
    FPWaldFlaecheType.class,
    FPBebauungsFlaecheType.class,
    FPLandwirtschaftsFlaecheType.class
})
public abstract class FPFlaechenschlussobjektType
    extends FPFlaechenobjektType
{

    @XmlElement(name = "_GenericApplicationPropertyOfFP_Flaechenschlussobjekt")
    protected List<Object> genericApplicationPropertyOfFPFlaechenschlussobjekt;

    /**
     * Gets the value of the genericApplicationPropertyOfFPFlaechenschlussobjekt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfFPFlaechenschlussobjekt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfFPFlaechenschlussobjekt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfFPFlaechenschlussobjekt() {
        if (genericApplicationPropertyOfFPFlaechenschlussobjekt == null) {
            genericApplicationPropertyOfFPFlaechenschlussobjekt = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfFPFlaechenschlussobjekt;
    }

}
