package core.basesyntax;

public class RightTriangle extends Figure {
    private String color;
    private int firstLeg;
    private int secondLeg;
    private int area = (int) (0.5 * (firstLeg * secondLeg));

    public RightTriangle(int firstLeg, int secondLeg, String color) {
        this.color = color;
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
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
