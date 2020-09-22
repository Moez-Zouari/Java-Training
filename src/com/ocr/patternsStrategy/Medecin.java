package com.ocr.patternsStrategy;
import com.ocr.patternsStrategy.comportement.*;
public class Medecin extends Personnage {

//le médecin a une trousse simple pour soigner, mais peut utiliser un pistolet ;

    public Medecin(){
        this.soin = new PremierSoin();
        this.deplacer = new Courir();
        this.espritCombatif = new CombatCouteau();
    }

    public Medecin(EspritCombatif espritCombatif,Soin soin,Deplacement deplacement){
        super(espritCombatif,soin,deplacement);}



    /*public void combattre() {
        if(this.armes.equals("pistolet"))
        System.out.println("Attaque au pistolet");
        else System.out.println("Vive le scalpel !");
    }

    public void soigner(){
        if (this.sacDeSoin.equals("trousse"))
            System.out.println("Je résoudre les blessures.");

       else System.out.println("Je soigne les blessures.");
    }*/
}
