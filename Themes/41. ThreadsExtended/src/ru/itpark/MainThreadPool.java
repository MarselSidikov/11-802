package ru.itpark;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainThreadPool {
    public static void main(String[] args) {
//        ThreadPool threadPool = new ThreadPool(3);
//
//        threadPool.submit(() -> {
//            for (int i = 0; i < 1000; i++) {
//                System.out.println(Thread.currentThread().getName() + " A");
//            }
//        });
//
//        threadPool.submit(() -> {
//            for (int i = 0; i < 1000; i++) {
//                System.out.println(Thread.currentThread().getName() + " B");
//            }
//        });
//
//        threadPool.submit(() -> {
//            for (int i = 0; i < 1000; i++) {
//                System.out.println(Thread.currentThread().getName() + " C");
//            }
//        });

        ExecutorService service = Executors.newFixedThreadPool(5);

        service.submit(() -> {
            for (int i = 0; i < 1000; i++) {
                System.out.println(Thread.currentThread().getName() + " A");
            }
        });

        service.submit(() -> {
            for (int i = 0; i < 1000; i++) {
                System.out.println(Thread.currentThread().getName() + " B");
            }
        });

        service.submit(() -> {
            for (int i = 0; i < 1000; i++) {
                System.out.println(Thread.currentThread().getName() + " C");
            }
        });
    }
}
