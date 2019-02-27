package ru.itis.iterators;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add("Bye");
        strings.add("Marsel");
        strings.add("Тырыпыры");

        for (int i = 0; i < strings.getCount(); i++) {
            System.out.println(strings.get(i));
        }

        // объектная переменная, указывает на объект в памяти

        // переменная = объект
        Iterator<String> iterator = strings.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        for (String string : strings) {
            System.out.println(string);
        }
    }
}
