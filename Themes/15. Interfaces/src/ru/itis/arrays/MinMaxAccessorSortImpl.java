package ru.itis.arrays;

/**
 * 17.10.2018
 * MinMaxAccessorSortImpl
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public abstract class MinMaxAccessorSortImpl implements MinMaxAccessor {
    protected int array[];

    protected boolean isSorted = false;

    public MinMaxAccessorSortImpl(int array[]) {
        this.array = new int[array.length];
        System.arraycopy(array, 0, this.array, 0, array.length);
    }

    @Override
    public int getMin() {
        if (!isSorted) {
            sort();
            isSorted = true;
        }
        return array[0];
    }

    @Override
    public int getMax() {
        if (!isSorted) {
            sort();
            isSorted = true;
        }
        return array[array.length - 1];
    }

    public abstract void sort();
}
