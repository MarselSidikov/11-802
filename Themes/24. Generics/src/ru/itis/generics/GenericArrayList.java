package ru.itis.generics;

/**
 * 03.12.2018
 * GenericArrayList
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class GenericArrayList<T> {
    private int count;
    private T elements[];

    public GenericArrayList() {
        this.elements = (T[])(new Object[5]);
        this.count = 0;
    }

    public T get(int index) {
        return elements[index];
    }

    public void add(T element) {
        this.elements[count++] = element;
    }
}
