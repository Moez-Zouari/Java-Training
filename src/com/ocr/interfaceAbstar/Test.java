package com.ocr.interfaceAbstar;

public class Test {
    public static void main(String[] args) {
        //Les méthodes d'un chien
        Chien c = new Chien("Gris bleuté", 20);
        c.boir();
        c.manger();
        c.deplacement();
        c.crier();
        System.out.println(c.toString());

        System.out.println("--------------------------------------------");
        //Les méthodes de l'interface
        c.faireCalin();
        c.faireLebeau();
        c.faireLechouille();

        System.out.println("--------------------------------------------");
        //Utilisons le polymorphisme de notre interface
        Rintintin r = new Chien();
        r.faireLebeau();
        r.faireCalin();
        r.faireLechouille();
    }
}
