package mediator;

import java.util.HashMap;
import java.util.Map;

public class ChatMediator implements MediatorInterface {
    private final Map<String, ChatClientController> clients = new HashMap<>();

    @Override
    public void registerClient(String username, ChatClientController client) {
        clients.put(username, client);
    }

    @Override
    public void sendMessage(ChatMessage message) {
        ChatClientController recipient = clients.get(message.getRecipient());
        if (recipient != null) {
            recipient.receiveMessage(message);
        }
    }
}
