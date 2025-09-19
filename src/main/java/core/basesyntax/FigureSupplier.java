package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int MAX_FIGURES = 5;
    public static final int MAX_PROPERTIES = 10;

    private Random rand = new Random();
    private ColorSupplier supplier = new ColorSupplier();

    public Figure getRandomFigure() {
        String color = supplier.getRandomColor().toString();
        int figuretype = rand.nextInt(MAX_FIGURES);

        switch (figuretype) {
            case 0:
                return new Square(rand.nextInt(MAX_PROPERTIES), color);
            case 1:
                return new Circle(rand.nextInt(MAX_PROPERTIES), color);
            case 2:
                return new Rectangle(rand.nextInt(MAX_PROPERTIES),
                        rand.nextInt(MAX_PROPERTIES), color);
            case 3:
                return new RightTriangle(rand.nextInt(MAX_PROPERTIES),
                        rand.nextInt(MAX_PROPERTIES), color);
            case 4:
                return new IsoscelesTrapezoid(rand.nextInt(MAX_PROPERTIES),
                        rand.nextInt(MAX_PROPERTIES), rand.nextInt(MAX_PROPERTIES), color);
            default:
                return new Circle(MAX_PROPERTIES, "White");
        }
    }

    public Object getDefaultFigure() {
        return new Circle(10, "White");
    }
}
