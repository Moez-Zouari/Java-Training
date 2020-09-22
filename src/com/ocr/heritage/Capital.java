package com.ocr.heritage;

public class Capital extends Ville {
    private String monument;
    public Capital() {
        super();
        monument="aucun";
    }


    public Capital (String nom , int hab, String pays, String monument) throws NombreHabitantException, NomVilleException {
            super(nom,hab,pays);
            this.monument = monument;
    }

    public String desVile(){
        String str = super.desVile()+"\t \n ==>> " +this.monument+ " Est un monument";
        return str;
    }

    public String toString(){

        return "\t" +super.toString()+ "\n\t" +this.monument + " Est un monument" ;
    }


    public String getMonument() {
        return monument;
    }

    public void setMonument(String monument) {
        this.monument = monument;
    }
}
