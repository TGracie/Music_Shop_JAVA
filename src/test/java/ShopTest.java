import behaviours.ISell;
import music_shop.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    ISell stand;

    @Before
    public void before(){
        stand = new Stand("Black", 10, 20);
        shop = new Shop("Rays Music Exchange", 500);
    }

    @Test
    public void hasDetails(){
        assertEquals("Rays Music Exchange", shop.getName());
        assertEquals(500, shop.getCash());
    }

    @Test
    public void startsEmpty(){
        assertEquals(0, shop.stockCount());
    }

    @Test
    public void canAddToStock(){
        shop.addItemToStock(stand);
        assertEquals(1, shop.stockCount());
    }

    @Test
    public void canRemoveItem(){
        shop.addItemToStock(stand);
        assertEquals(1, shop.stockCount());
        shop.removeStockItem(stand);
        assertEquals(0, shop.stockCount());
    }
}
