package LLD.Creational_Design_Pattern.Factory_Pattern.PetExample;

public abstract class PetFactory {


    /* this is not exactly FACTORY PATTERN */
    /*
    *
    * */
//    static Pet createPet(String petType) {
//        if (petType.equals("Cat")) {
//            return new CatConcrete();
//        } else if (petType.equals("Dog")) {
//            return new DogConcrete();
//        } else {
//            return new RabbitConcrete();
//        }
//    }

    public abstract Pet createPet();

    public void petPrice() {
        Pet pet = createPet();
        pet.price();
    }

}
