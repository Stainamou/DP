package flyweight;

import flyweight.Tile;
import flyweight.TileGraphicFactory;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public abstract class Map {
    protected Tile[][] tiles;
    protected int rows;
    protected int cols;

    public Map(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        tiles = new Tile[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                tiles[i][j] = createTile();
            }
        }
    }

    public abstract Tile createTile();

    public void display() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(tiles[i][j].getCharacter() + " ");
            }
            System.out.println();
        }
    }

    public void render(GraphicsContext gc, double tileSize) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                Tile tile = tiles[i][j];
                Image img = TileGraphicFactory.getTileGraphic(tile.getType());
                gc.drawImage(img, j * tileSize, i * tileSize, tileSize, tileSize);
            }
        }
    }

    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }
}