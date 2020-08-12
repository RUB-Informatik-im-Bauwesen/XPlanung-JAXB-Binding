//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.06.04 um 02:29:48 PM CEST 
//


package net.opengis.gml._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import de.xplanung.xplangml._5._0.RPLegendenobjektType;
import de.xplanung.xplangml._5._0.XPAbstraktesPraesentationsobjektType;
import de.xplanung.xplangml._5._0.XPBegruendungAbschnittType;
import de.xplanung.xplangml._5._0.XPBereichType;
import de.xplanung.xplangml._5._0.XPObjektType;
import de.xplanung.xplangml._5._0.XPPlanType;
import de.xplanung.xplangml._5._0.XPRasterdarstellungType;
import de.xplanung.xplangml._5._0.XPTextAbschnittType;


/**
 * <p>Java-Klasse für AbstractFeatureType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AbstractFeatureType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractGMLType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}boundedBy" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractFeatureType", propOrder = {
    "boundedBy"
})
@XmlSeeAlso({
    XPRasterdarstellungType.class,
    XPTextAbschnittType.class,
    XPBereichType.class,
    XPBegruendungAbschnittType.class,
    XPPlanType.class,
    AbstractFeatureCollectionType.class,
    XPAbstraktesPraesentationsobjektType.class,
    RPLegendenobjektType.class,
    XPObjektType.class,
    AbstractCoverageType.class
})
public abstract class AbstractFeatureType
    extends AbstractGMLType
{

    @XmlElement(nillable = true)
    protected BoundingShapeType boundedBy;

    /**
     * Ruft den Wert der boundedBy-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BoundingShapeType }
     *     
     */
    public BoundingShapeType getBoundedBy() {
        return boundedBy;
    }

    /**
     * Legt den Wert der boundedBy-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BoundingShapeType }
     *     
     */
    public void setBoundedBy(BoundingShapeType value) {
        this.boundedBy = value;
    }

}
