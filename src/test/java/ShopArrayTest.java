import org.junit.Before;
import org.junit.Test;
import shop.ShopArray;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShopArrayTest {

    private ShopArray guitars;
    private ShopArray pianos;


    @Before
    public void before() {
        guitars = new ShopArray();
        pianos = new ShopArray();


    }

    @Test
    public void canGetPianoSize(){
        assertEquals(0, pianos.getSize());
    }

    @Test
    public void addPianoToStock() {
        pianos.addPianoToStock("shiney piano");
       /////////// System.out.println(pianos);
        assertEquals(1, pianos.getSize());
    }

    @Test
    public void removePianoFromStock(){
        pianos.addPianoToStock("shiney piano");
        pianos.addPianoToStock("dull piano");
        pianos.addPianoToStock("large piano");
        pianos.removePianoFromStock("dull piano");
        assertEquals(2, pianos.getSize());

    }


}
