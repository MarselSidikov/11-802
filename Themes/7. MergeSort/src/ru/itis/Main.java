package ru.itis;

import java.util.Arrays;

public class Main {

    // вспомогательный массив
    private static int helpArray[];

    // процедура сортировка массива
    public static void sort(int[] array) {
        initHelpArray(array.length);
        sort(array, 0, array.length - 1);
    }

    // создает дополнительный массив такой же размерности
    private static void initHelpArray(int maxSize) {
        helpArray = new int[maxSize];
    }

    private static void sort(int array[], int lower, int higher) {
        // если правая граница столкнулась с левой
        if (higher <= lower) {
            return;
        }
        // вычисляем индекс среднего
        int middle = lower + (higher - lower) / 2;
        // сортируем левую половину
        sort(array, lower, middle);
        // сортируем правую половину
        sort(array, middle + 1, higher);
        // соединяем
        merge(array, lower, middle, higher);
    }

    // процедуря слияния двух половинок массива
    // array[lower...middle,middle+1, higher]
    private static void merge(int array[],
                       int lower,
                       int middle,
                       int higher) {
        // копируем выделенный фрагмент в вспомогательный массив
        for (int currentIndex = lower; currentIndex <= higher; currentIndex++) {
            helpArray[currentIndex] = array[currentIndex];
        }

        // запускаем два бегунка
        int i = lower, j = middle + 1;
        for (int currentIndex = lower; currentIndex <= higher; currentIndex++) {
            if (i > middle) {
                array[currentIndex] = helpArray[j];
                j++;
            } else if (j > higher) {
                array[currentIndex] = helpArray[i];
                i++;
            } else if (helpArray[j] < helpArray[i]) {
                array[currentIndex] = helpArray[j];
                j++;
            } else {
                array[currentIndex] = helpArray[i];
                i++;
            }
        }

    }

    public static void main(String[] args) {
        int array[] = {3, 4, -1, -57, 11, 56, -10, 666};
        sort(array);
        System.out.println(Arrays.toString(array));
    }
}
