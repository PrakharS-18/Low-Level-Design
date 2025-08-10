package LLD.Creational_Design_Pattern.Singleton_Pattern.BillPugh;

public class BillPughStaticInnerClassSingleton {
    private BillPughStaticInnerClassSingleton() {}

    private static class SingletonHelper {
        private final static BillPughStaticInnerClassSingleton INSTANCE = new BillPughStaticInnerClassSingleton();
    }

    public static BillPughStaticInnerClassSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
}
