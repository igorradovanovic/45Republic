
package com.base.Republic.wsclient.data.apws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.base.Republic.wsclient.data.response.TAprZahtev;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="data" type="{http://schemas.datacontract.org/2004/07/SnT.APR_PLProxyService.APR_PL}TAprZahtev" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "data"
})
@XmlRootElement(name = "GetRegListaEntiteta")
public class GetRegListaEntiteta {

    @XmlElementRef(name = "data", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<TAprZahtev> data;

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TAprZahtev }{@code >}
     *     
     */
    public JAXBElement<TAprZahtev> getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TAprZahtev }{@code >}
     *     
     */
    public void setData(JAXBElement<TAprZahtev> value) {
        this.data = value;
    }

}
