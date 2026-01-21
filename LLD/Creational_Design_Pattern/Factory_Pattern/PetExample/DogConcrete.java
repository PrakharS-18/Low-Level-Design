package LLD.Creational_Design_Pattern.Factory_Pattern.PetExample;

public class DogConcrete implements Pet {
    @Override
    public void price() {
        System.out.println("Dog price is: $100");
    }
}
