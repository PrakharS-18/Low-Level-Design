package LLD.Creational_Design_Pattern.Singleton_Pattern.LazyLoaded;

public class SynchronizedLazyLoadedSingleton {
    private static SynchronizedLazyLoadedSingleton INSTANCE;
    private SynchronizedLazyLoadedSingleton() {}
    public static synchronized SynchronizedLazyLoadedSingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SynchronizedLazyLoadedSingleton();
        }
        return INSTANCE;
    }

    /*
     * Y - Resource efficient
     * Y - THREAD SAFE
     * X- Locking overhead on performance*/
}
