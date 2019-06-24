import behaviours.musicSectionType;
import instruments.Trumpet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {

    Trumpet trumpet1;

    @Before
    public void before() {

        trumpet1 = new Trumpet("Brass", "gold", musicSectionType.BRASS, 50.00, 100.00, 3);
    }

        @Test
        public void canGetNumOfValves(){
            assertEquals(3, trumpet1.getNumOfValves());
        }

        @Test
        public void canSetNumOfValves(){
            trumpet1.setNumOfValves(6);
            assertEquals(6, trumpet1.getNumOfValves());

        }


}
