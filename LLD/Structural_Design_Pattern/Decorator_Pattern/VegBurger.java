package LLD.Structural_Design_Pattern.Decorator_Pattern;

public class VegBurger extends Burger{
    @Override
    void description() {
        System.out.println("I am a VEG burger");
    }

    @Override
    int cost() {
       return 100;
    }
}
