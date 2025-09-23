package proxy;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Document doc1 = new Document("1", new Date(), "Hello World");
        DocumentProxy proxy1 = new DocumentProxy(doc1);

        library.addDocument(doc1);
        library.addDocument(proxy1);

        DocumentInterface retrieved = library.getDocument("1");
        System.out.println("Retrieved document ID: " + retrieved.getId());
    }
}
