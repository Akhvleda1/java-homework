package ge.tbc.testautomation.javaoop.figures;

public class Circle implements Comparable{
    private double radius;
    public static int numberOfCircleInstances;

    public double getRadius() {return radius;}
    public void setRadius(double radius) {this.radius = radius;}

    public Circle(double radius){
        this.radius = radius;
        numberOfCircleInstances++;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Circle){
            Circle other = (Circle) o;
            if (this.getRadius() > other.getRadius()) return 1;
            if (this.getRadius() < other.getRadius()) return -1;
            return 0;
        }
        return -1;
    }
}
