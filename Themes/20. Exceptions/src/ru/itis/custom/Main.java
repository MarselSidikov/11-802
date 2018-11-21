package ru.itis.custom;

import java.util.Scanner;

/**
 * 21.11.2018
 * MainFinally
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();

        if (word.equals("Коллоквиум")) {
            throw new BadWordException("Это слово слишком ужасное =(");
        }
    }
}
