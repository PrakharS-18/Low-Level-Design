package LLD.Creational_Design_Pattern.Prototype_Pattern.Vehicle_Example;

import java.beans.VetoableChangeListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ProtoMain {
    public static void main(String[] args) {
        CarShallowCopyExample v = new CarShallowCopyExample(1,1,2001,"BMW", new ArrayList<>(List.of("Shocker", "Prevent")));

        CarShallowCopyExample c = (CarShallowCopyExample) v.cloneVehicle();

        System.out.println(c.getMechanicalDetails());

        v.getMechanicalDetails().add("UPDATED");

//        c.setMechanicalDetails(List.of("ShockerUpdated", "PreventUpdated")); // creating a new list

        System.out.println(c.getMechanicalDetails());
        System.out.println(v.getMechanicalDetails());

        System.out.println("--------------------------------------------------------------------------------------------------------------------------------");

        CarDeepCopyExample v2 = new CarDeepCopyExample(2,2,2002,"AUDI", new ArrayList<>(List.of("Shocker", "Prevent")));

        CarDeepCopyExample c2 = (CarDeepCopyExample) v2.cloneVehicle();

        System.out.println(c2.getMechanicalDetails());

        v2.getMechanicalDetails().add("UPDATED");

        System.out.println(c2.getMechanicalDetails());
        System.out.println(v2.getMechanicalDetails());

    }

}
