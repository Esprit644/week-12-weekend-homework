import accessories.SheetMusic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {


    SheetMusic sheetMusic1;

    @Before
    public void before(){
        sheetMusic1 = new SheetMusic("Complete back-catalouge", 4.00, 8.00);
    }

    @Test
    public void canGetAccBuyPrice(){
      assertEquals(4, sheetMusic1.getAccBuyPrice(), 0.01);

    }

    @Test
    public void canSetAccBuyPrice(){
        sheetMusic1.setAccBuyPrice(4.50);
        assertEquals(4.50, sheetMusic1.getAccBuyPrice(), 0.01);
    }
}
