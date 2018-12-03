package ru.itis;

/**
 * 15.10.2018
 * Mouse
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Mouse extends Animal {
    public Mouse(String name, double weight) {
        super(name, weight);
    }

    public void sound() {
        System.out.println("3.14 3.14 3.14");
    }
}
