package mediator;

public interface MediatorInterface {
    void registerClient(String username, ChatClientController client);
    void sendMessage(ChatMessage message);
}
