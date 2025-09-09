package chain_of_responsibility;

public class GeneralFeedbackHandler extends FeedbackHandler {

    @Override
    public String handle(Message message) {
        if (message.getMessageType() == MessageType.GENERAL_FEEDBACK) {
            return "General feedback processed for: " + message.getSenderEmail() + ": " + message.getMessageContent();
        } else if (nextHandler != null) {
            return nextHandler.handle(message);
        }
        return "Unhandled message type.";
    }
}
