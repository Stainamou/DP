package chain_of_responsibility;

public class DevelopmentSuggestionHandler extends FeedbackHandler {

    @Override
    public String handle(Message message) {
        if (message.getMessageType() == MessageType.DEVELOPMENT_SUGGESTION) {
            return "Development suggestion processed for: " + message.getSenderEmail() + ": " + message.getMessageContent();
        } else if (nextHandler != null) {
            return nextHandler.handle(message);
        }
        return "Unhandled message type.";
    }
}
