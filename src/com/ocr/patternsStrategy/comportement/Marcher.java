package com.ocr.patternsStrategy.comportement;

import com.ocr.patternsStrategy.Deplacement;

public class Marcher implements Deplacement {

    public void deplacer(){
        System.out.println("Je me déplace en marchant");
    }

    @Override
    public void var() {
        Deplacement.super.var();
    }
}
