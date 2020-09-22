package com.ocr.exception;


public class Test {
   /* public static void main (String[] args){
        int i=20,j=0,d;
       try {
           System.out.println(i / j);
       } catch (ArithmeticException e) {
          // System.out.println("Division par Zero");
           System.out.println("Division par zéro !" + e.getMessage());}
       System.out.println("Coucou");
       }

    */


    public static void main(String[] args){
        try {
            System.out.println(" =>" + (1/0));
        } catch (ClassCastException e) {
            e.printStackTrace();
        }
        finally{
            System.out.println("action faite systématiquement");
        }
    }
    }

