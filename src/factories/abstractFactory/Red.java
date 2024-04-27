package factories.abstractFactory;

// Concrete Product B1
class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Filling with Red color");
    }

    @Override
    public String toString() {
        return "Red";
    }
}