package LLD.Behavioural_Design_Pattern.Strategy_Pattern;

public class PrakharDuck extends Duck{

    public PrakharDuck(IFlyStrategy ifs, ISwimStrategy is) {
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
