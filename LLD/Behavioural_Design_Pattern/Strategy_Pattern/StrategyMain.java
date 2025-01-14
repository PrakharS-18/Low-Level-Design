package LLD.Behavioural_Design_Pattern.Strategy_Pattern;

public class StrategyMain {
    public static void main(String[] args) {
        Duck pDuck = new PrakharDuck(new FlyStrategyTwo(), new SwimStrategyTwo());

        pDuck.display();
        pDuck.fly();
        pDuck.swim();

        System.out.println("---------------------------------------------------------------------------------------");

        Duck mDuck = new MomDuck(new FlyStrategyOne(), new SwimStrategyOne());

        mDuck.display();
        mDuck.fly();
        mDuck.swim();

        System.out.println("---------------------------------------------------------------------------------------");

        Duck tejDuck = new TejDuck(new FlyStrategyTwo(), new SwimStrategyThree());

        tejDuck.display();
        tejDuck.fly();
        tejDuck.swim();

    }
}
