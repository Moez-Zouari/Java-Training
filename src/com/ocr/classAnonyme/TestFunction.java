package com.ocr.classAnonyme;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class TestFunction {
    public static void main(String[] args) {

        List<Personne> lPersonne = Arrays.asList(
                new Personne(20, "Moez"),
                new Personne(50, "Ahmad"),
                new Personne(40, "Imed")
        );

        Function<Personne, String> f1 = (Personne p) -> p.getNom();
        Function<Personne, Integer> f2 = (Personne p) -> p.getAge() /** 2*/;
        Function<Integer, Integer> f3 = (Integer a) -> a * 2;
        System.out.println(transformToListString(lPersonne, f1));
        System.out.println(transformToListInt(lPersonne, f2.andThen(f3)));
    }

    public static List<Integer> transformToListInt(List<Personne> liste, Function<Personne, Integer> func) {

        List <Integer> ls = new ArrayList<>();
        for (Personne p :liste) {
            ls.add(func.apply(p));
        }
        return ls ;
    }

    private static List<String> transformToListString(List<Personne> liste, Function<Personne, String> func) {
        List<String> ls = new ArrayList<>();
        for (Personne p:liste){
            ls.add(func.apply(p));
        }
        return ls ;
    }


}
