package com.ocr.patternsStrategy;
import com.ocr.patternsStrategy.comportement.*;

public abstract class Personnage {

    // Nos instance de comportements
    protected EspritCombatif espritCombatif = new Pacifiste();
    protected Soin soin = new AucunSoin();
    protected  Deplacement deplacer = new Marcher();

    // Constructeur par defaut
    public Personnage(){}

    //Constructeur avec parametre

    public Personnage(EspritCombatif espritCombatif, Soin soin , Deplacement deplacer){
        this.espritCombatif = espritCombatif;
        this.soin=soin;
        this.deplacer=deplacer;
    }

    //Methode de deplacement de personnage
    public void seDeplacer(){
        deplacer.deplacer();
    }

    //Methode de combat
    public void combattre(){
        espritCombatif.combat();
    }

    //Methode de soin
    public void soigne(){
        soin.soigner();
    }


    public void setEspritCombatif(EspritCombatif espritCombatif) {
        this.espritCombatif = espritCombatif;
    }

    public void setSoin(Soin soin) {
        this.soin = soin;
    }

    public void setDeplacer(Deplacement deplacer) {
        this.deplacer = deplacer;
    }
}



//************************* Prmiere partie sans pattern strategy ******************************
  /* protected String armes ="" , chaussures="", sacDeSoin="";

 public void seDeplacer(){
     System.out.println("Je me déplace à pied.");
 }
  public  void  combattre(){
      System.out.println("Je ne combats PAS !");
  }
    public void soigner(){
        System.out.println("Je ne soigne pas.");
    }

    public void setArmes(String armes) {
        this.armes = armes;
    }

    public void setChaussures(String chaussures) {
        this.chaussures = chaussures;
    }

    public void setSacDeSoin(String sacDeSoin) {
        this.sacDeSoin = sacDeSoin;
    }*/

