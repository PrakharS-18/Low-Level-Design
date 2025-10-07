package LLD.Creational_Design_Pattern.Prototype_Pattern.Vehicle_Example;

import java.util.ArrayList;
import java.util.List;

public class CarShallowCopyExample implements Vehicle{
    private int engineType;
    int modelNo;
    int year;
    String company;
    List<String> mechanicalDetails; // here comes the twist : SHALLOW COPY() Vs DEEP COPY()
    /* SHALLOW COPY:- means the same copy of calling object will be passed
        DEEP COPY:- new copy for "mechanicalDetails" will be created for caller object
     */

    public CarShallowCopyExample(int engineType, int modelNo, int year, String company, List<String> mechanicalDetails) {
        this.engineType = engineType;
        this.modelNo = modelNo;
        this.year = year;
        this.company = company;
        this.mechanicalDetails = mechanicalDetails; //here no new list is created. REMEMBER this should be mutable
        // if its IMMUTABLE :- then shallow and deep works the same way
    }

    @Override
    public Vehicle cloneVehicle() {
        return new CarShallowCopyExample(this.engineType,
                this.modelNo,
                this.year,
                this.company,
                this.mechanicalDetails);
    }

    public List<String> getMechanicalDetails() {
        return mechanicalDetails;
    }

    public void setMechanicalDetails(List<String> mechanicalDetails) {
        this.mechanicalDetails = mechanicalDetails;
    }
}
