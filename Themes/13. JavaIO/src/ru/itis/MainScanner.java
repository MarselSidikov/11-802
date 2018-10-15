package ru.itis;

import java.io.File;
import java.util.Scanner;

public class MainScanner {

    public static void main(String[] args) throws Exception {
        File file = new File("input.txt");
        Scanner scanner = new Scanner(file);
        int value = scanner.nextInt();
        System.out.println(value);
    }
}
