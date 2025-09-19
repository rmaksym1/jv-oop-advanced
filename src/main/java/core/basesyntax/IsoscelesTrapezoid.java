package core.basesyntax;

import java.util.Random;

public class IsoscelesTrapezoid extends Figure {
    private Random rand = new Random();

    private String color;
    private int base;
    private int base2;
    private int height;
    private final int area = ((base + base2) / 2) * height;

    public IsoscelesTrapezoid(int base, int base2, int height, String color) {
        this.color = color;
        this.base = base;
        this.base2 = base2;
        this.height = height;
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
