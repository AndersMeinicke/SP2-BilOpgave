package com.company;

public class DieselBil extends Bil {
   private boolean harPartikelFilter;
    private float kmPrL;

    public DieselBil(boolean harPartikelFilter, float kmPrL,String regNR, String maerke, String model, int aargang, int antalDoere) {
        super(regNR,maerke,model,aargang,antalDoere);
        this.harPartikelFilter = harPartikelFilter;
        this.kmPrL = kmPrL;
    }

    public boolean isHarPartikelFilter() {
        return harPartikelFilter;
    }

    public void setHarPartikelFilter(boolean harPartikelFilter) {
        this.harPartikelFilter = harPartikelFilter;
    }

    public float getKmPrL() {
        return kmPrL;
    }

    public void setKmPrL(float kmPrL) {
        this.kmPrL = kmPrL;
    }
    @Override
    public String toString(){
        return "en diesel bil";
    }

    @Override
    int beregnGroenAfgift() {
        int udledningsAfgift = 0;
        if (isHarPartikelFilter()){
            udledningsAfgift += 1000;
        }
        if(kmPrL<=50&&kmPrL>20){
            udledningsAfgift += 130;
            return 330+udledningsAfgift;
        }
        else if(kmPrL<=20&&kmPrL>15){
            udledningsAfgift += 1390;
            return 1050+udledningsAfgift;
        }
        else if(kmPrL<=15&&kmPrL>10){
            udledningsAfgift += 1850;
            return 2340+udledningsAfgift;
        }
        else if(kmPrL<=10&&kmPrL>5){
            udledningsAfgift += 2770;
            return 5500+udledningsAfgift;
        }
        else if (kmPrL<5){
            udledningsAfgift += 15260;
            return 10470+udledningsAfgift; }
        // samme ide som med benzin bilen.
        else{return 100+udledningsAfgift;}
    }
}
