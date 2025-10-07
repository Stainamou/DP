package command;

public class MoveCursorUpCommand implements Command {
    private final PixelGrid model;

    public MoveCursorUpCommand(PixelGrid model) {
        this.model = model;
    }

    @Override
    public void execute() {
        model.moveCursor(-1, 0);
    }
}
