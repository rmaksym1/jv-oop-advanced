package core.basesyntax;

public class Circle extends Figure {
    private String color;
    private int radius;
    private int area = (int) (Math.PI * Math.pow(radius, radius));

    public Circle(int radius, String color) {
        this.color = color;
        this.radius = radius;
    }

    public int getArea() {
        return area;
    }

    @Override
    public String getInfo() {
        return "Figure: " + getClass().getSimpleName() + " area: " + area + " sq. units, "
                + "color: " + color;
    }
}
