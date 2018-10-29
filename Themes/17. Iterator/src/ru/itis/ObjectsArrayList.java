package ru.itis;

/**
 * 29.10.2018
 * ObjectsArrayList
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class ObjectsArrayList {
    private static final int MAX_SIZE = 5;
    private Object values[];
    private int count;

    public ObjectsArrayList() {
        this.values = new Object[MAX_SIZE];
        this.count = 0;
    }

    public void add(Object object) {
        if (count < MAX_SIZE) {
            values[count] = object;
            count++;
        } else {
            System.err.println("Все плохо");
        }
    }

    private class ArrayListIterator implements Iterator {

        private int currentIndex;

        public ArrayListIterator() {
            this.currentIndex = 0;
        }

        @Override
        public boolean hasNext() {
            return currentIndex < count;
        }

        @Override
        public Object next() {
            Object result = values[currentIndex];
            currentIndex++;
            return result;
        }
    }

    public Iterator getIterator() {
        return new ArrayListIterator();
    }
}
