package com.company;

public class ElBil extends Bil {
    private int batterikapacitetKWh;
    private float maxKm;
    private int whPrKm;

    public ElBil(int batterikapacitetKWh, float maxKm, int whPrKm,String regNR, String maerke, String model, int aargang, int antalDoere) {
        super(regNR,maerke,model,aargang,antalDoere);
        this.batterikapacitetKWh = batterikapacitetKWh;
        this.maxKm = maxKm;
        this.whPrKm = whPrKm;
    }

    public int getBatterikapacitetKWh() {
        return batterikapacitetKWh;
    }

    public void setBatterikapacitetKWh(int batterikapacitetKWh) {
        this.batterikapacitetKWh = batterikapacitetKWh;
    }

    public float getMaxKm() {
        return maxKm;
    }

    public void setMaxKm(float maxKm) {
        this.maxKm = maxKm;
    }

    public int getWhPrKm() {
        return whPrKm;
    }

    public void setWhPrKm(int whPrKm) {
        this.whPrKm = whPrKm;
    }
    @Override
    public String toString(){
        return "en el bil";
    }
    @Override
    int beregnGroenAfgift() {
        double kmPrL = 100/(getWhPrKm()/91.25);
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
        // samme ide som med benzin bilen.
        else{return 100;}
    }
}
