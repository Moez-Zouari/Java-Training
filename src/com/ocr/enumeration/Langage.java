package com.ocr.enumeration;

public enum Langage {
    //Objets directement construits
    JAVA ("Langage JAVA","Eclipse"),
    C ("Langage C","Code Block"),
    CPlus ("Langage C++","Visual Studio"),
    PHP ("Langage PHP","PS Pad");

    private String name = "";
    private String editor = "";


    //Constructeur
    Langage(String name, String editor){
        this.name = name;
        this.editor = editor;
    }

    public void getEditor() {
       System.out.println("Editeur " +editor);
    }

    public String toString(){
        return name;
    }

    public static void main (String[] args){
        Langage l1 = Langage.JAVA;
        Langage l2 = Langage.PHP;
       // System.out.println("Editeur " +l1.getEditor());
        //System.out.println("Editeur " +l2.getEditor());
        l1.getEditor();
        l2.getEditor();
    }
}
