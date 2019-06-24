import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class ShopHashTest {
    HashMap< String, Integer> shopStock = new HashMap< String, Integer>();

    @Before
    public void before(){

        shopStock.put("guitar", 5);
        shopStock.put("piano", 4);
        shopStock.put("trumpet", 3);
        shopStock.put("packet of guitar strings", 2);
        shopStock.put("sheet music", 1);
    }

    @Test
    public void getStock(){
        assertEquals(5, shopStock.get("guitar"), 00.01);
    }

    @Test
    public void canAmendStock(){
       shopStock.put("piano", 6);
//        shopStock.put(key, shopStock.get(key) + increaseValue);
        assertEquals(6, shopStock.get("piano"), 0.00);
    }

    @Test
    public void canRemoveAllStock(){
        shopStock.clear();
        assertEquals(0, shopStock.size());
    }
}
