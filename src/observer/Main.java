package observer;

public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        WeatherDisplay display = new WeatherDisplay();
        MobileApp mobileApp = new MobileApp();
        EmailAlert emailAlert = new EmailAlert();

        weatherStation.registerObserver(display);
        weatherStation.registerObserver(mobileApp);
        weatherStation.registerObserver(emailAlert);

        weatherStation.setTemperature(25);
    }
}