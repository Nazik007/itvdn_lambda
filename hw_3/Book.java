package itvdn_homeworks.lambda.hw_3;

/**
 * @author Nazarii Soviak
 */

public class Book {
    int numberOfPages;
    String author;
    String bookName;

    public Book(int numberOfPages, String author, String bookName) {
        this.numberOfPages = numberOfPages;
        this.author = author;
        this.bookName = bookName;
    }

    @Override
    public String toString() {
        return "Book name = " + bookName + "\nAuthor = " + author + "\nNumber of pages = " + numberOfPages;
    }
}

@FunctionalInterface
interface Display {
    void print ();
}

class Main {
    public static void main(String[] args) {

        Book book = new Book(230,"Taras Shevchenko","Kobzar");
        Book book1 = new Book(460, "J.K. Rowling","Harry Potter and the Deathly Hollows");
        Display printBook = ()-> System.out.println(book);
        Display printBook1 = ()-> System.out.println(book1);
        printBook.print();
        printBook1.print();
    }
}
