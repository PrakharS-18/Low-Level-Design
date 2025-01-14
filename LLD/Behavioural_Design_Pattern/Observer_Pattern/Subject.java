package LLD.Behavioural_Design_Pattern.Observer_Pattern;

public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyAllObserver(String message);
}
