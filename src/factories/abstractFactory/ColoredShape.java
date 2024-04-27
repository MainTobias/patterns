package factories.abstractFactory;

import factories.Shape;

public abstract class ColoredShape {
    private final Shape shape;
    private final Color color;


    public ColoredShape(Shape shape, Color color) {
        shape.draw();
        this.shape = shape;
        color.fill();
        this.color = color;
    }

    @Override
    public String toString() {
        return "ColoredShape{" +
                "shape=" + shape +
                ", color=" + color +
                '}';
    }
}
