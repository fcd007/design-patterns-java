package br.dev.dantas.facade.subsistema2;

public class CrmService {

  private CrmService() {
    super();
  }

  public static void gravarCliente(String nome, String cep, String cidade, String estado) {
    System.out.println("Gravando cliente no CRM: " + nome + " - " + cep + " - " + cidade + " - " + estado);
    //verificar dados do cliente ravar cliente no CRM
    System.out.println("Cliente gravado com sucesso!");
  }
}
