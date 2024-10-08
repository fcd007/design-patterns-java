package br.dev.dantas.facade;

import br.dev.dantas.facade.subsistema1.CepApi;
import br.dev.dantas.facade.subsistema2.CrmService;

public class Facade {

  public void migrarCliente(String nome, String cep) {

    //podemos obter a cidade e o estado a partir do CEP
    String cidade = CepApi.getInstance().getCidade(cep);
    String estado = CepApi.getInstance().getEstado(cep);

    CrmService.gravarCliente(nome, cep, cidade, estado);
  }
}
