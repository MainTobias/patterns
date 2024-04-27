package singleton;

public class EagerInitializationSingleton {
    // final ist Thread-Safe
    private static final EagerInitializationSingleton instance = new EagerInitializationSingleton();

    // private damit niemand eine weitere Instanz erstellen kann
    private EagerInitializationSingleton() {}

    public static EagerInitializationSingleton getInstance() {
        return instance;
    }
}
