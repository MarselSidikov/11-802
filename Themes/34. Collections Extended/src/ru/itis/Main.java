package ru.itis;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Марсель");
        set.add("Рафаэлевич");
        set.add("Сидиков");

        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Марсель");
        linkedHashSet.add("Рафаэлевич");
        linkedHashSet.add("Сидиков");

        for (String value : set) {
            System.out.println(value);
        }
        System.out.println("------");
        for (String value : linkedHashSet) {
            System.out.println(value);
        }
        System.out.println("------");
        SortedSet<Human> humans = new TreeSet<>();
        humans.add(new Human(25, "Марсель"));
        humans.add(new Human(19, "Аделя"));
        humans.add(new Human(20, "Айрат"));
        humans.add(new Human(28, "Михаил Михайлович"));

        for (Human human : humans) {
            System.out.println(human);
        }
    }
}
