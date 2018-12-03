package ru.itis.practices;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * 19.11.2018
 * MainBad
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */

/**
 * Есть файл, там гарантировано ненулевые символы
 * Нужно поделить 10 на эти символы
 */
public class MainBad {
    public static InputStream openFile(String fileName) throws FileNotFoundException {
        return new FileInputStream("fileName");
    }
    public static void main(String[] args) {
        InputStream stream = null;
        try {
            stream = openFile("input.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        int byteValue = 0;
        try {
            byteValue = stream.read();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(10 / byteValue);
    }
}
