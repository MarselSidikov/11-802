package ru.itis.additional;

import java.io.FileNotFoundException;
import java.nio.file.FileAlreadyExistsException;

/**
 * 21.11.2018
 * MainCatchAndThrows
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class MainCatchAndThrows {

    // можно пробрасывать сразу предка
    public static void throwException(int number) throws Exception {
        switch (number) {
            case 1: throw new FileNotFoundException();
            case 2: throw new FileAlreadyExistsException("file.txt");
        }
        throw new FileNotFoundException();
    }
    // можно перечислять конкретные ошибки
    public static void throwException2(int number) throws FileNotFoundException, FileAlreadyExistsException {
        switch (number) {
            case 1: throw new FileNotFoundException();
            case 2: throw new FileAlreadyExistsException("file.txt");
        }
        throw new FileNotFoundException();
    }

    public static void main(String[] args) {
        try {
            throwException(2);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // отдельно обрабатываем каждое исключение
        try {
            throwException2(2);
        } catch (FileNotFoundException e) {
            e.printStackTrace(); // делаем именно при FileNotFound, но при других не делаем
        } catch (FileAlreadyExistsException e) {
            e.printStackTrace(); // делаем именно при FileAlreadyExists, при других делаем
        }

        // можно перехватить предка, тогда все потомки будут попадать в catch блок
        try {
            throwException2(2);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // можно указать какие-либо конкретные исключения, а остальное спихнуть на предка
        try {
            throwException2(2);
        } catch (FileNotFoundException e) {
            e.printStackTrace(); // делаем только при FileNotFound
        } catch (Exception e) {
            e.printStackTrace(); // делаем при всех остальных потомках Exception
        }

//         Так писать нельзя, потому что любой потомок Exception сразу попадет в первый catch-блок
//        try {
//            throwException2(2);
//        } catch (Exception e) {
//            e.printStackTrace();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
    }
}
