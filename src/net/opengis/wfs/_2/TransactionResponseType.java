//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.06.04 um 02:29:48 PM CEST 
//


package net.opengis.wfs._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für TransactionResponseType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TransactionResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TransactionSummary" type="{http://www.opengis.net/wfs/2.0}TransactionSummaryType"/>
 *         &lt;element name="InsertResults" type="{http://www.opengis.net/wfs/2.0}ActionResultsType" minOccurs="0"/>
 *         &lt;element name="UpdateResults" type="{http://www.opengis.net/wfs/2.0}ActionResultsType" minOccurs="0"/>
 *         &lt;element name="ReplaceResults" type="{http://www.opengis.net/wfs/2.0}ActionResultsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" use="required" type="{http://www.opengis.net/wfs/2.0}VersionStringType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionResponseType", propOrder = {
    "transactionSummary",
    "insertResults",
    "updateResults",
    "replaceResults"
})
public class TransactionResponseType {

    @XmlElement(name = "TransactionSummary", required = true)
    protected TransactionSummaryType transactionSummary;
    @XmlElement(name = "InsertResults")
    protected ActionResultsType insertResults;
    @XmlElement(name = "UpdateResults")
    protected ActionResultsType updateResults;
    @XmlElement(name = "ReplaceResults")
    protected ActionResultsType replaceResults;
    @XmlAttribute(name = "version", required = true)
    protected String version;

    /**
     * Ruft den Wert der transactionSummary-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TransactionSummaryType }
     *     
     */
    public TransactionSummaryType getTransactionSummary() {
        return transactionSummary;
    }

    /**
     * Legt den Wert der transactionSummary-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSummaryType }
     *     
     */
    public void setTransactionSummary(TransactionSummaryType value) {
        this.transactionSummary = value;
    }

    /**
     * Ruft den Wert der insertResults-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ActionResultsType }
     *     
     */
    public ActionResultsType getInsertResults() {
        return insertResults;
    }

    /**
     * Legt den Wert der insertResults-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionResultsType }
     *     
     */
    public void setInsertResults(ActionResultsType value) {
        this.insertResults = value;
    }

    /**
     * Ruft den Wert der updateResults-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ActionResultsType }
     *     
     */
    public ActionResultsType getUpdateResults() {
        return updateResults;
    }

    /**
     * Legt den Wert der updateResults-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionResultsType }
     *     
     */
    public void setUpdateResults(ActionResultsType value) {
        this.updateResults = value;
    }

    /**
     * Ruft den Wert der replaceResults-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ActionResultsType }
     *     
     */
    public ActionResultsType getReplaceResults() {
        return replaceResults;
    }

    /**
     * Legt den Wert der replaceResults-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionResultsType }
     *     
     */
    public void setReplaceResults(ActionResultsType value) {
        this.replaceResults = value;
    }

    /**
     * Ruft den Wert der version-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Legt den Wert der version-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
