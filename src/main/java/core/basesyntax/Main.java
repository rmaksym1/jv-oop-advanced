package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class Main {
    private Figure[] figures = new Figure[5];
    private FigureSupplier supplier = new FigureSupplier();

    public void main(String[] args) {
        for (int i = 0; i < figures.length / 2; i++) {
            figures[i] = (Figure) supplier.getRandomFigure();
        }

        for (int i = figures.length / 2; i < figures.length; i++) {
            figures[i] = (Figure) supplier.getDefaultFigure();
        }

        for (int i = 0; i < figures.length; i++) {
            figures[i].getInfo();
        }
    }

}
