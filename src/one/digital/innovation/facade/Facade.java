package one.digital.innovation.facade;

import one.digital.innovation.subsistema1.crm.CrmService;
import one.digital.innovation.subsistema2.cep.CepService;

public class Facade {

    public void migrarCliente(String nome, String cep){
        String cidade = CepService.getInstancia().recuperarCidade(cep);
        String estado = CepService.getInstancia().recuperarEstado(cep);
        CrmService.gravarCliente(nome, cep, cidade, estado);
    }
}
