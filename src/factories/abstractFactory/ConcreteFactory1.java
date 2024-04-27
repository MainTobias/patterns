package factories.abstractFactory;

import factories.Circle;
import factories.Shape;


class ConcreteFactory1 implements AbstractFactory {
    @Override
    public Shape createShape() {
        return new Circle();
    }

    @Override
    public Color createColor() {
        return new Red();
    }

    @Override
    public ColoredShape createColoredShape() {
        return new CircleColoredShape(createShape(), createColor());
    }
}
