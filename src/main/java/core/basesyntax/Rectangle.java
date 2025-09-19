package core.basesyntax;

public class Rectangle extends Figure {
    private String color;
    private int length;
    private int width;
    private int area = length * width;

    public Rectangle(int length, int width, String color) {
        this.length = length;
        this.width = width;
        this.color = color;
    }

    public int getArea() {
        return area;
    }

    @Override
    public String getInfo() {
        return "Figure: " + getClass().getSimpleName()
                + " area: " + area + " sq. units, "
                + "color: " + color;
    }
}
