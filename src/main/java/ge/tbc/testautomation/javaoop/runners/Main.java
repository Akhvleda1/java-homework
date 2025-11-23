package ge.tbc.testautomation.javaoop.runners;

import ge.tbc.testautomation.javaoop.figures.Circle;
import ge.tbc.testautomation.javaoop.util.Util;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Circle[] circles = new Circle[5];

        for (int i = 0; i < circles.length; i++){
            circles[i] = new Circle(random.nextInt(100));
            System.out.println("Number of Circle instances created: " + Circle.numberOfCircleInstances);
            System.out.println(Util.circleToString(circles[i]));
        }

    }
}
