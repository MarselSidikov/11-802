package ru.itis;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * 19.11.2018
 * MainFileNotFound
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class MainFileNotFound {

    public static void main(String[] args) {
        try {
            InputStream stream = new FileInputStream("input.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Программа: Я не нашел файл, я говорю - " + e.getMessage() +  " можно идти дальше?");
        }

        System.out.println("JVM: Конечно!");
        System.out.println("Программа: Ура!");
        System.out.println("Марк: Я хочу домой");
    }
}
