
package webservices.uploadArquivos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateGed complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateGed">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="socged" type="{http://services.soc.age.com/}webServiceGedVo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateGed", propOrder = {
    "socged"
})
public class UpdateGed {

    protected WebServiceGedVo socged;

    /**
     * Gets the value of the socged property.
     * 
     * @return
     *     possible object is
     *     {@link WebServiceGedVo }
     *     
     */
    public WebServiceGedVo getSocged() {
        return socged;
    }

    /**
     * Sets the value of the socged property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebServiceGedVo }
     *     
     */
    public void setSocged(WebServiceGedVo value) {
        this.socged = value;
    }

}
