package LLD.Behavioural_Design_Pattern.Observer_Pattern;

import java.util.ArrayList;

public class ObserverMain {
    public static void main(String[] args) {
        SubjectConcrete subject = new SubjectConcrete();

        ObserverConcrete observer1 = new ObserverConcrete();

        subject.registerObserver(observer1);

        subject.setLatestUpdate(" Hi!, The observer pattern seems to work ");
    }
}
