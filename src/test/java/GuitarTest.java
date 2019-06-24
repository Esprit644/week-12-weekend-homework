import behaviours.IPlay;
import behaviours.musicSectionType;
import instruments.Guitar;
import instruments.Instrument;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar1;
    Guitar guitar2;

    @Before
    public void before(){

        guitar1 = new Guitar("wood", "red", musicSectionType.STRING, 12, 50.00, 100.00);
        guitar2 = new Guitar("steel", "blue", musicSectionType.STRING, 6, 150.00, 200.00);
    }

    @Test
    public void canGetConstructionType() {
        assertEquals("steel", guitar2.getConstructionType());
    }

    @Test
    public void canSetConstructionType() {
        guitar1.setConstructionType("CRP");
        assertEquals("CRP", guitar1.getConstructionType());
    }

    @Test
    public void canGetColour() {
       assertEquals("blue", guitar2.getColour());
    }

    @Test
    public void setColour() {
        guitar2.setColour("tartan");
        assertEquals("tartan", guitar2.getColour());
    }

    @Test
    public void canGetMusicSection() {
       assertEquals(musicSectionType.STRING, guitar1.getMusicSection());
    }

    @Test
    public void canSetMusicSection() {
        guitar1.setMusicSection(musicSectionType.BRASS);
        assertEquals(musicSectionType.BRASS, guitar1.getMusicSection());
   }

    @Test
    public void canGetBuyPrice() {
        assertEquals(150, guitar2.getBuyPrice(), 00);
    }

        @Test
    public void setBuyPrice() {
        guitar2.setBuyPrice(250.00);
        assertEquals(250, guitar2.getBuyPrice(), 00);
    }

    @Test
    public void canGetSellPrice() {
        assertEquals(200, guitar2.getSellPrice(), 00);
    }

    @Test
    public void setSellPrice() {
        guitar2.setSellPrice(300.00);
        assertEquals(300, guitar2.getSellPrice(), 00);
    }


    @Test
    public void getNumOfStrings() {
        assertEquals(6, guitar2.getNumOfStrings());
    }

    @Test
    public void setNumOfStrings() {
        guitar2.setNumOfStrings(16);
        assertEquals(16, guitar2.getNumOfStrings());
    }

    @Test
    public void canInstrumentMakeSound(){
        assertEquals("weep weep", guitar1.instrumentSound());
    }

    @Test
    public void canCalculateMarkUp(){
        guitar1.calculateMarkUp();
        assertEquals(50, guitar1.getInstrumentMarkup(), 0.01);
    }
}
