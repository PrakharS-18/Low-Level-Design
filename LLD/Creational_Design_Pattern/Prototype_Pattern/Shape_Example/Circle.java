package LLD.Creational_Design_Pattern.Prototype_Pattern.Shape_Example;

public class Circle implements Shape {

    /* example of primitive and immutable --> we demo only Shallow copy */
    private final double radius;
    private String color;
    private final String heavyOperation = "getTheValueFromDB";

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }


    @Override
    public Circle cloneThisObject() {
        return new Circle(radius, color);
    }

    double getArea() {
        return Math.PI * radius * radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
