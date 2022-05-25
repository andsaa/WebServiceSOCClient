
package webservices.uploadArquivos;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for webServiceInfoGeralVo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="webServiceInfoGeralVo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoMensagem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mensagem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mensagemOperacaoDetalheList" type="{http://services.soc.age.com/}webServiceInfoOperacaoDetalheVo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="numeroErros" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "webServiceInfoGeralVo", propOrder = {
    "codigoMensagem",
    "mensagem",
    "mensagemOperacaoDetalheList",
    "numeroErros"
})
public class WebServiceInfoGeralVo {

    protected String codigoMensagem;
    protected String mensagem;
    @XmlElement(nillable = true)
    protected List<WebServiceInfoOperacaoDetalheVo> mensagemOperacaoDetalheList;
    protected int numeroErros;

    /**
     * Gets the value of the codigoMensagem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoMensagem() {
        return codigoMensagem;
    }

    /**
     * Sets the value of the codigoMensagem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoMensagem(String value) {
        this.codigoMensagem = value;
    }

    /**
     * Gets the value of the mensagem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMensagem() {
        return mensagem;
    }

    /**
     * Sets the value of the mensagem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMensagem(String value) {
        this.mensagem = value;
    }

    /**
     * Gets the value of the mensagemOperacaoDetalheList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mensagemOperacaoDetalheList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMensagemOperacaoDetalheList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WebServiceInfoOperacaoDetalheVo }
     * 
     * 
     */
    public List<WebServiceInfoOperacaoDetalheVo> getMensagemOperacaoDetalheList() {
        if (mensagemOperacaoDetalheList == null) {
            mensagemOperacaoDetalheList = new ArrayList<WebServiceInfoOperacaoDetalheVo>();
        }
        return this.mensagemOperacaoDetalheList;
    }

    /**
     * Gets the value of the numeroErros property.
     * 
     */
    public int getNumeroErros() {
        return numeroErros;
    }

    /**
     * Sets the value of the numeroErros property.
     * 
     */
    public void setNumeroErros(int value) {
        this.numeroErros = value;
    }

}
