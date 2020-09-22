package com.ocr.patternsStrategy;

import com.ocr.patternsStrategy.comportement.Operation;

public class Test {

    public static void main (String[] arg){
/*
        Personnage p = new Sniper();
        p.soigne();
        p.seDeplacer();
        p.combattre();*/

        Personnage[] tpers = {new Guerrier(),new Sniper(),new Chirirugien(),new Medecin(), new Civil()};

        for (Personnage p : tpers) {

            System.out.println("\t Instancier de" +p.getClass().getName());
            System.out.println("********************************");
            p.seDeplacer();
            p.soigne();
            p.combattre();


        }
        System.out.println("********************************");
        Personnage pers = new Guerrier();
        pers.soigne();
        pers.setSoin(new Operation(

        ));
        pers.soigne();
        }

        /*Guerrier g = new Guerrier();
        System.out.println("**************"+g.getClass().getName()+"***************");
        g.combattre();
        g.seDeplacer();
        Medecin m = new Medecin();
        m.soigner();
        Chirirugien c = new Chirirugien();
        c.soigner();
        c.seDeplacer();
        Civil cc = new Civil();
        cc.combattre();
        cc.seDeplacer();*/

        /*Personnage[] tpers = {new Guerrier(),new Guerrier(),new Civil(),new Civil(), new Chirirugien(), new Sniper(),new Medecin()};
        String[] tarms = {"pistolet","","Couteau","","gros sac","sniper",""};

        for (int i=0 ; i<tpers.length ; i++){
            System.out.println("\t Instance de " +tpers[i].getClass().getName());
            System.out.println("**************************");
            tpers[i].combattre();
            tpers[i].setArmes(tarms[i]);
            tpers[i].combattre();
            tpers[i].soigner();
            tpers[i].seDeplacer();


        }*/
    }

