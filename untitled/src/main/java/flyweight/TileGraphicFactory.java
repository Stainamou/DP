package flyweight;

import javafx.scene.image.Image;
import java.util.HashMap;
import java.util.Map;

public class TileGraphicFactory {
    private static final Map<String, Image> tileGraphics = new HashMap<>();

    public static Image getTileGraphic(String type) {
        if (!tileGraphics.containsKey(type)) {
            String path = switch (type) {
                case "building" -> "/images/building.png";
                case "road" -> "/images/road.png";
                case "forest" -> "/images/forest.png";
                case "swamp" -> "/images/swamp.png";
                case "water" -> "/images/water.png";
                default -> "/images/unknown.png";
            };
            tileGraphics.put(type, new Image(TileGraphicFactory.class.getResourceAsStream(path)));
        }
        return tileGraphics.get(type);
    }
}