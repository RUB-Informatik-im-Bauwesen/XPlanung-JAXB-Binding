//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.06.04 um 03:33:59 PM CEST 
//


package de.xplanung.xplangml._4._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für XP_HorizontaleAusrichtung.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="XP_HorizontaleAusrichtung">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="linksbündig"/>
 *     &lt;enumeration value="rechtsbündig"/>
 *     &lt;enumeration value="zentrisch"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "XP_HorizontaleAusrichtung")
@XmlEnum
public enum XPHorizontaleAusrichtung {

    @XmlEnumValue("linksb\u00fcndig")
    LINKSBÜNDIG("linksb\u00fcndig"),
    @XmlEnumValue("rechtsb\u00fcndig")
    RECHTSBÜNDIG("rechtsb\u00fcndig"),
    @XmlEnumValue("zentrisch")
    ZENTRISCH("zentrisch");
    private final String value;

    XPHorizontaleAusrichtung(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static XPHorizontaleAusrichtung fromValue(String v) {
        for (XPHorizontaleAusrichtung c: XPHorizontaleAusrichtung.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
