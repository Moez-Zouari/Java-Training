package com.ocr.genericité;

/*public class Solo {
    private Object valeur ;

    public void setValeur(Object valeur) {
        this.valeur = valeur;
    }

    public Object getValeur() {
        return valeur;
    }

    public Solo(Object valeur) {
        this.valeur = valeur;
    }


}

 */

public class Solo<T> {

    private T valeur ;

    public Solo(){
        this.valeur = null ;
    }

    public void setValeur(T valeur) {
        this.valeur = valeur;
    }

    public Solo(T valeur) {
        this.valeur = valeur;
    }

    public T getValeur() {
        return valeur;
    }
}