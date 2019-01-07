import music_shop.Book;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {
    Book book;

    @Before
    public void before(){
        book = new Book("Beginner Guitar", 4, 10);
    }

    @Test
    public void hasDetails(){
        assertEquals("Beginner Guitar", book.getTitle());
        assertEquals(4, book.getBuyPrice());
        assertEquals(10, book.getSellPrice());
    }

    @Test
    public void changeSellPrice(){
        book.setSellPrice(8);
        assertEquals(8, book.getSellPrice());
    }

    @Test
    public void getMarkup(){
        assertEquals(6, book.calculateMarkup());
    }
}
