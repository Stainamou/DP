package command;

public class MoveCursorDownCommand implements Command {
    private final PixelGrid model;

    public MoveCursorDownCommand(PixelGrid model) {
        this.model = model;
    }

    @Override
    public void execute() {
        model.moveCursor(1, 0);
    }
}
