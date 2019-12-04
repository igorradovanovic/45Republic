
package com.base.Republic.wsclient.data.response;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.snt_apr_plproxyservice package. 
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

    private final static QName _TAprZahtev_QNAME = new QName("http://schemas.datacontract.org/2004/07/SnT.APR_PLProxyService.APR_PL", "TAprZahtev");
    private final static QName _\u0422TipRegistracionogEntiteta_QNAME = new QName("http://schemas.datacontract.org/2004/07/SnT.APR_PLProxyService.APR_PL", "\u0422TipRegistracionogEntiteta");
    private final static QName _TAprZahtevResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/SnT.APR_PLProxyService.APR_PL", "TAprZahtevResponse");
    private final static QName _ArrayOf\u0422RegistracioniEntitet_QNAME = new QName("http://schemas.datacontract.org/2004/07/SnT.APR_PLProxyService.APR_PL", "ArrayOf\u0422RegistracioniEntitet");
    private final static QName _\u0422RegistracioniEntitet_QNAME = new QName("http://schemas.datacontract.org/2004/07/SnT.APR_PLProxyService.APR_PL", "\u0422RegistracioniEntitet");
    private final static QName _ArrayOfTGrupa_QNAME = new QName("http://schemas.datacontract.org/2004/07/SnT.APR_PLProxyService.APR_PL", "ArrayOfTGrupa");
    private final static QName _TGrupa_QNAME = new QName("http://schemas.datacontract.org/2004/07/SnT.APR_PLProxyService.APR_PL", "TGrupa");
    private final static QName _ArrayOfTPolje_QNAME = new QName("http://schemas.datacontract.org/2004/07/SnT.APR_PLProxyService.APR_PL", "ArrayOfTPolje");
    private final static QName _TPolje_QNAME = new QName("http://schemas.datacontract.org/2004/07/SnT.APR_PLProxyService.APR_PL", "TPolje");
    private final static QName _\u0422TipRegistracionogEntiteta1_QNAME = new QName("http://schemas.datacontract.org/2004/07/SnT.APR_PLProxyService.APR_PL", "\u0422TipRegistracionogEntiteta1");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.snt_apr_plproxyservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TAprZahtev }
     * 
     */
    public TAprZahtev createTAprZahtev() {
        return new TAprZahtev();
    }

    /**
     * Create an instance of {@link TAprZahtevResponse }
     * 
     */
    public TAprZahtevResponse createTAprZahtevResponse() {
        return new TAprZahtevResponse();
    }

    /**
     * Create an instance of {@link ArrayOf\u0422RegistracioniEntitet }
     * 
     */
    public ArrayOf\u0422RegistracioniEntitet createArrayOf\u0422RegistracioniEntitet() {
        return new ArrayOf\u0422RegistracioniEntitet();
    }

    /**
     * Create an instance of {@link \u0422RegistracioniEntitet }
     * 
     */
    public \u0422RegistracioniEntitet create\u0422RegistracioniEntitet() {
        return new \u0422RegistracioniEntitet();
    }

    /**
     * Create an instance of {@link ArrayOfTGrupa }
     * 
     */
    public ArrayOfTGrupa createArrayOfTGrupa() {
        return new ArrayOfTGrupa();
    }

    /**
     * Create an instance of {@link TGrupa }
     * 
     */
    public TGrupa createTGrupa() {
        return new TGrupa();
    }

    /**
     * Create an instance of {@link ArrayOfTPolje }
     * 
     */
    public ArrayOfTPolje createArrayOfTPolje() {
        return new ArrayOfTPolje();
    }

    /**
     * Create an instance of {@link TPolje }
     * 
     */
    public TPolje createTPolje() {
        return new TPolje();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TAprZahtev }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SnT.APR_PLProxyService.APR_PL", name = "TAprZahtev")
    public JAXBElement<TAprZahtev> createTAprZahtev(TAprZahtev value) {
        return new JAXBElement<TAprZahtev>(_TAprZahtev_QNAME, TAprZahtev.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link \u0422TipRegistracionogEntiteta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SnT.APR_PLProxyService.APR_PL", name = "\u0422TipRegistracionogEntiteta")
    public JAXBElement<\u0422TipRegistracionogEntiteta> create\u0422TipRegistracionogEntiteta(\u0422TipRegistracionogEntiteta value) {
        return new JAXBElement<\u0422TipRegistracionogEntiteta>(_\u0422TipRegistracionogEntiteta_QNAME, \u0422TipRegistracionogEntiteta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TAprZahtevResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SnT.APR_PLProxyService.APR_PL", name = "TAprZahtevResponse")
    public JAXBElement<TAprZahtevResponse> createTAprZahtevResponse(TAprZahtevResponse value) {
        return new JAXBElement<TAprZahtevResponse>(_TAprZahtevResponse_QNAME, TAprZahtevResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOf\u0422RegistracioniEntitet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SnT.APR_PLProxyService.APR_PL", name = "ArrayOf\u0422RegistracioniEntitet")
    public JAXBElement<ArrayOf\u0422RegistracioniEntitet> createArrayOf\u0422RegistracioniEntitet(ArrayOf\u0422RegistracioniEntitet value) {
        return new JAXBElement<ArrayOf\u0422RegistracioniEntitet>(_ArrayOf\u0422RegistracioniEntitet_QNAME, ArrayOf\u0422RegistracioniEntitet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link \u0422RegistracioniEntitet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SnT.APR_PLProxyService.APR_PL", name = "\u0422RegistracioniEntitet")
    public JAXBElement<\u0422RegistracioniEntitet> create\u0422RegistracioniEntitet(\u0422RegistracioniEntitet value) {
        return new JAXBElement<\u0422RegistracioniEntitet>(_\u0422RegistracioniEntitet_QNAME, \u0422RegistracioniEntitet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTGrupa }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SnT.APR_PLProxyService.APR_PL", name = "ArrayOfTGrupa")
    public JAXBElement<ArrayOfTGrupa> createArrayOfTGrupa(ArrayOfTGrupa value) {
        return new JAXBElement<ArrayOfTGrupa>(_ArrayOfTGrupa_QNAME, ArrayOfTGrupa.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TGrupa }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SnT.APR_PLProxyService.APR_PL", name = "TGrupa")
    public JAXBElement<TGrupa> createTGrupa(TGrupa value) {
        return new JAXBElement<TGrupa>(_TGrupa_QNAME, TGrupa.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTPolje }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SnT.APR_PLProxyService.APR_PL", name = "ArrayOfTPolje")
    public JAXBElement<ArrayOfTPolje> createArrayOfTPolje(ArrayOfTPolje value) {
        return new JAXBElement<ArrayOfTPolje>(_ArrayOfTPolje_QNAME, ArrayOfTPolje.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TPolje }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SnT.APR_PLProxyService.APR_PL", name = "TPolje")
    public JAXBElement<TPolje> createTPolje(TPolje value) {
        return new JAXBElement<TPolje>(_TPolje_QNAME, TPolje.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link \u0422TipRegistracionogEntiteta1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SnT.APR_PLProxyService.APR_PL", name = "\u0422TipRegistracionogEntiteta1")
    public JAXBElement<\u0422TipRegistracionogEntiteta1> create\u0422TipRegistracionogEntiteta1(\u0422TipRegistracionogEntiteta1 value) {
        return new JAXBElement<\u0422TipRegistracionogEntiteta1>(_\u0422TipRegistracionogEntiteta1_QNAME, \u0422TipRegistracionogEntiteta1 .class, null, value);
    }

}
