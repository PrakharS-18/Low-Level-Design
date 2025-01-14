package LLD.Behavioural_Design_Pattern.Strategy_Pattern;

public class FlyStrategyOne implements IFlyStrategy{

    @Override
    public void fly() {
        System.out.println("Hi, I am function to fly like Mom and Dad");
    }
}
