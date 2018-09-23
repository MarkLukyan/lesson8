package Figure.Shapes;

import Figure.imp.CalculatableArea;
import Figure.imp.CalculatablePerimetr;

public class Circle extends Figure implements CalculatableArea, CalculatablePerimetr {

    public Circle(int a) {
        super(a);
    }

    public Circle(String name) {
        super(name);
    }

    @Override
    public double calculateArea() {
        return Math.PI*a*a;
    }

    @Override
    public double calkulatePerimetr() {
        return 2*a*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{}" +
                "радиус" + a;
    }
}
