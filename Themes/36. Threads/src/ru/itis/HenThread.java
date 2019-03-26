package ru.itis;

public class HenThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + "Курица");
        }
    }
}
