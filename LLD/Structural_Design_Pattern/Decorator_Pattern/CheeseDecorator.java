package LLD.Structural_Design_Pattern.Decorator_Pattern;

public class CheeseDecorator extends BurgerDecorator {

    private Burger burger;

    public CheeseDecorator(Burger burger) {
        this.burger = burger;
    }

    @Override
    void description() {
        System.out.println("Added some extra cheese on burger");
    }

    @Override
    int cost() {
        return burger.cost() + 25;
    }
}
