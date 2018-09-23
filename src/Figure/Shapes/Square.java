package Figure.Shapes;

import Figure.Shapes.EqilaterialTraingle;
import Figure.imp.CalculableDiagonal;
import Figure.imp.CalculatableArea;
import Figure.imp.CalculatablePerimetr;

public class Square extends EqilaterialTraingle implements CalculableDiagonal, CalculatableArea, CalculatablePerimetr {


    public Square(int a) {
        super(a);
    }

    public Square(String name) {
        super(name);
    }

    @Override
    public double calculeteDiagonal() {
        return a*Math.sqrt(2);
    }

    @Override
    public double calculateArea() {
        return Math.pow(a,2);
    }

    @Override
    public double calkulatePerimetr() {
        return a*4;
    }

    @Override
    public String toString() {
        return "Square{" +
                "Высота: " + h +
                ", cтороны: " + a +
                '}';
    }
}
