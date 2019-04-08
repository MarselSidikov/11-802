package ru.itpark;

public class Product {
    private boolean isReady = false;

    // готовность продукта
    public boolean isProduced() {
        return isReady;
    }

    // был ли он использован
    // не использован - если продукт готов
    // использован - если не готов
    public boolean isConsumed() {
        return !isReady;
    }

    public void produce() {
        this.isReady = true;
    }

    public void consume() {
        this.isReady = false;
    }

}
