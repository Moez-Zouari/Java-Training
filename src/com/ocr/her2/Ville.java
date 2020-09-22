package com.ocr.her2;

public class Ville {

    protected String nomVille ;
    protected String nomPays ;
    protected   int nbrHabit ;
    protected char categorie;

    public Ville() {
        System.out.println("Création d'une ville vide \n");
        nomVille = "Inconnu";
        nomPays = "Inconnu";
        nbrHabit= 0;
        this.setCategorie();
    }

    public  Ville(String nv , String np , int nh) {
        System.out.println("Création d'une ville \n");
        nomVille = nv ;
        nomPays = np;
        nbrHabit = nh;
        this.setCategorie();
    }

    public String getNomVille() {
        return nomVille;
    }

    public void setNomVille(String nomVille) {
        this.nomVille = nomVille;
    }

    public String getNomPays() {
        return nomPays;
    }

    public void setNomPays(String nomPays) {
        this.nomPays = nomPays;
    }

    public int getNbrHabit() {
        return nbrHabit;
    }

    public void setNbrHabit(int nbrHabit) {
        this.nbrHabit = nbrHabit;
    }

    public void setCategorie() {
        int bornSup[] = {0,1000,10000,50000,100000,500000,1000000};
        char bornCar[] = {'?','A','B','C','D','E','F','J'};
        int i = 0;
        while (i<bornSup.length && this.getNbrHabit()>bornSup[i])
            i++;
        this.categorie=bornCar[i];

     }

     public String  camparer (Ville v1){
        String str ="";
        if(v1.getNbrHabit()>this.getNbrHabit())
            str = "La ville " +v1.getNomVille()+ " Avec un nombre d'ahbitant " +v1.getNbrHabit()+
                    " Est plus grande que " +this.getNomVille()+ " qui a " +this.getNbrHabit()+ " Habitants" ;
        else
            str = " La ville " +this.getNomVille()+ " Avec un nombre d'ahbitant " +this.getNbrHabit()+
                    " Est plus grande que " +v1.getNomVille()+ " qui a " +v1.getNbrHabit()+ " Habitants" ;

        return str;

     }




    public String decriToi (){
        return "Ville "
                + this.nomVille +
                " Situé en " + this.nomPays +
                " a comme habitants " + nbrHabit +
                " Elle appartient à la catégorie " + this.categorie;

    }

    @Override
    public String toString() {
        return "Ville "
                 + this.nomVille +
                " Situé en " + this.nomPays +
                " a comme habitants " + nbrHabit
                ;
    }
}
