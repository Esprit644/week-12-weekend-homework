package shop;

import java.util.ArrayList;

public class ShopArray {

    private ArrayList<String> guitars;
    private ArrayList<String> pianos;

    public ShopArray(){
        this.guitars = new ArrayList<>();
        this.pianos = new ArrayList<>();


    }


    public int getSize() {
        return pianos.size();
    }

    public void addPianoToStock(String piano) {
        this.pianos.add(piano);
    }

    public void removePianoFromStock(String piano) {
        this.pianos.remove(piano);
    }
}
