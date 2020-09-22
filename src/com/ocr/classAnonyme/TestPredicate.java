package com.ocr.classAnonyme;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class TestPredicate {

    public static void main (String[] args){
        List<Personne> lpersonne = Arrays.asList(
                new Personne(50,"Moez"),
                new Personne(25 , "Hammadi"),
                new Personne(15 , "amir")
        );

        Predicate<Personne> predicate = (Personne p ) -> p.getAge() <20 ;
        for(Personne p : lpersonne){
            if (predicate.test(p))
                System.out.println(p.getNom() + "a l'age requis");
        }

    }
}
