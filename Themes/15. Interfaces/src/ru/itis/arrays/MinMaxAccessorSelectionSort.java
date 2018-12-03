package ru.itis.arrays;

/**
 * 17.10.2018
 * MinMaxAccessorSelectionSort
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class MinMaxAccessorSelectionSort extends MinMaxAccessorSortImpl {
    public MinMaxAccessorSelectionSort(int[] array) {
        super(array);
    }

    @Override
    public void sort() {
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int indexOfMin = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    indexOfMin = j;
                }
            }
            int temp = array[i];
            array[i] = array[indexOfMin];
            array[indexOfMin] = temp;
        }
    }
}
