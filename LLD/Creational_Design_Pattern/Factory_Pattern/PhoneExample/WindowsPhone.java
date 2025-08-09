package LLD.Creational_Design_Pattern.Factory_Pattern.PhoneExample;

public class WindowsPhone extends PhoneFactory implements Phone{
    @Override
    public void price() {
        System.out.println("Price is 46K");
    }
}
