import java.util.Iterator;

/**
 * 19.02.2019
 * ArrayList
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class ArrayList<T> implements Iterable<T> {
    public static final int MAX_SIZE = 10;

    T elements[];
    int count;

    public ArrayList() {
        this.elements = (T[]) new Object[MAX_SIZE];
        this.count = 0;
    }

    public void add(T element) {
        this.elements[count] = element;
        count++;
    }

    @Override
    public Iterator<T> iterator() {
        return new ArrayListIterator();
    }

    private class ArrayListIterator implements Iterator<T> {

        private int currentIndex;

        public ArrayListIterator() {
            this.currentIndex = 0;
        }

        @Override
        public boolean hasNext() {
            return currentIndex < count;
        }

        @Override
        public T next() {
            currentIndex++;
            return elements[currentIndex - 1];
        }
    }
}

