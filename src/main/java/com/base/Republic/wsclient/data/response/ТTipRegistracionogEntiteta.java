
package com.base.Republic.wsclient.data.response;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for \u0422TipRegistracionogEntiteta.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="\u0422TipRegistracionogEntiteta"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Item1"/&gt;
 *     &lt;enumeration value="Item2"/&gt;
 *     &lt;enumeration value="Item3"/&gt;
 *     &lt;enumeration value="Item4"/&gt;
 *     &lt;enumeration value="Item5"/&gt;
 *     &lt;enumeration value="Item6"/&gt;
 *     &lt;enumeration value="Item7"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "\u0422TipRegistracionogEntiteta")
@XmlEnum
public enum \u0422TipRegistracionogEntiteta {

    @XmlEnumValue("Item1")
    ITEM_1("Item1"),
    @XmlEnumValue("Item2")
    ITEM_2("Item2"),
    @XmlEnumValue("Item3")
    ITEM_3("Item3"),
    @XmlEnumValue("Item4")
    ITEM_4("Item4"),
    @XmlEnumValue("Item5")
    ITEM_5("Item5"),
    @XmlEnumValue("Item6")
    ITEM_6("Item6"),
    @XmlEnumValue("Item7")
    ITEM_7("Item7");
    private final String value;

    \u0422TipRegistracionogEntiteta(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static \u0422TipRegistracionogEntiteta fromValue(String v) {
        for (\u0422TipRegistracionogEntiteta c: \u0422TipRegistracionogEntiteta.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
