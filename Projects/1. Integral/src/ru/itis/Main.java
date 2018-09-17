package ru.itis;

import java.util.Scanner;

public class Main {

    /**
     * Функция, от которой необходимо вычислить интеграл
     * @param x
     * @return значение функции в точке x
     */
    public static double f(double x) {
        return x * x;
    }

    public static double leftRiemannSums(double a, double b, int n) {
        double h = (b - a) / n;
        double result = 0;
        for (double x = a; x <= b; x = x +  h) {
            result = result + f(x) * h;
        }
        return result;
    }

    public static double rightRiemannSums(double a, double b, int n) {
        return 0;
    }

    public static double byMidpointSums(double a, double b, int n) {
        return 0;
    }

    public static double byTrapezoidalRule(double a, double b, int n) {
        return 0;
    }

    public static double bySimpsonRule(double a, double b, int n) {
        return 0;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a;
        double b;
        int n;

        a = scanner.nextDouble();
        b = scanner.nextDouble();
        n = scanner.nextInt();
        System.out.println(leftRiemannSums(a, b, n));
        // Название метода - результат, количество итераций
    }
}
