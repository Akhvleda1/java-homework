package ge.tbc.testautomation.abstractClassesInterfaces;

import ge.tbc.testautomation.abstractClassesInterfaces.interfaces.IResizable;
import ge.tbc.testautomation.abstractClassesInterfaces.interfaces.IValidFigure;

public class Circle extends Figure implements IResizable, IValidFigure {
    protected double radius;

    public Circle(double radius) {
        this.radius = radius;
        if (!validateFigure()){
            throw new IllegalArgumentException("RADIUS MUST BE POSITIVE.");
        }
    }

    @Override
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public double getLength() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    public void printPackageName() {
        System.out.println("Package name: " + this.getClass().getPackageName());
    }

    @Override
    public void doubleSize() {
        // Doubled the area of the circle
        this.radius *= Math.sqrt(2);
    }

    @Override
    public void customSize(double byValue) {
        // Increased area of the circle by byValue
        this.radius *= Math.sqrt(byValue);
    }

    @Override
    public boolean validateFigure() {
        return this.radius > 0;
    }
}
