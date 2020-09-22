package com.ocr.interfaceAbstar;

abstract class Animal {

    protected int poids;
    protected String couleur;

    protected void manger() {
        System.out.println("Je mange de la viande. ");
    }

    protected void boir() {
        System.out.println("Je bois du l'eau");
    }

    abstract void deplacement();

    abstract void crier();

    @Override
    public String toString() {
        String str = "Je suis un objet de la " +this.getClass()+ " Je suis " + couleur + " Je pése " + poids;
        return str;
    }
}