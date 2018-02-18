package com.brainacad.oop.testthread3;

import static com.brainacad.oop.testthread3.Storage.*;

public class Counter extends Thread {

    @Override
    public void run() {

        while (!interrupted() && (varStartInt < varEndInt)) {
            if (executeCounter) {
                varStartInt++;
                executeCounter = false;
                executePrinter = true;


            }
        }
    }
}
