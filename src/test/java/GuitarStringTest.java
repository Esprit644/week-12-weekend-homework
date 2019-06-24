import accessories.GuitarString;

import behaviours.IPlay;
import instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarStringTest {

    GuitarString guitarString1;

    @Before
    public void before(){
        guitarString1 = new GuitarString("pack of 6", 3.00, 6.00);

    }

    @Test
    public void getDescription(){
        assertEquals("pack of 6", guitarString1.getDescription());
    }

    @Test
    public void setDescription(){
        guitarString1.setDescription("single string");
        assertEquals("single string", guitarString1.getDescription());
    }


    @Test
    public void canCalculateMarkUp() {
        guitarString1.calculateMarkUp();
        assertEquals(3.00, guitarString1.getAccessoryMarkUp(), 0.01);

    }


}
