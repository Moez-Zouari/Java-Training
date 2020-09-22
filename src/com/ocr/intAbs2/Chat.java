package com.ocr.intAbs2;

public class Chat extends Felin {

    public Chat(){}

    public Chat(String coul, int pod){
        this.couleur = coul;
        this.poids = pod;
    }


    @Override
    void crier() {
        System.out.println("Je miaule sur les toits !");
    }
}
