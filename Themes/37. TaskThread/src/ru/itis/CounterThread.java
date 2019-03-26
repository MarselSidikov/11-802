package ru.itis;

public class CounterThread extends Thread {
    private int start;
    private int finish;
    private int array[];

    public CounterThread(int start, int finish, int array[]) {
        this.start = start;
        this.finish = finish;
        this.array = array;
    }

    @Override
    public void run() {
        // TODO: посчитать сумму элементов в массиве array от array[start] до
        // TODO: array[finish]
        // TODO: и положить ee в глобальную переменную Main.mainSum
    }
}
