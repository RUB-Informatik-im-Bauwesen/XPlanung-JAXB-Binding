//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.06.04 um 02:29:48 PM CEST 
//


package net.opengis.fes._2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für UnaryLogicOpType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="UnaryLogicOpType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/fes/2.0}LogicOpsType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;group ref="{http://www.opengis.net/fes/2.0}FilterPredicates"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnaryLogicOpType", propOrder = {
    "comparisonOps",
    "spatialOps",
    "temporalOps",
    "logicOps",
    "extensionOps",
    "function",
    "id"
})
public class UnaryLogicOpType
    extends LogicOpsType
{

    @XmlElementRef(name = "comparisonOps", namespace = "http://www.opengis.net/fes/2.0", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends ComparisonOpsType> comparisonOps;
    @XmlElementRef(name = "spatialOps", namespace = "http://www.opengis.net/fes/2.0", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends SpatialOpsType> spatialOps;
    @XmlElementRef(name = "temporalOps", namespace = "http://www.opengis.net/fes/2.0", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends TemporalOpsType> temporalOps;
    @XmlElementRef(name = "logicOps", namespace = "http://www.opengis.net/fes/2.0", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends LogicOpsType> logicOps;
    protected ExtensionOpsType extensionOps;
    @XmlElement(name = "Function")
    protected FunctionType function;
    @XmlElementRef(name = "_Id", namespace = "http://www.opengis.net/fes/2.0", type = JAXBElement.class, required = false)
    protected List<JAXBElement<? extends AbstractIdType>> id;

    /**
     * Ruft den Wert der comparisonOps-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BinaryComparisonOpType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BinaryComparisonOpType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PropertyIsNilType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BinaryComparisonOpType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PropertyIsLikeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BinaryComparisonOpType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BinaryComparisonOpType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PropertyIsBetweenType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PropertyIsNullType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ComparisonOpsType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BinaryComparisonOpType }{@code >}
     *     
     */
    public JAXBElement<? extends ComparisonOpsType> getComparisonOps() {
        return comparisonOps;
    }

    /**
     * Legt den Wert der comparisonOps-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BinaryComparisonOpType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BinaryComparisonOpType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PropertyIsNilType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BinaryComparisonOpType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PropertyIsLikeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BinaryComparisonOpType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BinaryComparisonOpType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PropertyIsBetweenType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PropertyIsNullType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ComparisonOpsType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BinaryComparisonOpType }{@code >}
     *     
     */
    public void setComparisonOps(JAXBElement<? extends ComparisonOpsType> value) {
        this.comparisonOps = value;
    }

    /**
     * Ruft den Wert der spatialOps-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BinarySpatialOpType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BinarySpatialOpType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BinarySpatialOpType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BinarySpatialOpType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BBOXType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DistanceBufferType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DistanceBufferType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BinarySpatialOpType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BinarySpatialOpType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BinarySpatialOpType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BinarySpatialOpType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SpatialOpsType }{@code >}
     *     
     */
    public JAXBElement<? extends SpatialOpsType> getSpatialOps() {
        return spatialOps;
    }

    /**
     * Legt den Wert der spatialOps-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BinarySpatialOpType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BinarySpatialOpType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BinarySpatialOpType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BinarySpatialOpType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BBOXType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DistanceBufferType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DistanceBufferType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BinarySpatialOpType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BinarySpatialOpType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BinarySpatialOpType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BinarySpatialOpType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SpatialOpsType }{@code >}
     *     
     */
    public void setSpatialOps(JAXBElement<? extends SpatialOpsType> value) {
        this.spatialOps = value;
    }

    /**
     * Ruft den Wert der temporalOps-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BinaryTemporalOpType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BinaryTemporalOpType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BinaryTemporalOpType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BinaryTemporalOpType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BinaryTemporalOpType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BinaryTemporalOpType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BinaryTemporalOpType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TemporalOpsType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BinaryTemporalOpType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BinaryTemporalOpType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BinaryTemporalOpType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BinaryTemporalOpType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BinaryTemporalOpType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BinaryTemporalOpType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BinaryTemporalOpType }{@code >}
     *     
     */
    public JAXBElement<? extends TemporalOpsType> getTemporalOps() {
        return temporalOps;
    }

    /**
     * Legt den Wert der temporalOps-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BinaryTemporalOpType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BinaryTemporalOpType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BinaryTemporalOpType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BinaryTemporalOpType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BinaryTemporalOpType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BinaryTemporalOpType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BinaryTemporalOpType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TemporalOpsType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BinaryTemporalOpType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BinaryTemporalOpType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BinaryTemporalOpType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BinaryTemporalOpType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BinaryTemporalOpType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BinaryTemporalOpType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BinaryTemporalOpType }{@code >}
     *     
     */
    public void setTemporalOps(JAXBElement<? extends TemporalOpsType> value) {
        this.temporalOps = value;
    }

    /**
     * Ruft den Wert der logicOps-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UnaryLogicOpType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BinaryLogicOpType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LogicOpsType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BinaryLogicOpType }{@code >}
     *     
     */
    public JAXBElement<? extends LogicOpsType> getLogicOps() {
        return logicOps;
    }

    /**
     * Legt den Wert der logicOps-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UnaryLogicOpType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BinaryLogicOpType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LogicOpsType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BinaryLogicOpType }{@code >}
     *     
     */
    public void setLogicOps(JAXBElement<? extends LogicOpsType> value) {
        this.logicOps = value;
    }

    /**
     * Ruft den Wert der extensionOps-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionOpsType }
     *     
     */
    public ExtensionOpsType getExtensionOps() {
        return extensionOps;
    }

    /**
     * Legt den Wert der extensionOps-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionOpsType }
     *     
     */
    public void setExtensionOps(ExtensionOpsType value) {
        this.extensionOps = value;
    }

    /**
     * Ruft den Wert der function-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FunctionType }
     *     
     */
    public FunctionType getFunction() {
        return function;
    }

    /**
     * Legt den Wert der function-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FunctionType }
     *     
     */
    public void setFunction(FunctionType value) {
        this.function = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the id property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link AbstractIdType }{@code >}
     * {@link JAXBElement }{@code <}{@link ResourceIdType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends AbstractIdType>> getId() {
        if (id == null) {
            id = new ArrayList<JAXBElement<? extends AbstractIdType>>();
        }
        return this.id;
    }

}
