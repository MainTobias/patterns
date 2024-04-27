package factories.abstractFactory;

// Client class
public class AbstractFactoryClient {
    public static void main(String[] args) {
        AbstractFactory factory1 = new ConcreteFactory1();
        System.out.println(factory1.createColoredShape());


        AbstractFactory factory2 = new ConcreteFactory2();
        System.out.println(factory2.createColoredShape());
    }
}