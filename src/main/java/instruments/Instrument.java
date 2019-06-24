package instruments;

import behaviours.musicSectionType;

public abstract class Instrument {

    protected Double markup;

    private String constructionType;
    private String colour;
    private musicSectionType musicSection;
    private Double buyPrice;
    private Double sellPrice;

    public Instrument(String constructionType, String colour, musicSectionType musicSection, Double buyPrice,
                      Double sellPrice) {

        this.constructionType = constructionType;
        this.colour = colour;
        this.musicSection = musicSection;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;

    }

    public Double getInstrumentMarkup(){
        return this.markup;
    }

    public String getConstructionType() {
        return constructionType;
    }

    public void setConstructionType(String constructionType) {

        this.constructionType = constructionType;
    }

    public String getColour() {

        return colour;
    }

    public void setColour(String colour) {

        this.colour = colour;
    }

    public musicSectionType getMusicSection() {

        return musicSection;
    }

    public void setMusicSection(musicSectionType musicSection) {
        this.musicSection = musicSection;
    }

    public Double getBuyPrice() {

        return buyPrice;
    }

    public void setBuyPrice(Double buyPrice) {

        this.buyPrice = buyPrice;
    }

    public Double getSellPrice() {

        return sellPrice;
    }

    public void setSellPrice(Double sellPrice) {

        this.sellPrice = sellPrice;
    }


}
