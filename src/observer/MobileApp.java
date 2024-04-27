package observer;

public class MobileApp implements Observer {
    @Override
    public void notify(int temperature) {
        System.out.println("Mobile App: Current temperature is " + temperature);
    }
}
