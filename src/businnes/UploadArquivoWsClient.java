package businnes;

import java.nio.file.Files;
import java.nio.file.Paths;

import webservices.uploadArquivos.IdentificacaoUsuarioWsVo;
import webservices.uploadArquivos.RegrasArquivosGed;
import webservices.uploadArquivos.TipoClassificacaoUploadArquivoGedWs;
import webservices.uploadArquivos.UploadArquivosWs;
import webservices.uploadArquivos.UploadArquivosWsVo;

/**
 * Classe responsável por exemplificar a integração Upload de Arquivos
 * @author Andre Pinheiro
 * AGE & Make Technology
 */
public class UploadArquivoWsClient {
	
	private static final String USUARIO = "";
	private static final String RESPONSAVEL = "";
	private static final String CODIGO_EMPRESA_PRINCIPAL = "";
	private static final String SENHA = "";
	private static final String LOGIN = "";
	private static final String arquivo = "";
	
	private String codigo;
	private String chaveAcesso;
	
	public UploadArquivoWsClient(String codigo, String chaveAcesso){
		this.codigo = codigo;
		this.chaveAcesso = chaveAcesso;
	}

	public static void main(String[] args) {
		UploadArquivoWsClient client = new UploadArquivoWsClient(LOGIN, SENHA);
		client.upload();
	}
	
	private void upload(){
		
		try {
			WebServiceLocator 		locator 		= WebServiceLocator.getInstance();
			UploadArquivosWs    integracao		= locator.getUploadArquivo(String.valueOf(codigo),chaveAcesso);
			
			UploadArquivosWsVo uploadArquivoWsVo = new UploadArquivosWsVo();
			uploadArquivoWsVo.setIdentificacaoVo(getIdentificacaoVo());
			uploadArquivoWsVo.setArquivo(Files.readAllBytes(Paths.get(arquivo)));
			uploadArquivoWsVo.setClassificacao(TipoClassificacaoUploadArquivoGedWs.GED);
			
			uploadArquivoWsVo.setNomeArquivo("Teste Upload WS");
			uploadArquivoWsVo.setExtensaoArquivo(RegrasArquivosGed.TXT);
			uploadArquivoWsVo.setCodigoGed("");
			
			boolean uploadArquivo = integracao.uploadArquivo(uploadArquivoWsVo);
			
			if(uploadArquivo){
				System.out.println("Upload Efetuado com sucesso.");
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	private IdentificacaoUsuarioWsVo getIdentificacaoVo() {
		IdentificacaoUsuarioWsVo value = new IdentificacaoUsuarioWsVo();
		value.setCodigoEmpresaPrincipal(CODIGO_EMPRESA_PRINCIPAL);
		value.setCodigoResponsavel(RESPONSAVEL);
		value.setCodigoUsuario(USUARIO);
		value.setChaveAcesso(SENHA);
		return value;
	}

}
