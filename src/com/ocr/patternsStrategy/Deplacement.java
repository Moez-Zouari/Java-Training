package com.ocr.patternsStrategy;

public interface Deplacement {
    public void deplacer();

    default void var(){
        System.out.println("Yedek");
    }
}
