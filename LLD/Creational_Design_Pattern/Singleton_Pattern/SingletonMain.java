package LLD.Creational_Design_Pattern.Singleton_Pattern;

import LLD.Creational_Design_Pattern.Singleton_Pattern.BillPugh.BillPughStaticInnerClassSingleton;

public class SingletonMain {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();

        Singleton obj2 = Singleton.getInstance();

        System.out.println(obj1.hashCode() == obj2.hashCode());

        BillPughStaticInnerClassSingleton obj3 = BillPughStaticInnerClassSingleton.getInstance();

        BillPughStaticInnerClassSingleton obj4 = BillPughStaticInnerClassSingleton.getInstance();

        System.out.println(obj3.hashCode() == obj4.hashCode());


    }
}
