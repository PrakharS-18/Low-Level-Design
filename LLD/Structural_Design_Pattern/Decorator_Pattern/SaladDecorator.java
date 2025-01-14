package LLD.Structural_Design_Pattern.Decorator_Pattern;

public class SaladDecorator extends BurgerDecorator{

    private Burger burger;

    public SaladDecorator (Burger burger) {
        this.burger = burger;
    }

    @Override
    void description() {
        System.out.println("Hi! Extra Salad has been added to the burger");
    }

    @Override
    int cost() {
        return burger.cost() + 11;
    }
}
