import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrower;
    Library library;
    Book book1;
    Book book2;
    Book book3;
    Book book4;
    Book book5;
    Book book6;

    @Before
    public void setUp(){
        borrower = new Borrower();
        book1 = new Book("Americanah", "Adichi", "Feminist");
        book2 = new Book("We should all be feminists", "Adichi", "Feminist");
        book3 = new Book("Women who run with wolves", "Estés", "Feminist");
        book4 = new Book("Trainspotting", "Welsh", "Black Comedy");
        book5 = new Book("Filth", "Welsh", "Black Comedy");
        book6 = new Book("Something", "someone", "Humour");
        library = new Library(5);
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);

    }

    @Test
    public void hasNoBooksInitially() {
        assertEquals(0, borrower.numberOfBooksOnLoan());
    }

    @Test
    public void canBorrowBook() {
        borrower.borrowBook(library, book1);
        assertEquals(1, borrower.numberOfBooksOnLoan());

    }
}
