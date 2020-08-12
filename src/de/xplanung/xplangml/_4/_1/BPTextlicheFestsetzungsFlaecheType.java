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
 * Bereich in dem bestimmte Textliche Festsetzungen gültig sind, die über die Relation "refTextInhalt" (Basisklasse XP_Objekt) spezifiziert werden.
 * 
 * 
 * <p>Java-Klasse für BP_TextlicheFestsetzungsFlaecheType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="BP_TextlicheFestsetzungsFlaecheType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/4/1}BP_UeberlagerungsobjektType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/4/1}_GenericApplicationPropertyOfBP_TextlicheFestsetzungsFlaeche" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BP_TextlicheFestsetzungsFlaecheType", propOrder = {
    "genericApplicationPropertyOfBPTextlicheFestsetzungsFlaeche"
})
public class BPTextlicheFestsetzungsFlaecheType
    extends BPUeberlagerungsobjektType
{

    @XmlElement(name = "_GenericApplicationPropertyOfBP_TextlicheFestsetzungsFlaeche")
    protected List<Object> genericApplicationPropertyOfBPTextlicheFestsetzungsFlaeche;

    /**
     * Gets the value of the genericApplicationPropertyOfBPTextlicheFestsetzungsFlaeche property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfBPTextlicheFestsetzungsFlaeche property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfBPTextlicheFestsetzungsFlaeche().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfBPTextlicheFestsetzungsFlaeche() {
        if (genericApplicationPropertyOfBPTextlicheFestsetzungsFlaeche == null) {
            genericApplicationPropertyOfBPTextlicheFestsetzungsFlaeche = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfBPTextlicheFestsetzungsFlaeche;
    }

}
