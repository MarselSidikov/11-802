package ru.itis.primitive;

/**
 * 03.12.2018
 * ObjectArrayList
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class IntegerArrayList {
    private int count;
    private int elements[];

    public IntegerArrayList() {
        this.elements = new int[5];
        this.count = 0;
    }

    public int get(int index) {
        return elements[index];
    }

    public void add(int element) {
        this.elements[count++] = element;
    }
}
