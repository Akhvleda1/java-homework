package ge.tbc.testautomation.abstractClassesInterfaces;

import ge.tbc.testautomation.abstractClassesInterfaces.interfaces.IResizable;
import ge.tbc.testautomation.abstractClassesInterfaces.interfaces.IValidFigure;

public class Triangle extends Figure implements IResizable, IValidFigure {
    protected double sideA, sideB, sideC, height = 5;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        if (!validateFigure()){
            throw new IllegalArgumentException("INVALID SIDES.");
        }
    }

    @Override
    public double getArea() {
        return (this.height * this.sideC) / 2;
    }

    @Override
    public double getLength() {
        return this.sideA + this.sideB + this.sideC;
    }

    @Override
    public void printPackageName() {
        System.out.println("Package name: " + this.getClass().getPackageName());
    }

    @Override
    public void doubleSize() {
        double scale = Math.sqrt(2);
        this.sideA *= scale;
        this.sideB *= scale;
        this.sideC *= scale;
        this.height *= scale;
    }

    @Override
    public void customSize(double byValue) {
        double scale = Math.sqrt(byValue);
        this.sideA *= scale;
        this.sideB *= scale;
        this.sideC *= scale;
        this.height *= scale;
    }

    @Override
    public boolean validateFigure() {
        // A triangle is valid if the sum of any two sides are greater than the third side.
        return sideA >= 0 && sideB >= 0 && sideC >= 0 &&
               sideA + sideB > sideC && sideA + sideC > sideB && sideB + sideC > sideA;
    }
}
