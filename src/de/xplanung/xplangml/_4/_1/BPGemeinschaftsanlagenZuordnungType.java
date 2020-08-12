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
import net.opengis.gml._3.ReferenceType;


/**
 * Zuordnung von Gemeinschaftsanlagen zu Grundstücken.
 * 
 * 
 * <p>Java-Klasse für BP_GemeinschaftsanlagenZuordnungType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="BP_GemeinschaftsanlagenZuordnungType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/4/1}BP_GeometrieobjektType">
 *       &lt;sequence>
 *         &lt;element name="zuordnung" type="{http://www.opengis.net/gml/3.2}ReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/4/1}_GenericApplicationPropertyOfBP_GemeinschaftsanlagenZuordnung" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BP_GemeinschaftsanlagenZuordnungType", propOrder = {
    "zuordnung",
    "genericApplicationPropertyOfBPGemeinschaftsanlagenZuordnung"
})
public class BPGemeinschaftsanlagenZuordnungType
    extends BPGeometrieobjektType
{

    protected List<ReferenceType> zuordnung;
    @XmlElement(name = "_GenericApplicationPropertyOfBP_GemeinschaftsanlagenZuordnung")
    protected List<Object> genericApplicationPropertyOfBPGemeinschaftsanlagenZuordnung;

    /**
     * Gets the value of the zuordnung property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zuordnung property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZuordnung().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenceType }
     * 
     * 
     */
    public List<ReferenceType> getZuordnung() {
        if (zuordnung == null) {
            zuordnung = new ArrayList<ReferenceType>();
        }
        return this.zuordnung;
    }

    /**
     * Gets the value of the genericApplicationPropertyOfBPGemeinschaftsanlagenZuordnung property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfBPGemeinschaftsanlagenZuordnung property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfBPGemeinschaftsanlagenZuordnung().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfBPGemeinschaftsanlagenZuordnung() {
        if (genericApplicationPropertyOfBPGemeinschaftsanlagenZuordnung == null) {
            genericApplicationPropertyOfBPGemeinschaftsanlagenZuordnung = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfBPGemeinschaftsanlagenZuordnung;
    }

}
