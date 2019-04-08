package ru.itis;

public class MainRunnable {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("Hello");
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();

        ExecutorService service = new ExecutorService();
        service.submit(() -> {for (int i = 0; i < 100; i++) {}});
        service.submit(runnable);
        //
    }
}
