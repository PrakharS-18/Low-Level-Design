package LLD.Creational_Design_Pattern.Factory_Pattern;

public class PythonDeveloper implements Developer{
    @Override
    public int salary() {
        System.out.println("I am a Python Developer");
        return 750;
    }
}
