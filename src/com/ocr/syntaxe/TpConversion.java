package com.ocr.syntaxe;

import java.util.Scanner;

public class TpConversion {

    public static void main (String[] args) {
        double deg, rs;
        char rep='O' , choix;

       // Scanner sv = new Scanner(System.in);

        System.out.println("Convertisseur celsius et Fahraneit degré");
        System.out.println("-----------------------------------------");

       while (rep == 'O') {
       // do {
            // Verification du choix de conversion
            do {
                Scanner sc = new Scanner(System.in);
                System.out.println("Choisssisez la mode de conversion");
                System.out.println("1 : Convertisseur Celsius en Fahraneit");
                System.out.println("2 : Convertisseur Fahraneit en Celsius");
                choix = sc.nextLine().charAt(0);
            }
            while (choix != '1' && choix != '2');

            //Verification du choix de température à convertir
            do {
                Scanner sc = new Scanner(System.in);
                System.out.println("Vueillez Saisir la temperature à convertir");
                System.out.println("El doit étre entre -100° et 100°");
                deg = sc.nextInt();
            }
            while (deg > 100 || deg < -100);

            // Traitement de la conversion
            if (choix == '1') {
                rs = ((9.0 / 5.0 * deg) + 32.0);
                System.out.println(deg + "°C correspond à " + rs + "°F");
            }
            else{
                rs = (((deg - 32) * 5) / 9);
                System.out.println(deg + "°F correspond à " + rs + "°C");
            }


            // Refaire la conversion s'il veut

            do {
                Scanner sc = new Scanner(System.in);
                System.out.println("Voulez-vous convertir de nouveau ? O/N");
                rep = sc.nextLine().charAt(0);
            } while (rep != 'O' && rep != 'N');

        }// while (rep == 'O');
        System.out.println("Merci et aurevoir !!");
    }
}








