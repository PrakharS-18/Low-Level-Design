package LLD.Creational_Design_Pattern.Singleton_Pattern.EagerInitialization;

public class EagerInitializationSingleton {
    private static final EagerInitializationSingleton INSTANCE = new EagerInitializationSingleton();
    private EagerInitializationSingleton() {}
    public static EagerInitializationSingleton getInstance() {
        return INSTANCE;
    }

    /*
    * Y - THREAD-SAFE
    * X - INSTANCE CREATED EVEN IF NEVER USED
    **/
}
