
package webservices.uploadArquivos;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoClassificacaoUploadArquivoGedWs.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tipoClassificacaoUploadArquivoGedWs">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="GED"/>
 *     &lt;enumeration value="ASO"/>
 *     &lt;enumeration value="ASO_BRANCO"/>
 *     &lt;enumeration value="FICHA_CLINICA"/>
 *     &lt;enumeration value="FICHA_CLINICA_BRANCO"/>
 *     &lt;enumeration value="PEDIDO_EXAME"/>
 *     &lt;enumeration value="RESULTADO_EXAME"/>
 *     &lt;enumeration value="ENFERMAGEM"/>
 *     &lt;enumeration value="CONSULTA_ASSISTENCIAL"/>
 *     &lt;enumeration value="LICENCA_MEDICA"/>
 *     &lt;enumeration value="FICHA_PERSONALIZADA"/>
 *     &lt;enumeration value="RECEITA_MEDICA"/>
 *     &lt;enumeration value="ATESTADO"/>
 *     &lt;enumeration value="GESTAO_FAP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tipoClassificacaoUploadArquivoGedWs")
@XmlEnum
public enum TipoClassificacaoUploadArquivoGedWs {

    GED,
    ASO,
    ASO_BRANCO,
    FICHA_CLINICA,
    FICHA_CLINICA_BRANCO,
    PEDIDO_EXAME,
    RESULTADO_EXAME,
    ENFERMAGEM,
    CONSULTA_ASSISTENCIAL,
    LICENCA_MEDICA,
    FICHA_PERSONALIZADA,
    RECEITA_MEDICA,
    ATESTADO,
    GESTAO_FAP;

    public String value() {
        return name();
    }

    public static TipoClassificacaoUploadArquivoGedWs fromValue(String v) {
        return valueOf(v);
    }

}
