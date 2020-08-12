//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.06.04 um 02:29:48 PM CEST 
//


package net.opengis.wfs._2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ResolveValueType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ResolveValueType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="local"/>
 *     &lt;enumeration value="remote"/>
 *     &lt;enumeration value="all"/>
 *     &lt;enumeration value="none"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ResolveValueType")
@XmlEnum
public enum ResolveValueType {

    @XmlEnumValue("local")
    LOCAL("local"),
    @XmlEnumValue("remote")
    REMOTE("remote"),
    @XmlEnumValue("all")
    ALL("all"),
    @XmlEnumValue("none")
    NONE("none");
    private final String value;

    ResolveValueType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ResolveValueType fromValue(String v) {
        for (ResolveValueType c: ResolveValueType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
