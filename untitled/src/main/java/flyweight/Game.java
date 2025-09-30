package flyweight;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Game extends Application {
    private static final int TILE_SIZE = 40;

    @Override
    public void start(Stage stage) {
        CityMap cityMap = new CityMap(10, 15);

        Canvas canvas = new Canvas(cityMap.getCols() * TILE_SIZE, cityMap.getRows() * TILE_SIZE);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        cityMap.render(gc, TILE_SIZE);

        StackPane root = new StackPane(canvas);
        Scene scene = new Scene(root);

        stage.setTitle("RPG Map Generator with Flyweight");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}