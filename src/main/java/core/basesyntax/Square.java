package core.basesyntax;

public class Square extends Figure {
    private int sidesize;

    public Square(int sidesize, String color) {
        this.sidesize = sidesize;
        super.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public double getArea() {
        return Math.pow(sidesize, sidesize);
    }
}
