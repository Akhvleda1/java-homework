package ge.tbc.testautomation.figures;

public class Triangle extends Figure{
    protected double a, b, c, h = 5.5;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getArea() {
        return (this.c * this.h) / 2;
    }

    @Override
    public double getPerimeter() {
        return this.a + this.b + this.c;
    }
}
