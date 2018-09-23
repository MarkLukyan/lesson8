package Figure.Shapes;

import Figure.imp.CalculatableArea;
import Figure.imp.CalculatablePerimetr;

public class EqilaterialTraingle extends Figure implements CalculatableArea, CalculatablePerimetr {

    public double h = a*Math.sqrt(3)/2;

    public EqilaterialTraingle(int a) {
        super(a);
    }

    public EqilaterialTraingle(String name) {
        super(name);
    }

    @Override
    public double calculateArea() {
        return a*h/2;
    }

    @Override
    public double calkulatePerimetr() {
        return a*3;
    }

    @Override
    public String toString() {
        return "EqilaterialTraingle{" +
                "Высота: " + h +
                ", стороны: " + a +
                '}';
    }
}

