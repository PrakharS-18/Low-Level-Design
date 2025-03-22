package LLD.SOLID.LiskovSubstitution;

/*
 * Subtypes should be able to replace their base types without affecting functionality.
 * A derived class should extend the base class without breaking existing behavior.
 */
public interface LiskoveInvalidBird {

    public void fly();

    public void makeSound();
}