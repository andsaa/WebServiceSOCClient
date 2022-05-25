
package webservices.uploadArquivos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for gedWsRetornoVo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gedWsRetornoVo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gedWsVo" type="{http://services.soc.age.com/}gedWsVo" minOccurs="0"/>
 *         &lt;element name="informacaoGeral" type="{http://services.soc.age.com/}webServiceInfoGeralVo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gedWsRetornoVo", propOrder = {
    "gedWsVo",
    "informacaoGeral"
})
public class GedWsRetornoVo {

    protected GedWsVo gedWsVo;
    protected WebServiceInfoGeralVo informacaoGeral;

    /**
     * Gets the value of the gedWsVo property.
     * 
     * @return
     *     possible object is
     *     {@link GedWsVo }
     *     
     */
    public GedWsVo getGedWsVo() {
        return gedWsVo;
    }

    /**
     * Sets the value of the gedWsVo property.
     * 
     * @param value
     *     allowed object is
     *     {@link GedWsVo }
     *     
     */
    public void setGedWsVo(GedWsVo value) {
        this.gedWsVo = value;
    }

    /**
     * Gets the value of the informacaoGeral property.
     * 
     * @return
     *     possible object is
     *     {@link WebServiceInfoGeralVo }
     *     
     */
    public WebServiceInfoGeralVo getInformacaoGeral() {
        return informacaoGeral;
    }

    /**
     * Sets the value of the informacaoGeral property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebServiceInfoGeralVo }
     *     
     */
    public void setInformacaoGeral(WebServiceInfoGeralVo value) {
        this.informacaoGeral = value;
    }

}
