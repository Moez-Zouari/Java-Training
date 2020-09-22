package com.ocr.intAbs2;

abstract class Animal {

    protected int poids;
    protected String couleur;

    protected void manger(){
        System.out.println("Je mange de la viande");
    }

    protected void boir(){
        System.out.println("Je bois de l'eau");
    }

    abstract void deplacement();
    abstract void crier();

    @Override
    public String toString() {
        return "Je suis un objet de la classe" +this.getClass()+
                " le poids=" + this.poids +
                ", la couleur='" + this.couleur + '\'' +
                '}';
    }
}
