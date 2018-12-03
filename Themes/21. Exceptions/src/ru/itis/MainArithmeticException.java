package ru.itis;

import java.util.Scanner;

/**
 * 19.11.2018
 * MainArithmeticException
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class MainArithmeticException {

    public static int div(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        System.out.println(div(x, y));
    }
}
