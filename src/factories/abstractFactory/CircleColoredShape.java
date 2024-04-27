package factories.abstractFactory;

import factories.Circle;
import factories.Shape;

public class CircleColoredShape  extends ColoredShape{
    public CircleColoredShape(Shape shape, Color color) {
        super(shape, color);
        if (shape.getClass() != Circle.class) {
            throw new IllegalArgumentException();
        }
    }
}
