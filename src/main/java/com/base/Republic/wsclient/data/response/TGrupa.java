
package com.base.Republic.wsclient.data.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TGrupa complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TGrupa"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="identifikatorGrupeField" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="listaPoljaField" type="{http://schemas.datacontract.org/2004/07/SnT.APR_PLProxyService.APR_PL}ArrayOfTPolje"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TGrupa", propOrder = {
    "identifikatorGrupeField",
    "listaPoljaField"
})
public class TGrupa {

    @XmlElement(required = true, nillable = true)
    protected String identifikatorGrupeField;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfTPolje listaPoljaField;

    /**
     * Gets the value of the identifikatorGrupeField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifikatorGrupeField() {
        return identifikatorGrupeField;
    }

    /**
     * Sets the value of the identifikatorGrupeField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifikatorGrupeField(String value) {
        this.identifikatorGrupeField = value;
    }

    /**
     * Gets the value of the listaPoljaField property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTPolje }
     *     
     */
    public ArrayOfTPolje getListaPoljaField() {
        return listaPoljaField;
    }

    /**
     * Sets the value of the listaPoljaField property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTPolje }
     *     
     */
    public void setListaPoljaField(ArrayOfTPolje value) {
        this.listaPoljaField = value;
    }

}
