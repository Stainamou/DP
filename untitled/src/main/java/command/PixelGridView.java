package command;

import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class PixelGridView extends GridPane {
    private final Rectangle[][] cells = new Rectangle[8][8];
    private final PixelGrid model;

    public PixelGridView(PixelGrid model) {
        this.model = model;
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                Rectangle rect = new Rectangle(30, 30);
                rect.setFill(Color.WHITE);
                rect.setStroke(Color.LIGHTGRAY);
                add(rect, col, row);
                cells[row][col] = rect;
            }
        }
        update();
    }

    public void update() {
        int[][] grid = model.getGrid();
        int cursorRow = model.getCursorRow();
        int cursorCol = model.getCursorCol();
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                cells[row][col].setFill(grid[row][col] == 1 ? Color.BLACK : Color.WHITE);
                if (row == cursorRow && col == cursorCol) {
                    cells[row][col].setStroke(Color.RED);
                    cells[row][col].setStrokeWidth(3);
                } else {
                    cells[row][col].setStroke(Color.LIGHTGRAY);
                    cells[row][col].setStrokeWidth(1);
                }
            }
        }
    }
}
