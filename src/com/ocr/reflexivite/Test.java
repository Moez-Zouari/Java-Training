package com.ocr.reflexivite;

import com.ocr.syntaxe.Methode;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test {

    public static void main (String[] args){
        //Création d'un object Classe
        Class c = String.class;
        Class c2 = new String().getClass();
        // Retourle nom de lasuper classe
        System.out.println("\n La super classe de la classe" +String.class.getName() +" est : "+ String.class.getSuperclass());

        //Retour la super classe
        Class c1 = Object.class;
        Class c3 = new Object().getClass();
        System.out.println("\n La super classe de la classe" +Object.class.getName() +" est : "+ Object.class.getSuperclass());

        //Connaitre la liste des interfaces d'une classe
        Class c4 = new String().getClass();
        Class[] faces = c4.getInterfaces();
        System.out.println("\n Il y'a " + faces.length + " Interfaces implementées");
        for (int i=0 ; i<faces.length;i++)
            System.out.println(faces[i]);

        //Connaitre la liste des methodes d'une classe
        Method[] m = c4.getMethods();
        System.out.println("\n Il y'a " + m.length + " méthde dans cette classe ");
        for (int i=0 ; i<m.length;i++) {
            System.out.println(m[i]);

            //Connaitre les parametres et leurs arguments respectifs
            Class[] p = m[i].getParameterTypes();
            for (int j=0 ; j< p.length ; j++)
                System.out.println(p[j].getName());
            System.out.println("----------------------------------");
            }
/*
        //Connaitre la liste des champs (variable de classe ou d'instances)
        Field[] o = c.getDeclaredFields();
        System.out.println("\n Il y'a " + o.length + " champs dans cette classe ");
        for (int i=0 ; i<m.length;i++)
            System.out.println(o[i].getName());

 */

        //Connaitre la liste des constructeurs
        Constructor[] construct = c.getConstructors();
        System.out.println("\n Il y'a " + construct.length + " constructeurs dans cette classe ");
        for (int i=0 ; i<construct.length;i++) {
            System.out.println(construct[i].getName());

            Class[] param = construct[i].getParameterTypes();
            for (int j = 0; j < param.length; j++)
                System.out.println(param[j]);
            System.out.println("----------------------------------");
        }





        }
}
