package LLD.Creational_Design_Pattern.Singleton_Pattern;

public class Singleton {

    private static Singleton objectSingleton;

    private Singleton() {
        // private constructor because we should not be allowed to create a object
        // and object are created via constructor in java , so we make the constructor private now the option to make new object vanishes.
    }

    /* How do you create that one instance and use it ?
     * Ans: Since the constructor is not available to create an object , we create
     */

    public static Singleton getInstance() {
        if (objectSingleton==null) {
            objectSingleton = new Singleton();
        }
        return objectSingleton;
    }

    /*
     * 1. Make the default constructor private
     *
     * 2. Declare the getInstance method public and static to create that only instance
     *
     * 3. create the Singleton field as private so that no one can access it.
     *
     *
     * REAL LIFE EXAMPLE :- Logger Implementation, JDBC Connection Pool (Hikari).
     *
     */
}
