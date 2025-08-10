package LLD.Creational_Design_Pattern.Singleton_Pattern.LazyLoaded;

import LLD.Creational_Design_Pattern.Singleton_Pattern.EagerInitialization.EagerInitializationSingleton;

public class LazyLoadedSingleton {
    private static LazyLoadedSingleton INSTANCE;
    private LazyLoadedSingleton() {}
    public static LazyLoadedSingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new LazyLoadedSingleton();
        }
        return INSTANCE;
    }

    /*
    * Y - Resource efficient
    * X - Not THREAD SAFE*/
}
