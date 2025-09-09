package chain_of_responsibility;

public class ContactRequestHandler extends FeedbackHandler {

    @Override
    public String handle(Message message) {
        if (message.getMessageType() == MessageType.CONTACT_REQUEST) {
            return "Contact request processed for: " + message.getSenderEmail() + ": " + message.getMessageContent();
        } else if (nextHandler != null) {
            return nextHandler.handle(message);
        }
        return "Unhandled message type.";
    }
}
