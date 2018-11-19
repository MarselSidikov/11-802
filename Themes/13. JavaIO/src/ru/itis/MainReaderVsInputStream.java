package ru.itis;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.Reader;

/**
 * 31.10.2018
 * MainReaderVsInputStream
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class MainReaderVsInputStream {
    public static void main(String[] args) throws Exception {
        Reader reader = new FileReader("input3.txt");
        char text[] = new char[30];
        int length = reader.read(text);
        String string = new String(text, 0, length);
//        System.out.println(string);
        System.out.println(length);
        reader.close();

        InputStream inputStream = new FileInputStream("input3.txt");
        byte bytes[] = new byte[30];
        int count = inputStream.read(bytes);
        System.out.println(count);
    }
}
