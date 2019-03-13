package ru.itis.framework;

import ru.itis.Human;

import java.util.List;

/**
 * 13.03.2019
 * Main
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> integers = SimpleStupidFramework.getObjects(Integer.class, 100);
        for (Integer integer : integers) {
            System.out.println(integer.intValue());
        }
    }
}
