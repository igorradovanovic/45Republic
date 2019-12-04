
package com.base.Republic.wsclient.data.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TAprZahtevResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TAprZahtevResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="listaRegistracionihEntitetaField" type="{http://schemas.datacontract.org/2004/07/SnT.APR_PLProxyService.APR_PL}ArrayOf\u0422RegistracioniEntitet"/&gt;
 *         &lt;element name="razlogNeprihvatanjaField" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="zastevPrihvacenField" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TAprZahtevResponse", propOrder = {
    "listaRegistracionihEntitetaField",
    "razlogNeprihvatanjaField",
    "zastevPrihvacenField"
})
public class TAprZahtevResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOf\u0422RegistracioniEntitet listaRegistracionihEntitetaField;
    @XmlElement(required = true, nillable = true)
    protected String razlogNeprihvatanjaField;
    protected boolean zastevPrihvacenField;

    /**
     * Gets the value of the listaRegistracionihEntitetaField property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOf\u0422RegistracioniEntitet }
     *     
     */
    public ArrayOf\u0422RegistracioniEntitet getListaRegistracionihEntitetaField() {
        return listaRegistracionihEntitetaField;
    }

    /**
     * Sets the value of the listaRegistracionihEntitetaField property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOf\u0422RegistracioniEntitet }
     *     
     */
    public void setListaRegistracionihEntitetaField(ArrayOf\u0422RegistracioniEntitet value) {
        this.listaRegistracionihEntitetaField = value;
    }

    /**
     * Gets the value of the razlogNeprihvatanjaField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRazlogNeprihvatanjaField() {
        return razlogNeprihvatanjaField;
    }

    /**
     * Sets the value of the razlogNeprihvatanjaField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRazlogNeprihvatanjaField(String value) {
        this.razlogNeprihvatanjaField = value;
    }

    /**
     * Gets the value of the zastevPrihvacenField property.
     * 
     */
    public boolean isZastevPrihvacenField() {
        return zastevPrihvacenField;
    }

    /**
     * Sets the value of the zastevPrihvacenField property.
     * 
     */
    public void setZastevPrihvacenField(boolean value) {
        this.zastevPrihvacenField = value;
    }

}
