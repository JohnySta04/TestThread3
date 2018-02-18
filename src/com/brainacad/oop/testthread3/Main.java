package com.brainacad.oop.testthread3;

import static com.brainacad.oop.testthread3.Storage.*;

public class Main {
    public static void main(String[] strings) {
        System.out.println("******************************************");
        System.out.println("Labwork 2.17.5.1 ");
        System.out.println("--------------------------------------------");

        Printer printer = new Printer();
        Counter counter = new Counter();

        printer.start();
        counter.start();

        try {
            printer.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("******************************************");


        System.out.println("Labwork 2.17.5.2 ");
        System.out.println("--------------------------------------------");

        Storage1 storage1 = new Storage1();

        Printer1 printer1 = new Printer1(storage1);
        Counter1 counter1 = new Counter1(storage1);

        printer1.start();
        counter1.start();


        try {
            counter1.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        printer1.interrupt();
        System.out.println("******************************************");


    }
}