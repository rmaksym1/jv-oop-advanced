package core.basesyntax;

public abstract class Figure implements IFigure {
    protected String color;

    public String getColor() {
        return color;
    }

    public abstract double getArea();

}
