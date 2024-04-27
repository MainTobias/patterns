package factories.simple;

import factories.Circle;
import factories.Rectangle;
import factories.Shape;

class SimpleShapeFactory {
    public static Shape createShape(String type) {
        return switch (type) {
            case "Circle" -> new Circle();
            case "Rectangle" -> new Rectangle();
            default -> throw new IllegalArgumentException("Invalid shape type");
        };
    }
}
