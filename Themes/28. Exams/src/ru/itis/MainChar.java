package ru.itis;

/**
 * 12.01.2019
 * MainChar
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class MainChar {
    public static void main(String[] args) {
        char c = 'G';
        int code = c;
        System.out.println(code);
        char c1 = (char)(++code);
        System.out.println(c1);
    }
}
