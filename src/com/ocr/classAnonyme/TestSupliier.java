package com.ocr.classAnonyme;
import java.util.function.Supplier;

public class TestSupliier {
    public static void main(String[] args) {
      Supplier<String> s1 = () -> new String("hello !");
        System.out.println(s1.get());
        Supplier<Personne> s2 = () -> new Personne(50, "Dédé");
        System.out.println(s2.get().getAge()+"   "+ s2.get().getNom() );
    }
}
