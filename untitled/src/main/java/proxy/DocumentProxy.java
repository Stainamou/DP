package proxy;

import java.util.Date;

public class DocumentProxy implements DocumentInterface {
    private final Document document;
    private final AccessControlService accessControlService = AccessControlService.getInstance();

    public DocumentProxy(Document document) {
        this.document = document;
    }

    @Override
    public String getContent(User user) {
        if (accessControlService.isAllowed(document.getId(), user.getUsername())) {
            return document.getContent(user);
        } else {
            throw new AccessDeniedException("Access denied for user: " + user.getUsername());
        }
    }

    @Override
    public Date getCreationDate() {
        return document.getCreationDate();
    }

    public String getId() {
        return document.getId();
    }
}
