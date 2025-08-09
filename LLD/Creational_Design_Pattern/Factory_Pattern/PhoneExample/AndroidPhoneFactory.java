package LLD.Creational_Design_Pattern.Factory_Pattern.PhoneExample;

public class AndroidPhoneFactory extends PhoneFactory{
    @Override
    public Phone createPhone(String phoneType) {
        super.createPhone(phoneType);
        System.out.println("System configuration of android done , which is of no client use");
        return new AndroidPhone();
    }
}
