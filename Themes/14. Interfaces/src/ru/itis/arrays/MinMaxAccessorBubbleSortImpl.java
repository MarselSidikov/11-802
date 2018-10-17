package ru.itis.arrays;

/**
 * 17.10.2018
 * MinMaxAccessorBubbleSortImpl
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class MinMaxAccessorBubbleSortImpl  extends MinMaxAccessorSortImpl {
    public MinMaxAccessorBubbleSortImpl(int[] array) {
        super(array);
    }

    @Override
    public void sort() {
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j+1] = temp;
                }
            }
        }
        isSorted = true;
    }


}
