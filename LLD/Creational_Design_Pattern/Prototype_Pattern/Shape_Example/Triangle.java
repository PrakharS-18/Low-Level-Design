package LLD.Creational_Design_Pattern.Prototype_Pattern.Shape_Example;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Triangle implements Shape{
    List<String> typeOfTriangle; // mutable things need Deep Copy
    Area a;
    int l;
    int b;
    int h;

    public Triangle(int h, int b, int l, List<String> typeOfTriangle) {
        this.h = h;
        this.b = b;
        this.l = l;
        this.typeOfTriangle = typeOfTriangle;
        a = new Area(String.valueOf(h*b*l));
    }

    @Override
    public Triangle cloneThisObject() {
        return new Triangle(h, b, l, new ArrayList<>());
    }

    public String myType() {
        try {
            return typeOfTriangle.getFirst();
        } catch (NoSuchElementException ex) {
            return "SUIIIII";
        }
    }

    public int getArea() {
        return (l * b) / 2;
    }
}
