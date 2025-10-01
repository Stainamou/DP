package prototype;

import java.util.List;
import java.util.ArrayList;

public class Recommendation {
    public String targetAudience;
    public List<Book> books;

    public Recommendation(String targetAudience, List<Book> books) {
        this.targetAudience = targetAudience;
        this.books = books;
    }

    public Recommendation clone() {
        List<Book> clonedBooks = new ArrayList<>();
        for (Book book : this.books) {
            clonedBooks.add(book.clone());
        }
        return new Recommendation(this.targetAudience, clonedBooks);
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(int index) {
        if (index >= 0 && index < books.size()) {
            books.remove(index);
        }
    }

    public void setTargetAudience(String audience) {
        this.targetAudience = audience;
    }
}
