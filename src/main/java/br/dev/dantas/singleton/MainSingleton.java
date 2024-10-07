package br.dev.dantas.singleton;

public class MainSingleton {

  public static void main(String[] args) {

    // testes relacionados ao Design Pattern Singleton
    SingletonLazy singletonLazy = SingletonLazy.getInstance();
    System.out.println(singletonLazy);
    singletonLazy = SingletonLazy.getInstance();
    System.out.println(singletonLazy);

    SingletonEager singletonEager = SingletonEager.getInstance();
    System.out.println(singletonEager);
    singletonEager = SingletonEager.getInstance();
    System.out.println(singletonEager);

    SingletonLazyHolder singletonLazyHolder = SingletonLazyHolder.getInstance();
    System.out.println(singletonLazyHolder);
    singletonLazyHolder = SingletonLazyHolder.getInstance();
    System.out.println(singletonLazyHolder);
  }
}
