package LLD.Behavioural_Design_Pattern.Observer_Pattern;

import java.util.ArrayList;
import java.util.List;

public class SubjectConcrete implements Subject{
    private List<Observer> observerList = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyAllObserver(String message) {
        for (Observer ob: observerList) {
            ob.update(message);
        }
    }

    public void setLatestUpdate(String update) {
        System.out.println("Subject has some updates");
        notifyAllObserver(update);
    }
}
