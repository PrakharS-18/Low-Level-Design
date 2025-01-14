package LLD.Creational_Design_Pattern.Factory_Pattern;

public class FactoryMain {
    public static void main(String[] args) {

        /* Hides the complexity of creating the objects and its is done in DeveloperFactory Class , so kind of "Abstraction" */
        Developer developer1 = DeveloperFactory.getDeveloperWithLanguage("cpP");

        System.out.println(developer1.salary());

        developer1 = DeveloperFactory.getDeveloperWithLanguage("Java");

        System.out.println(developer1.salary());
    }

    /*
    * Factory Method is mostly used to deCouple the client code from the actual instantiation of objects
    *
    * Creational Design Patterns are in general related to different and efficient way of creating the objects.
    *
    * The issue with the Factory Design pattern is violation of O/C principle, even if you use abstract design pattern
    * it still violates may be not in that file but for sure in some another.
    *
    * */
}
