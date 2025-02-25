
package view;

import model.ShapeFactory;
import model.Shape;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory factory = ShapeFactory.getInstance();

        Shape s1 = factory.getShape("Square");
        Shape s2 = factory.getShape("Circle");
        Shape s3 = factory.getShape("Rectangle");

        System.out.println("Drawing of shape s1:");
        s1.draw();
        System.out.println("Drawing of shape s2:");
        s2.draw();
        System.out.println("Drawing of shape s3:");
        s3.draw();
    }
}
