package ru.itis.arrays;

/**
 * 17.10.2018
 * Main
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Main {
    public static void main(String[] args) {
        int array[] = {34, 10, 5, 6, -4, 10};

        MinMaxAccessor accessor = new MinMaxAccessorSelectionSort(array);

        System.out.println(accessor.getMax());
        System.out.println(accessor.getMin());
    }
}
