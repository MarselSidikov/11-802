package ru.itis;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // ссылочная переменная, которая указывает на массив
        // на массив чего? на массив ссылок, каждая из которых указывает массив
        int a[][] = new int[10][];
        Random random = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = new int[i + 1];
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = random.nextInt(10);
            }
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
