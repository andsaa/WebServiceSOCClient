package businnes;

import webservices.exportadados.ExportaDadosWs;
import webservices.exportadados.ExportaDadosWsService;
import webservices.exportadados.ExportaDadosWsVo;
import webservices.exportadados.WSException_Exception;

/**
 * Classe responsável por exemplificar a integração exporta dados
 * @author Andre Pinheiro
 * AGE & Make Technology
 */
public class ExportaDadosWsClient {
	
	
	public static void main(String[] args) {
		ExportaDadosWsClient client = new ExportaDadosWsClient();
		client.execute("{'empresa':'','codigo':'','chave':'','tipoSaida':'json'}");
		
	}
	
	private void execute(String parametros){
		ExportaDadosWs client = new ExportaDadosWsService().getExportaDadosWsPort();
		ExportaDadosWsVo arg0 = new ExportaDadosWsVo();
		arg0.setParametros(parametros);
		try {
			ExportaDadosWsVo exportaDadosWs = client.exportaDadosWs(arg0);
			if(exportaDadosWs.getMensagemErro() != null && exportaDadosWs.getMensagemErro().length() > 0){
				System.err.println("Erro >>>> "+ exportaDadosWs.getMensagemErro());
			}else{
				System.out.println(exportaDadosWs.getRetorno());
			}
			
		} catch (WSException_Exception e) {
			e.printStackTrace();
		}
		
	}

}
