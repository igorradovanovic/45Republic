
package com.base.Republic.wsclient.data.apws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

import com.base.Republic.wsclient.data.request.ResponseMessage;
import com.base.Republic.wsclient.data.response.TAprZahtev;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tempuri package. 
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

    private final static QName _GetRegListaEntitetaData_QNAME = new QName("http://tempuri.org/", "data");
    private final static QName _GetRegListaEntitetaResponseGetRegListaEntitetaResult_QNAME = new QName("http://tempuri.org/", "GetRegListaEntitetaResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tempuri
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetRegListaEntiteta }
     * 
     */
    public GetRegListaEntiteta createGetRegListaEntiteta() {
        return new GetRegListaEntiteta();
    }

    /**
     * Create an instance of {@link GetRegListaEntitetaResponse }
     * 
     */
    public GetRegListaEntitetaResponse createGetRegListaEntitetaResponse() {
        return new GetRegListaEntitetaResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TAprZahtev }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "data", scope = GetRegListaEntiteta.class)
    public JAXBElement<TAprZahtev> createGetRegListaEntitetaData(TAprZahtev value) {
        return new JAXBElement<TAprZahtev>(_GetRegListaEntitetaData_QNAME, TAprZahtev.class, GetRegListaEntiteta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetRegListaEntitetaResult", scope = GetRegListaEntitetaResponse.class)
    public JAXBElement<ResponseMessage> createGetRegListaEntitetaResponseGetRegListaEntitetaResult(ResponseMessage value) {
        return new JAXBElement<ResponseMessage>(_GetRegListaEntitetaResponseGetRegListaEntitetaResult_QNAME, ResponseMessage.class, GetRegListaEntitetaResponse.class, value);
    }

}
