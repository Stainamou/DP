package command;

public class PixelGrid {
    private final int[][] grid = new int[8][8];
    private int cursorRow = 0;
    private int cursorCol = 0;

    public int[][] getGrid() {
        return grid;
    }

    public int getCursorRow() {
        return cursorRow;
    }

    public int getCursorCol() {
        return cursorCol;
    }

    public void moveCursor(int dRow, int dCol) {
        cursorRow = Math.max(0, Math.min(7, cursorRow + dRow));
        cursorCol = Math.max(0, Math.min(7, cursorCol + dCol));
    }

    public void togglePixel() {
        grid[cursorRow][cursorCol] = grid[cursorRow][cursorCol] == 0 ? 1 : 0;
    }
}
