package LLD.Creational_Design_Pattern.Prototype_Pattern.Shape_Example;

public class Area {

    private String type;

    public Area(String type) {
        this.type = type;
    }

    void area() {
        System.out.println("I will display your area of type " + type);
    }
}
