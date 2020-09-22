package com.ocr.patternsStrategy;

public class Civil extends Personnage {
//le civil, quant à lui, peut utiliser un couteau seulement quand il en a un ;
public Civil(){
}

public Civil(EspritCombatif espritCombatif,Soin soin,Deplacement deplacement){
    super(espritCombatif,soin,deplacement);
}

    /*public void combattre() {
        if(this.armes.equals("Couteau"))
            System.out.println("Attaque au couteau");
        else System.out.println("je ne combat pas");
    }*/


}
