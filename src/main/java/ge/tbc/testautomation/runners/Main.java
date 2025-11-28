package ge.tbc.testautomation.runners;

import ge.tbc.testautomation.abstractClassesInterfaces.Circle;
import ge.tbc.testautomation.abstractClassesInterfaces.Triangle;

public class Main {
    public static void main(String[] args) {
//        Rectangle rectangle1 = new Rectangle(9, 5.7);
//        Rectangle rectangle2 = new Rectangle(5.5, 6.7);
//        Triangle triangle = new Triangle(7, 4, 6);
//        System.out.println("Rectangle 1 area: " + rectangle1.getArea());
//        System.out.println("Rectangle 1 perimeter: " + rectangle1.getPerimeter());
//        System.out.println("Triangle area: " + triangle.getArea());
//        System.out.println("Triangle perimeter: " + triangle.getPerimeter());
//        HelperFunctions.compareRectangles(rectangle1, rectangle2);

        // Circle class
        try {
            Circle circle = new Circle(-2); // trying to invoke exception
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        Circle circle = new Circle(5);
        System.out.println("Circle area: " + circle.getArea());
        System.out.println("Circle length: " + circle.getLength());
        circle.printPackageName(); // printing out package name
        circle.doubleSize(); // doubling area in size
        System.out.println("Circle area after doubling its size: " + circle.getArea());
        circle.customSize(3);
        System.out.println("Circle area after tripling its doubled size: " + circle.getArea());

        // Triangle class
        System.out.println("=================== Triangle ==================");
        try {
            // invalid sides because 1 + 3 isn't greater than 5
            Triangle triangle = new Triangle(5, 1, 3);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        Triangle triangle = new Triangle(5, 4, 3);
        System.out.println("Triangle area: " + triangle.getArea());
        System.out.println("Triangle length: " + triangle.getLength());
        triangle.printPackageName();
        triangle.doubleSize();
        System.out.println("Triangle area after doubling its size: " + triangle.getArea());
        triangle.customSize(3);
        System.out.println("Triangle area after tripling its doubled size: " + triangle.getArea());

        // JUST A LINE FOR HOTFIX
    }
}
