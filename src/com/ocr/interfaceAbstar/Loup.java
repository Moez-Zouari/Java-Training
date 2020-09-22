package com.ocr.interfaceAbstar;

public class Loup extends Calin {

    public Loup(){}
    public Loup (String couleur, int poids){
        this.couleur = couleur;
        this.poids = poids;
    }

    void crier(){
        System.out.println("Je hurle à la lune aen faisant Ohouhhh");
    }

}
