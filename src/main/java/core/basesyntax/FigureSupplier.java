package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private Random rand = new Random();
    private ColorSupplier supplier = new ColorSupplier();

    public Object getRandomFigure() {
        String color = supplier.getColor().toString();
        int figuretype = rand.nextInt(4);

        switch (figuretype) {
            case 0:
                return new Square(rand.nextInt(10), color);
            case 1:
                return new Circle(rand.nextInt(10), color);
            case 2:
                return new Rectangle(rand.nextInt(10), rand.nextInt(10), color);
            case 3:
                return new RightTriangle(rand.nextInt(10), rand.nextInt(10), color);
            case 4:
                return new IsoscelesTrapezoid(rand.nextInt(10),
                        rand.nextInt(10), rand.nextInt(10), color);
            default:
                return new Circle(10, "White");
        }
    }

    public Object getDefaultFigure() {
        return new Circle(10, "White");
    }
}
