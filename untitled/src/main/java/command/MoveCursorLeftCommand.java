package command;

public class MoveCursorLeftCommand implements Command {
    private final PixelGrid model;

    public MoveCursorLeftCommand(PixelGrid model) {
        this.model = model;
    }

    @Override
    public void execute() {
        model.moveCursor(0, -1);
    }
}
