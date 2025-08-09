package LLD.Creational_Design_Pattern.Factory_Pattern.PhoneExample;

public class PhoneExampleMain {
    public static void main(String[] args) {
        PhoneFactory iphone = new IOSPhoneFactory();
        Phone iphoneBought = iphone.createPhone("IOS");
        iphoneBought.price();

        System.out.println("---------------------------------------------------------------------------------------");

        PhoneFactory android = new AndroidPhoneFactory();
        Phone androidBought = android.createPhone("ANDROID");
        androidBought.price();

    }

    /* here they are two problems
    * First : Multiple responsibility (SIP violated)
    * Second : Order phone is open for modification by adding extra if for "WINDOWS" phone (OPEN-CLOSED) violated)
    * */
//    public static void orderPhone(String phoneType) {
//        if (phoneType.equals("ANDROID")) {
//            System.out.println("you got an " + phoneType + " phone");
//        } else if (phoneType.equals("IOS")) {
//            System.out.println("you got an " + phoneType + " phone");
//        }
//    }
}
