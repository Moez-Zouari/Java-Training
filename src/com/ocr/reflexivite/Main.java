package com.ocr.reflexivite;

import com.ocr.syntaxe.Methode;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main (String[] args){

        String nom = Paire.class.getName();
        System.out.println(nom.getClass());
        try {

            //On crée un objet class
            Class cl= Class.forName(nom);
            // Nouvelle instance de la classe partie
            Object o = cl.newInstance();
            // On Crée les paramétres du constructeur
            Class[] types = new Class[]{String.class, String.class};
            //On recpére le constructeur avec les deux paramétre
            Constructor ct = cl.getConstructor(types);
            //On instancie l'objet avec mes constructeur surchargé
            Object o2 = ct.newInstance(new String[]{"Moez", "Majdi"});

            //On va chercher la methode toString, elle n'a aucun parametre
            Method m  = cl.getMethod("toString",null);
            //La méthode invoke exécute la méthode sur l'objet passé en paramètre
            //Pas de paramètre, donc null en deuxième paramètre de la méthode invoke !
            System.out.println("----------------------------------------");
            System.out.println("Méthode " + m.getName() + " sur o2: " +m.invoke(o2, null));
            System.out.println("Méthode " + m.getName() + " sur o: " +m.invoke(o, null));


        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
