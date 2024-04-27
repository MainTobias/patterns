package factories.abstractFactory;

import factories.Circle;
import factories.Rectangle;
import factories.Shape;

public class RectangleColoredShape extends ColoredShape {
    public RectangleColoredShape(Shape shape, Color color) {
        super(shape, color);
        if (shape.getClass() != Rectangle.class) {
            throw new IllegalArgumentException();
        }
    }
}
