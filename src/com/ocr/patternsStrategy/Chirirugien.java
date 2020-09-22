package com.ocr.patternsStrategy;
import com.ocr.patternsStrategy.comportement.*;
public class Chirirugien extends Personnage {

//le chirurgien a une grosse trousse médicale, mais ne peut pas utiliser d'arme ;

   public Chirirugien(){
       this.soin = new Operation();
       this.deplacer = new Marcher();
   }

   public Chirirugien (EspritCombatif espritCombatif, Soin soin, Deplacement deplacement){
       super(espritCombatif,soin,deplacement);
   }

    /*public void soigner(){
        if (this.sacDeSoin.equals("gros sac"))
        System.out.println("Je fais des merveilles");
        else  System.out.println("Je fais des opérations.");
    }*/
}
