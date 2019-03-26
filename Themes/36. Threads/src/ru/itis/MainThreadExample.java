package ru.itis;

public class MainThreadExample {

    public static void main(String[] args) throws InterruptedException {
        Thread mainThread = Thread.currentThread();
        System.out.println(mainThread.getName());
        Thread.sleep(5000);
        System.out.println("End of sleep");
    }
}
