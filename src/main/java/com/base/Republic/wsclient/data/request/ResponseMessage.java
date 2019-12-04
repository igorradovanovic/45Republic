
package com.base.Republic.wsclient.data.request;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.base.Republic.wsclient.data.response.TAprZahtevResponse;
;


/**
 * <p>Java class for ResponseMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseMessage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ErrorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ErrorDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Result" type="{http://schemas.datacontract.org/2004/07/SnT.APR_PLProxyService.APR_PL}TAprZahtevResponse" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlRootElement(name = "ResponseMessage")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseMessage", propOrder = {
    "errorCode",
    "errorDescription",
    "id",
    "result"
})
public class ResponseMessage {

    @XmlElementRef(name = "ErrorCode", namespace = "http://APR.AprZahtev.Global.Lista", type = JAXBElement.class, required = false)
    protected JAXBElement<String> errorCode;
    @XmlElementRef(name = "ErrorDescription", namespace = "http://APR.AprZahtev.Global.Lista", type = JAXBElement.class, required = false)
    protected JAXBElement<String> errorDescription;
    @XmlElementRef(name = "Id", namespace = "http://APR.AprZahtev.Global.Lista", type = JAXBElement.class, required = false)
    protected JAXBElement<String> id;
    @XmlElementRef(name = "Result", namespace = "http://APR.AprZahtev.Global.Lista", type = JAXBElement.class, required = false)
    protected JAXBElement<TAprZahtevResponse> result;

    /**
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setErrorCode(JAXBElement<String> value) {
        this.errorCode = value;
    }

    /**
     * Gets the value of the errorDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getErrorDescription() {
        return errorDescription;
    }

    /**
     * Sets the value of the errorDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setErrorDescription(JAXBElement<String> value) {
        this.errorDescription = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setId(JAXBElement<String> value) {
        this.id = value;
    }

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TAprZahtevResponse }{@code >}
     *     
     */
    public JAXBElement<TAprZahtevResponse> getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TAprZahtevResponse }{@code >}
     *     
     */
    public void setResult(JAXBElement<TAprZahtevResponse> value) {
        this.result = value;
    }

}
