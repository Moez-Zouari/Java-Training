package com.ocr.genericité;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main (String[] args){

        List<Voiture> listVoiture = new ArrayList<Voiture>();
        listVoiture.add(new Voiture("Audi"));
        listVoiture.add(new Voiture("Mercedes"));

        List<VoitureSansPermis> listVoitureSP = new ArrayList<VoitureSansPermis>();
        listVoitureSP.add(new VoitureSansPermis(listVoiture.get(1),"1250 TU 1"));
        listVoitureSP.add(new VoitureSansPermis());
      //  affiche(listVoiture);
       // affiche(listVoitureSP);
        Garage garage = new Garage();
        garage.add(listVoiture);
        System.out.println("---------------------");
        garage.add(listVoitureSP);


    }

    static void affiche(List<? super Voiture> list){
        for (Object v:list)
            System.out.println(v.toString());
    }


}
