import music_shop.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {
    Piano steinway;

    @Before
    public void before(){
        steinway = new Piano("Percussion", "Brown", 500, 1000, "Steinway", "Upright");
    }

    @Test
    public void hasDetails(){
        assertEquals("Percussion", steinway.getType());
        assertEquals("Brown", steinway.getColour());
        assertEquals(500, steinway.getBuyPrice());
        assertEquals(1000, steinway.getSellPrice());
        assertEquals("Steinway", steinway.getMake());
        assertEquals("Upright", steinway.getStyle());
    }
}
