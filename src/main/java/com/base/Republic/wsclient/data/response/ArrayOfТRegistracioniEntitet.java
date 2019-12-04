
package com.base.Republic.wsclient.data.response;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOf\u0422RegistracioniEntitet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOf\u0422RegistracioniEntitet"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="\u0422RegistracioniEntitet" type="{http://schemas.datacontract.org/2004/07/SnT.APR_PLProxyService.APR_PL}\u0422RegistracioniEntitet" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOf\u0422RegistracioniEntitet", propOrder = {
    "\u0442RegistracioniEntitet"
})
public class ArrayOf\u0422RegistracioniEntitet {

    @XmlElement(name = "\u0422RegistracioniEntitet", nillable = true)
    protected List<\u0422RegistracioniEntitet> \u0442RegistracioniEntitet;

    /**
     * Gets the value of the \u0442RegistracioniEntitet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the \u0442RegistracioniEntitet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    get\u0422RegistracioniEntitet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link \u0422RegistracioniEntitet }
     * 
     * 
     */
    public List<\u0422RegistracioniEntitet> get\u0422RegistracioniEntitet() {
        if (\u0442RegistracioniEntitet == null) {
            \u0442RegistracioniEntitet = new ArrayList<\u0422RegistracioniEntitet>();
        }
        return this.\u0442RegistracioniEntitet;
    }

}
