package proxy;

import java.util.Date;

public interface DocumentInterface {
    String getContent(User user);
    Date getCreationDate();
    String getId();
}
