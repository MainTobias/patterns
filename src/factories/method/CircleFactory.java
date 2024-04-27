package factories.method;

import factories.Circle;
import factories.Shape;

class CircleFactory implements ShapeFactory {
    @Override
    public Shape createShape() {
        return new Circle();
    }
}
