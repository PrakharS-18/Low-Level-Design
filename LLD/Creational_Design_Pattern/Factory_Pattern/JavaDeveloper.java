package LLD.Creational_Design_Pattern.Factory_Pattern;

public class JavaDeveloper implements Developer {

    @Override
    public int salary() {
        System.out.println("I am Java Developer");
        return 1000;
    }
}
