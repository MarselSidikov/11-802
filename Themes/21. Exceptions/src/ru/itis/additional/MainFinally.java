package ru.itis.additional;

/**
 * 21.11.2018
 * MainFinally
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class MainFinally {
    public static void main(String[] args) {
        try {
            String strings[] = new String[Integer.MAX_VALUE];
        } catch (OutOfMemoryError e) {
            throw new StackOverflowError();
        } finally {
            System.out.println("А я все равно тут");
        }
    }
}
