package com.ocr.syntaxe;

import java.util.Scanner;

public class Boucle {
/*
    public static void main (String[] args)
    {
     // Intialiser variable prenom vide
        String prenom ;
        //Intialiser variable caractére à 0 = oui
        char carac ='O';
        // definir variable d'entrer clavier
        Scanner sc = new Scanner(System.in) ;

        while (carac == 'O')
        {
            System.out.println("Vueillez saisir votre prénom SVP");
            prenom = sc.nextLine();
            System.out.println("Bonjour "+ prenom);
            carac=' ';
            while (carac != 'O' && carac != 'N')
            {
                System.out.println("Voulez vous resaisir votre prénom O/N");
                carac = sc.nextLine().charAt(0);
            }


        }
        System.out.println("Au revoir");

    }

 */

/*
public  static void main (String[] args)
{
    int a =1 , b=15 ;
    while (a <= b)
    {
        System.out.println("Coucou "+ a +" Fois");
       a++;
    }
System.out.println("Ciao BB");
}
 */
/*
       public static void main (String[] args)
            {
                String prenom;
                Scanner sc = new Scanner(System.in);
                char carac;

                do {
                    System.out.println("Vueillez Saisir votre Prénom");
                    prenom = sc.nextLine();
                    System.out.println("Salut Monisuer/Madame " + prenom);

                    do {
                        System.out.println("Voulez vous refaire O/N ??");
                        carac = sc.nextLine().charAt(0);
                    }
                    while (carac != 'O' && carac != 'N');
                }
                    while (carac == 'O');
System.out.println("Aurevoire");

            }

 */
public static void main (String[] args)
{
  int i;
  Scanner sc = new Scanner(System.in);
  do {
      System.out.println("Donnez un nombre compris entre 10 et 20 ");
      i = sc.nextInt();}
  while (i>20 || i<10);
  System.out.println("Merci pour votre saisie");
    System.out.println("***********************************************************************");
    for(int j=0; j<=i ; j++)
    {
        System.out.println("C'est la ligne numéro "+j);
    }

}
}
