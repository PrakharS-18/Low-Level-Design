package LLD.Structural_Design_Pattern.Decorator_Pattern;

public class DecoratorMain {

    public static void main(String[] args) {
        Burger vegBurger = new VegBurger();

        vegBurger.description();

        vegBurger = new SaladDecorator(vegBurger);

        vegBurger.description();

        vegBurger = new CheeseDecorator(vegBurger);

        vegBurger.description();

        System.out.println("-------------------------------------------------------------------------");

        System.out.println("Final Cost: "+vegBurger.cost());
    }
}
