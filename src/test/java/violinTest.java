import music_shop.Violin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class violinTest {
    Violin violin;

    @Before
    public void before(){
        violin = new Violin("String", "Purple", 40, 80, 1.00);
    }

    @Test
    public void hasDetails(){
        assertEquals("String", violin.getType());
        assertEquals("Purple", violin.getColour());
        assertEquals(40, violin.getBuyPrice());
        assertEquals(80, violin.getSellPrice());
        assertEquals(1.00, violin.getSize(), 0.1);
    }

    @Test
    public void setPriceandPlay(){
        violin.setSellPrice(85);
        assertEquals(85, violin.getSellPrice());
        assertEquals("Wamp wamp", violin.play());
    }

    @Test
    public void canGetMarkup(){
        assertEquals(40, violin.calculateMarkup());
    }
}
