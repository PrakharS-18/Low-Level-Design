package LLD.Creational_Design_Pattern.Factory_Pattern.PetExample;

public class RabbitConcrete implements Pet {

    @Override
    public void price() {
        System.out.println("Rabbit is my breed and i will ask you 345$");
    }
}
