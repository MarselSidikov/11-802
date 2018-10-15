package ru.itis;

/**
 * 15.10.2018
 * Cat
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Fox extends Animal {

    private static final double RIMMA_RULE = 0.1;
    public Fox(String name, double weight) {
        super(name, weight);
    }

    public void eat(Animal animal) {
        // by rimma rule
        this.weight = animal.getWeight() * RIMMA_RULE;
    }

    public void sound() {
        System.out.println("Ring-ding-ding-ding-dingeringeding");
    }
}
