package com.ocr.syntaxe;

import java.util.Scanner;

public class Methode {

    //------------------------------- MAJ to MIN------------------------------------
    /*
    public static void main (String[] args){
        String chaine =new String("BONJOUR MOEZ"), chaine2 = new String();
        chaine2= chaine.toLowerCase();
        System.out.println(chaine2);
    }
*/
    //------------------------------- MIN TO MAJ ------------------------------------
    /*
    public static void main (String[] args){
        String chaine =new String("bonjour moez"), chaine2 = new String();
        chaine2= chaine.toUpperCase();
        System.out.println(chaine2);
    }
     */

    //------------------------------- Longuer du chaine ou tableau ------------------------------------
    /*
    public static void main (String[] args){
        String chaine =new String("bonjour moez  !"); int taille;
      taille = chaine.length();
        System.out.println("La longuer du chaine est " +taille);
    }
     */


    //------------------------------- Longuer du chaine ou tableau ------------------------------------
/*
    public static void main (String[] args){
        String chaine = new String(), chaine2 = new String();
        Scanner ch1 = new Scanner(System.in);
        Scanner ch2 = new Scanner(System.in);
        do{
        System.out.println("Donner une chaine caractere");
        chaine = ch1.nextLine();}
        while (chaine.length() == 0);

        do {
        System.out.println("Donner une deuxieme chaine caractere");
        chaine2 = ch2.nextLine();}
        while (chaine2.length() == 0);

        if (!chaine.equals(chaine2))
        System.out.println("Les chaines saisis sont identique ");
        else System.out.println("les 2 chaines saisis ne sont pas identique");
    }
*/
//------------------------------- SUBSTRING DE 2 chaine ------------------------------------
/*
    public static void main (String[] args){
        String chaine =new String("Salut Labes ?"), chaine2 = new String() ;
     chaine2 = chaine.substring(5, chaine.length());
        System.out.println(chaine + "Resultat" +chaine2);
    }
 */
//------------------------------- indexof------------------------------------
/*
    public static void main (String[] args){
        String chaine =new String("Bonjour Monsieur Moez");
        int n;
        n = chaine.lastIndexOf("si");
        System.out.println(n);
    }
 */
//------------------------------- Math-----------------------------------
/*
    public static void main (String[] args){
       double X , d=2 ;
       X = Math.random();
       System.out.println(X);
        double sin = Math.sin(X);
        System.out.println("Sinus  :  " +sin);
        double cos = Math.cos(X);
        System.out.println("Cosinus +  : " +cos);
        double tan = Math.tan(X);
        System.out.println("Tangante+  : " +tan);
        double abs = Math.abs(-120.25);
        System.out.println("Valeu absolu : " +abs);
        double exp = Math.exp(d,2);
        System.out.println("Exponetielle de  " +d+ "  Par 2 =  : " +exp);
    }
*/
/*
    public static void main (String[] args)
    {
        String[] tab = {"toto", "tata", "titi", "tete"};
       parcourirTableau(tab);
       System.out.println(toString(tab));
    }

    //--------------------Fonction Parcourir Tableau -------------------------
     static  void parcourirTableau(String[] tab)
     {
         for (int i=0 ; i< tab.length ; i++)
             System.out.println(tab[i]);
     }

    static String toString(String[] tab)
    {
        System.out.println("Méthode toString() !\n----------");
        String retour = "";

        for(String str : tab)
            retour += str + "\n";

        return retour;
    }
    */


}
