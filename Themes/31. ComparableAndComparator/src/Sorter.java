/**
 * 19.02.2019
 * Sorter
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Sorter {
    public static <T extends Comparable<T>> void sort(ArrayList<T> list) {
        Object elements[] = list.elements;
        for (int i = list.count - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (((Comparable<T>)elements[j]).compareTo((T)elements[j + 1]) > 0) {
                    Object temp = elements[j];
                    elements[j] = elements[j + 1];
                    elements[j + 1] = temp;
                }
            }
        }
    }
}
