package instruments;

import behaviours.IPlay;
import behaviours.ISell;
import behaviours.musicSectionType;

public class Guitar extends Instrument implements  IPlay, ISell{

    private int numOfStrings;

    public Guitar(String constructionType, String colour, musicSectionType musicSection, int numOfStrings,  Double buyPrice, Double sellPrice){
        super(constructionType, colour, musicSection, buyPrice, sellPrice);
        this.numOfStrings = numOfStrings;

    }


    public int getNumOfStrings() {
        return numOfStrings;
    }

    public void setNumOfStrings(int numOfStrings) {
        this.numOfStrings = numOfStrings;
    }


//    public Double calculateMarkUp(){
//        return markup = this.getSellPrice() - this.getBuyPrice();
//    }

    public String instrumentSound(){

        return "weep weep";
    }

    public void calculateMarkUp(){
        markup = this.getSellPrice() - getBuyPrice();
    }

}
