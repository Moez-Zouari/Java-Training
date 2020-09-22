package com.ocr.intAbs2;

public  class Lion extends Felin{

    public Lion(){}

    public Lion(String coul, int pod){
        this.couleur = coul;
        this.poids = pod;
    }

    void crier(){
        System.out.println("Je rugis dans la savane !");
    }
}
