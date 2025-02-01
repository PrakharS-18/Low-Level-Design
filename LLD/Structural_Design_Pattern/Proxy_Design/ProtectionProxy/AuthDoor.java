package LLD.Structural_Design_Pattern.Proxy_Design.ProtectionProxy;

public class AuthDoor implements Door{

    private Door door;

    String password;

    public AuthDoor(Door door,String password) {
        this.door = door;
        this.password = password;
    }

    @Override
    public void open() {
        if(password.equals("prakhar")) {
            door.open();
        }
        else{
            System.out.println("wrong password, Retry please!!");
        }
    }

    @Override
    public void close() {
        door.close();
    }
}
