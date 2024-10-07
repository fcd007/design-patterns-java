package br.dev.dantas.singleton;

/**
 * Singleton lento (Lazy)
 * @autor Dantas
 */
public class SingletonLazy {

  private static SingletonLazy instance;
  private SingletonLazy() {
    super();
  }

  public static SingletonLazy getInstance() {
    if(instance == null) {
      instance = new SingletonLazy();
    }

    return instance;
  }
}
