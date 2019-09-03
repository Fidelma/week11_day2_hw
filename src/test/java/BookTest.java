import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book;

    @Before
    public void setUp(){
        book = new Book("Americanah", "Adichi", "Feminist");

    }

    @Test
    public void canGetGenre() {
        assertEquals("Feminist", book.getGenre());
    }

    @Test
    public void canGetName() {
        assertEquals("Americanah", book.getName());
    }
}
