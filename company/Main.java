package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Garage garage = new Garage("Parkering");
        BenzinBil bil = new BenzinBil(95,50,"HE20422","Volkswagen","Polo",2010,4);
      Bil elBil = new ElBil(220,455,150,"st50039","Tesla","Model 3",2017,4);
      Bil dieselBil = new DieselBil(true,16,"MO19573","Citroen","C4",2004,4);
        garage.TilfoejBil(bil);
     garage.TilfoejBil(elBil);
     garage.TilfoejBil(dieselBil);
        System.out.println(garage.beregnGroenAfgiftForBilpark());
        System.out.println(garage);
    }
}
