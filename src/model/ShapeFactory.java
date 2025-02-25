
package model;

public class ShapeFactory {
    private static ShapeFactory factory;

    private ShapeFactory() {
    }

    public static ShapeFactory getInstance() {
        if (factory == null) {
            factory = new ShapeFactory();
        }
        return factory;
    }

    public static Shape getShape(String shapeType) {
        return switch (shapeType) {
            case "Circle" -> new Circle();
            case "Rectangle" -> new Rectangle();
            case "Square" -> new Square();
            default -> null;
        };
    }
}
