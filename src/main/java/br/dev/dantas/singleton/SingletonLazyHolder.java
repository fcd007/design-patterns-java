package br.dev.dantas.singleton;

/**
 * Singleton lazy holder (Lazy Holder)
 * @autor Dantas
 */
public class SingletonLazyHolder {

  private static class InstanceHolder {
    public static SingletonLazyHolder instance = new SingletonLazyHolder();
  }

  private SingletonLazyHolder() {
    super();
  }

  public static SingletonLazyHolder getInstance() {
    return InstanceHolder.instance;
  }
}
