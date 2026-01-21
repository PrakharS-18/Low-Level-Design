package LLD.Creational_Design_Pattern.Factory_Pattern.PetExample;

public class RabbitFactory extends PetFactory{

    @Override
    public Pet createPet() {
        return new RabbitConcrete();
    }
}
