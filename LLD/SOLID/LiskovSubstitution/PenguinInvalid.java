package LLD.SOLID.LiskovSubstitution;

/* The subchild penguin is not fully representing the bird
 * Violation of Liskov - A Bird reference cannot hold Penguin object and do the stuff which it supposed to do
 */
public class PenguinInvalid implements LiskoveInvalidBird{

    @Override
    public void fly() {
        throw new UnsupportedOperationException("Unimplemented method 'fly'");
    }

    @Override
    public void makeSound() {
        System.out.println("<---- Penguin Noise ---->");
    }
    
}
