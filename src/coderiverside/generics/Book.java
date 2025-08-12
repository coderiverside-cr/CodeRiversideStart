package coderiverside.generics;

public class Book extends Thing {
    private final String title;

    public Book(String title) {
        super("Book");
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Thing{" +
                "name='" + this.getName() + '\'' +
                "title='" + this.getTitle() + '\'' +
                '}';
    }
}
