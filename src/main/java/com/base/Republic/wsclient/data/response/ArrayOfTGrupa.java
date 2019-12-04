package com.base.Republic.wsclient.data.response;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfTGrupa complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfTGrupa"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TGrupa" type="{http://schemas.datacontract.org/2004/07/SnT.APR_PLProxyService.APR_PL}TGrupa" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfTGrupa", propOrder = {
    "tGrupa"
})
public class ArrayOfTGrupa {

    @XmlElement(name = "TGrupa", nillable = true)
    protected List<TGrupa> tGrupa;

    /**
     * Gets the value of the tGrupa property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tGrupa property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTGrupa().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TGrupa }
     * 
     * 
     */
    public List<TGrupa> getTGrupa() {
        if (tGrupa == null) {
            tGrupa = new ArrayList<TGrupa>();
        }
        return this.tGrupa;
    }

}
