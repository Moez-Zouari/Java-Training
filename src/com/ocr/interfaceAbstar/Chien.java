package com.ocr.interfaceAbstar;

public  class Chien extends Calin implements Rintintin {

    public Chien(){}

    public Chien(String couleur , int poids){
        this.couleur = couleur;
        this.poids = poids ;
    }

    void crier(){
        System.out.println("j'abois sans raison");
    }

    public void faireCalin() {
        System.out.println("Je te fais un GROS CÂLIN");
    }

    public void faireLebeau() {
        System.out.println("Je fais le beau !");
    }

    public void faireLechouille() {
        System.out.println("Je fais de grosses léchouilles...");
    }
}
