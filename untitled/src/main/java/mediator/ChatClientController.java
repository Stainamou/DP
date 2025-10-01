package mediator;

import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import java.util.List;

public class ChatClientController {
    private final String username;
    private final MediatorInterface mediator;

    private TextArea messageArea;
    private TextField inputField;
    private ComboBox<String> recipientBox;
    private Button sendButton;
    private VBox root;

    public ChatClientController(String username, MediatorInterface mediator) {
        this.username = username;
        this.mediator = mediator;
        mediator.registerClient(username, this);
        setupUI();
    }

    private void setupUI() {
        messageArea = new TextArea();
        messageArea.setEditable(false);

        inputField = new TextField();
        recipientBox = new ComboBox<>();
        sendButton = new Button("Send");

        sendButton.setOnAction(e -> {
            String recipient = recipientBox.getValue();
            String content = inputField.getText();
            if (recipient != null && !content.isEmpty()) {
                sendMessage(recipient, content);
                inputField.clear();
            }
        });

        root = new VBox(10, messageArea, recipientBox, inputField, sendButton);
    }

    public VBox getRoot() {
        return root;
    }

    public void updateRecipients(List<String> usernames) {
        recipientBox.getItems().setAll(usernames);
        recipientBox.getItems().remove(username);
    }

    public void sendMessage(String recipient, String content) {
        ChatMessage message = new ChatMessage(username, recipient, content);
        mediator.sendMessage(message);
    }

    public void receiveMessage(ChatMessage message) {
        messageArea.appendText("[" + message.getSender() + "]: " + message.getContent() + "\n");
    }

    public String getUsername() {
        return username;
    }
}
