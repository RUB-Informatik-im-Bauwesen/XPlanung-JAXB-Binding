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
 * Festsetzung nacvh §9 Nr. (4) BauGB
 * 
 * 
 * <p>Java-Klasse für BP_FestsetzungNachLandesrechtType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="BP_FestsetzungNachLandesrechtType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/4/1}BP_GeometrieobjektType">
 *       &lt;sequence>
 *         &lt;element name="kurzbeschreibung" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/4/1}_GenericApplicationPropertyOfBP_FestsetzungNachLandesrecht" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BP_FestsetzungNachLandesrechtType", propOrder = {
    "kurzbeschreibung",
    "genericApplicationPropertyOfBPFestsetzungNachLandesrecht"
})
public class BPFestsetzungNachLandesrechtType
    extends BPGeometrieobjektType
{

    protected String kurzbeschreibung;
    @XmlElement(name = "_GenericApplicationPropertyOfBP_FestsetzungNachLandesrecht")
    protected List<Object> genericApplicationPropertyOfBPFestsetzungNachLandesrecht;

    /**
     * Ruft den Wert der kurzbeschreibung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKurzbeschreibung() {
        return kurzbeschreibung;
    }

    /**
     * Legt den Wert der kurzbeschreibung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKurzbeschreibung(String value) {
        this.kurzbeschreibung = value;
    }

    /**
     * Gets the value of the genericApplicationPropertyOfBPFestsetzungNachLandesrecht property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfBPFestsetzungNachLandesrecht property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfBPFestsetzungNachLandesrecht().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfBPFestsetzungNachLandesrecht() {
        if (genericApplicationPropertyOfBPFestsetzungNachLandesrecht == null) {
            genericApplicationPropertyOfBPFestsetzungNachLandesrecht = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfBPFestsetzungNachLandesrecht;
    }

}
