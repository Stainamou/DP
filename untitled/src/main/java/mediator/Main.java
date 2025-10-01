package mediator;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Arrays;
import java.util.List;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        ChatMediator mediator = new ChatMediator();
        List<String> usernames = Arrays.asList("Alice", "Bob", "Charlie");

        for (String username : usernames) {
            ChatClientController controller = new ChatClientController(username, mediator);
            controller.updateRecipients(usernames);

            Stage stage = new Stage();
            stage.setTitle("Chat - " + username);
            stage.setScene(new Scene(controller.getRoot(), 400, 300));
            stage.show();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
