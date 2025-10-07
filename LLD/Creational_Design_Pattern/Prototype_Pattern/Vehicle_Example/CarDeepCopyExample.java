package LLD.Creational_Design_Pattern.Prototype_Pattern.Vehicle_Example;

import java.util.ArrayList;
import java.util.List;

public class CarDeepCopyExample implements Vehicle{

    private int engineType;
    int modelNo;
    int year;
    String company;
    List<String> mechanicalDetails; // here comes the twist : SHALLOW COPY() Vs DEEP COPY()
    /* SHALLOW COPY:- means the same copy of calling object will be passed
        DEEP COPY:- new copy for "mechanicalDetails" will be created for caller object
     */

    public CarDeepCopyExample(int engineType, int modelNo, int year, String company, List<String> mechanicalDetails) {
        this.engineType = engineType;
        this.modelNo = modelNo;
        this.year = year;
        this.company = company;
        this.mechanicalDetails = new ArrayList<>(mechanicalDetails);
    }

    @Override
    public Vehicle cloneVehicle() {
        return new CarDeepCopyExample(engineType, modelNo, year, company, mechanicalDetails);
    }

    public List<String> getMechanicalDetails() {
        return mechanicalDetails;
    }

    public void setMechanicalDetails(List<String> mechanicalDetails) {
        this.mechanicalDetails = mechanicalDetails;
    }
}
