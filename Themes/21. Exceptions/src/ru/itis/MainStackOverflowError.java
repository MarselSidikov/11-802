package ru.itis;

/**
 * 19.11.2018
 * MainStackOverflowError
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class MainStackOverflowError {
    public static void f() {
        f();
    }

    public static void main(String[] args) {
        f();
    }
}
