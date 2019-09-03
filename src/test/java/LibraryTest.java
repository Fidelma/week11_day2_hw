import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Book book1;
    Book book2;
    Book book3;
    Book book4;
    Book book5;
    Book book6;
    Library library;


    @Before
    public void setUp(){
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
    public void libraryStartsEmpty(){
        assertEquals(4, library.getCollectionSize());
    }

    @Test
    public void canAddBookToLibrary() {
        library.addBook(book1);
        assertEquals(5, library.getCollectionSize());
    }

    @Test
    public void canNotAddIfFull() {
        library.addBook(book5);
        library.addBook(book6);
        assertEquals(5, library.getCollectionSize());
    }

    @Test
    public void canLoanBook() {
        library.loanBook(book1);
        assertEquals(3, library.getCollectionSize());
    }

    @Test
    public void canAddToGenres() {
        assertEquals(2, library.getNumberOfGenres());

    }

    @Test
    public void canCheckNumberOfBooksOfGenre() {
        assertEquals(3, library.checkGenre("Feminist"));
    }


}
