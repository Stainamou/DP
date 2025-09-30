package flyweight;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import flyweight.Tile;

public class MapRenderer {
    public static void render(Tile[][] map, GraphicsContext gc, int tileSize) {
        for (int row = 0; row < map.length; row++) {
            for (int col = 0; col < map[row].length; col++) {
                Tile tile = map[row][col];
                String tileType = tile.getClass().getSimpleName();
                Image img = TileGraphicFactory.getTileGraphic(tileType);
                gc.drawImage(img, col * tileSize, row * tileSize, tileSize, tileSize);
            }
        }
    }
}
