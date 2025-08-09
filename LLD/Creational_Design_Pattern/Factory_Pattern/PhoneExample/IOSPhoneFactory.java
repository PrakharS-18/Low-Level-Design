package LLD.Creational_Design_Pattern.Factory_Pattern.PhoneExample;

public class IOSPhoneFactory extends PhoneFactory{
    @Override
    public Phone createPhone(String phoneType) {
        super.createPhone(phoneType);
        return new IOSPhone();
    }
}
