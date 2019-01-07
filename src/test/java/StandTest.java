import music_shop.Stand;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StandTest {

    Stand stand;

    @Before
    public void before(){
        stand = new Stand("Black", 10, 20);
    }

    @Test
    public void hasDetails(){
        assertEquals("Black", stand.getColour());
        assertEquals(10, stand.getBuyPrice());
        assertEquals(20, stand.getSellPrice());
    }

    @Test
    public void canChangeSellPrice(){
        stand.setSellPrice(15);
        assertEquals(15, stand.getSellPrice());
    }

    @Test
    public void getMarkup(){
        assertEquals(10, stand.calculateMarkup());
    }
}
