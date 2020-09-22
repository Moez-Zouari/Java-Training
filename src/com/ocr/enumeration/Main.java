package com.ocr.enumeration;

public class Main {
    public static void main (String[] args){
        for (Langage lang : Langage.values()){
            if (Langage.JAVA.equals(lang))
                System.out.println("J'aime " +lang);
            else
                System.out.println(lang);
        }
    }
}
