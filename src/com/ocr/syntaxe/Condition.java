package com.ocr.syntaxe;

import java.util.Scanner;

public class Condition
{
    /*------------------------------- Lire l'entrer a condition une seule fois ---------------
    public static void main (String[] args)
    {
        System.out.println("Vueillez Saisir un chiffre entre -10 et 10");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        if ((i > 10 ) || (i< -10))
        {
            //sc.nextInt();
            System.out.println("L'intervalle saisi est faux");
            System.out.println("Vueillez Saisir un nouveau chiffre entre -10 et 10");
            i = sc.nextInt();
        }


            if (i < 0)
                 System.out.println("Le nombre est négative");
            else System.out.println("Le nombre est positive");

    }

     */
//-------------------------------------------- Elese  ---------------------------------------------------
    /*
    public static void main (String [] args)
    {
        System.out.println("Saisir un chiffre");
        Scanner sc= new Scanner(System.in);
        int i = sc.nextInt();
        if (i<0)
            System.out.println("Le nombre saisi est négative");
        else {
            if (i==0)
                System.out.println("Le nombre saisi est nulle");
            else
                System.out.println("Le nombre saisi est positive");
             }
    }
    */

    //-------------------------------------------- Elese IF ---------------------------------------------------

    /*
    public static void main (String [] args)
    {
        System.out.println("Saisir un chiffre");
        Scanner sc= new Scanner(System.in);
        int i = sc.nextInt();

        if (i<0)
                System.out.println("Le nombre saisi est négative");
        else if (i==0)
                System.out.println("Le nombre saisi est nulle");
        else
                System.out.println("Le nombre saisi est positive");
    }
    */

    //-------------------------------------------- Elese IF & SWITCH ---------------------------------------------------
    public static void main (String[] args)
    {
        int mois ;
        System.out.println("Vueillez saisir un chiffre entre 1 et 12");
        Scanner sc = new Scanner(System.in);
        mois = sc.nextInt();
       /* if  ((mois < 1)||(mois>12))
        {
            System.out.println("Le chiffre saisi est hors intervalle");
        }*/

        switch (mois)
        {
            case 1:
                System.out.println("C'est le mois de Janvier");
                break;
            case 2:
                System.out.println("C'est le mois de Février");
                break;
            case 3:
                System.out.println("C'est le mois de Mars");
                break;
            case 4:
                System.out.println("C'est le mois de Avril");
                break;
            case 5:
                System.out.println("C'est le mois de Mai");
                break;
            case 6:
                System.out.println("C'est le mois de Juin");
                break;
            case 7:
                System.out.println("C'est le mois de Juillet");
                break;
            case 8:
                System.out.println("C'est le mois de Aout");
                break;
            case 9:
                System.out.println("C'est le mois de Septembre");
                break;
            case 10:
                System.out.println("C'est le mois de Octobre");
                break;
            case 11:
                System.out.println("C'est le mois de Novembre");
                break;
            case 12:
                System.out.println("C'est le mois de Décembre");
                break;
            default:
                System.out.println("7el 7boubek");

        }

    }




}
