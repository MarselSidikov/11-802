package ru.itis;

/**
 * 19.11.2018
 * MainOutOfMemoryException
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class MainOutOfMemoryException {
    public static void main(String[] args) {
        String strings[] = new String[Integer.MAX_VALUE];
    }
}
