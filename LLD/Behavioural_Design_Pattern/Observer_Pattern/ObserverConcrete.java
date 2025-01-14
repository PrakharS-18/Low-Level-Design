package LLD.Behavioural_Design_Pattern.Observer_Pattern;

public class ObserverConcrete implements Observer {
    @Override
    public void update(String message) {
        System.out.println("Received update from subject is:"+ message);
    }
}
