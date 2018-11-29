package ru.itis;

/**
 * 28.11.2018
 * MathExperience
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class MathExperience {
    public boolean isPrime(int number) {
        if (number == 0 || number == 1) {
            throw new IllegalArgumentException("One or zero not allowed");
        }
        if (number == 2 || number == 3) {
            return true;
        }

        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
