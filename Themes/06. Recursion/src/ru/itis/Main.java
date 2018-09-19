package ru.itis;

public class Main {

    // 0, 1, 1, 2, 3, 5, 8, ...
    // xN = xN-1 + xN-2
    // x1 = 0
    // x2 = 1
    // x3 = xN-1 + xN-2 = x2 + x1 = 1

    public static int fib(int n) {
        System.out.println("in fib with n = " + n);
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            int result = fib(n - 1) + fib(n - 2);
            System.out.println("out from fib = " + result);
            return result;
        }
    }

    public static int f(int n) {
        System.out.println("in n! with n = " + n);
        if (n == 0) {
            return 1;
        }
        int result = n * f(n -1);
        System.out.println("out from n! = " + result);
        return result;
    }

    public static void main(String[] args) {
        // System.out.println(f(7));
        System.out.println(fib(11));

    }
}
