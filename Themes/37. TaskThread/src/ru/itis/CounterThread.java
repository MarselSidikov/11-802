package ru.itis;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CounterThread extends Thread {
    private int start;
    private int finish;
    private int array[];

    // private static final Object MUTEX = new Object();
    private static final Lock lock = new ReentrantLock();

    public CounterThread(int start, int finish, int array[]) {
        this.start = start;
        this.finish = finish;
        this.array = array;
    }

    @Override
    public void run() {
        for (int i = start; i <= finish; i++) {
            // получение mainSum
            // получение array[i]
            // чтение mainSum
            // чтение array[i]
            // суммирование значений mainSum и array[i]
            // запись нового значения mainSum
//            synchronized (MUTEX) {
            lock.lock();
            Main.mainSum += array[i];
            lock.unlock();
//            }
        }
    }
}
