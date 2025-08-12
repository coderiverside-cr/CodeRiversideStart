package coderiverside.classdesign.constructor;

public class Book {
    private String title;
    private String author;
    private int pageCount;

    public Book() {
        this.pageCount = 1;
    }

    public Book(String title) {
        this();
        this.title = title;
    }

    public Book(String title, String author) {
        this(title);
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
               "title='" + title + '\'' +
               ", author='" + author + '\'' +
               ", pageCount=" + pageCount +
               '}';
    }
}
