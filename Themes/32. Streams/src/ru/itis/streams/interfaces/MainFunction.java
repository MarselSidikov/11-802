package ru.itis.streams.interfaces;

import java.util.function.Function;
import java.util.function.Predicate;

/**
 * 20.02.2019
 * MainFunction
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class MainFunction {
    public static void main(String[] args) {
        Function<String, Integer> lengthFunction = string -> {
            return string.length();
        };

        Function<Integer, Character> characterCodeByLength = integer -> {
            return Character.valueOf((char)(integer + 32));
        };

        System.out.println(lengthFunction.apply("Hello"));
        System.out.println(lengthFunction.andThen(characterCodeByLength).apply("Hello"));
    }
}
