package LLD.Creational_Design_Pattern.Factory_Pattern.PetExample;

public class DogFactory extends PetFactory {

    @Override
    public Pet createPet() {
        return new DogConcrete();
    }
}
