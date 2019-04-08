package ru.itpark;

// потребитель, отдельный поток
public class Consumer extends Thread {
    // имеется продукт
    private final Product product;

    public Consumer(Product product) {
        this.product = product;
    }

    @Override
    public void run() {
        // бесконечный цикл
        while (true) {
            // блокируем продукт
            synchronized (product) {
                // пока продукт не готов
                while (!product.isProduced()) {
                    try {
                        // мы говорим, что мы ждем
                        System.out.println("Consumer waiting");
                        // уходим в ожидание на продукте
                        // wait - уводит в ожидание текущий поток
                        product.wait();
                    } catch (InterruptedException e) {
                        throw new IllegalStateException(e);
                    }
                }
                // как только продукт стал готов
                System.out.println("Consumer consuming");
                // потребляем
                product.consume();
                // оповещяем что мы его употребили
                product.notify();
            }
        }
    }
}
