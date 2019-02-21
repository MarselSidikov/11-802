package ru.itis.streams.interfaces;

import java.util.function.Predicate;

/**
 * 20.02.2019
 * MainPredicate
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class MainPredicate {
    public static void main(String[] args) {
        Predicate<String> isStartsWithLower = string -> {
            return Character.isLowerCase(string.charAt(0));
        };

        Predicate<String> isEndsWithLower = string -> {
            return Character.isLowerCase(string.charAt(string.length() - 1));
        };

        System.out.println(isStartsWithLower.test("Hello"));
        System.out.println(isStartsWithLower.test("hello"));
        System.out.println("And test --------");
        System.out.println(isStartsWithLower.and(isEndsWithLower).test("hello"));
        System.out.println(isStartsWithLower.and(isEndsWithLower).test("Hello"));
        System.out.println(isStartsWithLower.and(isEndsWithLower).test("hellO"));
        System.out.println("Or test --------");
        System.out.println(isStartsWithLower.or(isEndsWithLower).test("hello"));
        System.out.println(isStartsWithLower.or(isEndsWithLower).test("Hello"));
        System.out.println(isStartsWithLower.or(isEndsWithLower).test("HellO"));
    }
}
