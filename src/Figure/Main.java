package Figure;


import Figure.Shapes.Circle;
import Figure.Shapes.EqilaterialTraingle;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(3);
        circle.setName("Circle");
        //System.out.println("Фигура: " + circle.setName());
        System.out.println("Площадь: " + circle.calculateArea());
        System.out.println("Периметр: " + circle.calkulatePerimetr());

        EqilaterialTraingle et = new EqilaterialTraingle(5);
        et.setName("EqilaterialTraingle");
        System.out.println("Площадь: " + et.calculateArea());
        System.out.println("Периметр: "+ et.calkulatePerimetr());

    }
}
