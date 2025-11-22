package ge.tbc.testautomation.util;

import ge.tbc.testautomation.figures.Rectangle;

public class HelperFunctions {
    public static void compareRectangles(Rectangle rec1, Rectangle rec2){
        if (rec1.getPerimeter() == rec2.getPerimeter()){
            System.out.println("parameter 1 = parameter 2");
        } else if (rec1.getPerimeter() > rec2.getPerimeter()) {
            System.out.println("parameter 1 > parameter 2");
        } else {
            System.out.println("parameter 1 < parameter 2");
        }
    }
}
