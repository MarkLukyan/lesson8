package Figure.Shapes;

import Figure.imp.CalculableDiagonal;
import Figure.imp.CalculatableArea;
import Figure.imp.CalculatablePerimetr;

public class Rectangle extends Square implements CalculableDiagonal, CalculatableArea, CalculatablePerimetr {

    public int b;

    public Rectangle(int a) {
        super(a);
    }

    public Rectangle(String name) {
        super(name);
    }

    @Override
    public double calculeteDiagonal() {
        return super.calculeteDiagonal();
    }

    @Override
    public double calculateArea() {
        return super.calculateArea();
    }

    @Override
    public double calkulatePerimetr() {
        return super.calkulatePerimetr();
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "Ширина: " + b +
                ", высота: " + a +
                '}';
    }
}
