package LLD.Structural_Design_Pattern.Decorator_Pattern;

public class ChickenBurger extends Burger{

    @Override
    void description() {
        System.out.println("I am a CHICKEN Burger");
    }

    @Override
    int cost() {
        return 150;
    }
}
