package ge.tbc.testautomation.javaoop.runners;

import ge.tbc.testautomation.javaoop.figures.Circle;
import ge.tbc.testautomation.javaoop.util.Util;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Circle circle1 = new Circle(random.nextInt(12,100)); // used nextInt instead of nextDouble for rounding.
        System.out.println("Number of Circle instances created: " + Circle.numberOfCircleInstances);
        Circle circle2 = new Circle(random.nextInt(12, 100));
        System.out.println("Number of Circle instances created: " + Circle.numberOfCircleInstances);
        Circle circle3 = new Circle(random.nextInt(12, 100));
        System.out.println("Number of Circle instances created: " + Circle.numberOfCircleInstances);
        Circle circle4 = new Circle(random.nextInt(12, 100));
        System.out.println("Number of Circle instances created: " + Circle.numberOfCircleInstances);
        Circle circle5 = new Circle(random.nextInt(12, 100));
        System.out.println("Number of Circle instances created: " + Circle.numberOfCircleInstances);

        String circle1Radius = Util.circleToString(circle1);
        String circle2Radius = Util.circleToString(circle2);
        String circle3Radius = Util.circleToString(circle3);
        String circle4Radius = Util.circleToString(circle4);
        String circle5Radius = Util.circleToString(circle5);

        System.out.println("first radius: " + circle1Radius + ", " +
                            "second radius: " + circle2Radius + ", " +
                            "third radius: " + circle3Radius + ", " +
                            "fourth radius: " + circle4Radius + ", " +
                            "fifth radius: " + circle5Radius);

    }
}
