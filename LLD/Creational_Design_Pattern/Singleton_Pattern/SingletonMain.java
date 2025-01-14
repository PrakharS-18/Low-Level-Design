package LLD.Creational_Design_Pattern.Singleton_Pattern;

public class SingletonMain {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();

        Singleton obj2 = Singleton.getInstance();

        System.out.println(obj1.hashCode() == obj2.hashCode());

    }
}
