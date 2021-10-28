package com.company;

import java.util.ArrayList;

public class Garage {
    ArrayList<Bil> bil = new ArrayList<>();
    String navn;
    Garage(String navn){
        this.navn = navn;
    }


    public void TilfoejBil(Bil bilen){
        bil.add(bilen);
    }
    @Override
    public String toString(){
        String teksten = "Der er: ";
        for(Bil biler : bil){
           teksten += biler + ", ";
        }
        return teksten;
    }
    public int beregnGroenAfgiftForBilpark() {
        int samletVaerdi = 0;
        for (Bil biler : bil) {
            samletVaerdi += biler.beregnGroenAfgift();
        }
        return samletVaerdi;
    }
}
