package ru.itis;

import java.io.FileNotFoundException;

/**
 * 19.11.2018
 * MainThrowNewExample
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class MainThrowNewExample {
    public static void findFile(String fileName) throws FileNotFoundException {
        if (fileName.equals("Нормальный файл")) {
            System.out.println("Нашел");
        } else if (fileName.equals("Треки Элджея")) {
            throw new FileNotFoundException();
        }
    }

    public static void div(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException();
        }
    }

    public static void main(String[] args) {
        try {
            findFile("Треки Элджея");
        } catch (FileNotFoundException e) {
            System.out.println("Не нашел он твою \"музыку\"");
        }
        div(10, 0);
    }
}
