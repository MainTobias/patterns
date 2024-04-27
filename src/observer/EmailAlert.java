package observer;

public class EmailAlert implements Observer {
    @Override
    public void notify(int temperature) {
        if (temperature > 30) {
            System.out.println("Email Alert: Temperature is above 30 degrees!");
        }
    }
}
