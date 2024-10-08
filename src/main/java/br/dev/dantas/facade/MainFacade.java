package br.dev.dantas.facade;

public class MainFacade {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.migrarCliente("João", "01001000");
    }
}
