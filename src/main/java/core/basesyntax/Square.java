package core.basesyntax;

public class Square extends Figure {
    private String color;
    private int sidesize;
    private int area = (int) Math.pow(sidesize, sidesize);

    public Square(int sidesize, String color) {
        this.sidesize = sidesize;
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
