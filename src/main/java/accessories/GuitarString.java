package accessories;

import behaviours.ISell;

public class GuitarString extends Accessories implements ISell {

    public GuitarString(String description, Double accBuyPrice, Double accSellPrice){

        super(description, accBuyPrice, accSellPrice);

    }

//    public Double calculateMarkUp(){
//       return markup = this.getAccSellPrice() - this.getAccBuyPrice();
//    }
    //if I removed return then this would still work and I would have no need for the protected variable markup
    //in the abstract class.


    public void calculateMarkUp(){
        this.markup = this.getAccSellPrice() - this.getAccBuyPrice();

    }


}
