
package com.base.Republic.wsclient.data.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for \u0422RegistracioniEntitet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="\u0422RegistracioniEntitet"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="listaGrupaField" type="{http://schemas.datacontract.org/2004/07/SnT.APR_PLProxyService.APR_PL}ArrayOfTGrupa"/&gt;
 *         &lt;element name="maticniBrojField" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tipField" type="{http://schemas.datacontract.org/2004/07/SnT.APR_PLProxyService.APR_PL}\u0422TipRegistracionogEntiteta1"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u0422RegistracioniEntitet", propOrder = {
    "listaGrupaField",
    "maticniBrojField",
    "tipField"
})
public class \u0422RegistracioniEntitet {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfTGrupa listaGrupaField;
    @XmlElement(required = true, nillable = true)
    protected String maticniBrojField;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected \u0422TipRegistracionogEntiteta1 tipField;

    /**
     * Gets the value of the listaGrupaField property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTGrupa }
     *     
     */
    public ArrayOfTGrupa getListaGrupaField() {
        return listaGrupaField;
    }

    /**
     * Sets the value of the listaGrupaField property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTGrupa }
     *     
     */
    public void setListaGrupaField(ArrayOfTGrupa value) {
        this.listaGrupaField = value;
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
     * Gets the value of the tipField property.
     * 
     * @return
     *     possible object is
     *     {@link \u0422TipRegistracionogEntiteta1 }
     *     
     */
    public \u0422TipRegistracionogEntiteta1 getTipField() {
        return tipField;
    }

    /**
     * Sets the value of the tipField property.
     * 
     * @param value
     *     allowed object is
     *     {@link \u0422TipRegistracionogEntiteta1 }
     *     
     */
    public void setTipField(\u0422TipRegistracionogEntiteta1 value) {
        this.tipField = value;
    }

}
