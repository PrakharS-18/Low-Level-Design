package LLD.SOLID.LiskovSubstitution;

public class Penguin implements SwimBird{

    @Override
    public void makeSound() {
        System.out.println("Penguin Noises");
    }

    @Override
    public void swim() {
        System.out.println("Penguin can Swim");
    }
    
}
