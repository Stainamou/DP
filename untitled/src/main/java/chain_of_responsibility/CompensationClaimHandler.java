package chain_of_responsibility;

public class CompensationClaimHandler extends FeedbackHandler {

    @Override
    public String handle(Message message) {
        if (message.getMessageType() == MessageType.COMPENSATION_CLAIM) {
            return "Compensation claim processed for: " + message.getSenderEmail() + ": " + message.getMessageContent();
        } else if (nextHandler != null) {
            return nextHandler.handle(message);
        }
        return "Unhandled message type.";
    }
}
