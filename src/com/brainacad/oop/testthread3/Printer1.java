package com.brainacad.oop.testthread3;

public class Printer1 extends Thread {

    private Storage1 storage1;

    public Printer1(Storage1 storage1) {
        this.storage1 = storage1;
    }

    @Override
    public void run() {

        while (!interrupted() && (storage1.getVarStartInt() < storage1.getVarEndInt() - 1)) {
            try {
                Thread.sleep(1);
                synchronized (storage1) {
                    System.out.println(storage1.getVarStartInt());
                    //               msg.notify();
                    storage1.notify();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
