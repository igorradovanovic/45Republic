
package com.base.Republic.wsclient.data.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TAprZahtev complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TAprZahtev"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="matBrOrgPodnosiocaField" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="maticniBrojField" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="nazivOrgPodnosiocaField" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="\u0442ipField" type="{http://schemas.datacontract.org/2004/07/SnT.APR_PLProxyService.APR_PL}\u0422TipRegistracionogEntiteta"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlRootElement(name="TAprZahtev")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TAprZahtev", propOrder = {
    "matBrOrgPodnosiocaField",
    "maticniBrojField",
    "nazivOrgPodnosiocaField",
    "\u0442ipField"
})
public class TAprZahtev {

    @XmlElement(required = true, nillable = true)
    protected String matBrOrgPodnosiocaField;
    @XmlElement(required = true, nillable = true)
    protected String maticniBrojField;
    @XmlElement(required = true, nillable = true)
    protected String nazivOrgPodnosiocaField;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected \u0422TipRegistracionogEntiteta \u0442ipField;

    /**
     * Gets the value of the matBrOrgPodnosiocaField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatBrOrgPodnosiocaField() {
        return matBrOrgPodnosiocaField;
    }

    /**
     * Sets the value of the matBrOrgPodnosiocaField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatBrOrgPodnosiocaField(String value) {
        this.matBrOrgPodnosiocaField = value;
    }

    /**
     * Gets the value of the maticniBrojField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaticniBrojField() {
        return maticniBrojField;
    }

    /**
     * Sets the value of the maticniBrojField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaticniBrojField(String value) {
        this.maticniBrojField = value;
    }

    /**
     * Gets the value of the nazivOrgPodnosiocaField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNazivOrgPodnosiocaField() {
        return nazivOrgPodnosiocaField;
    }

    /**
     * Sets the value of the nazivOrgPodnosiocaField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNazivOrgPodnosiocaField(String value) {
        this.nazivOrgPodnosiocaField = value;
    }

    /**
     * Gets the value of the \u0442ipField property.
     * 
     * @return
     *     possible object is
     *     {@link \u0422TipRegistracionogEntiteta }
     *     
     */
    public \u0422TipRegistracionogEntiteta get\u0422ipField() {
        return \u0442ipField;
    }

    /**
     * Sets the value of the \u0442ipField property.
     * 
     * @param value
     *     allowed object is
     *     {@link \u0422TipRegistracionogEntiteta }
     *     
     */
    public void set\u0422ipField(\u0422TipRegistracionogEntiteta value) {
        this.\u0442ipField = value;
    }

}
