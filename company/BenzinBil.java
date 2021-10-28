package com.company;

public class BenzinBil extends Bil {
    private int oktanTal;
    private float kmPrL;

    public BenzinBil(int oktanTal, float kmPrL,String regNR, String maerke, String model, int aargang, int antalDoere) {
        super(regNR,maerke,model,aargang,antalDoere);
        this.oktanTal = oktanTal;
        this.kmPrL = kmPrL;
    }

    public int getOktanTal() {
        return oktanTal;
    }

    public void setOktanTal(int oktanTal) {
        this.oktanTal = oktanTal;
    }

    public float getKmPrL() {
        return kmPrL;
    }

    public void setKmPrL(float kmPrL) {
        this.kmPrL = kmPrL;
    }
    @Override
    public String toString(){
        return "en benzin bil";
    }
    @Override
    int beregnGroenAfgift() {
        if(kmPrL<=50&&kmPrL>20){
            return 330;
        }
        else if(kmPrL<=20&&kmPrL>15){
            return 1050;
        }
        else if(kmPrL<=15&&kmPrL>10){
            return 2340;
        }
        else if(kmPrL<=10&&kmPrL>5){
            return 5500;
        }
        else if (kmPrL<5){ return 10470; }
        //har en placeholder værdi her, fordi hvis noget er over 50 ville vi ellers ikke kunne give en værdi,
        else{return 100;}
    }

}
