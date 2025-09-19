package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random rand = new Random();

    public Color getColor() {
        Color randomcolor = Color.values()[rand.nextInt(Color.values().length)];
        return randomcolor;
    }
}
