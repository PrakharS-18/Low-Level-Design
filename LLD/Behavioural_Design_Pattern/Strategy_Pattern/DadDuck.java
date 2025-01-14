package LLD.Behavioural_Design_Pattern.Strategy_Pattern;

public class DadDuck extends Duck{
    public DadDuck(IFlyStrategy ifs, ISwimStrategy is) {
        super(ifs, is);
    }

    @Override
    void display() {
        super.display();
    }

    @Override
    public void fly() {
        super.fly();
    }

    @Override
    public void swim() {
        super.swim();
    }
}
