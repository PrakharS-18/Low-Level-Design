package LLD.Creational_Design_Pattern.Factory_Pattern.PhoneExample;

/* still here OPEN-CLOSED is violated */
public class PhoneFactory {
//    public static Phone createPhone(String phoneType) {
//        switch (phoneType) {
//            case "ANDROID":
//                return new AndroidPhone();
//            case "IOS":
//                return new IOSPhone();w
//            case "WINDOWS":
//                return new WindowsPhone();
//        }
//        return new AndroidPhone();
//    }

    Phone createPhone(String phoneType) {
        System.out.println("Phone is created of type:- " + phoneType);
        return null;
    }
}
