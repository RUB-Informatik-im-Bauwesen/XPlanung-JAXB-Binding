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
import javax.xml.bind.annotation.XmlType;


/**
 * Festsetzung einer von der Bebauung freizuhaltenden Schutzfläche und ihre Nutzung, sowie einer Fläche für besondere Anlagen und Vorkehrungen zum Schutz vor schädlichen Umwelteinwirkungen und sonstigen Gefahren im Sinne des Bundes-Immissionsschutzgesetzes sowie die zum Schutz vor solchen Einwirkungen oder zur  Vermeidung oder Minderung solcher Einwirkungen zu treffenden baulichen und sonstigen technischen Vorkehrungen (§9, Abs. 1, Nr. 24 BauGB).
 * 
 * <p>Java-Klasse für BP_ImmissionsschutzType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="BP_ImmissionsschutzType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/5/0}BP_GeometrieobjektType">
 *       &lt;sequence>
 *         &lt;element name="nutzung" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="laermpegelbereich" type="{http://www.xplanung.de/xplangml/5/0}BP_Laerrmpegelbereich" minOccurs="0"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/5/0}_GenericApplicationPropertyOfBP_Immissionsschutz" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BP_ImmissionsschutzType", propOrder = {
    "nutzung",
    "laermpegelbereich",
    "genericApplicationPropertyOfBPImmissionsschutz"
})
public class BPImmissionsschutzType
    extends BPGeometrieobjektType
{

    protected String nutzung;
    protected String laermpegelbereich;
    @XmlElement(name = "_GenericApplicationPropertyOfBP_Immissionsschutz")
    protected List<Object> genericApplicationPropertyOfBPImmissionsschutz;

    /**
     * Ruft den Wert der nutzung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNutzung() {
        return nutzung;
    }

    /**
     * Legt den Wert der nutzung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNutzung(String value) {
        this.nutzung = value;
    }

    /**
     * Ruft den Wert der laermpegelbereich-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLaermpegelbereich() {
        return laermpegelbereich;
    }

    /**
     * Legt den Wert der laermpegelbereich-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLaermpegelbereich(String value) {
        this.laermpegelbereich = value;
    }

    /**
     * Gets the value of the genericApplicationPropertyOfBPImmissionsschutz property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfBPImmissionsschutz property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfBPImmissionsschutz().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfBPImmissionsschutz() {
        if (genericApplicationPropertyOfBPImmissionsschutz == null) {
            genericApplicationPropertyOfBPImmissionsschutz = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfBPImmissionsschutz;
    }

}
