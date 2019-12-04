
package com.base.Republic.wsclient.data.request;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

import com.base.Republic.wsclient.data.response.TAprZahtevResponse;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the lista.global.aprzahtev.apr package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ResponseMessage_QNAME = new QName("http://APR.AprZahtev.Global.Lista", "ResponseMessage");
    private final static QName _ResponseMessageErrorCode_QNAME = new QName("http://APR.AprZahtev.Global.Lista", "ErrorCode");
    private final static QName _ResponseMessageErrorDescription_QNAME = new QName("http://APR.AprZahtev.Global.Lista", "ErrorDescription");
    private final static QName _ResponseMessageId_QNAME = new QName("http://APR.AprZahtev.Global.Lista", "Id");
    private final static QName _ResponseMessageResult_QNAME = new QName("http://APR.AprZahtev.Global.Lista", "Result");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: lista.global.aprzahtev.apr
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ResponseMessage }
     * 
     */
    public ResponseMessage createResponseMessage() {
        return new ResponseMessage();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://APR.AprZahtev.Global.Lista", name = "ResponseMessage")
    public JAXBElement<ResponseMessage> createResponseMessage(ResponseMessage value) {
        return new JAXBElement<ResponseMessage>(_ResponseMessage_QNAME, ResponseMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://APR.AprZahtev.Global.Lista", name = "ErrorCode", scope = ResponseMessage.class)
    public JAXBElement<String> createResponseMessageErrorCode(String value) {
        return new JAXBElement<String>(_ResponseMessageErrorCode_QNAME, String.class, ResponseMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://APR.AprZahtev.Global.Lista", name = "ErrorDescription", scope = ResponseMessage.class)
    public JAXBElement<String> createResponseMessageErrorDescription(String value) {
        return new JAXBElement<String>(_ResponseMessageErrorDescription_QNAME, String.class, ResponseMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://APR.AprZahtev.Global.Lista", name = "Id", scope = ResponseMessage.class)
    public JAXBElement<String> createResponseMessageId(String value) {
        return new JAXBElement<String>(_ResponseMessageId_QNAME, String.class, ResponseMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TAprZahtevResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://APR.AprZahtev.Global.Lista", name = "Result", scope = ResponseMessage.class)
    public JAXBElement<TAprZahtevResponse> createResponseMessageResult(TAprZahtevResponse value) {
        return new JAXBElement<TAprZahtevResponse>(_ResponseMessageResult_QNAME, TAprZahtevResponse.class, ResponseMessage.class, value);
    }

}
