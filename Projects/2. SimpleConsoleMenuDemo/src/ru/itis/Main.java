package ru.itis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int left, right;
        while (true) {
            System.out.println("МЕНЮ:");
            System.out.println("1. Сложить числа");
            System.out.println("2. Вычесть числа");
            System.out.println("3. Умножить числа");
            System.out.println("4. Поделить числа");
            System.out.println("5. Выход");

            int operation = scanner.nextInt();
            switch (operation) {
                case 1: {
                    left = scanner.nextInt();
                    right = scanner.nextInt();
                    int result = left + right;
                    System.out.println(result);
                } break;
                case 2: {
                    left = scanner.nextInt();
                    right = scanner.nextInt();
                    int result = left - right;
                    System.out.println(result);
                } break;
                case 3: {
                    left = scanner.nextInt();
                    right = scanner.nextInt();
                    int result = left * right;
                    System.out.println(result);
                } break;
                case 4: {
                    left = scanner.nextInt();
                    right = scanner.nextInt();
                    int result = left / right;
                    System.out.println(result);
                } break;
                case 5: System.exit(0);
                default:
                    System.err.println("Неизвестная команда");
            }
        }
    }
}
