package LLD.Creational_Design_Pattern.Singleton_Pattern.LazyLoaded;

import LLD.Creational_Design_Pattern.Singleton_Pattern.Singleton;

public class DoubleCheckingLockingLLSingleton {
    private static DoubleCheckingLockingLLSingleton INSTANCE;
    private DoubleCheckingLockingLLSingleton() {}
    public static DoubleCheckingLockingLLSingleton getInstance() {
        if (INSTANCE == null) {
            /* specific area where race condition might occur */
            synchronized (Singleton.class) {
                INSTANCE = new DoubleCheckingLockingLLSingleton();
            }
        }
        return INSTANCE;
    }

    /*
     * Y - Resource efficient
     * Y - THREAD SAFE
     * Y - Locking overhead on performance
     * X - code complexity*/
}
