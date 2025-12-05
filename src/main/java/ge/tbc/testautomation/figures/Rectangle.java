package ge.tbc.testautomation.figures;

public class Rectangle extends Figure{
    protected double a, b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getArea() {
        return this.a * this.b;
    }

    @Override
    public double getPerimeter() {
        return (this.a + this.b) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
