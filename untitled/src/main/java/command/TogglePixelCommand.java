package command;

public class TogglePixelCommand implements Command {
    private final PixelGrid model;

    public TogglePixelCommand(PixelGrid model) {
        this.model = model;
    }

    @Override
    public void execute() {
        model.togglePixel();
    }
}
