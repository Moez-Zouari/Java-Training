package com.ocr.java8Interface;

public class Alien implements Mitose, Pondre {
    public void reproduire() {
        System.out.println("Je suis un alien");
        Pondre.super.reproduire();
        Mitose.super.reproduire();
    }
}
