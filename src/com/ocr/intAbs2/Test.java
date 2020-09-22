package com.ocr.intAbs2;

public class Test {

    public static void main (String[] args){
    Chien c = new Chien("Noire",45);
    c.crier();
    c.boir();
    System.out.println("---------------------------------------------------");
    System.out.println(c.toString());
    Chat a = new Chat("Gris",8);
    a.deplacement();
    a.manger();
    System.out.println("---------------------------------------------------");
    c.faireCalin();
    c.faireLechouille();
    c.faireLeBeau();
    System.out.println("---------------------------------------------------");
    Rintintin r = new Chien("Blanc",20);
    System.out.println(r.toString());
    r.faireCalin();
    r.faireLeBeau();
    r.faireLechouille();
    System.out.println("---------------------------------------------------");


    }
}
