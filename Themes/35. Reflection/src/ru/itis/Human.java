package ru.itis;

/**
 * 13.03.2019
 * Human
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Human {
    int age;
    private String name;

    public Human() {
        this.name = "DEFAULT_NAME";
        this.age = 0;
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeOlder() {
        age++;
    }

    public void makeOlder(int age) {
        this.age += age;
    }

    public String getName() {
        return name;
    }
}

