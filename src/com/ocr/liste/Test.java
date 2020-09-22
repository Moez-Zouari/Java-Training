package com.ocr.liste;

import java.util.*;

public class Test {

    public static void main (String[]  args) {
        List l = new LinkedList();
        l.add(15);
        l.add("Toto");
        l.add(20.12f);

        for (int i = 0; i < l.size(); i++)
            System.out.println("L'element à l'indice " + i + " est " + l.get(i));

        System.out.println("\n  Parcour avec un itérateur");
        System.out.println("-------------------------------");
        ListIterator l1 = l.listIterator();
        while (l1.hasNext())
            System.out.println(l1.next());


        ArrayList l2 = new ArrayList();
        l2.add("Moez");
        l2.add(15);
        l2.add(20.12f);
        l2.add('A');
        System.out.println("\n  Parcour avec un Array List");
        System.out.println("-------------------------------");
        for (int i = 0; i < l2.size(); i++) {
            System.out.println("L'element à l'indice " + i + " est " + l2.get(i));
        }
        // l2.remove(0);
        //System.out.println(l2.get(0));
        //System.out.println(l2.contains("Moe"));
        System.out.println("\n  Parcour avec un Hashtable");
        System.out.println("-------------------------------");

        Hashtable ht = new Hashtable();
        ht.put('A',15);
        ht.put('B',136);
        ht.put("ak",'b');

        Enumeration e = ht.elements();

        while (e.hasMoreElements())
            System.out.println(e.nextElement());


        HashSet hs = new HashSet();
        hs.add("toto");
        hs.add(null);
        hs.add('d');

        Iterator it = hs.iterator();
        while(it.hasNext())
            System.out.println(it.next());

        System.out.println("\nParcours avec un tableau d'objet");
        System.out.println("-----------------------------------");

        Object[] obj = hs.toArray();
        for(Object o : obj)
            System.out.println(o);
    }
}
