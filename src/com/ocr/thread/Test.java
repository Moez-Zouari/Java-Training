package com.ocr.thread;

public class Test {
    public static void main(String[] args){
        //System.out.println("Le nom thread principal est " + Thread.currentThread().getName());
        TestThread t = new TestThread("A");
        TestThread t2 = new TestThread(" B", t);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Statut du Thread " + t.getName() + " = " + t.getState());
        System.out.println("Statut du Thread " + t2.getName() + " = " + t2.getState());
    }
}
