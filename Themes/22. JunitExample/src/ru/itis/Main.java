package ru.itis;

public class Main {

    public static void main(String[] args) {
        MathExperience mathExperience = new MathExperience();
        System.out.println(mathExperience.isPrime(16));
        System.out.println(mathExperience.isPrime(133));
        System.out.println(mathExperience.isPrime(169));
        System.out.println(mathExperience.isPrime(1));
        System.out.println(mathExperience.isPrime(0));
    }
}
