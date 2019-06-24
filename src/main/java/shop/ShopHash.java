package shop;

import java.util.HashMap;

public class ShopHash {

    private HashMap<String, Integer> shopStock;

    public static void main(String args[]) {
        // create and populate hash map

        HashMap<String, Integer> shopStock = new HashMap<String, Integer>();


        shopStock.put("guitar", 5);
        shopStock.put("piano", 4);
        shopStock.put("trumpet", 3);
        shopStock.put("packet of guitar strings", 2);
        shopStock.put("sheet music", 1);

    }

//    public static void addStock(String key, int increaseValue){
//        shopStock.put(key, shopStock.get(key) + increaseValue);
//
//
//    }


}
