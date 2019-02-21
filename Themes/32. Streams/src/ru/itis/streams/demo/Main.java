package ru.itis.streams.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

/**
 * 20.02.2019
 * Main
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Main {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("Hello");
        words.add("marsel");
        words.add("byeOf");
        words.add("1");

        Stream<String> wordsStream = words.stream();

        wordsStream.forEach(word -> System.out.println(word));

        wordsStream = words.stream();

        Stream<Integer> lengths = wordsStream.map(word -> word.length());
        lengths.forEach(length -> System.out.println(length));

    }
}
