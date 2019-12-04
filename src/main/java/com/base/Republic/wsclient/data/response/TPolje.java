
package com.base.Republic.wsclient.data.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TPolje complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TPolje"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nazivField" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tipField" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="vrednostField" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TPolje", propOrder = {
    "nazivField",
    "tipField",
    "vrednostField"
})
public class TPolje {

    @XmlElement(required = true, nillable = true)
    protected String nazivField;
    @XmlElement(required = true, nillable = true)
    protected String tipField;
    @XmlElement(required = true, nillable = true)
    protected String vrednostField;

    /**
     * Gets the value of the nazivField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNazivField() {
        return nazivField;
    }

    /**
     * Sets the value of the nazivField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNazivField(String value) {
        this.nazivField = value;
    }

    /**
     * Gets the value of the tipField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipField() {
        return tipField;
    }

    /**
     * Sets the value of the tipField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipField(String value) {
        this.tipField = value;
    }

    /**
     * Gets the value of the vrednostField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVrednostField() {
        return vrednostField;
    }

    /**
     * Sets the value of the vrednostField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVrednostField(String value) {
        this.vrednostField = value;
    }

}
