package ru.itis;

public class MainStackDemo {

    public static int f0(int v) {
        System.out.println("in f0 with " + v);
        int d = f1(v);
        int t = f1(v  +1);
        int result = f2(d, t) * f3(d + 1);
        System.out.println("out from f0 with " + result);
        return result;
    }

    public static int f1(int y) {
        System.out.println("in f1 with " + y);
        int result =  f2(y * y, y + y);
        System.out.println("out from f1 with " + result);
        return result;
    }

    public static int f2(int a, int b) {
        System.out.println("in f2 with " + a + " and " + b);
        int result = a + b;
        System.out.println("out from f2 with " + result);
        return result;
    }

    public static int f3(int x) {
        System.out.println("in f3 with " + x);
        int result =  f2(x + 10, 10);
        System.out.println("out from f3 with " + result);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(f0(10));
    }
}
