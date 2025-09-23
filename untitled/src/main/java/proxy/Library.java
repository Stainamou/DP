package proxy;

import java.util.HashMap;
import java.util.Map;

public class Library {
    private final Map<String, DocumentInterface> documents = new HashMap<>();

    public void addDocument(DocumentInterface document) {
        if (document instanceof Document) {
            documents.put(((Document) document).getId(), document);
        } else if (document instanceof DocumentProxy) {
            documents.put(((DocumentProxy) document).getId(), document);
        }
    }

    public DocumentInterface getDocument(String id) {
        return documents.get(id);
    }

    public Map<String, DocumentInterface> getAllDocuments() {
        return new HashMap<>(documents);
    }
}
