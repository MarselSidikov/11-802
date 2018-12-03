package ru.itis;

/**
 * 15.10.2018
 * Student
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Student extends Animal {

    public Student(String name, double weight) {
        super(name, weight);
    }

    @Override
    public void sound() {
        System.out.println("ну дай пожрать ((9");
    }

    public void ныть() {
        System.out.println("Дай пожрать ((((");
    }

    public void eat(Mouse mouse) {
        this.weight = this.weight + 0.0;
    }
}
