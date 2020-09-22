package com.ocr.heritage;

import java.util.Objects;

public class Ville {



    protected String nomVille ;
    protected String nomPays;
    protected int nbreHabitant ;
    protected   char categorie;
    public static int nbrInstances;
    protected static int nbrInstancesBis;

public Ville() {
    System.out.println("Création d'une ville");
    nomVille = "Inconnu";
    nomPays = "Inconnu";
    nbreHabitant = 0 ;
    this.setCategorie();
    nbrInstances++;
    nbrInstancesBis++;


}

public Ville(String pVille , int pNbrehab , String pPays)
        throws NombreHabitantException, NomVilleException {
                if (pNbrehab < 0)
                         throw  new NombreHabitantException(pNbrehab);
                if (pVille.length()<3)
                        throw  new NomVilleException("Le nome de la ville est moin de 3 caractére" +  pVille);
                else {
                            System.out.println("Création d'une ville avec des paramétres");
                            nomVille = pVille;
                            nbreHabitant = pNbrehab;
                            nomPays = pPays;
                            this.setCategorie();
                            nbrInstances++;
                            nbrInstancesBis++;
                }
}

//************************* Getters *********************
    public String getNomVille(){
    return nomVille;
    }
    public String getNomPays(){
    return nomPays;
    }
    public int getNbreHabitant(){
    return nbreHabitant;
    }
    public char getCategorie(){
    return categorie;
    }
    public static int getNbrInstancesBis(){
    return nbrInstancesBis;
    }


    //************************** Setters *********************

    public void setNomVille(String pVille){
        nomVille = pVille;
    }
    public void setNomPays(String pPays){
         nomPays = pPays;
    }
    public void setNbreHabitant(int pNbrehab){
        nbreHabitant = pNbrehab;
    }

 private void setCategorie() {
    int bornesSuperieurs[] = {0,1000,10000,100000,500000,1000000,5000000,10000000};
    char categories[] = {'?','A','B','C','D','E','F','G','H'};
    int i=0;
    while (i<bornesSuperieurs.length && this.nbreHabitant > bornesSuperieurs[i])
        i++;
    this.categorie = categories[i];
 }

 public String toString()
 {
     return "\t" +this.nomVille+ " Est une ville qui a" +this.nbreHabitant+ " Habitants situé a " +this.nomPays+ " Elle est de categorie" +this.categorie;

 }



 //Retourne la description de la ville
    public String desVile(){
    return "\t"+this.nomVille+ " est une ville de " +this.nomPays+ " Comporte " +this.nbreHabitant+ " Habitant(s) elle est donc de catégorie : "+this.categorie;
    }

    //Comparer

    public String comparer (Ville v1){
    String str = new String();
    if (v1.getNbreHabitant()< this.getNbreHabitant())
        str = this.nomVille +" Est une ville peuplé que "+v1.getNomVille();
    else  str = this.nomVille +" Est une ville moin peuple que " +v1.getNomVille();
    return str;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ville ville = (Ville) o;
        return nbreHabitant == ville.nbreHabitant &&
                categorie == ville.categorie &&
                nomVille.equals(ville.nomVille) &&
                nomPays.equals(ville.nomPays);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomVille, nomPays, nbreHabitant, categorie);
    }
}
