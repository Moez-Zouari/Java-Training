package com.ocr.stream;

import com.ocr.stream.Couleur;

public  class  Personne {
    public double taille = 0.0d, poids = 0.0d;
    public String nom = "", prenom = "";
    public Couleur yeux = Couleur.INCONNU;

    public Personne() {
    }

    public Personne(double taille, double poids, String nom, String prenom, Couleur yeux) {
        super();
        this.taille = taille;
        this.poids = poids;
        this.nom = nom;
        this.prenom = prenom;
        this.yeux = yeux;
    }

    @Override
    public String toString() {
        String s = "Je m'appelle " + nom + " " + prenom;
        s += " Je pése " + poids + " Kg ";
        s += ", et je mesure " + taille + " Cm";

        return s;
    }

    public double getTaille() {
        return taille;
    }

    public void setTaille(double taille) {
        this.taille = taille;
    }

    public double getPoids() {
        return poids;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Couleur getYeux() {
        return yeux;
    }

    public void setYeux(Couleur yeux) {
        this.yeux = yeux;
    }
}