package com.brainacad.oop.testthread3;

public class Counter1 extends Thread {
    private Storage1 storage1;

    public Counter1(Storage1 storage1) {
        this.storage1 = storage1;
    }

    @Override
    public void run() {

        while (!interrupted() && (storage1.getVarStartInt() < storage1.getVarEndInt())) {
            synchronized (storage1) {

                try {
                    storage1.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                storage1.setVarStartInt(storage1.getVarStartInt() + 1);
            }
        }



        /*while (!interrupted() && (varStartInt < varEndInt)) {
            synchronized (varStartInt) {
                varStartInt++;
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                printer1.notify();
            }
        }*/
    }
}
