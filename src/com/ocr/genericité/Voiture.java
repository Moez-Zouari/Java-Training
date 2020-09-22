package com.ocr.genericité;

public class Voiture {
    private String name;

    public Voiture (String name){
        this.name = name;
    }

    public Voiture() {

    }

    @Override
    public String toString() {
        return "Voiture{" +
                "name='" + name + '\'' +
                '}';
    }
}
