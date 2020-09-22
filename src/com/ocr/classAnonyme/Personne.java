package com.ocr.classAnonyme;

public class Personne {
    private String nom ;
    private int age ;

    public Personne(int agep, String nomp) {
        age = agep;
        nom = nomp;
    }

    public String getNom() {
        String nom = this.nom;
        return nom;
    }

    public Integer getAge() {
        int age = this.age;
        return  age;
    }
}
