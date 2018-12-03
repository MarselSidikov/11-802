package ru.itis.primitive;

/**
 * 03.12.2018
 * StringArrayList
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class StringArrayList {
    private int count;
    private String elements[];

    public StringArrayList() {
        this.elements = new String[5];
        this.count = 0;
    }

    public String get(int index) {
        return elements[index];
    }

    public void add(String element) {
        this.elements[count++] = element;
    }
}
