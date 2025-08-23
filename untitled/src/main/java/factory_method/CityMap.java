package factory_method;
import java.util.Random;

public class CityMap extends Map {
    private static final Random rand = new Random();

    public CityMap(int rows, int cols) {
        super(rows, cols);
    }

    @Override
    public Tile createTile() {
        int type = rand.nextInt(3);
        return switch (type) {
            case 0 -> new BuildingTile();
            case 1 -> new RoadTile();
            case 2 -> new ForestTile();
            default -> throw new IllegalStateException("Unexpected value: " + type);
        };
    }
}
