package command;

public class MoveCursorRightCommand implements Command {
    private final PixelGrid model;

    public MoveCursorRightCommand(PixelGrid model) {
        this.model = model;
    }

    @Override
    public void execute() {
        model.moveCursor(0, 1);
    }
}
