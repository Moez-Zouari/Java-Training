package com.ocr.stream;

public enum Couleur {

    MARRON ("marron"),
    BLEU ("bleu"),
    VERT ("vert"),
    VERRON ("verron"),
    INCONNU ("non determiné"),
    ROUGE ("rouge mais j'avais piscine...");

    private String name ;

    Couleur(String n) {
        name = n;
    }

    @Override
    public String toString() {
        return name;
    }







}
