package ru.itis;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        EggThread eggThread = new EggThread();
        HenThread henThread = new HenThread();

        eggThread.start();
        henThread.start();

        eggThread.join();
        henThread.join();
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread() + " " + "Человек");
        }
    }
}
