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


/**
 * Modelliert eine Nutzungsschablone. Die darzustellenden Attributwerte werden zeilenweise in die Nutzungsschablone geschrieben.
 * 
 * 
 * <p>Java-Klasse für XP_NutzungsschabloneType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="XP_NutzungsschabloneType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/5/1}XP_PTOType">
 *       &lt;sequence>
 *         &lt;element name="spaltenAnz" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="zeilenAnz" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/5/1}_GenericApplicationPropertyOfXP_Nutzungsschablone" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XP_NutzungsschabloneType", propOrder = {
    "spaltenAnz",
    "zeilenAnz",
    "genericApplicationPropertyOfXPNutzungsschablone"
})
public class XPNutzungsschabloneType
    extends XPPTOType
{

    protected int spaltenAnz;
    protected int zeilenAnz;
    @XmlElement(name = "_GenericApplicationPropertyOfXP_Nutzungsschablone")
    protected List<Object> genericApplicationPropertyOfXPNutzungsschablone;

    /**
     * Ruft den Wert der spaltenAnz-Eigenschaft ab.
     * 
     */
    public int getSpaltenAnz() {
        return spaltenAnz;
    }

    /**
     * Legt den Wert der spaltenAnz-Eigenschaft fest.
     * 
     */
    public void setSpaltenAnz(int value) {
        this.spaltenAnz = value;
    }

    /**
     * Ruft den Wert der zeilenAnz-Eigenschaft ab.
     * 
     */
    public int getZeilenAnz() {
        return zeilenAnz;
    }

    /**
     * Legt den Wert der zeilenAnz-Eigenschaft fest.
     * 
     */
    public void setZeilenAnz(int value) {
        this.zeilenAnz = value;
    }

    /**
     * Gets the value of the genericApplicationPropertyOfXPNutzungsschablone property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfXPNutzungsschablone property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfXPNutzungsschablone().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfXPNutzungsschablone() {
        if (genericApplicationPropertyOfXPNutzungsschablone == null) {
            genericApplicationPropertyOfXPNutzungsschablone = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfXPNutzungsschablone;
    }

}
