package instruments;

import behaviours.IPlay;
import behaviours.ISell;
import behaviours.musicSectionType;
import behaviours.pianoSize;

public class Piano extends Instrument implements IPlay {

    private pianoSize size;

    public Piano (String constructionType, String colour, musicSectionType musicSection, Double buyPrice, Double sellPrice, pianoSize size) {

        super(constructionType, colour, musicSection, buyPrice, sellPrice);
        this.size = size;

    }


    public pianoSize getSize() {
        return this.size;
    }

    public void setSize(pianoSize size) {

        this.size = size;
    }

    public String instrumentSound(){
        return "plinkety plink";
    }


}
