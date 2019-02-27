package ru.itis.iterators;

import java.util.Iterator;

/**
 * 27.02.2019
 * ArrayList
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class ArrayList<T> implements Iterable<T> {

    private T elements[];
    private int count;

    private class ArrayListIterator implements Iterator<T> {
        // индекс, на который указывает итератор
        int current;

        public ArrayListIterator() {
            this.current = 0;
        }

        @Override
        public boolean hasNext() {
            return current < count;
        }

        @Override
        public T next() {
            T result = elements[current];
            current++;
            return result;
        }
    }

    public ArrayList() {
        this.elements = (T[])(new Object[10]);
        this.count = 0;
    }

    public void add(T element) {
        this.elements[count] = element;
        this.count++;
    }

    public T get(int index) {
        return this.elements[index];
    }

    public int getCount() {
        return count;
    }

    @Override
    public Iterator<T> iterator() {
        return new ArrayListIterator();
    }
}
