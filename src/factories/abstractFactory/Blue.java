package factories.abstractFactory;

// Concrete Product B2
class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("Filling with Blue color");
    }

    @Override
    public String toString() {
        return "Blue";
    }
}
