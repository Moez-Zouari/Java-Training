package com.ocr.syntaxe;

public class Chapitre2{


   //-----------------Somme et variable arithmetique ----------------------------------------------------
    /*
    public static void main (String [] args ){
        int resultat ;
        int i=14;
        int f=3;
        i--;
        resultat = i%f ;
        System.out.println("a ="+ i +", b ="+ f);
        System.out.println("le reste de division de "+i+" par "+f+" egale à "+ resultat);

    }
    */

    //---------------------------------- Conversion CAST 1 --------------------------------------------------
   /*
   //Résultat incorrecte = 1 et non 1.5 car il conserve la valeur de division comme de entiers
   public static void main (String [] args )
   {
       int nbr1 =3;
       int nbr2=2;
       double resultat = (double)(nbr1/nbr2);
       System.out.println("a ="+ nbr1 +", b ="+ nbr2);
       System.out.println("Resultat "+nbr1+" divisé par "+nbr2+" egale à "+ resultat);

   }
   */


//------------------------------ Conversion Cast 2 ----------------------------------------------
// Resultat Correcte il faut convertir chaque variable à part pour a voir 1.5 comme résultat
 /*
    public static void main (String [] args ){
        int nbr1 =3;
       int nbr2=2;
       double resultat = (double)(nbr1)/(double)(nbr2);
        System.out.println("a ="+ nbr1 +", b ="+ nbr2);
        System.out.println("Resultat "+nbr1+" divisé par "+nbr2+" egale à "+ resultat);

    }

  */


//------------------------------ Conversion Cast 3 entier en String  ----------------------------------------------

/*
    public static void main (String [] args ){
        int i = 3;
        String j = new String();
        j = j.valueOf(i);

     System.out.println("Resultat en chaine de caractere egale "+j);
     System.out.println("On reviens au début");

     int k = Integer.valueOf(j).intValue();
     int rslt = k +3 ;
     System.out.println("Valeu 1= "+i+ " Addition de 3 egale ="+rslt);

    }


*/




}
