package one.digital.innovation.subsistema2.cep;

import one.digital.innovation.singleton.SingletonEager;

public class CepService {
    private static CepService instancia = new CepService();

    private CepService() {
        super();
    }

    public static CepService getInstancia() {
        return instancia;
    }
    public String recuperarCidade(String cep){
        return "Recife";

    }
    public String recuperarEstado(String cep) {
        return "PE";
    }
}
