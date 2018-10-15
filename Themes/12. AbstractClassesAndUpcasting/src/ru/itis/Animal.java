package ru.itis;

/**
 * 15.10.2018
 * Animal
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public abstract class Animal {

    private String name;
    protected double weight;

    public Animal(String name, double weight) {
        this.name = name;
        if (weight >= 0) {
            this.weight = weight;
        } else {
            this.weight = 0;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public abstract void sound();
}
