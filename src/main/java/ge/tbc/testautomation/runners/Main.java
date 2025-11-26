package ge.tbc.testautomation.runners;

import ge.tbc.testautomation.figures.Rectangle;
import ge.tbc.testautomation.figures.Triangle;
import ge.tbc.testautomation.util.HelperFunctions;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(9, 5.7);
        Rectangle rectangle2 = new Rectangle(5.5, 6.7);
        Triangle triangle = new Triangle(7, 4, 6);
        System.out.println("Rectangle 1 area: " + rectangle1.getArea());
        System.out.println("Rectangle 1 perimeter: " + rectangle1.getPerimeter());
        System.out.println("Triangle area: " + triangle.getArea());
        System.out.println("Triangle perimeter: " + triangle.getPerimeter());
        HelperFunctions.compareRectangles(rectangle1, rectangle2);
    }
}
