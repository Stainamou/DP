package proxy;

import java.util.Date;

public class Document implements DocumentInterface {
    private final String id;
    private final Date creationDate;
    private final String content;

    public Document(String id, Date creationDate, String content) {
        this.id = id;
        this.creationDate = creationDate;
        this.content = content;
    }

    @Override
    public String getContent(User user) {
        return content;
    }

    @Override
    public Date getCreationDate() {
        return creationDate;
    }

    public String getId() {
        return id;
    }
}
