package Figure.Shapes;

public abstract class Figure {

    public int a;
    public Figure(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    private String name;

    public Figure(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
