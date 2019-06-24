package accessories;

public abstract class Accessories {

    protected Double markup;


    private String description;
    private Double accBuyPrice;
    private Double accSellPrice;

    public Accessories(String description, Double accBuyPrice, Double accSellPrice){

        this.description = description;
        this.accBuyPrice = accBuyPrice;
        this.accSellPrice = accSellPrice;
        //this.markup = 0.00;

    }

    // Check this
    public Double getAccessoryMarkUp() {

        return this.markup;
    }






    public String getDescription(){
        return this.description;
    }

    public void setDescription(String newDescription){
        this.description = newDescription;

    }

    public Double getAccBuyPrice(){
        return this.accBuyPrice;
    }

    public void setAccBuyPrice(Double newPrice){
        this.accBuyPrice = newPrice;

    }

    public Double getAccSellPrice(){
        return this.accSellPrice;
    }

    public void setAccSellPrice(Double newPrice){
        this.accSellPrice = newPrice;

    }





}
