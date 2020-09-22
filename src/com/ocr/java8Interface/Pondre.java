package com.ocr.java8Interface;

public interface Pondre extends Reproduction {
    public static void description() {
        Reproduction.description();
        System.out.println("Redefinie dans pondre.Java");
    }

default void reproduire(){
        System.out.println("Je pond des oeufs");
}
}
