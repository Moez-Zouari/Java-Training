package com.ocr.java8Interface;

public interface Mitose extends Reproduction {
    public static void description(){
        Reproduction.description();
        System.out.println("Redefinie dans mitose.Java");
    }

    default void reproduire(){
        System.out.println("Je me divise");
    }
}
