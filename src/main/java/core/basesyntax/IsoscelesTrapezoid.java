package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int base;
    private int base2;
    private int height;

    public IsoscelesTrapezoid(int base, int base2, int height, String color) {
        this.color = color;
        this.base = base;
        this.base2 = base2;
        this.height = height;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public double getArea() {
        return (base + base2) / 2.0 * height;
    }
}
