package factories.abstractFactory;

import factories.Shape;

interface AbstractFactory {
    Shape createShape();

    Color createColor();

    ColoredShape createColoredShape();
}
