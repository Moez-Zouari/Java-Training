package com.ocr.patternsStrategy;
import com.ocr.patternsStrategy.comportement.*;

public class Guerrier extends Personnage {

    public Guerrier(){
    this.espritCombatif = new CombatCouteau();

    }

    public Guerrier (EspritCombatif espritCombatif,Soin soin,Deplacement deplacement){
        super(espritCombatif,soin,deplacement);
    }



    /*public void combattre() {
        if(this.armes.equals("pistolet"))
            System.out.println("Attaque au pistolet");
        else if (this.armes.equals("couteau"))
            System.out.println("Attaque au couteau");
        else
            System.out.println("Attaque au fusil de sniper");
    }*/


}
