package instruments;

import behaviours.musicSectionType;

public class Trumpet extends Instrument {

    private int numOfValves;

    public Trumpet(String constructionType, String colour, musicSectionType musicSection, Double buyPrice, Double sellprice, int numOfValves) {
        super(constructionType, colour, musicSection, buyPrice, sellprice);
        this.numOfValves = numOfValves;

    }
        public int getNumOfValves(){
            return this.numOfValves;

        }

        public void setNumOfValves(int newNumber){
            this.numOfValves = newNumber;
        }
}
