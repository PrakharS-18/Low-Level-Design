package LLD.Creational_Design_Pattern.Prototype_Pattern.Shape_Example;

import java.util.ArrayList;
import java.util.List;

public class ProtoMain {
    public static void main(String[] args) {
        Circle c1 = new Circle(12.00, "Blue");

        System.out.println(c1.getArea());

        // rather than creating a brand new circle of color -> Red
        // i can clone the above object

        Circle c2 = c1.cloneThisObject();
        c2.setColor("Green");
        System.out.println(c2.getColor());
        System.out.println(c2.getArea());

        Triangle t1 = new Triangle(3, 4, 5, new ArrayList<>(List.of("Pnoiu", "Acute", "Obtuse")));
        System.out.println(t1.getArea());
        System.out.println(t1.myType());
        t1.a.area();

        Triangle t2 = t1.cloneThisObject();
        t2.typeOfTriangle.add("Random");
        System.out.println(t2.getArea());
        System.out.println(t2.myType());
        t2.a.area();
 }
}
