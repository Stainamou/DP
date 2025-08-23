package factory_method;
import java.util.Random;

public class WildernessMap extends Map {
    private static final Random rand = new Random();

    public WildernessMap(int rows, int cols) {
        super(rows, cols);
    }

    public Tile createTile() {
        int type = rand.nextInt(3);
        return switch (type) {
            case 0 -> new SwampTile();
            case 1 -> new WaterTile();
            case 2 -> new ForestTile();
            default -> throw new IllegalStateException("Unexpected value: " + type);
        };
    }
}
