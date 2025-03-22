package LLD.SOLID.LiskovSubstitution;

public class LSPMain {
    public static void main(String[] args) {
        SwimBird pgBird = new Penguin();

        pgBird.makeSound();

        pgBird.swim();
    }
}
