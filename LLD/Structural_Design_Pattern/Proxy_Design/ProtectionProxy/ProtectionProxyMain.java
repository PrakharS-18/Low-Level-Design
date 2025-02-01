package LLD.Structural_Design_Pattern.Proxy_Design.ProtectionProxy;

public class ProtectionProxyMain {
    public static void main(String[] args) {
        Door door = new AuthDoor(new NormalDoor(), "prakhar1");

        door.open();

        System.out.println("--------------------------------------------------------------------------");

        door.close();
    }
}
