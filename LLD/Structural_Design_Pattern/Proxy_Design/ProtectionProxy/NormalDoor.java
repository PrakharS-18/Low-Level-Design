package LLD.Structural_Design_Pattern.Proxy_Design.ProtectionProxy;

public class NormalDoor implements Door {
    @Override
    public void open() {
        System.out.println("The Door is opened");
    }

    @Override
    public void close() {
        System.out.println("The Door is closed");
    }
}
