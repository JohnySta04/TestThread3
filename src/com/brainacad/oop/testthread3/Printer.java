package com.brainacad.oop.testthread3;

import static com.brainacad.oop.testthread3.Storage.*;

public class Printer extends Thread {

    @Override
    public void run() {

        while (!interrupted() && (varStartInt < varEndInt)) {
            if (executePrinter) {
                System.out.println(varStartInt);
                executePrinter = false;
                executeCounter = true;

/*
               try {

                    Thread.sleep(1000);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
*/

            }
        }
    }
}
