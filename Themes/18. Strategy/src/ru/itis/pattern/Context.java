package ru.itis.pattern;

/**
 * 07.11.2018
 * Context
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Context {

    private Strategy strategy;

    public void contextMethod() {
        strategy.algorithm();
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
