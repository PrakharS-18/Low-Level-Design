package LLD.Creational_Design_Pattern.Factory_Pattern.PetExample;

public class PetMain {

    public static void main(String[] args) {

        /* When you don't have the factory , client that is your main class need to be aware of your direct classes which not might be his main or ultimate requirement */
//        Pet firstPet =  new CatConcrete();
//        Pet secondPet = new DogConcrete();
//        Pet thirdPet = new RabbitConcrete();  // you need to instantiate the object at the time and need to know about the every detail's, lets say it had some input parameters which are just for server use

        /* Now you will see the use of factory :- Abstraction from client

         */

//        Pet firstPet = PetFactory.createPet("Cat");
//        Pet secondPet = PetFactory.createPet("Dog");
//
//        firstPet.price();
//        secondPet.price();

        PetFactory firstPet = new CatFactory();
        firstPet.createPet();
        firstPet.petPrice();
    }
}
