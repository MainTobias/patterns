package factories.method;

import factories.Rectangle;
import factories.Shape;

class RectangleFactory implements ShapeFactory {
    @Override
    public Shape createShape() {
        return new Rectangle();
    }
}
