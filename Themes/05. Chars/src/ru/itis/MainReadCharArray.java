package ru.itis;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 17.09.2018
 * MainReadCharArray
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class MainReadCharArray {
    public static void main(String[] args) {
        char array[];
        Scanner scanner = new Scanner(System.in);
        array = scanner.nextLine().toCharArray();
        System.out.println(Arrays.toString(array));
    }
}
