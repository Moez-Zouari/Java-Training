package com.ocr.patternsStrategy.comportement;

import com.ocr.patternsStrategy.EspritCombatif;

public class Pacifiste implements EspritCombatif {
    public void combat() {
        System.out.println("Je ne combats pas !");
    }
}
