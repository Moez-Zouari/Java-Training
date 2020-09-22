package com.ocr.thread;

public class CompteEnBanque {
    private int solde = 15 ;

    public int getSolde() {
        if (this.solde < 0)
            System.out.println("Vous étes à decouvert !");
        return this.solde;
    }
    public synchronized void retraitArgent (int retrait){
        solde = solde - retrait ;
        System.out.println("Solde = " +solde);

    }

}
