package com.ocr.classAnonyme;


import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class TestConsummer {

    public static void main (String[] args){
        List<Personne> lpersonne = Arrays.asList(
             new Personne(40,"Moez"),
             new Personne(25,"Ahmad"),
             new Personne(80, "Hajj")
        );

        Consumer<Personne> consumer = (Personne p) -> p.getAge();
        for (int i = 0; i < lpersonne.size(); i++) {
            System.out.print(lpersonne.get(i).getNom() + " " + lpersonne.get(i).getAge()+ ", ");
        }
        System.out.println();
    }

    
}
