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
 * Raumkategorien
 * 
 * <p>Java-Klasse für RP_RaumkategorieType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RP_RaumkategorieType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/4/1}RP_GeometrieobjektType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/4/1}_GenericApplicationPropertyOfRP_Raumkategorie" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RP_RaumkategorieType", propOrder = {
    "genericApplicationPropertyOfRPRaumkategorie"
})
public class RPRaumkategorieType
    extends RPGeometrieobjektType
{

    @XmlElement(name = "_GenericApplicationPropertyOfRP_Raumkategorie")
    protected List<Object> genericApplicationPropertyOfRPRaumkategorie;

    /**
     * Gets the value of the genericApplicationPropertyOfRPRaumkategorie property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfRPRaumkategorie property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfRPRaumkategorie().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfRPRaumkategorie() {
        if (genericApplicationPropertyOfRPRaumkategorie == null) {
            genericApplicationPropertyOfRPRaumkategorie = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfRPRaumkategorie;
    }

}
