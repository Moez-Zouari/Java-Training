package com.ocr.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestStream {
    public static void main (String[] args){
        List<Personne> listP = Arrays.asList(
                new Personne(1.80, 70, "A", "Nicolas", Couleur.BLEU),
                new Personne(1.56, 50, "B", "Nicole", Couleur.VERRON),
                new Personne(1.75, 65, "C", "Germain", Couleur.VERT),
                new Personne(1.68, 50, "D", "Michel", Couleur.ROUGE),
                new Personne(1.96, 65, "E", "Cyrille", Couleur.BLEU),
                new Personne(2.10, 120, "F", "Denis", Couleur.ROUGE),
                new Personne(1.90, 90, "G", "Olivier", Couleur.VERRON)


        );

        //---------------Parcours avec les streams--------------

       /* Stream<Personne> sp = listP.stream();
        sp.forEach(System.out::println);
        */

       //----------------Stream iterator avec limite-----------
      /*
       Stream.iterate(1, (x) -> x+1).forEach(System.out::println);
       Stream.iterate(1d, (x) -> x+1).limit(100).forEach(System.out::println);
       */


        //-----------------Stream Filtrage---------------------
       /* Stream<Personne> sp = listP.stream();
        sp.forEach(System.out::println);
        System.out.println("\n Aprés le filtrage");
        sp=listP.stream();
        sp.filter(x -> x.getPoids() <70).forEach(System.out::println);
        */

        //-----------------Stream Map -----------------------
       /* Stream<Personne> sp = listP.stream();
        sp.forEach(System.out::println);

        System.out.println("\n Aprés le filtrage et le map");
        sp = listP.stream();
        sp.filter(x -> (x).getPoids()<70).map(x -> x.getPoids()).forEach(System.out::println);

        */

        //-----------------Stream Reduce -----------------------
      /*  Stream<Personne> sp = listP.stream();
        sp.forEach(System.out::println);

        System.out.println("\n aprés le filtrage  et le map");
        sp = listP.stream();
        sp.filter(x -> (x).getPoids()<0).map(x -> x.getPoids()).forEach(System.out::println);
        System.out.println("\n aprés le filtrage  et le map et le reduce");
        sp =listP.stream();
        /*double sum = sp.filter(x -> x.getPoids() <70).map(x -> x.getPoids()).reduce(0.0d,(x,y) -> x+y);
        System.out.println(sum);


        Optional<Double>   sum = Optional.ofNullable(sp.filter(x -> x.getPoids() > 250).map(x -> x.getPoids()).reduce(0.0d, (x, y) -> x + y));
        System.out.println(sum.orElse(0.0));
        /*if (sum.isPresent())
            System.out.println(sum.get());
        else
            System.out.println("Aucun agrégat de poids");

         */

        //-----------------Count -----------------------
        /*Stream<Personne> sp = listP.stream();
        sp = listP.stream();
        long count = sp	.filter(x -> x.getPoids() > 50).map(x -> x.getPoids()).count();
        System.out.println("Nombre d'éléments : " + count);
         */

        //-----------------Collect -----------------------
        Stream<Personne> sp = listP.stream();
        sp = listP.stream();

        List<Double> ld = sp.filter(x -> x.getPoids() > 50)
                .map(x -> x.getPoids())
                .collect(Collectors.toList());
        System.out.println(ld);

        Stream<Personne> sr = listP.stream();
        sr=listP.stream();
        Optional<Object> lj = sr.findFirst().filter(x -> x.getPoids()<66).map(x -> x.getPoids());
        System.out.println(lj);


    }


}
