package LLD.Behavioural_Design_Pattern.Strategy_Pattern;

public class Duck {

    IFlyStrategy iFlyStrategy;
    ISwimStrategy iSwimStrategy;

    public Duck(IFlyStrategy ifs, ISwimStrategy is) {
        this.iFlyStrategy = ifs;
        this.iSwimStrategy = is;
    }
    void display() {
        System.out.println("Display the information about yourself");
    }

    public void fly() {
        iFlyStrategy.fly();
    }

    public void swim() {
        iSwimStrategy.swim();
    }
}
