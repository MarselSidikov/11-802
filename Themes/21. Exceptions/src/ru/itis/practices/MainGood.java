package ru.itis.practices;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * 19.11.2018
 * MainGood
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class MainGood {
    public static InputStream openFile(String fileName) {
        try {
            return new FileInputStream("fileName");
        } catch (FileNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static int readByte(InputStream stream) {
        try {
            return stream.read();
        } catch (IOException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static void main(String[] args) {
        InputStream stream = openFile("input.txt");
        int byteValue = readByte(stream);
    }
}
