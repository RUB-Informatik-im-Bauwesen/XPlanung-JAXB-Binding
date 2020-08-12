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
 * Fläche, auf denen ganz oder teilweise nur Wohngebäude errichtet werden dürfen, die für Personengruppen mit besonderem Wohnbedarf bestimmt sind (§9, Abs. 1, Nr. 8 BauGB)
 * 
 * 
 * <p>Java-Klasse für BP_PersGruppenBestimmteFlaecheType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="BP_PersGruppenBestimmteFlaecheType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xplanung.de/xplangml/5/0}BP_UeberlagerungsobjektType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.xplanung.de/xplangml/5/0}_GenericApplicationPropertyOfBP_PersGruppenBestimmteFlaeche" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BP_PersGruppenBestimmteFlaecheType", propOrder = {
    "genericApplicationPropertyOfBPPersGruppenBestimmteFlaeche"
})
public class BPPersGruppenBestimmteFlaecheType
    extends BPUeberlagerungsobjektType
{

    @XmlElement(name = "_GenericApplicationPropertyOfBP_PersGruppenBestimmteFlaeche")
    protected List<Object> genericApplicationPropertyOfBPPersGruppenBestimmteFlaeche;

    /**
     * Gets the value of the genericApplicationPropertyOfBPPersGruppenBestimmteFlaeche property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfBPPersGruppenBestimmteFlaeche property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericApplicationPropertyOfBPPersGruppenBestimmteFlaeche().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getGenericApplicationPropertyOfBPPersGruppenBestimmteFlaeche() {
        if (genericApplicationPropertyOfBPPersGruppenBestimmteFlaeche == null) {
            genericApplicationPropertyOfBPPersGruppenBestimmteFlaeche = new ArrayList<Object>();
        }
        return this.genericApplicationPropertyOfBPPersGruppenBestimmteFlaeche;
    }

}
