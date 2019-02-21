package ru.itis.streams.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * 20.02.2019
 * MainExtended
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class MainExtended {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("Hellosfsdf");
        words.add("marseldfdafsdffsdfsfsdfsdf");
        words.add("byeOfsdfsfsdf");
        words.add("1");

        words.stream().map(string -> string.length())
                .map(length -> (char)(length + 50))
                .filter(character -> Character.isUpperCase(character))
                .forEach(character -> System.out.println(character));

        words.stream().map(String::length)
                .map(length -> (char)(length + 50))
                .filter(Character::isUpperCase)
                .forEach(System.out::println);
    }
}
