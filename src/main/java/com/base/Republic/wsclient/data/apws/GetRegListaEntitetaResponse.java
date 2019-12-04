
package com.base.Republic.wsclient.data.apws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.base.Republic.wsclient.data.request.ResponseMessage;


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
 *         &lt;element name="GetRegListaEntitetaResult" type="{http://APR.AprZahtev.Global.Lista}ResponseMessage" minOccurs="0"/&gt;
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
    "getRegListaEntitetaResult"
})
@XmlRootElement(name = "GetRegListaEntitetaResponse")
public class GetRegListaEntitetaResponse {

    @XmlElementRef(name = "GetRegListaEntitetaResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ResponseMessage> getRegListaEntitetaResult;

    /**
     * Gets the value of the getRegListaEntitetaResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ResponseMessage }{@code >}
     *     
     */
    public JAXBElement<ResponseMessage> getGetRegListaEntitetaResult() {
        return getRegListaEntitetaResult;
    }

    /**
     * Sets the value of the getRegListaEntitetaResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ResponseMessage }{@code >}
     *     
     */
    public void setGetRegListaEntitetaResult(JAXBElement<ResponseMessage> value) {
        this.getRegListaEntitetaResult = value;
    }

}
