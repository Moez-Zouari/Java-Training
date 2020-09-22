package com.ocr.intAbs2;

public class Tigre extends Felin {

    public Tigre(){}

    public Tigre(String coul, int pod){
        this.couleur = coul;
        this.poids = pod ;
    }



    @Override
    void crier() {
        System.out.println("Je grogne très fort !");
    }
}
