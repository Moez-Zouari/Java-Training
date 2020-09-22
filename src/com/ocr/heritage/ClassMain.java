package com.ocr.heritage;

public class ClassMain {

//********************************************* ESSAI 1 ************************************************

public static void main (String[] args) {
    //Ville ville = new Ville();

    Ville ville1 = null;
         try {
        ville1 = new Ville("Mr", -2, "France");

    } catch (NombreHabitantException | NomVilleException e2) {
        System.out.println(e2.getMessage()); }
     finally{
        if(ville1 == null)
            ville1 = new Ville();
    }
    System.out.println(ville1.toString());

/*
    Ville ville2 = null;
    try {
        ville2 = new Ville("Sf", -1, "Tunisie");

    } catch (NombreHabitantException e) {
    } catch (NomVilleException e2) {
       System.out.println(e2.getMessage());
    }
    finally{
        if(ville2 == null)
            ville2 = new Ville();
    }
    System.out.println(ville2.toString());

 */


    // com.ocr.Heritage.Ville ville3 = new com.ocr.Heritage.Ville("Tokyo", 10002154, "Japan");
    // com.ocr.Heritage.Capital cap = new com.ocr.Heritage.Capital();
    //com.ocr.Heritage.Capital cap1 = new com.ocr.Heritage.Capital("Paris", 654987, "France", "la tour Eiffel");
    // System.out.println("\n"+cap1.desVile());
    /*
Ville[] tableau = new Ville[6];
String[] tab = {"Sfax","Gafsa","Sousse","Nabeul","Bizert","Tunis"};
int[]  tab2 = {1000,-2,100000,20000,45121,12364};

for (int i=0 ; i < tableau.length ; i++) {
    if (i < 3) {

        //Ville v = null;
        Ville v = null;
        try {
            v = new Ville(tab[i], tab2[i], "Tunisie");
        } catch (NombreHabitantException e) {
            e.printStackTrace();
        }

        tableau[i] = v;

    } else {
        Capital c = null;
        try {
            c = new Capital(tab[i], tab2[i], "Tunisie", "Sidi bousaid");
        } catch (NombreHabitantException e) {
            e.printStackTrace();
        }
        tableau[i] = c;

    }

}
    for(Object v : tableau){
        System.out.println(((Ville)v).desVile()+"\n");
    }
    /*
    for (int j=0 ; j<tableau.length ;j++) {
        System.out.println(tableau[j].toString()+ "\n");
    }


     */


/*
    System.out.println("\n v = " + ville.getNomVille() + " ville de " + ville.getNbreHabitant() + "  Habitants se situant en " + ville.getNomPays());
    System.out.println("v1 = " + ville1.getNomVille() + " ville de " + ville1.getNbreHabitant() + " Habitants se situant en " + ville1.getNomPays());
    System.out.println("v2 = " + ville2.getNomVille() + " com.ocr.Heritage.Ville de " + ville2.getNbreHabitant() + " Habitants se situant en " + ville2.getNomPays());
    System.out.println("v3  = " + ville3.getNomVille() + " ville de " + ville3.getNbreHabitant() + " Habitants se situant en" + ville3.getNomPays() + "\n\n");

    com.ocr.Heritage.Ville temp = new com.ocr.Heritage.Ville();

    temp = ville1;
    ville1 = ville2;
    ville2 = temp;

    System.out.println("*********************** Apres prémutation ************************");
    System.out.println("v1 = " + ville1.getNomVille() + " ville de " + ville1.getNbreHabitant() + " Habitants se situant en " + ville1.getNomPays());
    System.out.println("v2 = " + ville2.getNomVille() + " com.ocr.Heritage.Ville de " + ville2.getNbreHabitant() + " Habitants se situant en " + ville2.getNomPays() + "\n \n");

    //Changer les noms par les mutateur

    ville1.setNomVille("Hing Kong");
    ville1.setNomPays("Chine");
    ville1.setNbreHabitant(100020000);
    System.out.println("*********************** Apres Changement de ligne  ************************");
    System.out.println("v1 = " + ville1.getNomVille() + " ville de " + ville1.getNbreHabitant() + " Habitants se situant en " + ville1.getNomPays() + "\n \n");

    System.out.println(ville1.desVile());
    System.out.println(ville.desVile());
    System.out.println(ville2.desVile());
    System.out.println(ville1.comparer(ville2));

    System.out.println(ville.getNomVille());
    ville.setNomVille("Sfax") ;
    System.out.println(ville.getNomVille());
    System.out.println(ville1.getNomVille());

*/

}



}
