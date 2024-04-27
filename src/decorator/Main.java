package decorator;

public class Main {
    public static void main(String[] args) {
        Coffee simpleCoffee = new SimpleCoffee();
        System.out.println("Cost: " + simpleCoffee.getCost() + ", Description: " + simpleCoffee.getDescription());

        Coffee milkCoffee = new Milk(new SimpleCoffee());
        System.out.println("Cost: " + milkCoffee.getCost() + ", Description: " + milkCoffee.getDescription());

        Coffee sugarCoffee = new Sugar(new SimpleCoffee());
        System.out.println("Cost: " + sugarCoffee.getCost() + ", Description: " + sugarCoffee.getDescription());

        Coffee milkAndSugarCoffee = new Sugar(new Milk(new SimpleCoffee()));
        System.out.println("Cost: " + milkAndSugarCoffee.getCost() + ", Description: " + milkAndSugarCoffee.getDescription());
    }
}