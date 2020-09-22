package com.ocr.syntaxe;

import java.util.Scanner;

public class Tableaux {

    public static void main(String[] arsg) {

        int tableauEntier[] = new int[10], n, k, j = 0;
        char carac ;
        boolean rslt = false ;
        Scanner sc = new Scanner(System.in);

        // com.ocr.syntaxe.Condition taille tableau
        do  {
            System.out.println("Vueillez saisir la taille du tableau entre 5 et 10");
            n = sc.nextInt();
            }
        while (n < 5 || n > 10);

        // Saisi des entier qui doivent étre positive
        for (int i = 0; i < n; i++) {
            do {
                Scanner rc = new Scanner(System.in);
                System.out.println("Saisir un nombre positive");
                int a = rc.nextInt();
                tableauEntier[i] = a;
                if (tableauEntier[i] < 1)
                    System.out.println("On accepte que les nombre positive , resaisir le nombre");
            }
            while (tableauEntier[i] < 1);
        }
        System.out.println("Vous avez rempli votre tableau correctement");



                     for (int i =0; i<n ; i++){
                         System.out.println("**************************************************************");
                         System.out.println("La valeur de la case" +i+ "est égale à : "+tableauEntier[i]);
                         System.out.println("**************************************************************");
                     }



                     // Resaisi de tt le traitement
        do {
                // Saisie du nombre à chercher q'uil doit étre positive
            do {
                System.out.println("Vueillez Saisir un nombre positive à chervher");
                Scanner rc = new Scanner(System.in);
                k = rc.nextInt();
                if (k < 1)
                    System.out.println("On accepte que les nombre positive , resaisir le nombre");
            }
            while (k < 1);


            // Verifier l'existance du nombre à chercher
            for (j = 0; j < tableauEntier.length; j++) {
                if ( tableauEntier[j] == k )
                rslt = true;
            }



            // Affichage du resultat de la recherche
            if (rslt){
                System.out.println("Le nombre à chercher est trouver");
                rslt = false; }
            else
                System.out.println("Le nombre à chercher n'est pâs trouver");



            // Esayer un nouveau recherche
            do {
                Scanner rj = new Scanner(System.in);

                System.out.println("Voulez vous essayer de nouveau O/N");
                carac = rj.nextLine().charAt(0);

            } while (carac != 'O' && carac != 'N');

        }while (carac == 'O');
    }


/*
        int premiersNombres[][] = {{0, 2, 4, 6, 8}, {1, 3, 5, 7, 9}};

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(premiersNombres[i][j]);
            }
            System.out.println("");
        }*/
       /*
        String tab[][]={{"toto", "titi", "tutu", "tete", "tata"}, {"1", "2", "3", "4"}};
        int i = 0, j = 0;

        for(String sousTab[] : tab)
        {
            i = 0;
            for(String str : sousTab)
            {
                System.out.println("La valeur de la nouvelle boucle est  : " + str);
                System.out.println("La valeur du tableau à l'indice ["+j+"]["+i+"] est : " + tab[j][i]);
                i++;
            }
            j++;
        }

        */
/*
       int premierNombre [][] = {{0,2,4,6,8},{1,3,5,7,9}}, i=0 , j=0;
       while (i<2){
           j=0;
           while (j<5){
               System.out.print(premierNombre[i][j]);
               j++;
           }
           System.out.println(" ");
           i++;
       }
*/
/*
String tab[][] ={{"1","2","3","4","5"},{"Moez","Ahmad","Hamadi","Mouna"}};
int i=0, j=0;
     for  (String sousTab[] : tab){
         j=0;
         for (String str : sousTab){
             System.out.println("La valeur de la nouvelle boucle est " + str);
             System.out.println("La valeur du tableau à l'indire["+i+"]["+j+"] est"+ tab[i][j]);
             j++;
         }
         i++;
     }
     */


    }








