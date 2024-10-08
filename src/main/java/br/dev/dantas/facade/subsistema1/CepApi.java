package br.dev.dantas.facade.subsistema1;

public class CepApi {

  //implementando um singleton
  private static CepApi instance = new CepApi();

  private CepApi() {
    super();
  }

  public static CepApi getInstance() {
    return instance;
  }

  public String getCidade(String cep) {
    return "São Paulo";
  }

  public String getEstado(String cep) {
    return "SP";
  }

  public String getEndereco(String cep) {
    return "Rua São Paulo";
  }

  public String getBairro(String cep) {
    return "Centro";
  }
}
