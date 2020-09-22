package com.ocr.patternsStrategy;

public class Sniper extends Personnage {

    public Sniper(){
        //this.espritCombatif= new CombatPistolet();
      //  this.deplacer = new Courir() ;
        }


        public Sniper(EspritCombatif espritCombatif, Soin soin, Deplacement deplacement){
        super(espritCombatif,soin,deplacement);
        }
    //le sniper peut utiliser son fusil de sniper ainsi qu'un fusil à pompe ;
/*
    public void combattre() {
        if (this.armes.equals("sniper"))
            System.out.println("Attaque au fusil de sniper");
        else System.out.println("Attaque a fusil à pompe");
    }*/

}
