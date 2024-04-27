package factories.abstractFactory;

import factories.Rectangle;
import factories.Shape;


class ConcreteFactory2 implements AbstractFactory {
    @Override
    public Shape createShape() {
        return new Rectangle();
    }

    @Override
    public Color createColor() {
        return new Blue();
    }

    @Override
    public ColoredShape createColoredShape() {
        return new RectangleColoredShape(createShape(), createColor());
    }
}
