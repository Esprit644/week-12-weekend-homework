import accessories.Reed;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReedTest {

    Reed reed1;

    @Before
    public void before(){
        reed1 = new Reed("pack of ten", 5.00, 10.00);
    }

    @Test
    public void canGetAccSellPrice(){
        assertEquals(10, reed1.getAccSellPrice(),00.01);

    }

    @Test
    public void  canSetAccSellPrice(){
        reed1.setAccSellPrice(10.50);
        assertEquals(10.50, reed1.getAccSellPrice(),00.01);
    }


}
