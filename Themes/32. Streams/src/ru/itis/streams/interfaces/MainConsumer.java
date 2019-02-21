package ru.itis.streams.interfaces;

import java.util.function.Consumer;

/**
 * 20.02.2019
 * MainConsumer
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class MainConsumer {
    public static void main(String[] args) {
        Consumer<String> printConsumer = string -> {
            System.out.println(string);
        };

        printConsumer.accept("Hello");
    }
}
