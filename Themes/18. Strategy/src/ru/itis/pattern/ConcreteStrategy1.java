package ru.itis.pattern;

/**
 * 07.11.2018
 * ConcreteStrategy1
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class ConcreteStrategy1 implements Strategy {
    @Override
    public void algorithm() {
        System.out.println("Ты крутой!");
    }
}
