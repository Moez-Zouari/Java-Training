package com.ocr.genericité;

import java.util.*;

public class Test {
    public static void main (String[] args) {
          /*  Solo<Integer> val = new Solo<Integer>(14);
            Solo<String> valS = new Solo<String>("TOTOTOTO");
            Solo<Float> valF = new Solo<Float>(12.2f);
            Solo<Double> valD = new Solo<Double>(12.202568);

        int nbr = val.getValeur();
        System.out.println(val.getValeur());
           */
          /*Duo<String,Boolean> dual = new Duo<String, Boolean>("Moez",true);
          System.out.println("La valeur de l'objet "+ dual.getValeur1()+ " La valeur 2 de l'objet " +dual.getValeur2());
          Duo<Character, Float> dua = new Duo<Character, Float>();

           */

        System.out.println("Liste String");
        System.out.println("----------------------");
        List<String> listeString = new ArrayList<String>();
        listeString.add("Moez");
        listeString.add("Zouari");
        listeString.add("feded");
        for (String str:listeString)
            System.out.println(str);

        System.out.println("Liste Float");
        System.out.println("----------------------");
        List<Float> listeFloat = new ArrayList<Float>();
        listeFloat.add(112.2F);
        listeFloat.add(113.2F);
        listeFloat.add(114.2F);
        for (Float str:listeFloat)
            System.out.println(str);
    }
}
