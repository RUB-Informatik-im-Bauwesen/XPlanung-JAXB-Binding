//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.06.04 um 02:29:48 PM CEST 
//


package net.opengis.wfs._2;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import net.opengis.fes._2.AbstractAdhocQueryExpressionType;
import net.opengis.fes._2.AbstractQueryExpressionType;


/**
 * <p>Java-Klasse für LockFeatureType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="LockFeatureType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/wfs/2.0}BaseRequestType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/fes/2.0}AbstractQueryExpression" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="lockId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="expiry" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" default="300" />
 *       &lt;attribute name="lockAction" type="{http://www.opengis.net/wfs/2.0}AllSomeType" default="ALL" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LockFeatureType", propOrder = {
    "abstractQueryExpression"
})
public class LockFeatureType
    extends BaseRequestType
{

    @XmlElementRef(name = "AbstractQueryExpression", namespace = "http://www.opengis.net/fes/2.0", type = JAXBElement.class, required = false)
    protected List<JAXBElement<? extends AbstractQueryExpressionType>> abstractQueryExpression;
    @XmlAttribute(name = "lockId")
    protected String lockId;
    @XmlAttribute(name = "expiry")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger expiry;
    @XmlAttribute(name = "lockAction")
    protected AllSomeType lockAction;

    /**
     * Gets the value of the abstractQueryExpression property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the abstractQueryExpression property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbstractQueryExpression().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link QueryType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractAdhocQueryExpressionType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractQueryExpressionType }{@code >}
     * {@link JAXBElement }{@code <}{@link StoredQueryType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends AbstractQueryExpressionType>> getAbstractQueryExpression() {
        if (abstractQueryExpression == null) {
            abstractQueryExpression = new ArrayList<JAXBElement<? extends AbstractQueryExpressionType>>();
        }
        return this.abstractQueryExpression;
    }

    /**
     * Ruft den Wert der lockId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLockId() {
        return lockId;
    }

    /**
     * Legt den Wert der lockId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLockId(String value) {
        this.lockId = value;
    }

    /**
     * Ruft den Wert der expiry-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getExpiry() {
        if (expiry == null) {
            return new BigInteger("300");
        } else {
            return expiry;
        }
    }

    /**
     * Legt den Wert der expiry-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setExpiry(BigInteger value) {
        this.expiry = value;
    }

    /**
     * Ruft den Wert der lockAction-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AllSomeType }
     *     
     */
    public AllSomeType getLockAction() {
        if (lockAction == null) {
            return AllSomeType.ALL;
        } else {
            return lockAction;
        }
    }

    /**
     * Legt den Wert der lockAction-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AllSomeType }
     *     
     */
    public void setLockAction(AllSomeType value) {
        this.lockAction = value;
    }

}
