import javafx.beans.property.adapter.JavaBeanBooleanPropertyBuilder;

public class DemoConstructor {
    public static void main(String[] args) {
        Book book1 = new Book(); // Default constructor
        Book book2 = new Book("Clean Code");

        // Builder pattern
        Book book3 = new BookBuilder()
                .setName("")
                .haveIsbn("1234")
                .withPrice(100)
                .build();
    }
}

class BookFactory {

    public Book createBookWithName(String name) {
        Book book = new Book(name);
        return book;
    }

}

class BookBuilder {
    Book book;

    BookBuilder() {
        book = new Book();
    }

    public BookBuilder setName(String name) {
        book.setName(name);
        return this;
    }

    public BookBuilder haveIsbn(String isbn) {
        book.setIsbn(isbn);
        return this;
    }

    public BookBuilder withPrice(int price) {
        book.setPrice(price);
        return this;
    }

    public Book build() {
        return book;
    }
}


class Book {
    private String name;
    private int price;
    private String isbn;

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    // Default constructor
    public Book() {
        this("");
    }

    public Book(String name) {
        this(name, 0);
    }

    public Book(String name, int price) {
        this.name = name;
        this.price = price;
    }
}
