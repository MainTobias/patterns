package factories.simple;


import factories.Shape;

public class SimpleFactory {
    public static void main(String[] args) {
        Shape circle = SimpleShapeFactory.createShape("Circle");
        Shape rectangle = SimpleShapeFactory.createShape("Rectangle");

        circle.draw();
        rectangle.draw();
    }
}
