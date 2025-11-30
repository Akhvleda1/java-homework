package ge.tbc.testautomation.figures;

import java.util.Comparator;

public class RectangleComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        if (o1 instanceof Rectangle && o2 instanceof Rectangle){
            Rectangle rec1 = (Rectangle) o1;
            Rectangle rec2 = (Rectangle) o2;
            if (rec1.getArea() < rec2.getArea()) return 1; // swapped places for reverse results
            if (rec1.getArea() > rec2.getArea()) return -1; // swapped places for reverse results
            return 0;
        }
        return -1;
    }
}
