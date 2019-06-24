import behaviours.musicSectionType;
import behaviours.pianoSize;
import instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano1;

    @Before
    public void before(){
        piano1 = new Piano("wood", "black", musicSectionType.KEYBOARD, 100.00, 200.00, pianoSize.GRAND);


    }


    @Test
    public void getSize() {
        assertEquals(pianoSize.GRAND, piano1.getSize());
    }

    @Test
    public void setSize() {
        piano1.setSize(pianoSize.MINI);
        assertEquals(pianoSize.MINI, piano1.getSize());
    }

    @Test
    public void canGetConstructionType() {
        assertEquals("wood", piano1.getConstructionType());
    }

    @Test
    public void canSetConstructionType() {
        piano1.setConstructionType("CRP");
        assertEquals("CRP", piano1.getConstructionType());
    }

    @Test
    public void canGetColour() {
        assertEquals("black", piano1.getColour());
    }

    @Test
    public void setColour() {
        piano1.setColour("tartan");
        assertEquals("tartan", piano1.getColour());
    }

    @Test
    public void canGetMusicSection() {
        assertEquals(musicSectionType.KEYBOARD, piano1.getMusicSection());
    }

    @Test
    public void canSetMusicSection() {
        piano1.setMusicSection(musicSectionType.BRASS);
        assertEquals(musicSectionType.BRASS, piano1.getMusicSection());
    }

    @Test
    public void canGetBuyPrice() {
        assertEquals(100, piano1.getBuyPrice(), 00);
    }

    @Test
    public void setBuyPrice() {
        piano1.setBuyPrice(200.00);
        assertEquals(200, piano1.getBuyPrice(), 00);
    }

    @Test
    public void canGetSellPrice() {
        assertEquals(200, piano1.getSellPrice(), 00);
    }

    @Test
    public void setSellPrice() {
        piano1.setSellPrice(300.00);
        assertEquals(300, piano1.getSellPrice(), 00);
    }

    @Test
    public void canInstrumentmakeSound(){
        assertEquals("plinkety plink", piano1.instrumentSound());
    }


}
