package ru.itpark;

public class Producer extends Thread {
    private final Product product;

    public Producer(Product product) {
        this.product = product;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (product) {
                // пока продукт не употреблен
                while (!product.isConsumed()) {
                    System.out.println("Producer waiting");
                    // передаем управление другим потокам
                    // мы будем ждать на product, пока другой поток
                    // не оповестит нас о том, что можно пользоваться product
                    try {
                        product.wait();
                    } catch (InterruptedException e) {
                        throw new IllegalArgumentException();
                    }
                }
                System.out.println("Producer producing");
                product.produce();
                // оповещаем другой поток,что мы освободили product
                // и его можно не ждать
                product.notify();
            }
        }
    }
}
