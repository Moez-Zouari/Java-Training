package com.ocr.classAnonyme;
import com.ocr.patternsStrategy.Guerrier;
import com.ocr.patternsStrategy.Personnage;
import com.ocr.patternsStrategy.Soin;
import com.ocr.patternsStrategy.comportement.*;

public class Test {

    public static void main (String[]  args){
        Personnage pers = new Guerrier();
        pers.soigne();
        pers.setSoin(new Operation());
        pers.soigne();

        //Utilisation d'une classe anonyme
        pers.setSoin(new Soin() {
            @Override
            public void soigner() {
                System.out.println("Je soigne avec une classe anonyme ! ");
            }
        });

        pers.soigne();

    }

}
