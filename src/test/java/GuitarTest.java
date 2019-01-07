import music_shop.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {
    Guitar strato;

    @Before
    public void before(){
        strato = new Guitar("String", "Black", 1200, 1500, 6, "Stratocaster");
    }

    @Test
    public void hasDetails(){
        assertEquals("String", strato.getType());
        assertEquals("Black", strato.getColour());
        assertEquals(1200, strato.getBuyPrice());
        assertEquals(1500, strato.getSellPrice());
        assertEquals(6, strato.getNumberOfStrings());
        assertEquals("Stratocaster", strato.getModel());
    }
}
