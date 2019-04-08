package ru.itis;

import java.util.Deque;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.CopyOnWriteArrayList;

public class ExecutorService {

    private Deque<Runnable> tasks;
    private ThreadWorkers threads[];

    public ExecutorService(int threadCount) {
        this.tasks = new ConcurrentLinkedDeque<>();
        this.threads = new ThreadWorkers[threadCount];

        for (int i = 0; i < threadCount; i++) {
            this.threads[i].start();
        }
    }

    public void submit(Runnable task) {
        //TODO: когда кладете задачу в список, из списка не должно ничего уходить
    }

    private class ThreadWorkers extends Thread {

        @Override
        public void run() {
            // TODO: ждать задач, если список содержит хотя бы одну задачу
            // взять на выполнение
        }
    }
}
