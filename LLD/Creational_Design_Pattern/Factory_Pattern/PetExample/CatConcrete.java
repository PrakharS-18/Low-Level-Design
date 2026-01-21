package LLD.Creational_Design_Pattern.Factory_Pattern.PetExample;

public class CatConcrete implements Pet {

    @Override
    public void price() {
        System.out.println("I am a Cat and my price is 125$");
    }
}
