package command;

public class GenerateCodeCommand implements Command {
    private final PixelGrid model;

    public GenerateCodeCommand(PixelGrid model) {
        this.model = model;
    }

    @Override
    public void execute() {
        int[][] grid = model.getGrid();
        System.out.println("int [][] pixelArt = {");
        for (int row = 0; row < 8; row++) {
            System.out.println("    {");
            for (int col = 0; col < 8; col++) {
                System.out.println(grid[row][col]);
                if (col < 7) {
                    System.out.println(", ");
                }
            }
            System.out.println(row < 7 ? "}," : "}");
        }
        System.out.println("};");
    }
}
