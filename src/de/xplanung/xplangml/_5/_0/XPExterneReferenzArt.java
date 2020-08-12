//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.06.04 um 02:29:48 PM CEST 
//


package de.xplanung.xplangml._5._0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für XP_ExterneReferenzArt.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="XP_ExterneReferenzArt">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Dokument"/>
 *     &lt;enumeration value="PlanMitGeoreferenz"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "XP_ExterneReferenzArt")
@XmlEnum
public enum XPExterneReferenzArt {


    /**
     * Referenz auf ein Dokument.
     * 
     */
    @XmlEnumValue("Dokument")
    DOKUMENT("Dokument"),

    /**
     * Referenz auf einen georeferenzierten Plan.
     * 
     */
    @XmlEnumValue("PlanMitGeoreferenz")
    PLAN_MIT_GEOREFERENZ("PlanMitGeoreferenz");
    private final String value;

    XPExterneReferenzArt(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static XPExterneReferenzArt fromValue(String v) {
        for (XPExterneReferenzArt c: XPExterneReferenzArt.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
