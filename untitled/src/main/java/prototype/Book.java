package prototype;

public class Book {
    public String title;
    public String author;
    public String genre;
    public int publicationYear;

    public Book(String title, String author, String genre, int publicationYear) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.publicationYear = publicationYear;
    }

    public Book clone() {
        return new Book(this.title, this.author, this.genre, this.publicationYear);
    }
}
