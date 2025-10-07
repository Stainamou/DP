package command;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class PixelArtEditorApp extends Application {
    @Override
    public void start(Stage primaryStage) {
        PixelGrid model = new PixelGrid();
        PixelGridView view = new PixelGridView(model);

        Command up = new MoveCursorUpCommand(model);
        Command down = new MoveCursorDownCommand(model);
        Command left = new MoveCursorLeftCommand(model);
        Command right = new MoveCursorRightCommand(model);
        Command toggle = new TogglePixelCommand(model);
        Command generate = new GenerateCodeCommand(model);

        Button codeButton = new Button("Create Code");
        codeButton.setOnAction(e -> generate.execute());

        BorderPane root = new BorderPane();
        root.setCenter(view);
        root.setBottom(codeButton);

        Scene scene = new Scene(root, 1280, 700);

        scene.setOnKeyPressed(e -> {
            switch (e.getCode()) {
                case UP: up.execute(); break;
                case DOWN: down.execute(); break;
                case LEFT: left.execute(); break;
                case RIGHT: right.execute(); break;
                case SPACE: toggle.execute(); break;
                default: break;
            }
            view.update();
        });

        codeButton.setOnAction(e -> generate.execute());

        primaryStage.setScene(scene);
        primaryStage.setTitle("Pixel Art Editor");
        primaryStage.show();
        root.requestFocus();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
