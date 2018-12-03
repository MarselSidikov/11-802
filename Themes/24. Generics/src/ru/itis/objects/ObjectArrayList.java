package ru.itis.objects;

/**
 * 03.12.2018
 * ObjectArrayList
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class ObjectArrayList {
    private int count;
    private Object elements[];

    public ObjectArrayList() {
        this.elements = new Object[5];
        this.count = 0;
    }

    public Object get(int index) {
        return elements[index];
    }

    public void add(Object element) {
        this.elements[count++] = element;
    }
}
