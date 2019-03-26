package ru.itis;

import java.util.Scanner;

public class Main {

    private static int mainSum = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mainArray[];

        int numbersCount = scanner.nextInt();
        int threadsCount = scanner.nextInt();

        // TODO: создаете массив размерности numberCount ~ 2 000 000

        // TODO: заполняете его случайными числами ~ 0...1000

        // TODO: обычным for-ом посчитали сумму всех чисел и положили в переменную expectedSum

        // TODO: создать threadsCount потоков типа CounterThread

        // TODO: назначить каждому потоку свой участок

        // TODO: сравнить сумму mainSum и exceptedSum
    }
}
