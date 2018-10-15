package ru.itis;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Arrays;

/**
 * 15.10.2018
 * MainInputStream
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class MainInputStream {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = new FileInputStream("input2.txt");
        int value = inputStream.read();
        while (value != -1) {
            System.out.print((char)value);
            value = inputStream.read();
        }
        System.out.println();
        InputStream inputStream2 = new FileInputStream("input3.txt");
        byte bytes[] = new byte[10];
        int length = inputStream2.read(bytes);
        System.out.println(length);
        System.out.println(Arrays.toString(bytes));
    }
}
