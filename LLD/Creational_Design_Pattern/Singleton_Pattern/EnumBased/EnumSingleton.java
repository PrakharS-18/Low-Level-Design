package LLD.Creational_Design_Pattern.Singleton_Pattern.EnumBased;

public enum EnumSingleton {
    INSTANCE;
    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}
/* PROS
* Thread-Safe, Serialization-Safe
* */

/* Cons :- can't be Lazy loaded (loaded when required not on class loading during jvm starts up) */
