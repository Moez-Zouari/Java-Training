package com.ocr.patternsStrategy;
@FunctionalInterface
public interface Soin {
    public void soigner();
    //public String toto(int i);
    public default String toto (int i){
        return  "Toute est OK !";
    }
}
