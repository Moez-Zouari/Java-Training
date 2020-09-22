package com.ocr.intAbs2;

public class Loup extends Canin {

    public Loup(){}

    public Loup(String coul , int poi){
        this.couleur = coul;
        this.poids = poi;
    }

    void crier(){
        System.out.println("Je hurle à la Lune en faisant ouhouh !");
    }
}
