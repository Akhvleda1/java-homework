package ge.tbc.testautomation.runners;

import ge.tbc.testautomation.figures.Circle;
import ge.tbc.testautomation.figures.Rectangle;
import ge.tbc.testautomation.generics.AnyPair;
import ge.tbc.testautomation.generics.FigurePair;

import java.lang.reflect.Field;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int num = 5;
        String str = "Hello";
        AnyPair<Field[], Field[]> result = getDeclaredFields(num, str);
        System.out.println(Arrays.asList(result.getElementOne()));
        System.out.println(Arrays.asList(result.getElementTwo()));

        Circle circle = new Circle(num);
        Rectangle rectangle = new Rectangle(num, num + 3);
        FigurePair<Circle, Rectangle> figurePair = new FigurePair<>(circle, rectangle);
        System.out.println(figurePair);
    }

    private static <K, D> AnyPair<Field[], Field[]> getDeclaredFields(K objOne, D objTwo){
        Field[] fieldsOne = objOne.getClass().getDeclaredFields();
        Field[] fieldsTwo = objTwo.getClass().getDeclaredFields();
        return new AnyPair<>(fieldsOne, fieldsTwo);
    }
}
