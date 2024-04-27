package observer;

public class WeatherDisplay implements Observer {
    @Override
    public void notify(int temperature) {
        System.out.println("Weather Display: Temperature is " + temperature);
    }
}

