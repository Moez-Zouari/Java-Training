package com.ocr.intAbs2;

public class Chien extends Canin implements Rintintin {

    public Chien(){}

    public Chien(String coul, int poid){
        this.couleur = coul;
        this.poids = poid ;
    }

    void crier(){
        System.out.println("J'abois sans raison");
    }


    public void faireCalin() {
        System.out.println("Je te fais un GROS CÂLIN");
    }

    public void faireLeBeau() {
        System.out.println("Je fais le beau !");
    }

    public void faireLechouille() {
        System.out.println("Je fais de grosses léchouilles...");
    }
}
