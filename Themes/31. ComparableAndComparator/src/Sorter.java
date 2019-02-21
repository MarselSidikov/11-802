import java.util.Comparator;

/**
 * 19.02.2019
 * Sorter
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Sorter {

    public static <T extends Comparable<T>> void sort(ArrayList<T> list) {
       sort0(list, null);
    }

    public static <T> void sort(ArrayList<T> list, Comparator<T> comparator) {
        sort0(list, comparator);
    }

    private static <T> void sort0(ArrayList<T> list, Comparator<T> comparator) {
        Object elements[] = list.elements;
        for (int i = list.count - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                int compareResult;
                if (comparator == null) {
                    compareResult = ((Comparable<T>)elements[j]).compareTo((T)elements[j + 1]);
                } else {
                    compareResult = comparator.compare((T)elements[j], (T)elements[j+1]);
                }
                if ( compareResult > 0) {
                    Object temp = elements[j];
                    elements[j] = elements[j + 1];
                    elements[j + 1] = temp;
                }
            }
        }
    }
}
