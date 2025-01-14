package LLD.Creational_Design_Pattern.Abstract_Factory_Pattern;

import LLD.Creational_Design_Pattern.Factory_Pattern.Developer;

public class CppDeveloper implements Developer {
    @Override
    public int salary() {
        System.out.println("I am Cpp Developer");
        return 850;
    }
}
