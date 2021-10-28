package com.company;

public abstract class Bil {
    private String regNR;
    private String maerke;
    private String model;
    private int aargang;
    private int antalDoere;

    public Bil(String regNR, String maerke, String model, int aargang, int antalDoere) {
        this.regNR = regNR;
        this.maerke = maerke;
        this.model = model;
        this.aargang = aargang;
        this.antalDoere = antalDoere;
    }
    abstract int beregnGroenAfgift();
}
