package com.ocr.her2;

public class Main {

    public static void main (String[] args){
        Ville v = new Ville();
        Ville v1 = new Ville("Sfax","Tunisie",5000000);
        Ville v2 = new Ville("Tokyo", "Japan",10000);
        Capital cap = new Capital("Berlin" ,"Allemagne" , 250000 ,"Hetlar");

       //System.out.println("\t" + v1.getNomVille()+ " Est une ville situé à " +v1.getNomPays()+ " est comporte plus de " +v1.getNbrHabit());
        System.out.println("****** Avant la pérmutation ******");
        System.out.println("La Ville V1 : " +v1.toString());
        System.out.println("La Ville V2 : " +v2.toString());
        System.out.println("****** Apres la pérmutation ******");
        Ville temp;
        temp = v1 ;
        v1 = v2 ;
        v2 = temp;
        System.out.println("La Ville V1 : " +v1.toString());
        System.out.println("La Ville V2 : " +v2.toString());
        System.out.println("**********************************************");
        System.out.println(v1.decriToi());
        System.out.println(v2.decriToi());
        System.out.println("**********************************************");
        System.out.println(v1.camparer(v2));
        System.out.println("**********************************************");
        System.out.println(cap.desVille());
        cap.setMonument("3asba");
        cap.setNomPays("9a7ba");
        cap.setNbrHabit(0);
        System.out.println(cap.desVille());


    }
        }
