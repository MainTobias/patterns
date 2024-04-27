package singleton;

public class LazyInitializationSingleton {
    private static LazyInitializationSingleton instance;

    private LazyInitializationSingleton() {}

    // synchronized ermöglicht bei einem LazyInitializationSingleton Thread-Safety
    public static synchronized LazyInitializationSingleton getInstance() {
        if (instance == null) instance = new LazyInitializationSingleton();
        return instance;
    }
}
