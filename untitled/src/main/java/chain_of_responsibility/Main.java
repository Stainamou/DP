package chain_of_responsibility;

public class Main {
    public static void main(String[] args) {

        FeedbackHandler compensationHandler = new CompensationClaimHandler();
        FeedbackHandler contactHandler = new ContactRequestHandler();
        FeedbackHandler developmentHandler = new DevelopmentSuggestionHandler();
        FeedbackHandler generalHandler = new GeneralFeedbackHandler();

        compensationHandler.setNextHandler(contactHandler);
        contactHandler.setNextHandler(developmentHandler);
        developmentHandler.setNextHandler(generalHandler);

        Message[] messages = {
                new Message(MessageType.COMPENSATION_CLAIM, "Requesting refund for damaged product.", "alice@example.com"),
                new Message(MessageType.CONTACT_REQUEST, "Please call me regarding my order.", "bob@example.com"),
                new Message(MessageType.DEVELOPMENT_SUGGESTION, "Add dark mode to the app.", "carol@example.com"),
                new Message(MessageType.GENERAL_FEEDBACK, "Great service!", "dave@example")
        };

        for (Message msg : messages) {
            String result = compensationHandler.handle(msg);
            System.out.println(result);
        }
    }
}
